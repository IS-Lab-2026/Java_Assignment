import java.util.Scanner;

public class Mushroom {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String forest;
        String convex;
        String ring;
        String gills;

        System.out.println("Think of one of the six mushrooms.");

        System.out.print("Does your mushroom grow in a forest? ");
        forest = input.nextLine();

        if (forest.equalsIgnoreCase("no")) {

            System.out.print("Does your mushroom have a convex cup? ");
            convex = input.nextLine();

            if (convex.equalsIgnoreCase("yes")) {
                System.out.println("Your mushroom is Agaric jaunissant.");
            }
            else {
                System.out.println("Your mushroom is Coprin chevelu.");
            }
        }

        else {

            System.out.print("Does your mushroom have a convex cup? ");
            convex = input.nextLine();

            if (convex.equalsIgnoreCase("yes")) {

                System.out.print("Does your mushroom have a ring? ");
                ring = input.nextLine();

                if (ring.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is Amanite tue-mouches.");
                }
                else {
                    System.out.println("Your mushroom is Pied bleu.");
                }
            }

            else {

                System.out.print("Does your mushroom have gills? ");
                gills = input.nextLine();

                if (gills.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is Girolle.");
                }
                else {
                    System.out.println("Your mushroom is Cepe de Bordeaux.");
                }
            }
        }
    }
}
