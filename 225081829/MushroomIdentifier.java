import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MushroomIdentifier {
    // Characteristic order: gills, forest, ring, convex cup.
    private static final String[] QUESTIONS = {
        "Does your mushroom have gills?",
        "Does your mushroom grow in a forest?",
        "Does your mushroom have a ring?",
        "Does your mushroom have a convex cup?"
    };

    private static class Mushroom {
        String name;
        boolean[] traits;

        Mushroom(String name, boolean gills, boolean forest,
                 boolean ring, boolean convexCup) {
            this.name = name;
            this.traits = new boolean[] {gills, forest, ring, convexCup};
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Mushroom> candidates = new ArrayList<>();
        candidates.add(new Mushroom("Agaric jaunissant", true, false, true, true));
        candidates.add(new Mushroom("Amanite tue-mouche", true, true, true, true));
        candidates.add(new Mushroom("Cèpe de Bordeaux", false, true, false, false));
        candidates.add(new Mushroom("Coprin chevelu", true, false, true, false));
        candidates.add(new Mushroom("Girolle", true, true, false, false));
        candidates.add(new Mushroom("Pied bleu", true, true, false, true));

        System.out.println("Think of one of the six mushrooms.");
        System.out.println("Answer each question truthfully with yes or no.");
        System.out.println("The program will ask at most three questions.");

        // Ask at most three questions. Select the question that best splits
        // the remaining candidates into two groups.
        for (int questionCount = 0;
             questionCount < 3 && candidates.size() > 1;
             questionCount++) {

            int bestTrait = chooseBestQuestion(candidates);
            if (bestTrait == -1) {
                break; // Remaining candidates cannot be separated by these traits.
            }

            boolean yesAvailable = false;
            boolean noAvailable = false;
            for (Mushroom mushroom : candidates) {
                if (mushroom.traits[bestTrait]) {
                    yesAvailable = true;
                } else {
                    noAvailable = true;
                }
            }

            if (!yesAvailable || !noAvailable) {
                break;
            }

            boolean answer = readYesNo(scanner, QUESTIONS[bestTrait] + " (yes/no): ");

            List<Mushroom> matching = new ArrayList<>();
            for (Mushroom mushroom : candidates) {
                if (mushroom.traits[bestTrait] == answer) {
                    matching.add(mushroom);
                }
            }
            candidates = matching;
        }

        if (candidates.size() == 1) {
            System.out.println("Your mushroom is: " + candidates.get(0).name);
        } else if (candidates.isEmpty()) {
            System.out.println("No mushroom matches those answers.");
        } else {
            System.out.println("The answers do not identify a single mushroom.");
            System.out.println("Possible mushrooms:");
            for (Mushroom mushroom : candidates) {
                System.out.println("- " + mushroom.name);
            }
            System.out.println("The available characteristics may require a fourth question.");
        }

        scanner.close();
    }

    private static int chooseBestQuestion(List<Mushroom> candidates) {
        int bestTrait = -1;
        int bestDifference = Integer.MAX_VALUE;

        for (int trait = 0; trait < QUESTIONS.length; trait++) {
            int yesCount = 0;
            for (Mushroom mushroom : candidates) {
                if (mushroom.traits[trait]) {
                    yesCount++;
                }
            }

            int noCount = candidates.size() - yesCount;

            // Ignore questions that do not separate the remaining candidates.
            if (yesCount == 0 || noCount == 0) {
                continue;
            }

            // Prefer the question that splits candidates most evenly.
            int difference = Math.abs(yesCount - noCount);
            if (difference < bestDifference) {
                bestDifference = difference;
                bestTrait = trait;
            }
        }

        return bestTrait;
    }

    private static boolean readYesNo(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String answer = scanner.nextLine().trim();

            if (answer.equalsIgnoreCase("yes")) {
                return true;
            }
            if (answer.equalsIgnoreCase("no")) {
                return false;
            }

            System.out.println("Please answer yes or no.");
        }
    }
}
