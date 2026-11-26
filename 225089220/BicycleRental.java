package com.mycompany.quitbuttonexample;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class QuitButtonExample extends JFrame {

    public QuitButtonExample() {
        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);
        //panel.setBackground(Color.BLUE); // Sets the background color

        // Label and TextField for Starting Time
        JLabel startLabel = new JLabel("Enter starting time (0-23):");
        startLabel.setForeground(Color.BLACK);
        startLabel.setBounds(50, 30, 180, 25);
        panel.add(startLabel);

        JTextField startTimeField = new JTextField();
        startTimeField.setBounds(230, 30, 150, 25);
        panel.add(startTimeField);

        // Label and TextField for Ending Time
        JLabel endLabel = new JLabel("Enter ending time (1-24):");
        endLabel.setForeground(Color.BLACK);
        endLabel.setBounds(50, 70, 180, 25);
        panel.add(endLabel);

        JTextField endTimeField = new JTextField();
        endTimeField.setBounds(230, 70, 150, 25);
        panel.add(endTimeField);

        // Label to display the result or error message
        JLabel resultLabel = new JLabel("");
        resultLabel.setForeground(Color.YELLOW);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        resultLabel.setBounds(50, 160, 400, 30);
        panel.add(resultLabel);

        // Calculate Button
        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(50, 115, 100, 25);
        panel.add(calculateButton);

        // Quit Button
        JButton quitButton = new JButton("Quit");
        quitButton.setBounds(170, 115, 80, 25);
        panel.add(quitButton);

        // Calculation Logic when Calculate is clicked
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    int startTime = Integer.parseInt(startTimeField.getText().trim());
                    int endTime = Integer.parseInt(endTimeField.getText().trim());

                    if (startTime < 0 || startTime > 23 ||
                        endTime < 1 || endTime > 24 ||
                        startTime >= endTime) {

                        resultLabel.setForeground(Color.RED);
                        resultLabel.setText("Invalid time.");
                        return;
                    }

                    int total = 0;

                    for (int hour = startTime; hour < endTime; hour++) {
                        if (hour < 7) {
                            total += 500;
                        } else if (hour < 14) {
                            total += 1000;
                        } else if (hour < 19) {
                            total += 1500;
                        } else if (hour < 21) {
                            total += 1000;
                        } else {
                            total += 500;
                        }
                    }

                    resultLabel.setForeground(Color.GREEN);
                    resultLabel.setText("Total rental cost: " + total + " RWF");

                } catch (NumberFormatException e) {
                    resultLabel.setForeground(Color.RED);
                    resultLabel.setText("Please enter valid whole numbers.");
                }
            }
        });

        // Quit Action
        quitButton.addActionListener((ActionEvent event) -> {
            System.exit(0);
        });

        setTitle("Rental Calculations");
        setSize(800, 500);
        setLocationRelativeTo(null); // Centers the window on screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            QuitButtonExample ex = new QuitButtonExample();
            ex.setVisible(true);
        });
    }
}