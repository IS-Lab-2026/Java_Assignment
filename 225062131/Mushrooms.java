

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class Mushrooms {
   public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        System.out.println("use only 'yes' or ,'no'\n");
        System.out.println("Does the mushroom hane ring?");
        String q1;
        q1=input.nextLine();
        switch (q1){
            case "no":
                System.out.println("Does it have gills?");
                String q2=input.nextLine();
                switch (q2){
                    case "no":
                        System.out.println("It is cepe de bordeau.");
                        break;
                    case "yes":
                        System.out.println("Does it have a convex cup?");
                        String q3 = input.nextLine();
                            switch (q3){
                                case "no":
                                    System.out.println("It is Girolle.");
                                    break;
                                case "yes":
                                    System.out.println("pied bleu");}}
        break;
        case "yes":
             System.out.println("Does it grow in forest?."); 
             String q4=input.nextLine();
             switch (q4){
                 case "yes":
                     System.out.println("It is Amanite tue-mouche.");
                     break;
                 case "no":
                     System.out.println("Does it have a convex cup?");
             }
             String q5=input.nextLine();
             switch (q5){
                 case "yes":
                     System.out.println("It is Agaric Jaunissant");
                     break;
                 case"no":
                     System.out.println("It is Coprin chevelu");
                }
        }
}
   }



