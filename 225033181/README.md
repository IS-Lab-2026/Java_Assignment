NAME: DUSINGIZIMANA Edinamique
REGno: 225033181


JAVA MINI PROJECTS: DETAILED CODE EXPLANATION

INTRODUCTION
This repository contains two Java programs:

Bicycle Rental System: Calculates bicycle rental costs based on starting and ending hours.
Mushroom Guessing Program: Identifies one of six mushrooms by asking questions about its characteristics.
These projects practice variables, input, output, conditions, loops, strings, and arithmetic operations.

BICYCLE RENTAL SYSTEM
2.1. Program Description

The program calculates the total bicycle rental cost based on the starting and ending hours entered by the user. It validates the hours and applies different hourly rates depending on the time of day. A for loop processes each rental hour and adds the corresponding charge.

2.2. Explanation of the Code

Line 1: import java.util.Scanner; Imports Scanner from java.util to read keyboard input.

Line 2: public class BicycleRental { Declares the public BicycleRental class. The filename must be BicycleRental.java.

Line 3: public static void main(String[] args) { Declares the main method, where program execution begins.

Line 4: Scanner input = new Scanner(System.in); Creates a Scanner object named input to read user input.

Line 5: System.out.println("Enter starting time (0-23): "); Displays a prompt asking for the starting hour, from 0 to 23.

Line 6: int startTime = input.nextInt(); Reads the starting hour and stores it in startTime.

Line 7: System.out.print("Enter ending time (1-24): "); Requests the ending hour, from 1 to 24.

Line 8: int endTime = input.nextInt(); Reads the ending hour and stores it in endTime.

Line 9: if (startTime < 0 || startTime > 23 || endTime < 1 || endTime > 24) { Checks whether either hour is outside its permitted range. The || operator means OR.

Line 10: System.out.println("Error: Invalid hour ranges provided."); Displays an error when the entered hours are invalid.

Line 11: return; Stops the program from calculating the cost using invalid hours.

Line 12: } Closes the first if block.

Line 13: if (startTime >= endTime) { Checks whether the starting hour is greater than or equal to the ending hour. Rentals crossing midnight are not supported.

Line 14: System.out.println("Error: Starting time must be less than ending time."); Displays an error when the rental period is invalid.

Line 15: return; Terminates the main method after the error.

Line 16: } Closes the second if block.

Line 17: int totalCost = 0; Initializes totalCost to zero to store the accumulated rental price.

Line 18: for (int h = startTime; h < endTime; h++) { Processes every rental hour from startTime up to, but not including, endTime. The h++ expression increases the hour by one each iteration.

Line 19: if ((h >= 0 && h < 7) || (h >= 21 && h < 24)) { Checks hours 0-6 and 21-23. The && operator means AND. The || operator means OR.

Line 20: totalCost += 500; Adds 500 RWF for each hour in the lowest-price periods.

Line 21: } else if ((h >= 7 && h < 14) || (h >= 19 && h < 21)) { Checks hours 7-13 and 19-20.

Line 22: totalCost += 1000; Adds 1,000 RWF for each hour in these periods.

Line 23: } else if (h >= 14 && h < 19) { Checks hours 14-18.

Line 24: totalCost += 1500; Adds 1,500 RWF for each hour in the highest-price period.

Line 25: } Closes the hourly pricing conditions. Only one matching branch executes per hour.

Line 26: } Closes the for loop. The loop continues until h is no longer less than endTime.

Line 27: System.out.println("Total rent to pay: " + totalCost + " RWF"); Displays the total rental cost in Rwandan francs.

Line 28: input.close(); Closes the Scanner after normal calculation.

Line 29: } Closes the main method.

Line 30: } Closes the BicycleRental class.

2.3. Example Calculation

Starting hour: 8 Ending hour: 11

The program processes hours 8, 9, and 10.

Hour 8: 1,000 RWF Hour 9: 1,000 RWF Hour 10: 1,000 RWF

Total = 1,000 + 1,000 + 1,000 Total = 3,000 RWF

Output: Total rent to pay: 3000 RWF

2.4. Important Java Concepts

Variables: startTime, endTime, totalCost, and h store values. Input: Scanner and nextInt() read numbers. Output: println() and print() display messages. Conditions: if and else if select actions. Logical operators: || means OR; && means AND. Comparison operators: <, >, and >= compare values. Loops: for processes each rental hour. Arithmetic: += adds charges to the total. Termination: return exits the method when validation fails.

MUSHROOM GUESSING PROGRAM
3.1. Program Description

This program identifies one of six mushrooms by asking questions about gills, forest habitat, a ring, and a convex cup. It uses nested if-else statements to follow a decision tree.

The six options are:

Agaric Jaunissant
Amanite tue-mouche
Cepe de Bordeaux
Coprin chevelu
Girolle
Pied bleu
3.2. Explanation of the Code

Line 1: import java.util.Scanner; Imports Scanner to read the user's answers.

