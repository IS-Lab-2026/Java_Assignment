import javax.swing.*;
import java.awt.*;

/**
 * Form-based version of BicycleRental, extended with borrower details.
 *
 * Pricing (same as the console app), per hour:
 *   before 07:00 or from 21:00 onward ......... 500 RWF
 *   07:00-13:59 and 19:00-20:59 ............... 1000 RWF
 *   14:00-18:59 ............................... 1500 RWF
 */
public class BicycleRentalGUI extends JFrame {

    // Borrower details
    private final JTextField nameField = new JTextField(20);
    private final JTextField phoneField = new JTextField(20);
    private final JTextField idField = new JTextField(20);
    private final JTextField addressField = new JTextField(20);

    // Rental details
    private final JComboBox<String> bicycleBox = new JComboBox<>(
            new String[]{"City bike", "Mountain bike", "Road bike", "Kids bike"});
    private final JComboBox<String> startBox = new JComboBox<>();
    private final JComboBox<String> endBox = new JComboBox<>();

    private final JTextArea receiptArea = new JTextArea(12, 30);

    public BicycleRentalGUI() {
        setTitle("Bicycle Rental");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Start time: 0-23, end time: 1-24 (same ranges as the console app)
        for (int h = 0; h <= 23; h++) {
            startBox.addItem(formatHour(h));
        }
        for (int h = 1; h <= 24; h++) {
            endBox.addItem(formatHour(h));
        }
        startBox.setSelectedIndex(8);   // 08:00 by default
        endBox.setSelectedIndex(9);     // 10:00 by default

        JPanel main = new JPanel(new BorderLayout(10, 10));
        main.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // ----- Left side: the form -----
        JPanel form = new JPanel(new GridBagLayout());
        form.setBorder(BorderFactory.createTitledBorder("Rental form"));
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        c.anchor = GridBagConstraints.WEST;
        c.fill = GridBagConstraints.HORIZONTAL;

        int row = 0;
        addSectionLabel(form, c, row++, "Borrower details");
        addRow(form, c, row++, "Full name *", nameField);
        addRow(form, c, row++, "Phone number *", phoneField);
        addRow(form, c, row++, "National ID *", idField);
        addRow(form, c, row++, "Address", addressField);

        addSectionLabel(form, c, row++, "Rental details");
        addRow(form, c, row++, "Bicycle type", bicycleBox);
        addRow(form, c, row++, "Starting time", startBox);
        addRow(form, c, row++, "Ending time", endBox);

        JButton calculateButton = new JButton("Calculate rent");
        JButton clearButton = new JButton("Clear");
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        buttons.add(calculateButton);
        buttons.add(clearButton);
        c.gridx = 0;
        c.gridy = row;
        c.gridwidth = 2;
        form.add(buttons, c);

        main.add(form, BorderLayout.WEST);

        // ----- Right side: receipt -----
        receiptArea.setEditable(false);
        receiptArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));
        JScrollPane scroll = new JScrollPane(receiptArea);
        scroll.setBorder(BorderFactory.createTitledBorder("Receipt"));
        main.add(scroll, BorderLayout.CENTER);

        add(main);

        // ----- Events -----
        calculateButton.addActionListener(e -> calculate());
        clearButton.addActionListener(e -> clearForm());

        pack();
        setLocationRelativeTo(null);
    }

    // ---------- Layout helpers ----------

    private void addSectionLabel(JPanel panel, GridBagConstraints c, int row, String text) {
        JLabel label = new JLabel(text);
        label.setFont(label.getFont().deriveFont(Font.BOLD));
        c.gridx = 0;
        c.gridy = row;
        c.gridwidth = 2;
        panel.add(label, c);
        c.gridwidth = 1;
    }

    private void addRow(JPanel panel, GridBagConstraints c, int row, String labelText, JComponent field) {
        c.gridx = 0;
        c.gridy = row;
        c.weightx = 0;
        panel.add(new JLabel(labelText), c);
        c.gridx = 1;
        c.weightx = 1;
        panel.add(field, c);
    }

    private String formatHour(int hour) {
        return String.format("%02d:00", hour);
    }

    // ---------- Logic ----------

    private void calculate() {
        // Borrower validation
        String name = nameField.getText().trim();
        String phone = phoneField.getText().trim();
        String id = idField.getText().trim();
        String address = addressField.getText().trim();

        if (name.isEmpty() || phone.isEmpty() || id.isEmpty()) {
            showError("Please fill in the borrower's name, phone number and national ID.");
            return;
        }

        // Hours: start 0-23 -> index = hour, end 1-24 -> index + 1 = hour
        int startTime = startBox.getSelectedIndex();
        int endTime = endBox.getSelectedIndex() + 1;

        if (startTime >= endTime) {
            showError("Starting time must be less than ending time.");
            return;
        }

        // Same pricing loop as the console app, also counting hours per rate
        int totalCost = 0;
        int hours500 = 0, hours1000 = 0, hours1500 = 0;
        for (int hour = startTime; hour < endTime; hour++) {
            if (hour < 7 || hour >= 21) {
                totalCost += 500;
                hours500++;
            } else if (hour < 14 || hour >= 19) {
                totalCost += 1000;
                hours1000++;
            } else {
                totalCost += 1500;
                hours1500++;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("===== BICYCLE RENTAL RECEIPT =====\n\n");
        sb.append("Borrower : ").append(name).append("\n");
        sb.append("Phone    : ").append(phone).append("\n");
        sb.append("ID       : ").append(id).append("\n");
        if (!address.isEmpty()) {
            sb.append("Address  : ").append(address).append("\n");
        }
        sb.append("\nBicycle  : ").append(bicycleBox.getSelectedItem()).append("\n");
        sb.append("From     : ").append(formatHour(startTime)).append("\n");
        sb.append("To       : ").append(formatHour(endTime == 24 ? 0 : endTime))
                .append(endTime == 24 ? " (midnight)" : "").append("\n");
        sb.append("Duration : ").append(endTime - startTime).append(" hour(s)\n\n");
        sb.append("--- Breakdown ---\n");
        if (hours500 > 0) {
            sb.append(String.format("%2d h x  500 RWF = %5d RWF%n", hours500, hours500 * 500));
        }
        if (hours1000 > 0) {
            sb.append(String.format("%2d h x 1000 RWF = %5d RWF%n", hours1000, hours1000 * 1000));
        }
        if (hours1500 > 0) {
            sb.append(String.format("%2d h x 1500 RWF = %5d RWF%n", hours1500, hours1500 * 1500));
        }
        sb.append("\nTotal rent to pay: ").append(totalCost).append(" RWF\n");

        receiptArea.setText(sb.toString());
        receiptArea.setCaretPosition(0);
    }

    private void clearForm() {
        nameField.setText("");
        phoneField.setText("");
        idField.setText("");
        addressField.setText("");
        bicycleBox.setSelectedIndex(0);
        startBox.setSelectedIndex(8);
        endBox.setSelectedIndex(9);
        receiptArea.setText("");
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BicycleRentalGUI().setVisible(true));
    }
}
