
import java.util.Scanner;

public class MushroomClassification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer;

        System.out.print(
            "Does your mushroom have gills? (yes/no): "
        );
        answer = input.nextLine().trim().toLowerCase();

        if (answer.equals("no")) {
            System.out.println(
                "Your mushroom is Cepe de Bordeaux."
            );

        } else {
            System.out.print(
                "Does your mushroom grow in a forest? (yes/no): "
            );
            answer = input.nextLine().trim().toLowerCase();

            if (answer.equals("no")) {
                System.out.print(
                    "Does your mushroom have a convex cup? (yes/no): "
                );
                answer = input.nextLine().trim().toLowerCase();

                if (answer.equals("yes")) {
                    System.out.println(
                        "Your mushroom is Agaric Jaunissant."
                    );
                } else {
                    System.out.println(
                        "Your mushroom is Coprin Chevelu."
                    );
                }

            } else {
                System.out.print(
                    "Does your mushroom have a ring? (yes/no): "
                );
                answer = input.nextLine().trim().toLowerCase();

                if (answer.equals("yes")) {
                    System.out.println(
                        "Your mushroom is Amanite Tue-Mouches."
                    );

                } else {
                    System.out.print(
                        "Does your mushroom have a convex cup? (yes/no): "
                    );
                    answer = input.nextLine().trim().toLowerCase();

                    if (answer.equals("yes")) {
                        System.out.println(
                            "Your mushroom is Pied Bleu."
                        );
                    } else {
                        System.out.println(
                            "Your mushroom is Girolle."
                        );
                    }
                }
            }
        }

        input.close();
    }
}
