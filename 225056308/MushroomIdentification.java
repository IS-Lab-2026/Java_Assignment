import java.util.Scanner;

public class MushroomIdentification {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer;

        System.out.println("MUSHROOM IDENTIFICATION");
        System.out.println();

        // Question 1
        System.out.print("Does your mushroom have a convex cap? (yes/no): ");
        answer = input.nextLine();

        if (answer.equalsIgnoreCase("yes")) {

            // Question 2
            System.out.print("Does your mushroom grow in a forest? (yes/no): ");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("no")) {

                System.out.println("Your mushroom is: Agaric jaunissant");

            } else {

                // Question 3
                System.out.print("Does your mushroom have a ring? (yes/no): ");
                answer = input.nextLine();

                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is: Amanite tue-mouche");
                } else {
                    System.out.println("Your mushroom is: Pied bleu");
                }
            }

        } else {

            // Question 2
            System.out.print("Does your mushroom have gills? (yes/no): ");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("no")) {

                System.out.println("Your mushroom is: Cepe de bordeaux");

            } else {

                // Question 3
                System.out.print("Does your mushroom grow in a forest? (yes/no): ");
                answer = input.nextLine();

                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is: Girolle");
                } else {
                    System.out.println("Your mushroom is: Coprin chevelu");
                }
            }
        }

        input.close();
    }
}