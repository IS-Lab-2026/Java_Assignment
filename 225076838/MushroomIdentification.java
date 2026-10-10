import java.util.Scanner;

public class MushroomIdentification {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer;

        System.out.println("Answer each question with yes or no.");
        System.out.println();

        System.out.print("Does your mushroom have gills? ");
        answer = input.nextLine();

        if (answer.equals("no")) {

            System.out.println("Your mushroom is Cepe de Bordeaux.");

        } else {
            System.out.print("Does your mushroom grow in a forest? ");
            answer = input.nextLine();

            if (answer.equals ("no")) {
                System.out.print("Does your mushroom have a convex cup? ");
                answer = input.nextLine();

                if (answer.equals ("yes")) {
                    System.out.println("Your mushroom is Agaric Jaunissant.");
                } else {
                    System.out.println("Your mushroom is Coprin chevelu.");
                }

            } else {
                System.out.print("Does your mushroom have a ring? ");
                answer = input.nextLine();

                if (answer.equals ("yes")) {

                    System.out.println("Your mushroom is Amanite tue-mouche.");

                } else {
                }
            }
        }

        input.close();
    }
}
