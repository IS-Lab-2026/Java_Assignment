Regno : 225031571

Discription of all problems

problem1: 

 1. **import java.util.Scanner;** — Imports the Scanner utility to read keyboard input from the user.
 2. **public class BicycleRental {** — Declares the main class containing the entire bicycle rental logic.
 3. **public static void main(String[] args) {** — The main entry point where program execution begins.
 4. **Scanner input = new Scanner(System.in);** — Creates the Scanner object to listen for typed values.
 5. **System.out.print("Enter start time: "); int start = input.nextInt();** — Prompts for and stores the rental start hour.
 6. **System.out.print("Enter end time: "); int end = input.nextInt();** — Prompts for and stores the rental finish hour.
 7. **if (start < 0 || start > 23 || end < 1 || end > 24)** — Validates if the entered hours fall outside the 24-hour day limits.
 8. **System.out.println("Invalid time entered.");** — Prints an error message when input numbers are out of range.
 9. **else if (start >= end)** — Checks if start time is illogical by being equal to or after end time.
 10. **System.out.println("Start time must be less than end time.");** — Alerts the user that a ride cannot end before or when it began.
 11. **else { int total = 0;** — Initializes the running total cost accumulator to 0 for valid times.
 12. **if (end <= 7) { total = (end - start) * 500; }** — Calculates cost for rides entirely within early morning (500 RWF/hr).
 13. **else if (start >= 7 && end <= 14) { total = (end - start) * 1000; }** — Calculates cost for rides entirely during standard day hours (1000 RWF/hr).
 14. **else if (start >= 14 && end <= 19) { total = (end - start) * 1500; }** — Calculates cost for rides strictly within peak afternoon (1500 RWF/hr).
 15. **else if (start >= 19 && end <= 21) { total = (end - start) * 1000; }** — Calculates cost for rides strictly within evening hours (1000 RWF/hr).
 16. **else if (start >= 21) { total = (end - start) * 500; }** — Calculates cost for rides occurring strictly after 21:00 (500 RWF/hr).
 17. **else { int h1 = 0, h2 = 0, h3 = 0;** — Initializes hour counters for multi-tier rates: h1 (500), h2 (1000), h3 (1500).
 18. **if (start < 7 && end <= 7) { h1 += (end - start); }** — Adds hours to h1 if the entire segment completed before 7:00.
 19. **else if (start < 7) { h1 += (7 - start); }** — Adds only the pre-7:00 morning portion of the trip to h1.
 20. **if (start < 14 && end > 7)** — Detects if the rental period overlaps with the 7:00–14:00 time band.
 21. **int s = (start < 7) ? 7 : start; int e = (end > 14) ? 14 : end; h2 += (e - s);** — Clamps boundaries to [7, 14] and adds active hours to h2.
 22. **if (start < 19 && end > 14)** — Detects if the rental period overlaps with the 14:00–19:00 peak slot.
 23. **int s = (start < 14) ? 14 : start; int e = (end > 19) ? 19 : end; h3 += (e - s);** — Clamps boundaries to [14, 19] and adds peak hours to h3.
 24. **if (start < 21 && end > 19)** — Detects if the rental period overlaps with the 19:00–21:00 evening slot.
 25. **int s = (start < 19) ? 19 : start; int e = (end > 21) ? 21 : end; h2 += (e - s);** — Clamps boundaries to [19, 21] and adds evening hours to h2.
 26. **if (end > 21 && start >= 21) { h1 += (end - start); }** — Adds all late-night hours to h1 if ride began at/after 21:00.
 27. **else if (end > 21) { h1 += (end - 21); }** — Adds only the post-21:00 hours to h1 if the ride started earlier.
 28. **total = (h1 * 500) + (h2 * 1000) + (h3 * 1500); }** — Computes the total fee by summing weighted rate categories.
 29. **System.out.println("The total rent to pay is: " + total + " RWF");** — Outputs the calculated rental fee in RWF.
 30. **} } }** — Closes the validation block, the main method, and the class.
 
 
 
 Problem 2:
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

