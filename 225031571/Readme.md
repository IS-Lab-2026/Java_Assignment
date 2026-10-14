 1. **import java.util.Scanner;**
   Imports the Scanner tool so the program can read user keyboard input.
 2. **public class MushroomGuesser {**
   Creates the main class named MushroomGuesser.
 3. **public static void main(String[] args) {**
   The entry point where the program starts running.
 4. **Scanner scanner = new Scanner(System.in);**
   Initializes the scanner object to listen for typed input.
 5. **System.out.print("Does your mushroom have a ring? (yes/no): ");**
   Asks the first question: whether the mushroom has a ring.
 6. **String ring = scanner.next();**
   Saves the user's answer into a text variable called ring.
 7. **if (ring.equals("yes")) {**
   Checks if the user answered "yes" to having a ring.
 8. **System.out.print("Does your mushroom grow in a forest? (yes/no): ");**
   Asks if the ringed mushroom grows in a forest.
 9. **String forest = scanner.next();**
   Saves the forest answer into the variable forest.
 10. **if (forest.equals("yes")) {**
   Checks if it grows in the forest.
 11. **System.out.println("It is Amanite tue-mouche");**
   Prints the result: **Amanite tue-mouche**.
 12. **} else {**
   Runs if the ringed mushroom does not grow in a forest.
 13. **System.out.print("Does your mushroom have a convex cup? (yes/no): ");**
   Asks if it has a convex cup shape.
 14. **String cup = scanner.next();**
   Saves the cup answer into the variable cup.
 15. **if (cup.equals("yes")) {**
   Checks if the cup is convex.
 16. **System.out.println("It is Agaric jaunissant");**
   Prints the result: **Agaric jaunissant**.
 17. **} else {**
   Runs if the cup is not convex.
 18. **System.out.println("It is Coprin chevelu");**
   Prints the result: **Coprin chevelu**.
 19. **} }**
   Closes the inner decision blocks for the ring branch.
 20. **} else {**
   Runs if the mushroom does **not** have a ring (answer was "no").
 21. **System.out.print("Does your mushroom have gills? (yes/no): ");**
   Asks if the ringless mushroom has gills underneath.
 22. **String gills = scanner.next();**
   Saves the gills answer into the variable gills.
 23. **if (gills.equals("no")) {**
   Checks if it has no gills.
 24. **System.out.println("It is Cepe de bordeaux");**
   Prints the result: **Cepe de bordeaux**.
 25. **} else {**
   Runs if the mushroom has gills.
 26. **System.out.print("Does your mushroom have a convex cup? (yes/no): ");**
   Asks if it has a convex cup.
 27. **String cup = scanner.next();**
   Saves this cup answer into cup.
 28. **if (cup.equals("yes")) {**
   Checks if the cup is convex.
 29. **System.out.println("It is Pied bleu");**
   Prints the result: **Pied bleu**.
 30. **} else {**
   Runs if the cup is not convex.
 31. **System.out.println("It is Girolle");**
   Prints the result: **Girolle**.
 32. **} } } } }**
   Closes all remaining blocks (if, else, main, and class).

