# Mushroom Identification Program

## Description
This Java program identifies one of six mushroom types by asking the user up to three yes/no questions about the mushroom's characteristics.

## Mushroom Types
- Agaric jaunissant
- Amanite tue-mouche
- Cepe de bordeaux
- Coprin chevelu
- Girolle
- Pied bleu

## Identification Logic
1. Ask whether the mushroom has a convex cap.
2. If yes, ask whether it grows in a forest:
   - No: Agaric jaunissant.
   - Yes: ask whether it has a ring:
     - Yes: Amanite tue-mouche.
     - No: Pied bleu.
3. If it does not have a convex cap, ask whether it has gills:
   - No: Cepe de bordeaux.
   - Yes: ask whether it grows in a forest:
     - No: Coprin chevelu.
     - Yes: Girolle.

The program asks no more than three questions on any path.

## Java Code
Save the program as `MushroomIdentification.java`.

```java
import java.util.Scanner;

public class MushroomIdentification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;

        System.out.println("MUSHROOM IDENTIFICATION");
        System.out.println();

        System.out.print("Does your mushroom have a convex cap? (yes/no): ");
        answer = input.nextLine().trim();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.print("Does your mushroom grow in a forest? (yes/no): ");
            answer = input.nextLine().trim();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Your mushroom is: Agaric jaunissant");
            } else {
                System.out.print("Does your mushroom have a ring? (yes/no): ");
                answer = input.nextLine().trim();

                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is: Amanite tue-mouche");
                } else {
                    System.out.println("Your mushroom is: Pied bleu");
                }
            }
        } else {
            System.out.print("Does your mushroom have gills? (yes/no): ");
            answer = input.nextLine().trim();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Your mushroom is: Cepe de bordeaux");
            } else {
                System.out.print("Does your mushroom grow in a forest? (yes/no): ");
                answer = input.nextLine().trim();

                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is: Girolle");
                } else {
                    System.out.println("Your mushroom is: Coprin chevelu");
                }
            }
        }

        input.close();
    }
}
```

## Example
```text
Does your mushroom have a convex cap? (yes/no): yes
Does your mushroom grow in a forest? (yes/no): yes
Does your mushroom have a ring? (yes/no): no
Your mushroom is: Pied bleu
```

## Compile and Run
```bash
javac MushroomIdentification.java
java MushroomIdentification
```
