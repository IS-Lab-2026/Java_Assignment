import java.util.Scanner;

public class MushroomIdentification {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String gills, forest, ring, convexCup;
        String mushroom;

        System.out.print("Does your mushroom have gills? (yes/no): ");
        gills = input.nextLine();

        System.out.print("Does your mushroom grow in a forest? (yes/no): ");
        forest = input.nextLine();

        System.out.print("Does your mushroom have a ring? (yes/no): ");
        ring = input.nextLine();

        if (gills.equalsIgnoreCase("no")) {
            mushroom = "Cepe de bordeau";
        }
        else if (forest.equalsIgnoreCase("no")) {

            if (ring.equalsIgnoreCase("yes")) {
                mushroom = "Coprin chevelu";
            }
            else {
                mushroom = "Agaric jaunissant";
            }
        }
        else {

            if (ring.equalsIgnoreCase("yes")) {
                mushroom = "Amanite tue-mouche";
            }
            else {
                mushroom = "Girolle or Pied bleu";
            }
        }

        System.out.println("Your mushroom is: " + mushroom);

        input.close();
    }
}