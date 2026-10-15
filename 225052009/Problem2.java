import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mushroom;

        System.out.println("Think of one of the six mushrooms and answer the questions truthfully.");

        boolean hasRing = askYesNo(input, "Does your mushroom have a ring? (yes/no): ");

        if (hasRing) {
            boolean growsInForest = askYesNo(input, "Does your mushroom grow in a forest? (yes/no): ");

            if (growsInForest) {
                mushroom = "Amanite tue-mouche";
            } else {
                boolean hasConvexCup = askYesNo(input, "Does your mushroom have a convex cup? (yes/no): ");
                if (hasConvexCup) {
                    mushroom = "Agaric Jaunissant";
                } else {
                    mushroom = "Coprin chevelu";
                }
            }
        } else {
            boolean hasGills = askYesNo(input, "Does your mushroom have gills? (yes/no): ");

            if (!hasGills) {
                mushroom = "Cepe de Bordeaux";
            } else {
                boolean hasConvexCup = askYesNo(input, "Does your mushroom have a convex cup? (yes/no): ");
                if (hasConvexCup) {
                    mushroom = "Pied bleu";
                } else {
                    mushroom = "Girolle";
                }
            }
        }

        System.out.println("Your mushroom is: " + mushroom);
        input.close();
    }

    private static boolean askYesNo(Scanner input, String question) {
        while (true) {
            System.out.print(question);
            String answer = input.nextLine().trim();
            if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
                return true;
            }
            if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
                return false;
            }
            System.out.println("Please answer yes or no.");
        }
    }
}
