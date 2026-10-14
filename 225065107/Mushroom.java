/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mushroom;
import java.util.Scanner;
/**
 *
 * @author ornella
 */
public class Mushroom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        char ans;
    
    
         
        System.out.print("Does your mushroom have gills?  ");
        ans = input.next().charAt(0);
        if(ans=='n'){
        System.out.println("the mushroom is cepe de bordeaux");
        }
        else{
System.out.print("Does your mushroom grow in a forest?  ");
        ans = input.next().charAt(0);
System.out.print("Does your mushroom have a ring?  ");
        ans = input.next().charAt(0);
        System.out.print("Does your mushroom have a convex cup?  ");
        ans = input.next().charAt(0);
      if(ans=='y'&&ans=='n'&&ans=='y'){
          System.out.println("the mushroom is Coprin chevelu");
      }
    else  if(ans=='n'&&ans=='y'&&ans=='y'){
    System.out.println("the mushroom is Amanite tue-mouche");      
      }
    else if(ans=='n'&&ans=='y'){
        System.out.println("The mushroom is Convex cup");
    }
    else{
        System.out.println("the mushroom is Girolle");
    }
        }
    }
    }
    
   