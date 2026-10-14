import java.util.Scanner;

public class Mashroom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Think of one of the following mushrooms:");
        System.out.println("- Agaric Jaunissant");
        System.out.println("- Amanite tue-mouche");
        System.out.println("- Cepe de Bordeaux");
        System.out.println("- Coprin chevelu");
        System.out.println("- Girolle");
        System.out.println("- Pied bleu");
        System.out.print("Does your mushroom have a convex cup? (yes/no): ");
        String answer1 = scanner.nextLine().trim().toLowerCase();

        if (answer1.equals("yes")) {
            System.out.print("Does your mushroom have a ring? (yes/no): ");
            String answer2 = scanner.nextLine().trim().toLowerCase();

            if (answer2.equals("yes")) {
 
                System.out.print("Does your mushroom grow in a forest? (yes/no): ");
                String answer3 = scanner.nextLine().trim().toLowerCase();

                if (answer3.equals("yes")) {
                    System.out.println("\nYour mushroom is: Amanite tue-mouche");
                } else {
                    System.out.println("\nYour mushroom is: Agaric Jaunissant");
                }

            }
            else {
                 System.out.println("\nYour mushroom is: Pied bleu");
            }

        }
        else {

            System.out.print("Does your mushroom have a ring? (yes/no): ");
            String answer2 = scanner.nextLine().trim().toLowerCase();

            if (answer2.equals("yes")) {
    
                System.out.println("\nYour mushroom is: Coprin chevelu");

            }
            else {
                System.out.print("Does your mushroom have gills? (yes/no): ");
                String answer3 = scanner.nextLine().trim().toLowerCase();

                if (answer3.equals("yes")) {
                    System.out.println("\nYour mushroom is: Girolle");
                } else {
                    System.out.println("\nYour mushroom is: Cepe de Bordeaux");
                }
            }
        }

    
    }
}
