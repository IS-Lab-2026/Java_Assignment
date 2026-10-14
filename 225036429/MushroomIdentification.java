import java.util.Scanner;

public class MushroomIdentification {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String cup;
        String forest;
        String ring;
        String gills;

        System.out.print("Does the mushroom have a convex cup? (yes/no): ");
        cup = input.nextLine().toLowerCase();

        if (cup.equals("yes")) {

            System.out.print("Does the mushroom grow in a forest? (yes/no): ");
            forest = input.nextLine().toLowerCase();

            if (forest.equals("no")) {

                System.out.println("The mushroom is Agaric jaunissant.");

            } else {

                System.out.print("Does the mushroom have a ring? (yes/no): ");
                ring = input.nextLine().toLowerCase();

                if (ring.equals("yes")) {
                    System.out.println("The mushroom is Amanite tue-mouche.");
                } else {
                    System.out.println("The mushroom is Pied bleu.");
                }
            }

        } else {

            System.out.print("Does the mushroom have gills? (yes/no): ");
            gills = input.nextLine().toLowerCase();

            if (gills.equals("no")) {

                System.out.println("The mushroom is Cepe de bordeaux.");

            } else {

                System.out.print("Does the mushroom grow in a forest? (yes/no): ");
                forest = input.nextLine().toLowerCase();

                if (forest.equals("no")) {
                    System.out.println("The mushroom is Coprin chevelu.");
                } else {
                    System.out.println("The mushroom is Girolle.");
                }
            }
        }

        input.close();
    }
}
