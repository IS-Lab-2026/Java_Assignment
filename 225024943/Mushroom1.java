import java.util.Scanner;

public class Mushroom1 {
 
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Mushroom List");
        System.out.println("- Agaric Jaunissant\n- Amanite tue-mouche\n- Cepe de bordeaux\n- Coprin chevelu\n- Girolle\n- Pied bleu\n");
        
        System.out.println("Other info");
        System.out.println("- The cepe de bordeaux is the only one to have pores, the other mushrooms having gills.\n- Both coprin chevelu and agaric jaunissant grow in meadows, other mushrooms grow in forests.\n- The only mushrooms to have a convex cup are agaric jaunissant, amanite tuemouches, and pied bleu.\n- The only mushrooms to have a ring are agaric jaunissant,amanite tue-mouches, and coprin chevelu.\n");



        System.out.println("Now think of one of the 6 mushrooms");

        System.out.print("Does your mushroom have a ring? (yes/no): ");
        String x = input.nextLine().trim().toLowerCase();

        switch (x) {
            case "yes":
                System.out.print("Does it grow in a forest?(yes/no): ");
                String y = input.nextLine().trim().toLowerCase();

                if(y.equalsIgnoreCase("no")){
                    System.out.print("Does it have convex cup?(yes/no): ");
                    String z = input.nextLine().trim().toLowerCase();

                    if(z.equalsIgnoreCase("no")){
                        System.out.println("You chose Coprin chevelu");

                    }else if(z.equalsIgnoreCase("yes")){
                        System.out.println("You chose Agaric jaunissant");
                    }else{
                        System.out.println("Invalid input");
                    }
  
                }else if(y.equalsIgnoreCase("yes")){
                     System.out.println("You chose Amanite tue-mouche");
                }else{
                    System.out.println("Invalid input");
                }

                break;
            case "no":
                System.out.print("Does it have Gills?(yes/no): ");
                String z = input.nextLine().trim().toLowerCase();

                if(z.equalsIgnoreCase("yes")){
                    System.out.print("Does it have convex cup?(yes/no): ");
                    String i = input.nextLine().trim().toLowerCase();

                    if(i.equalsIgnoreCase("yes")){
                        System.out.println("You chose Pied bleu");

                    }else if(i.equalsIgnoreCase("no")){
                        System.out.println("You chose Girolle");
                    }else{
                        System.out.println("Invalid input");
                    }

                }else if(z.equalsIgnoreCase("no")){
                    System.out.println("You chose Cepe de bordeaux");
                }else{
                    System.out.println("Invalid input");
                }
                

                break;
            default:
                System.out.println("Invalid input");
                break;
        }



     }
    
       

    
}
