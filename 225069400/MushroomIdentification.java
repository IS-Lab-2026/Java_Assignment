import java.util.Scanner;

public class MushroomIdentification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String mushroom;

        System.out.println("Think of one of the six mushrooms.");
        System.out.println("Answer using yes or no.");

        System.out.print("Does your mushroom have gills? ");
        String gills = input.nextLine().trim().toLowerCase();

        if (gills.equals("no")) {
            mushroom = "Cepe de Bordeaux";
        } else {
            System.out.print("Does your mushroom grow in a forest? ");
            String forest = input.nextLine().trim().toLowerCase();

            if (forest.equals("no")) {
                System.out.print("Does your mushroom have a convex cup? ");
                String convex = input.nextLine().trim().toLowerCase();

                if (convex.equals("yes")) {
                    mushroom = "Agaric jaunissant";
                } else {
                    mushroom = "Coprin chevelu";
                }
            } else {
                System.out.print("Does your mushroom have a convex cup? ");
                String convex = input.nextLine().trim().toLowerCase();

                if (convex.equals("no")) {
                    System.out.print("Does your mushroom have a ring? ");
                    String ring = input.nextLine().trim().toLowerCase();

                    if (ring.equals("yes")) {
                        mushroom = "Amanite tue-mouche";
                    } else {
                        mushroom = "Girolle";
                    }
                } else {
                    mushroom = "Pied bleu";
                }
            }
        }

        System.out.println("Your mushroom is: " + mushroom);

        input.close();
    }
}
