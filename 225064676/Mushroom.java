
package my.mushroom;

import java.util.Scanner;

public class Mushroom {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       String gills;
       String forest;
       String ring;
       String convex;
       
       System.out.println("Mushroom identification");
       System.out.println();
       
       System.out.println("Does your mushroom have gills? (yes/no): ");
    gills=input.next();
    if(gills.equals("no")){
        System.out.println("your mushroom is cepe de bordeaux.");
    }
    else{
        System.out.println("Does your mushroom grow in the forest? (yes/no): ");
        forest=input.next();
         
    if( forest.equals("no")){
        System.out.println("Does your mushroom have a convex cup? (yes/no): ");
        convex=input.next();
        if(convex.equals("yes")){
            System.out.println("Your mushroom is Agaric Jaunissant.");
             }
        else{
            System.out.println("Your mushroom is Coprin Chevelu.");
            }
    }
    else{
        System.out.println("Does your mushroom have a ring? (yes/no): ");
        ring=input.next();
      if(ring.equals("yes")){
          System.out.println("Your mushroom is Amanite Tue-Mouche.");
          }
      else{
          System.out.println("Does your mushroom have a convex cup? (yes/no): ");
          convex=input.next();
          if(convex.equals("yes")){
              System.out.println("Your mushroom is Pied Bleu.");
               }
          else{
              System.out.println(" Your mushroom is Girolle.");
          }
      
      }
    }
    }
}}
