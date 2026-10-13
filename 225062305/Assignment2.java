package com.mycompany.sonia;
import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer the following questions with 'yes' or 'no':");
        System.out.print("Does your mushroom have gills? ");
        String gills = scanner.nextLine();
        if (gills.equals("no")) {
            System.out.println("The mushroom is: Cepe de bordeaux");
        } else {  
            System.out.print("Does your mushroom grow in a forest? ");
            String forest = scanner.nextLine();
            if (forest.equals("no")) {
                System.out.print("Does your mushroom have a ring? ");
                String ring = scanner.nextLine();
                if (ring.equals("yes")) {
                    System.out.println("The mushroom is: Agaric jaunissant");
                } else {
                    System.out.println("The mushroom is: Coprin chevelu");
                }
            } else {
                System.out.print("Does your mushroom have a convex cup? ");
                String convexCup = scanner.nextLine();
                if (convexCup.equals("no")) {
                    System.out.println("The mushroom is: Girolle");
                } else {
                    System.out.print("Does your mushroom have a ring? ");
                    String ring = scanner.nextLine();
                    if (ring.equals("yes")) {
                        System.out.println("The mushroom is: Amanite tue-mouche");
                    } else {
                        System.out.println("The mushroom is: Pied bleu");
                    }
                }
            }
        }
    
    }
                    }
