/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.work;
import java.util.Scanner;
/**
 *
 * @author alain
 */
public class Work {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String answer;

        System.out.println("Think of one of the six mushrooms:");
        System.out.println("1. Agaric jaunissant");
        System.out.println("2. Amanite tue-mouche");
        System.out.println("3. Cepe de Bordeaux");
        System.out.println("4. Coprin chevelu");
        System.out.println("5. Girolle");
        System.out.println("6. Pied bleu");

       
        System.out.print("Does your mushroom have a ring? (yes/no): ");
        answer = input.nextLine().toLowerCase();

        if (answer.equals("yes")) {
            System.out.print("Does your mushroom have gills? (yes/no): ");
            answer = input.nextLine().toLowerCase();

            if (answer.equals("no")) {

                System.out.println("Your mushroom is Cepe de Bordeaux.");

            } else {
                System.out.print("Does your mushroom grow in a forest? (yes/no): ");
                answer = input.nextLine().toLowerCase();

                if (answer.equals("yes")) {
                    System.out.println("Your mushroom is Amanite tue-mouche.");
                } else {
                    System.out.println("Your mushroom is Agaric jaunissant.");
                }
            }

        } else {
            System.out.print("Does your mushroom grow in a forest? (yes/no): ");
            answer = input.nextLine().toLowerCase();

            if (answer.equals("no")) {

                System.out.println("Your mushroom is Coprin chevelu.");

            } else {
                System.out.print("Does your mushroom have a convex cup? (yes/no): ");
                answer = input.nextLine().toLowerCase();

                if (answer.equals("yes")) {
                    System.out.println("Your mushroom is Pied bleu.");
                } else {
                    System.out.println("Your mushroom is Girolle.");
                }
            }
        }

        
    }
}
    

