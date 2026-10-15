import java.util.Scanner;

public class MushroomIdentification {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Does your mushroom have gills? (yes/no): ");
        String gills = input.nextLine().toLowerCase();

        if (gills.equals("no")) {
            System.out.println("Your mushroom is Cepe de bordeaux.");

        } else {
            System.out.print("Does your mushroom grow in a forest? (yes/no): ");
            String forest = input.nextLine().toLowerCase();

            if (forest.equals("no")) {
                System.out.print("Does your mushroom have a convex cup? (yes/no): ");
                String convexCup = input.nextLine().toLowerCase();

                if (convexCup.equals("yes")) {
                    System.out.println("Your mushroom is Agaric jaunissant.");
                } else {
                    System.out.println("Your mushroom is Coprin chevelu.");
                }

            } else {
                System.out.print("Does your mushroom have a ring? (yes/no): ");
                String ring = input.nextLine().toLowerCase();

                if (ring.equals("no")) {
                    System.out.println("Your mushroom is Girolle.");
                } else {
                    System.out.println(
                        "Your mushroom is either Amanite tue-mouche or Pied bleu."
                    );
                }
            }
        }

        input.close();
    }
}
