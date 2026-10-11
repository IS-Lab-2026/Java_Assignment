import java.util.Scanner;
public class Mushroom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Think of one of: Agaric Jaunissant, Amanite tue-mouche, Cepe de Bordeaux,");
        System.out.println("Coprin chevelu, Girolle, Pied bleu.");
        System.out.println("Answer each question with yes or no.\n");
        String result;
        System.out.print("Does your mushroomw1 have a convex cup? ");
        String convex = input.next();
        if (convex.equals("yes")) {
            System.out.print("Does your mushroom grow in a forest? ");
            String forest = input.next();
            if (forest.equals("no")) {
                result = "Agaric Jaunissant";
            } else {
                System.out.print("Does your mushroom have a ring? ");
                String ring = input.next();
                if (ring.equals("yes")) {
                    result = "Amanite tue-mouche";
                } else {
                    result = "Pied bleu";
                }
            }
        } else {
            System.out.print("Does your mushroom have gills? ");
            String gills = input.next();
            if (gills.equals("no")) {
                result = "Cepe de Bordeaux";
            } else {
                System.out.print("Does your mushroom grow in a forest? ");
                String forest = input.next();
                if (forest.equals("yes")) {
                    result = "Girolle";
                } else {
                    result = "Coprin chevelu";
                }
            }
        }

        System.out.println("\nYour mushroom is: " + result);
    }
}