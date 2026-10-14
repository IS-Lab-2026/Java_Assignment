

1. Bicycle Rental Cost Calculator
This program calculates the total rental cost of a bicycle based on hourly time slots and tiered pricing structures (in Rwandan Francs - RWF). It prompts the user for a starting hour (0 to 23) and an ending hour (1 to 24), validates the input, loops through each hour, applies the appropriate rate, and prints the summary.

Bicycle Rental Explanation
import java.util.Scanner;: Imports the Scanner class to read user keyboard input.

public class BicycleRental: Declares the public class container matching the filename.

public static void main(String[] args): The main execution entry point for the Java runtime.

Scanner scanner = new Scanner(System.in);: Initializes the scanner object for reading standard input.

Prompts & Input Reading: System.out.print prints prompts, and scanner.nextInt() captures integer values for startTime and endTime.

Input Validation (if statement): Checks bounds (0-23 for start, 1-24 for end, and startTime < endTime). If invalid, prints an error, closes the scanner, and terminates via return;.

int totalCost = 0;: Initializes cost accumulation.

Hourly Loop (for loop): Iterates from startTime to endTime - 1. Checks hourly brackets:

0:00 - 6:59 or 21:00 - 23:59 adds 500 RWF.

7:00 - 13:59 or 19:00 - 20:59 adds 1000 RWF.

14:00 - 18:59 adds 1500 RWF.

Summary & Cleanup: Prints total duration and final cost, then closes the scanner resource




2.Mushroom Identifier Explanation
import java.util.Scanner;: Imports the scanner utility for reading string input.

public class MushroomIdentifier: Declares the class container matching filename MushroomIdentifier.java.

public static void main(String[] args): The main application entry point.

Menu & Welcome Banner: Displays the list of five target mushrooms and instructions.

Question 1 & Input Sanitization: Reads input via scanner.nextLine(), cleans whitespace with .trim(), and normalizes casing with .toLowerCase().

Branch 1 (No Ring): If q1 is "no", asks about gills (q2). Yes leads to Pied bleu, No leads to Cepe de bordeaux.

Branch 2 (Yes Ring): If q1 is "yes", asks about a convex cup (q2). No leads to Coprin chevelu. Yes triggers a third question (q3) about forest habitat: Yes leads to Amanite tue-mouche, No leads to Agaric Jaunissant.

Input Validation Fallback: Handles invalid text responses for the first question.

Resource Cleanup: Closes the scanner to prevent resource leaks.
