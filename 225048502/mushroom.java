import java.util.Scanner;

public class mushroom {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.println("Enter 1 for YES and 0 for NO.\n");

        System.out.print("Does your mushroom have gills? : ");
        int gills = get.nextInt();

        if (gills == 0) {
           
            System.out.println("Your mushroom is: Cepe de bordeaux");
        } else {
            
            System.out.print("Does your mushroom grow in a forest? : ");
            int forest = get.nextInt();

            if (forest == 0) {
                
                System.out.print("Does your mushroom have a convex cup? : ");
                int convex = get.nextInt();

                if (convex == 1) {
                    System.out.println("Your mushroom is: Agaric jaunissant");
                } else {
                    System.out.println("Your mushroom is: Coprin chevelu");
                }
            } else {
                
                System.out.print("Does your mushroom have a ring? : ");
                int ring = get.nextInt();

                if (ring == 1) {
                    System.out.println("Your mushroom is: Amanite tue-mouches");
                } else {
                    System.out.print("Does your mushroom have a convex cup? : ");
                    int convex = get.nextInt();

                    if (convex == 1) {
                        System.out.println("Your mushroom is: Pied bleu");
                    } else {
                        System.out.println("Your mushroom is: Girolle");
                    }
                }
            }
        }

        get.close();
    }
}
