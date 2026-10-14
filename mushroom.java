package school;

import java.util.Scanner;

public class mushroom {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String ans;

        System.out.println("Think of one of these mushrooms:");
        System.out.println("1. Agaric jaunissant");
        System.out.println("2. Amanite tue-mouche");
        System.out.println("3. Cepe de Bordeaux");
        System.out.println("4. Coprin chevelu");
        System.out.println("5. Pied bleu");

        System.out.print("Does your mushroom grow in a forest? (yes/no): ");
        ans = input.next();

        if (ans.equalsIgnoreCase("no")) {

            System.out.print("Does your mushroom have a convex cap? (yes/no): ");
            ans = input.next();

            if (ans.equalsIgnoreCase("yes")) {
                System.out.println("Your mushroom is: Agaric jaunissant");
            } else {
                System.out.println("Your mushroom is: Coprin chevelu");
            }

        } else {

            System.out.print("Does your mushroom have gills? (yes/no): ");
            ans = input.next();

            if (ans.equalsIgnoreCase("no")) {
                System.out.println("Your mushroom is: Cepe de Bordeaux");
            } else {

                System.out.print("Does your mushroom have a ring? (yes/no): ");
                ans = input.next();

                if (ans.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is: Amanite tue-mouche");
                } else {
                    System.out.println("Your mushroom is: Pied bleu");
                }
            }
        }

        input.close();
    }
}
