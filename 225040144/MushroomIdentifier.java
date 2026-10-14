import java.util.Scanner;

public class MushroomIdentifier {

    public static boolean askYesNo(
            Scanner input, String question) {

        while (true) {
            System.out.print(question + " (yes/no): ");

            String answer = input.nextLine()
                                 .trim()
                                 .toLowerCase();

            if (answer.equals("yes") || answer.equals("y")) {
                return true;
            } else if (answer.equals("no") ||
                       answer.equals("n")) {
                return false;
            } else {
                System.out.println(
                    "Invalid answer. Please enter yes or no."
                );
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String mushroom;

        boolean convexCup = askYesNo(
            input,
            "Does your mushroom have a convex cup?"
        );

        if (convexCup) {

            boolean ring = askYesNo(
                input,
                "Does your mushroom have a ring?"
            );

            if (ring) {
                boolean forest = askYesNo(
                    input,
                    "Does your mushroom grow in a forest?"
                );

                if (forest) {
                    mushroom = "Amanite tue-mouche";
                } else {
                    mushroom = "Agaric jaunissant";
                }

            } else {
                mushroom = "Pied bleu";
            }

        } else {

            boolean gills = askYesNo(
                input,
                "Does your mushroom have gills?"
            );

            if (!gills) {
                mushroom = "Cepe de Bordeaux";
            } else {
                boolean forest = askYesNo(
                    input,
                    "Does your mushroom grow in a forest?"
                );

                if (forest) {
                    mushroom = "Girolle";
                } else {
                    mushroom = "Coprin chevelu";
                }
            }
        }

        System.out.println(
            "The identified mushroom is: " + mushroom
        );

        input.close();
    }
}