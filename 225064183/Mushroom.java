import java.util.Scanner;
public class Mushroom {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        


        String gills;
        String forest;
        String ring;

        System.out.print("Does your mushroom have gills? ");
        gills = input.nextLine();

        if (gills.equals("no")) {

            System.out.println("Your mushroom is Cepe de Bordeaux");

        } else {

            System.out.print("Does your mushroom grow in a forest? ");
            forest = input.nextLine();

            if (forest.equals("no")) {

                System.out.print("Does your mushroom have a convex cup? ");
                String cup = input.nextLine();

                if (cup.equals("yes")) {
                    System.out.println("Your mushroom is Agaric Jaunissant");
                } else {
                    System.out.println("Your mushroom is Coprin chevelu");
                }

            } else {

                System.out.print("Does your mushroom have a ring? ");
                ring = input.nextLine();

                if (ring.equals("yes")) {
                    System.out.println("Your mushroom is Amanite tue-mouche");
                } else {
                    System.out.println("Your mushroom is Pied bleu");
                }
                input.close();
            }
        }
    }
}