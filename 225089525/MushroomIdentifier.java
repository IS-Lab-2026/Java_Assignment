import java.util.Scanner;

public class MushroomIdentifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Think of one mushroom: Agaric Jaunissant, Amanite tue-mouche, Cepe de Bordeaux, Coprin chevelu, Girolle, Pied bleu");
        System.out.println("Answer with yes or no.");

        System.out.print("Does your mushroom grow in a forest? ");
        String growsInForest = input.next();
        System.out.print("Does your mushroom have a convex cup? ");
        String hasConvexCup = input.next();

        if (growsInForest.equalsIgnoreCase("yes")) {
            if (hasConvexCup.equalsIgnoreCase("yes")) {
                System.out.print("Does your mushroom have a ring? ");
                String hasRing = input.next();
                if (hasRing.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is Amanite tue-mouche");
                } else {
                    System.out.println("Your mushroom is Pied bleu");
                }
            } else {
                System.out.print("Does your mushroom have gills? ");
                String hasGills = input.next();
                if (hasGills.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is Girolle");
                } else {
                    System.out.println("Your mushroom is Cepe de Bordeaux");
                }
            }
        } else {
            if (hasConvexCup.equalsIgnoreCase("yes")) {
                System.out.println("Your mushroom is Agaric Jaunissant");
            } else {
                System.out.println("Your mushroom is Coprin chevelu");
            }
        }

        input.close();
    }
}
