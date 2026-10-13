import java.util.Scanner;

public class Mushroom {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Think of one of the 6 mushroom(Agaric Jaunissant,Amanite Tue-mouche, Cepe de Bordeaux, Cprin Chivelu, Gillore, Pied Bleu).");
        System.out.println("Answer yes or no");
        System.out.print("Does your mushroom have a ring? ");
        String ring = input.next();

        System.out.print("Does your mushroom have a convex cup? ");
        String cup = input.next();

        if (ring.equals("yes") && cup.equals("no")) {
            System.out.println("Your mushroom is Coprin chevelu");
        }
        else if (ring.equals("no") && cup.equals("yes")) {
            System.out.println("Your mushroom Pied bleu");
        }
        else if (ring.equals("yes") && cup.equals("yes")) {
            
            System.out.print("Does your mushroom grow in a forest? ");
            String forest = input.next();

            if (forest.equals("yes")) {
                System.out.println("Your mushroom Amanite tue-mouche");
            }
            else {
                System.out.println("Your mushroom Agaric Jaunissant");
            }
        }
        else {
            
            System.out.print("Does your mushroom have gills? ");
            String gills = input.next();

            if (gills.equals("yes")) {
                System.out.println("Your mushroom is Girolle");
            }
            else {
                System.out.println("Your mushroom Cepe de bordeaux");
            }
        }
    }
}