Line 2: public class MushroomGuess { Declares the MushroomGuess class. The filename must be MushroomGuess.java.

Line 3: public static void main(String[] args) { Defines the main method, where execution begins. public allows access, static allows execution without creating an object, and void means no value is returned.

Line 4: Scanner input = new Scanner(System.in); Creates a Scanner object to read keyboard input.

Line 5: System.out.println("Think of one of these mushrooms:"); Asks the user to select a mushroom mentally.

Lines 6-11: System.out.println(...) Display the six mushroom names. The numbers are part of the displayed text.

Line 12: System.out.println(); Prints a blank line to separate the list from the questions.

Line 13: System.out.print("Does your mushroom have gills? (yes/no): "); Asks whether the mushroom has gills. print() keeps the answer on the same line.

Line 14: String gills = input.nextLine().toLowerCase(); Reads the answer, stores it in gills, and converts it to lowercase. For example, YES becomes yes.

Line 15: if (gills.equals("no")) { Checks whether the answer exactly matches no. equals() compares string contents.

Line 16: System.out.println("Your mushroom is: Cepe de Bordeaux"); Displays Cepe de Bordeaux when the answer is no.

Line 17: } else { Starts the alternative branch when the answer is not exactly no.

Line 18: System.out.print("Does your mushroom grow in a forest? (yes/no): "); Asks whether the mushroom grows in a forest.

Line 19: String forest = input.nextLine().toLowerCase(); Reads the forest answer and converts it to lowercase.

Line 20: if (forest.equals("no")) { Checks whether the user answered no about forest habitat.

Line 21: System.out.print("Does your mushroom have a ring? (yes/no): "); Asks about a ring when the forest answer is no.

Line 22: String ring = input.nextLine().toLowerCase(); Reads and converts the ring answer.

Line 23: if (ring.equals("yes")) { Checks whether the answer is yes.

Line 24: System.out.println("Your mushroom is: Agaric Jaunissant"); Displays Agaric Jaunissant when the ring answer is yes.

Line 25: } else { Starts the alternative ring branch.

Line 26: System.out.println("Your mushroom is: Coprin Chevelu"); Displays Coprin Chevelu when the ring answer is not yes.

Line 27: } Closes the ring condition.

Line 28: } else { Starts the alternative forest branch when the answer is not exactly no.

Line 29: System.out.print("Does your mushroom have a convex cup? (yes/no): "); Asks about the convex-cup characteristic.

Line 30: String cup = input.nextLine().toLowerCase(); Reads the answer and converts it to lowercase.

Line 31: if (cup.equals("yes")) { Checks whether the convex-cup answer is yes.

Line 32: System.out.print("Does your mushroom have a ring? (yes/no): "); Asks about a ring when the cup answer is yes.

Line 33: String ring = input.nextLine().toLowerCase(); Reads the second ring answer. This variable is in a separate block from the earlier ring variable.

Line 34: if (ring.equals("yes")) { Checks whether the second ring answer is yes.

Line 35: System.out.println("Your mushroom is: Amanite tue-mouche"); Displays Amanite tue-mouche when the ring answer is yes.

Line 36: } else { Starts the alternative ring branch.

Line 37: System.out.println("Your mushroom is: Pied bleu"); Displays Pied bleu when the ring answer is not yes.

Line 38: } Closes the second ring condition.

Line 39: } else { Starts the alternative convex-cup branch.

Line 40: System.out.println("Your mushroom is: Girolle"); Displays Girolle when the cup answer is not yes.

Line 41: } Closes the convex-cup condition.

Line 42: } Closes the forest condition.

Line 43: } Closes the outer gills condition.

Line 44: input.close(); Closes the Scanner after the result is displayed.

Line 45: } Closes the main method.

Line 46: } Closes the MushroomGuess class.

3.3. Decision Tree

Gills = no: Result: Cepe de Bordeaux.

Gills = yes, Forest = no: Ring = yes: Agaric Jaunissant. Ring = no: Coprin Chevelu.

Gills = yes, Forest = yes: Convex cup = no: Girolle. Convex cup = yes: Ring = yes: Amanite tue-mouche. Ring = no: Pied bleu.

The actual code treats any answer other than the exact expected string as the alternative branch. It does not reject invalid answers or remove surrounding spaces.

3.4. Example Execution

Gills: yes Forest: yes Convex cup: yes Ring: no

Output: Your mushroom is: Pied bleu

The program reaches this result because the answers follow the corresponding nested conditions.

Note: This program is a basic programming exercise, not a scientifically reliable method of identifying mushrooms.

3.5. Important Java Concepts

Classes and methods: MushroomGuess and main() organize the program. Input: Scanner and nextLine() read answers. Strings: String stores text. Conversion: toLowerCase() converts answers to lowercase. Comparison: equals() compares string values. Conditions: if and else choose actions. Nested conditions: Multiple conditions create the decision tree. Variable scope: Variables declared inside blocks are limited to those blocks. Output: print() and println() display questions and results.

COMPILING AND RUNNING THE PROGRAMS
Requirements:

Install the Java Development Kit (JDK).
Use a code editor or IDE, such as Visual Studio Code, IntelliJ IDEA, or Eclipse.
Open a terminal or command prompt.
Check Java: java -version

Check the compiler: javac -version

4.1. Run Bicycle Rental System

Save the code as BicycleRental.java.

Compile: javac BicycleRental.java

Run: java BicycleRental

4.2. Run Mushroom Guessing Program

Save the code as MushroomGuess.java.

Compile: javac MushroomGuess.java

Run: java MushroomGuess


The Bicycle Rental System demonstrates input, validation, loops, conditions, and arithmetic calculations. It processes rental hours individually and applies the correct hourly rate.

The Mushroom Guessing Program demonstrates string handling, user input, comparisons, and nested conditions. It follows a decision tree to select one of six predefined results.
