import java.util.Scanner;

public class Mushroom {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer;
        String mushroom;

        System.out.print("Does it have gills? yes/no: ");
        answer = input.nextLine();

        if (answer.equals("no")) {

            mushroom = "Cepe de Bordeaux";

        } else {

            System.out.print("Does it grow in a forest? yes/no: ");
            answer = input.nextLine();

            if (answer.equals("no")) {

                System.out.print("Does it have a convex cup? yes/no: ");
                answer = input.nextLine();

                if (answer.equals("yes")) {
                    mushroom = "Agaric Jaunissant";
                } else {
                    mushroom = "Coprin chevelu";
                }

            } else {

                System.out.print("Does it have a ring? yes/no: ");
                answer = input.nextLine();

                if (answer.equals("yes")) {

                    mushroom = "Amanite tue-mouche";

                } else {

                    System.out.print("Does it have a convex cup? yes/no: ");
                    answer = input.nextLine();

                    if (answer.equals("yes")) {
                        mushroom = "Pied bleu";
                    } else {
                        mushroom = "Girolle";
                    }
                }
            }
        }

        System.out.println("Your mushroom is: " + mushroom);
    }
}


