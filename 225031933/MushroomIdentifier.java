import java.util.Scanner;

public class MushroomIdentifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean ring = ask(input, "Does your mushroom have a ring? (yes/no)");

        if (ring) {
            boolean forest = ask(input, "Does your mushroom grow in a forest? (yes/no)");

            if (forest) {
                System.out.println("Your mushroom is Amanite tue-mouche.");
            } else {
                boolean convexCup = ask(input, "Does your mushroom have a convex cup? (yes/no)");

                if (convexCup) {
                    System.out.println("Your mushroom is Agaric jaunissant.");
                } else {
                    System.out.println("Your mushroom is Coprin chevelu.");
                }
            }
        } else {
            boolean gills = ask(input, "Does your mushroom have gills? (yes/no)");

            if (!gills) {
                System.out.println("Your mushroom is Cep de bordeaux.");
            } else {
                boolean convexCup = ask(input, "Does your mushroom have a convex cup? (yes/no)");

                if (convexCup) {
                    System.out.println("Your mushroom is Pied bleu.");
                } else {
                    System.out.println("Your mushroom is Girolle.");
                }
            }
        }

        input.close();
    }

    private static boolean ask(Scanner input, String question) {
        while (true) {
            System.out.print(question + " ");
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