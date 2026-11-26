import javax.swing.*;
import java.awt.*;

/**
 * Form-based version of MushroomIdentifier.
 * Same questions and same decision logic as the console app.
 */
public class MushroomIdentifierGUI extends JFrame {

    // Each question has a Yes and a No radio button
    private final JRadioButton forestYes = new JRadioButton("Yes");
    private final JRadioButton forestNo = new JRadioButton("No");
    private final JRadioButton cupYes = new JRadioButton("Yes");
    private final JRadioButton cupNo = new JRadioButton("No");
    private final JRadioButton ringYes = new JRadioButton("Yes");
    private final JRadioButton ringNo = new JRadioButton("No");
    private final JRadioButton gillsYes = new JRadioButton("Yes");
    private final JRadioButton gillsNo = new JRadioButton("No");

    private final ButtonGroup forestGroup = new ButtonGroup();
    private final ButtonGroup cupGroup = new ButtonGroup();
    private final ButtonGroup ringGroup = new ButtonGroup();
    private final ButtonGroup gillsGroup = new ButtonGroup();

    private final JLabel resultLabel = new JLabel(" ", SwingConstants.CENTER);

    public MushroomIdentifierGUI() {
        setTitle("Mushroom Identifier");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel main = new JPanel(new BorderLayout(10, 10));
        main.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // ----- Header -----
        JLabel title = new JLabel("<html><b>Think of one mushroom:</b><br>"
                + "Agaric Jaunissant, Amanite tue-mouche, Cepe de Bordeaux,<br>"
                + "Coprin chevelu, Girolle, Pied bleu</html>");
        main.add(title, BorderLayout.NORTH);

        // ----- Questions -----
        JPanel questions = new JPanel(new GridLayout(4, 2, 10, 10));
        questions.setBorder(BorderFactory.createTitledBorder("Answer with Yes or No"));

        questions.add(new JLabel("Does your mushroom grow in a forest?"));
        questions.add(yesNoPanel(forestYes, forestNo, forestGroup));

        questions.add(new JLabel("Does your mushroom have a convex cup?"));
        questions.add(yesNoPanel(cupYes, cupNo, cupGroup));

        questions.add(new JLabel("Does your mushroom have a ring?"));
        questions.add(yesNoPanel(ringYes, ringNo, ringGroup));

        questions.add(new JLabel("Does your mushroom have gills?"));
        questions.add(yesNoPanel(gillsYes, gillsNo, gillsGroup));

        main.add(questions, BorderLayout.CENTER);

        // ----- Buttons + result -----
        JButton identifyButton = new JButton("Identify");
        JButton resetButton = new JButton("Reset");
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        buttons.add(identifyButton);
        buttons.add(resetButton);

        resultLabel.setFont(resultLabel.getFont().deriveFont(Font.BOLD, 16f));

        JPanel bottom = new JPanel(new GridLayout(2, 1, 5, 10));
        bottom.add(buttons);
        bottom.add(resultLabel);
        main.add(bottom, BorderLayout.SOUTH);

        add(main);

        // ----- Events -----
        // Ring / gills questions are only relevant for some answers, so enable them dynamically
        java.awt.event.ActionListener updater = e -> updateEnabledQuestions();
        forestYes.addActionListener(updater);
        forestNo.addActionListener(updater);
        cupYes.addActionListener(updater);
        cupNo.addActionListener(updater);

        identifyButton.addActionListener(e -> identify());
        resetButton.addActionListener(e -> reset());

        updateEnabledQuestions();

        pack();
        setLocationRelativeTo(null);
    }

    /** Puts a Yes and No radio button side by side and groups them together. */
    private JPanel yesNoPanel(JRadioButton yes, JRadioButton no, ButtonGroup group) {
        group.add(yes);
        group.add(no);
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        p.add(yes);
        p.add(no);
        return p;
    }

    /**
     * Ring is asked only if forest = yes AND cup = yes.
     * Gills is asked only if forest = yes AND cup = no.
     */
    private void updateEnabledQuestions() {
        boolean inForest = forestYes.isSelected();
        boolean askRing = inForest && cupYes.isSelected();
        boolean askGills = inForest && cupNo.isSelected();

        setEnabledAndClear(ringYes, ringNo, ringGroup, askRing);
        setEnabledAndClear(gillsYes, gillsNo, gillsGroup, askGills);
        resultLabel.setText(" ");
    }

    private void setEnabledAndClear(JRadioButton yes, JRadioButton no, ButtonGroup group, boolean enabled) {
        yes.setEnabled(enabled);
        no.setEnabled(enabled);
        if (!enabled) {
            group.clearSelection();
        }
    }

    /** Same decision tree as the console version. */
    private void identify() {
        if (!forestYes.isSelected() && !forestNo.isSelected()) {
            showWarning("Please answer: Does your mushroom grow in a forest?");
            return;
        }
        if (!cupYes.isSelected() && !cupNo.isSelected()) {
            showWarning("Please answer: Does your mushroom have a convex cup?");
            return;
        }

        boolean growsInForest = forestYes.isSelected();
        boolean hasConvexCup = cupYes.isSelected();
        String mushroom;

        if (growsInForest) {
            if (hasConvexCup) {
                if (!ringYes.isSelected() && !ringNo.isSelected()) {
                    showWarning("Please answer: Does your mushroom have a ring?");
                    return;
                }
                mushroom = ringYes.isSelected() ? "Amanite tue-mouche" : "Pied bleu";
            } else {
                if (!gillsYes.isSelected() && !gillsNo.isSelected()) {
                    showWarning("Please answer: Does your mushroom have gills?");
                    return;
                }
                mushroom = gillsYes.isSelected() ? "Girolle" : "Cepe de Bordeaux";
            }
        } else {
            mushroom = hasConvexCup ? "Agaric Jaunissant" : "Coprin chevelu";
        }

        resultLabel.setText("Your mushroom is " + mushroom);
    }

    private void reset() {
        forestGroup.clearSelection();
        cupGroup.clearSelection();
        ringGroup.clearSelection();
        gillsGroup.clearSelection();
        updateEnabledQuestions();
    }

    private void showWarning(String message) {
        JOptionPane.showMessageDialog(this, message, "Missing answer", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MushroomIdentifierGUI().setVisible(true));
    }
}
