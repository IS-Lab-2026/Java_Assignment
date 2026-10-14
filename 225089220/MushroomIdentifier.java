import java.util.Scanner;

public class MushroomIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Mushroom Identifier ---");
        System.out.println("Think of one of these mushrooms:");
        System.out.println("- Agaric Jaunissant\n- Amanite tue-mouche\n- Cepe de bordeau\n- Coprin chevelu\n- Pied bleu\n");
        System.out.println("Please answer the following questions with 'yes' or 'no'.\n");

        // Question 1: Does it have gills? (Cepe de Bordeaux is the only one with pores, meaning no gills)
        System.out.print("Does your mushroom have gills? (yes/no): ");
        String gills = scanner.nextLine().trim().toLowerCase();

        if (gills.equals("no")) {
            // Cepe de Bordeaux has pores, so it is the only one without gills.
            System.out.println("\nYour mushroom is: Cepe de bordeau");
        } else {
            // Remaining: Agaric Jaunissant, Amanite tue-mouche, Coprin chevelu, Pied bleu
            
            // Question 2: Does it grow in a forest?
            System.out.print("Does your mushroom grow in a forest? (yes/no): ");
            String forest = scanner.nextLine().trim().toLowerCase();

            if (forest.equals("yes")) {
                // Remaining: Amanite tue-mouche, Pied bleu (Forest growers)
                
                // Question 3: Does it have a ring?
                System.out.print("Does your mushroom have a ring? (yes/no): ");
                String ring = scanner.nextLine().trim().toLowerCase();

                if (ring.equals("yes")) {
                    System.out.println("\nYour mushroom is: Amanite tue-mouche");
                } else {
                    System.out.println("\nYour mushroom is: Pied bleu");
                }
                
            } else {
                // Remaining: Agaric Jaunissant, Coprin chevelu (Meadow growers)
                
                // Question 3: Does it have a convex cup?
                System.out.print("Does your mushroom have a convex cup? (yes/no): ");
                String convex = scanner.nextLine().trim().toLowerCase();

                if (convex.equals("yes")) {
                    System.out.println("\nYour mushroom is: Agaric jaunissant");
                } else {
                    System.out.println("\nYour mushroom is: Coprin chevelu");
                }
            }
        }

        scanner.close();
    }
}