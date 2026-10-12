import java.util.Scanner;

public class MushroomFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer;

        System.out.println("Think of one of these mushrooms:");
        System.out.println("Agaric Jaunissant, Amanite tue-mouche, Cepe de bordeaux,");
        System.out.println("Coprin chevelu, Girolle, Pied bleu");
        System.out.println("Answer each question with 1 for YES or 0 for NO.\n");

        System.out.print("Does your mushroom grow in a forest? ");
        answer = input.nextInt();

        if (answer == 0) {
            // Meadow: Agaric jaunissant or Coprin chevelu
            System.out.print("Does your mushroom have a convex cup? ");
            answer = input.nextInt();
            if (answer == 1) {
                System.out.println("Your mushroom is: Agaric Jaunissant");
            } else {
                System.out.println("Your mushroom is: Coprin chevelu");
            }
        } else {
            // Forest: Amanite, Pied bleu, Cepe or Girolle
            System.out.print("Does your mushroom have a convex cup? ");
            answer = input.nextInt();
            if (answer == 1) {
                // Amanite tue-mouche or Pied bleu
                System.out.print("Does your mushroom have a ring? ");
                answer = input.nextInt();
                if (answer == 1) {
                    System.out.println("Your mushroom is: Amanite tue-mouche");
                } else {
                    System.out.println("Your mushroom is: Pied bleu");
                }
            } else {
                // Cepe de bordeaux or Girolle
                System.out.print("Does your mushroom have gills? ");
                answer = input.nextInt();
                if (answer == 1) {
                    System.out.println("Your mushroom is: Girolle");
                } else {
                    System.out.println("Your mushroom is: Cepe de bordeaux");
                }
            }
        }
        input.close();
    }
}
