import java.util.Scanner;
public class Mushroom{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("answer with yes or no");
        System.out.println("Does your mushroom have a ring?");
        String ring =input.next();
        if(ring.equalsIgnoreCase("yes")) {
          System.out.println("Does Mushroom grow in a forest?");
          String forest=input.next();
          if(forest.equalsIgnoreCase("yes")){
            System.out.println("Your Mushroom is Amainite tue-mouche");
          }  
else{
    System.out.println("Does Mushroom have a Convex Cup?");
    String cup=input.next();
    if(cup.equalsIgnoreCase("yes")){
        System.out.println("Your mushroom is agaric Jaunissant");
    }
else{
    System.out.println("Your mushroom is Coprin Chevelu.");
}
}
        }
        else{
            System.out.println("Does Mushroom have Gills?");
            String gills=input.next();
            if(gills.equalsIgnoreCase("no")){
                System.out.println("Your mushroom is cepe de Bordeaux");
            }
            else{
                System.out.println("Does Mushroom have a Convex cup?");
                String cup=input.next();
            if (cup.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is Pied Bleu.");
                }else{
                    System.out.println("Your mushroom is Girolle.");

                }
            }
        }
    }
}