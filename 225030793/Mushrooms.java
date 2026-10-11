/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mushrooms;

/**
 *
 * @author Gueest
 */
import java.util.Scanner;
public class Mushrooms {

    public static void main(String[] args) {
        String gills,forest,Convexcup,ring;
        System.out.println("Answer the question with yes or no");
        Scanner input= new Scanner(System.in);
        System.out.println("Does your mashroom have a ring?");
        ring=input.nextLine();
        if(ring.equalsIgnoreCase("yes")){
            System.out.println("Does your mashroom grow in forest:");
            forest=input.nextLine();
            if (forest.equalsIgnoreCase("yes")){
                System.out.println("your mushroom is Amanite tue-mouche");
            }
            else if(forest.equalsIgnoreCase("no")){
                System.out.println("Does your mushroom have a convexcup?");
                Convexcup=input.nextLine();
                if(Convexcup.equalsIgnoreCase("yes")){
                    System.out.println("your mushroom is Agaric Jaunissant");
                }
                else if(Convexcup.equalsIgnoreCase("no")){
                    System.out.println("your mushroom is Coprin chevelu");
                }
                else{
                    System.out.println("Invalid input");
                }
            }
            else{
               System.out.println("Invalid input"); 
            }
        }
        else if(ring.equalsIgnoreCase("no")){
            System.out.println("Does your mashroom have gills:");
            gills = input.nextLine();
            if(gills.equalsIgnoreCase("yes")){
            System.out.println("Does your mashroom have a convex cup?");
                Convexcup=input.nextLine();
                if(Convexcup.equalsIgnoreCase("yes")){
                    System.out.println("your mushroom is Pied bleu");
                }
                else if(Convexcup.equalsIgnoreCase("no")){
                   System.out.println("your mushroom is Girolle"); 
                }
                else{
                  System.out.println("Invalid input");
                }
        }
            else if(gills.equalsIgnoreCase("no")){
                System.out.println("your mushroom is Cepe de bordeau");
            }
            else{
                System.out.println("Invalid input");
            }
        }
        else{
          System.out.println("Invalid input");  
        }
    }}