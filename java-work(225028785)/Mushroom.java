import java.util.*;

public class Mushroom {
    public static void main(String[] args) {
        boolean answer,answer2,answer3;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Mushroom guess game (Type true for YES and false for NO)");
        System.out.println("Does your mushroom have a ring?");
        answer = input.nextBoolean();
        
        if (answer) {
            System.out.println("Does your mushroom have a convex cup?");
            answer2 = input.nextBoolean();
            
            if (answer2) {
                System.out.println("Does your mushroom grow in meadows?");
                answer3 = input.nextBoolean();
                
                if (answer3) {
                    System.out.println("Mushroom: Agaric jaunissant");
                } else if (!answer3) {
                    System.out.println("Mushroom: Amanite tue-mouche");
                }
                
            } else if (!answer2) {
                System.out.println("Mushroom: Coprin chevelu");
            }
            
        } else if (!answer) {
            System.out.println("Does your mushroom have a convex cup?");
            answer2 = input.nextBoolean();
            
            if (answer2) {
                System.out.println("Mushroom: Pied bleu");
                
            } else if (!answer2) {
                System.out.println("Does your mushroom have gills?");
                answer3 = input.nextBoolean();
                
                if (answer3) {
                    System.out.println("Mushroom: Girolle");
                } else if (!answer3) {
                    System.out.println("Mushroom: Cepe de bordeaux");
                }
            }
        }
        
        input.close();
    }
}
