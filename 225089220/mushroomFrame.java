import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MushroomIdentifier extends JFrame {

    private JLabel headerLabel;
    private JLabel questionLabel;
    private JButton yesButton;
    private JButton noButton;
    private JButton resetButton;

    private int currentStep = 1;

    public MushroomIdentifier() {
        setTitle("Mushroom Identifier - Problem 2");
        setSize(500, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(15, 15));

        headerLabel = new JLabel(
            "<html><center><b>Think of one mushroom:</b><br>" +
            "Agaric Jaunissant | Amanite tue-mouche | Cèpe de Bordeaux | Coprin chevelu | Pied bleu" +
            "</center></html>",
            SwingConstants.CENTER
        );
        headerLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));
        headerLabel.setBorder(BorderFactory.createEmptyBorder(15, 10, 5, 10));
        add(headerLabel, BorderLayout.NORTH);

        questionLabel = new JLabel("Question 1: Does your mushroom have gills?", SwingConstants.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        questionLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        add(questionLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 15));

        yesButton = new JButton("Yes");
        yesButton.setFont(new Font("Arial", Font.BOLD, 14));
        yesButton.setPreferredSize(new Dimension(100, 40));

        noButton = new JButton("No");
        noButton.setFont(new Font("Arial", Font.BOLD, 14));
        noButton.setPreferredSize(new Dimension(100, 40));

        resetButton = new JButton("Play Again");
        resetButton.setFont(new Font("Arial", Font.BOLD, 14));
        resetButton.setPreferredSize(new Dimension(130, 40));
        resetButton.setVisible(false);

        buttonPanel.add(yesButton);
        buttonPanel.add(noButton);
        buttonPanel.add(resetButton);
        add(buttonPanel, BorderLayout.SOUTH);

        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAnswer(true);
            }
        });

        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAnswer(false);
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetGame();
            }
        });
    }

    private void handleAnswer(boolean isYes) {
        switch (currentStep) {
            case 1:
                if (!isYes) {
                    showResult("Cèpe de Bordeaux");
                } else {
                    currentStep = 2;
                    questionLabel.setText("Question 2: Does your mushroom grow in a forest?");
                }
                break;

            case 2:
                if (isYes) {
                    currentStep = 3;
                    questionLabel.setText("Question 3: Does your mushroom have a ring?");
                } else {
                    currentStep = 4;
                    questionLabel.setText("Question 3: Does your mushroom have a convex cup?");
                }
                break;

            case 3:
                if (isYes) {
                    showResult("Amanite tue-mouche");
                } else {
                    showResult("Pied bleu");
                }
                break;

            case 4:
                if (isYes) {
                    showResult("Agaric jaunissant");
                } else {
                    showResult("Coprin chevelu");
                }
                break;
        }
    }

    private void showResult(String mushroomName) {
        questionLabel.setText("<html><center>Your mushroom is:<br><br><font color='blue' size='5'>" + mushroomName + "</font></center></html>");
        yesButton.setVisible(false);
        noButton.setVisible(false);
        resetButton.setVisible(true);
    }

    private void resetGame() {
        currentStep = 1;
        questionLabel.setText("Question 1: Does your mushroom have gills?");
        yesButton.setVisible(true);
        noButton.setVisible(true);
        resetButton.setVisible(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MushroomIdentifier().setVisible(true);
            }
        });
    }
}