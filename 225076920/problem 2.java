import java.util.Scanner;

public class MushroomIdentifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mushroom;

        System.out.println("Think of one of the six mushrooms.");
        System.out.println("Answer each question with yes or no.");

        boolean forest = ask(input, "Does your mushroom grow in a forest? ");

        if (!forest) {
            // Meadow mushrooms: Agaric jaunissant and Coprin chevelu.
            boolean convexCup = ask(input, "Does your mushroom have a convex cup/cap? ");
            mushroom = convexCup ? "Agaric jaunissant" : "Coprin chevelu";
        } else {
            boolean convexCup = ask(input, "Does your mushroom have a convex cup/cap? ");

            if (convexCup) {
                // Forest mushrooms with a convex cup/cap:
                // Amanite tue-mouches has a ring; Pied bleu does not.
                boolean ring = ask(input, "Does your mushroom have a ring? ");
                mushroom = ring ? "Amanite tue-mouches" : "Pied bleu";
            } else {
                // Forest mushrooms without a convex cup/cap:
                // Cepe de Bordeaux has pores (not gills); Girolle has gills.
                boolean gills = ask(input, "Does your mushroom have gills? ");
                mushroom = gills ? "Girolle" : "Cepe de Bordeaux";
            }
        }

        System.out.println("Your mushroom is: " + mushroom);
        input.close();
    }

    private static boolean ask(Scanner input, String question) {
        while (true) {
            System.out.print(question);
            String answer = input.nextLine().trim().toLowerCase();

            if (answer.equals("yes") || answer.equals("y")) {
                return true;
            }
            if (answer.equals("no") || answer.equals("n")) {
                return false;
            }

            System.out.println("Please answer yes or no.");
        }
    }
}
