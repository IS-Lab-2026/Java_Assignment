import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer;
        String mushroom;

        System.out.println("MUSHROOM IDENTIFICATION SYSTEM");
        System.out.println("Answer each question with yes or no.");

        System.out.print("Does your mushroom have gills? ");
        answer = input.nextLine().trim().toLowerCase();

        if (answer.equals("no")) {
            mushroom = "Cepe de bordeaux";

        } else if (answer.equals("yes")) {

            System.out.print("Does your mushroom grow in a meadow? ");
            answer = input.nextLine().trim().toLowerCase();

            if (answer.equals("yes")) {

                System.out.print("Does your mushroom have a convex cup? ");
                answer = input.nextLine().trim().toLowerCase();

                if (answer.equals("yes")) {
                    mushroom = "Agaric jaunissant";
                } else {
                    mushroom = "Coprin chevelu";
                }

            } else {

                System.out.print("Does your mushroom have a ring? ");
                answer = input.nextLine().trim().toLowerCase();

                if (answer.equals("yes")) {
                    mushroom = "Amanite tue-mouches";
                } else {

                    System.out.print("Does your mushroom have a convex cup? ");
                    answer = input.nextLine().trim().toLowerCase();

                    if (answer.equals("yes")) {
                        mushroom = "Pied bleu";
                    } else {
                        mushroom = "Girolle";
                    }
                }
            }

        } else {
            mushroom = "Invalid answer";
        }

        System.out.println("Identified mushroom: " + mushroom);

        input.close();
    }
}
