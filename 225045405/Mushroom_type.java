
import java.util.Scanner;

public class Mushroom_type {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String Resp;

        System.out.println("MUSHROOM IDENTIFICATION");
        System.out.println("Think of one of the five mushrooms.");
        System.out.println();

        System.out.print("Does your mushroom have gills? (yes/no): ");
        Resp = input.nextLine();

        if (Resp.equalsIgnoreCase("no")) {

            System.out.println("Your mushroom is Cepe de Bordeaux.");

        } else if (Resp.equalsIgnoreCase("yes")) {

            System.out.print("Does your mushroom grow in a forest? (yes/no): ");
            Resp = input.nextLine();

            if (Resp.equalsIgnoreCase("no")) {

                System.out.print("Does your mushroom have a convex cup? (yes/no): ");
                Resp = input.nextLine();

                if (Resp.equalsIgnoreCase("yes")) {

                    System.out.println("Your mushroom is Agaric Jaunissant.");

                } else if (Resp.equalsIgnoreCase("no")) {

                    System.out.println("Your mushroom is Coprin Chevelu.");

                } else {

                    System.out.println("Invalid Resp.");
                }

            } else if (Resp.equalsIgnoreCase("yes")) {

                System.out.print("Does your mushroom have a ring? (yes/no): ");
                Resp = input.nextLine();

                if (Resp.equalsIgnoreCase("yes")) {

                    System.out.println("Your mushroom is Amanite Tue-Mouche.");

                } else if (Resp.equalsIgnoreCase("no")) {

                    System.out.println("Your mushroom is Pied Bleu.");

                } else {

                    System.out.println("Invalid Resp.");
                }

            } else {

                System.out.println("Invalid Resp.");
            }

        } else {

            System.out.println("Invalid Resp.");
        }

    }
}
