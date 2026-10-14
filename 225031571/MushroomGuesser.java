import java.util.Scanner; 
public class MushroomGuesser { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.print("Does your mushroom have a ring? (yes/no): "); 
        String ring = scanner.next(); 
 
        if (ring.equals("yes")) { 
            System.out.print("Does your mushroom grow in a forest? (yes/no): "); 
            String forest = scanner.next(); 
 
            if (forest.equals("yes")) { 
                System.out.println("It is Amanite tue-mouche"); 
            } else { 
                System.out.print("Does your mushroom have a convex cup? (yes/no): "); 
                String cup = scanner.next(); 
 
                if (cup.equals("yes")) { 
                    System.out.println("It is Agaric jaunissant"); 
                } else { 
                    System.out.println("It is Coprin chevelu"); 
                } 
            } 
        } else { 
            System.out.print("Does your mushroom have gills? (yes/no): "); 
            String gills = scanner.next(); 
 
            if (gills.equals("no")) { 
                System.out.println("It is Cepe de bordeaux"); 
            } else { 
                System.out.print("Does your mushroom have a convex cup? (yes/no): "); 
                String cup = scanner.next(); 
 
                if (cup.equals("yes")) { 
                    System.out.println("It is Pied bleu"); 
                } else { 
                    System.out.println("It is Girolle"); 
                } 
            } 
        } 
    } 
}yes