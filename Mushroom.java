import java.util.Scanner;

public class Mushroom {

    // Helper method to read a boolean yes/no response
    private static boolean askQuestion(Scanner scanner, String question) {
        while (true) {
            System.out.print(question + " (yes/no): ");
            String input = scanner.next().trim().toLowerCase();
            if (input.equals("yes") || input.equals("y")) {
                return true;
            } else if (input.equals("no") || input.equals("n")) {
                return false;
            }
            System.out.println("Invalid input. Please answer with 'yes' or 'no'.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of one of the six mushrooms:");
        System.out.println("- Agaric Jaunissant\n- Amanite Tue-Mouche\n- Cèpe de Bordeaux");
        System.out.println("- Coprin Chevelu\n- Girolle\n- Pied Bleu\n");

        // Question 1: Gills
        boolean hasGills = askQuestion(scanner, "Does your mushroom have gills?");

        if (!hasGills) {
            // Only Cèpe de Bordeaux lacks gills (1 question used)
            System.out.println("\nYour mushroom is: Cèpe de Bordeaux");
        } else {
            // Question 2: Forest
            boolean inForest = askQuestion(scanner, "Does your mushroom grow in a forest?");

            if (inForest) {
                // Candidates: Amanite Tue-Mouche, Girolle, Pied Bleu
                // Question 3: Convex Cap
                boolean hasConvexCap = askQuestion(scanner, "Does your mushroom have a convex cap?");

                if (hasConvexCap) {
                    // Candidates: Amanite Tue-Mouche, Pied Bleu
                    // Ask about the ring to differentiate (4 questions used)
                    boolean hasRing = askQuestion(scanner, "Does your mushroom have a ring?");
                    if (hasRing) {
                        System.out.println("\nYour mushroom is: Amanite Tue-Mouche");
                    } else {
                        System.out.println("\nYour mushroom is: Pied Bleu");
                    }
                } else {
                    // Only Girolle in forest without a convex cap (3 questions used)
                    System.out.println("\nYour mushroom is: Girolle");
                }
            } else {
                // Candidates in Meadow (not forest): Agaric Jaunissant, Coprin Chevelu
                // Question 3: Convex Cap (3 questions used)
                boolean hasConvexCap = askQuestion(scanner, "Does your mushroom have a convex cap?");

                if (hasConvexCap) {
                    System.out.println("\nYour mushroom is: Agaric Jaunissant");
                } else {
                    System.out.println("\nYour mushroom is: Coprin Chevelu");
                }
            }
        }

        scanner.close();
    }
}
