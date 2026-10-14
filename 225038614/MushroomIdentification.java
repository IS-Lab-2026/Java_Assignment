import java.util.Scanner;

public class MushroomIdentification {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Answer with yes or no.");

        System.out.print("Does your mushroom have gills? ");
        String gills = input.nextLine();

        if (gills.equalsIgnoreCase("no")) {

            System.out.println("Your mushroom is Cepe de bordeaux.");

        } else {

            System.out.print("Does your mushroom grow in a forest? ");
            String forest = input.nextLine();

            if (forest.equalsIgnoreCase("no")) {

                System.out.print("Does your mushroom have a ring? ");
                String ring = input.nextLine();

                if (ring.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is Agaric jaunissant.");
                } else {
                    System.out.println("Your mushroom is Coprin chevelu.");
                }

            } else {

                System.out.print("Does your mushroom have a ring? ");
                String ring = input.nextLine();

                if (ring.equalsIgnoreCase("yes")) {

                    System.out.println("Your mushroom is Amanite tue-mouche.");

                } else {

                    System.out.print("Does your mushroom have a convex cup? ");
                    String cup = input.nextLine();

                    if (cup.equalsIgnoreCase("yes")) {
                        System.out.println("Your mushroom is Pied bleu.");
                    } else {
                        System.out.println("Your mushroom is Girolle.");
                    }
                }
            }
        }

        input.close();
    }
}