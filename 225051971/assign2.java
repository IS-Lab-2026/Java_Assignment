/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school;

/**
 *
 * @author el-matadol
 */
import java.util.Scanner;
public class assign2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ans;

        
        System.out.println("Think of one of these mushrooms:");
        System.out.println(" Agaric jaunissant");
        System.out.println(" Amanite tue-mouche");
        System.out.println(" Cepe de bordeaux");
        System.out.println(" Coprin chevelu");
        System.out.println(" Pied bleu");
      

        
        System.out.print("Does your mushroom grow in a forest? (y/n): ");
        ans = input.next().charAt(0);

        if (ans == 'n') {
            
            System.out.print("Does your mushroom have a convex cap? (y/n): ");
            ans = input.next().charAt(0);

            if (ans == 'y') {
                System.out.println("Your mushroom is: Agaric jaunissant");
            } else {
                System.out.println("Your mushroom is: Coprin chevelu");
            }

        } else {
            
            System.out.print("Does your mushroom have gills? (y/n): ");
            ans = input.next().charAt(0);

            if (ans == 'n') {
                System.out.println("Your mushroom is: Cepe de bordeaux");
            } else {
                
                System.out.print("Does your mushroom have a ring? (y/n): ");
                ans = input.next().charAt(0);

                if (ans == 'y') {
                    System.out.println("Your mushroom is: Amanite tue-mouche");
                } else {
                    System.out.println("Your mushroom is: Pied bleu");
                }
            }
        }

        input.close();
    }

    
    
}
