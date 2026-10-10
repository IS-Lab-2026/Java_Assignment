import java.util.Scanner;

public class MushroomGuesser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer;

        System.out.println("Think of a mushroom.");
        System.out.println("Answer with 1 for yes or 2 for no.");

        System.out.print("Does it grow in a forest? ");
        answer = input.nextInt();

        if (answer == 2) {
        
            System.out.print("Does it have a convex cup? ");
            answer = input.nextInt();

            if (answer == 1) {
                System.out.println("Agaric Jaunissant");
            } else {
                System.out.println("Coprin chevelu");
            }

        } else {
            
            System.out.print("Does it have a convex cup? ");
            answer = input.nextInt();

            if (answer == 1) {
                System.out.print("Does it have a ring? ");
                answer = input.nextInt();

                if (answer == 1) {
                    System.out.println("Amanite tue-mouche");
                } else {
                    System.out.println("Pied bleu");
                }

            } else {
                System.out.print("Does it have gills? ");
                answer = input.nextInt();

                if (answer == 1) {
                    System.out.println("Girolle");
                } else {
                    System.out.println("Cepe de bordeaux");
                }
                }
                }
                }
                } 
