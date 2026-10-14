import java.util.Scanner;

public class MushroomIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Think of one of the 6 mushrooms:");
        System.out.println("- Agaric Jaunissant\n- Amanite tue-mouche\n- Cepe de bordeau\n- Coprin chevelu\n- Girolle\n- Pied bleu");
        System.out.println("Answer the following questions with 'yes' or 'no'.\n");

        // Question 1: Does your mushroom have gills?
        System.out.print("Does your mushroom have gills? (yes/no): ");
        String gills = scanner.nextLine().trim().toLowerCase();

        if (gills.equals("no")) {
            // Only Cepe de bordeaux has pores (no gills)
            System.out.println("Result: The mushroom is **Cepe de bordeau**.");
        } else {
            // Question 2: Does your mushroom grow in a forest?
            System.out.print("Does your mushroom grow in a forest? (yes/no): ");
            String forest = scanner.nextLine().trim().toLowerCase();

            if (forest.equals("no")) {
                // Grows in meadows: Coprin chevelu or Agaric jaunissant
                // Question 3: Does your mushroom have a ring?
                System.out.print("Does your mushroom have a ring? (yes/no): ");
                String ring = scanner.nextLine().trim().toLowerCase();

                if (ring.equals("yes")) {
                    // Both have rings, but let's check cup or distinguish them:
                    // Agaric jaunissant has a convex cup, Coprin chevelu does too, 
                    // but wait, let's check the rules for Coprin chevelu and Agaric jaunissant:
                    // Both grow in meadows, both have rings. 
                    // Does Agaric jaunissant have a convex cup? Yes. Does Coprin chevelu have a convex cup? Let's check:
                    // Actually, let's look at the convex cup question or ring question.
                    // Let's ask about the convex cup to separate them or check ring.
                    // Both Coprin chevelu and Agaric jaunissant have a ring. 
                    // Agaric jaunissant has a convex cup, whereas Coprin chevelu does not have a convex cup listed in that rule.
                    System.out.print("Does your mushroom have a convex cup? (yes/no): ");
                    String cup = scanner.nextLine().trim().toLowerCase();
                    if (cup.equals("yes")) {
                        System.out.println("Result: The mushroom is **Agaric Jaunissant**.");
                    } else {
                        System.out.println("Result: The mushroom is **Coprin chevelu**.");
                    }
                } else {
                    // Meadow without a ring? (None of the standard 6 fit this path directly unless checked, 
                    // but let's make sure it handles it safely)
                    System.out.println("Result: Unidentified mushroom based on answers.");
                }
            } else {
                // Grows in forests: Amanite tue-mouche, Girolle, Pied bleu
                // Question 3: Does your mushroom have a convex cup?
                System.out.print("Does your mushroom have a convex cup? (yes/no): ");
                String cup = scanner.nextLine().trim().toLowerCase();

                if (cup.equals("yes")) {
                    // Amanite tue-mouche or Pied bleu
                    // Let's check if it has a ring
                    System.out.print("Does your mushroom have a ring? (yes/no): ");
                    String ring = scanner.nextLine().trim().toLowerCase();

                    if (ring.equals("yes")) {
                        System.out.println("Result: The mushroom is **Amanite tue-mouche**.");
                    } else {
                        System.out.println("Result: The mushroom is **Pied bleu**.");
                    }
                } else {
                    // Forest without a convex cup
                    System.out.println("Result: The mushroom is **Girolle**.");
                }
            }
        }

     
    }
}