  import java.util.Scanner;

public class MushroomGuess {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Think of one of these mushrooms:");
        System.out.println("1. Agaric Jaunissant");
        System.out.println("2. Amanite tue-mouche");
        System.out.println("3. Cepe de Bordeaux");
        System.out.println("4. Coprin chevelu");
        System.out.println("5. Girolle");
        System.out.println("6. Pied bleu");
        System.out.println();
      
        System.out.print("Does your mushroom have gills? (yes/no): ");
        String gills = input.nextLine().toLowerCase();

        if (gills.equals("no")) {
            
            System.out.println("Your mushroom is: Cepe de Bordeaux");
        } 
        else {
            
            System.out.print("Does your mushroom grow in a forest? (yes/no): ");
            String forest = input.nextLine().toLowerCase();

            if (forest.equals("no")) {
                System.out.print("Does your mushroom have a ring? (yes/no): ");
                String ring = input.nextLine().toLowerCase();

                if (ring.equals("yes")) {
                    System.out.println("Your mushroom is: Agaric Jaunissant");
                } else {
                    System.out.println("Your mushroom is: Coprin Chevelu");
                }
            } 
            else {
                System.out.print("Does your mushroom have a convex cup? (yes/no): ");
                String cup = input.nextLine().toLowerCase();

                if (cup.equals("yes")) {
                    
                    System.out.print("Does your mushroom have a ring? (yes/no): ");
                    String ring = input.nextLine().toLowerCase();

                    if (ring.equals("yes")) {
                        System.out.println("Your mushroom is: Amanite tue-mouche");
                    } else {
                        System.out.println("Your mushroom is: Pied bleu");
                    }
                } else {
                    System.out.println("Your mushroom is: Girolle");
                }
            }
        }

        input.close();
    }
}


