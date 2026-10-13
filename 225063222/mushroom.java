package  lab1;

import java.util.Scanner;

public class lab {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer;
        String mushroom;

        System.out.print("Does your mushroom have gills? (yes/no): ");
        answer = input.nextLine();

        if (answer.equals("no")) {

            mushroom = "Cepe de bordeaux";

        } else {

            System.out.print("Does your mushroom grow in a forest? (yes/no): ");
            answer = input.nextLine();

            if (answer.equals("no")) {

                System.out.print("Does your mushroom have a ring? (yes/no): ");
                answer = input.nextLine();

                if (answer.equals("yes")) {
                    mushroom = "Coprin chevelu";
                } else {
                    mushroom = "Agaric jaunissant";
                }

            } else {

                System.out.print("Does your mushroom have a ring? (yes/no): ");
                answer = input.nextLine();

                if (answer.equals("yes")) {
                    mushroom = "Amanite tue-mouche";
                } else {
                    mushroom = "Girolle or Pied bleu";
                }
            }
        }

        
        System.out.println("Your mushroom is: " + mushroom);
    }
}