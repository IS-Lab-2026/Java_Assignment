Mushroom Identification Program
A Java command-line application that helps identify different mushroom species based on physical characteristics and growing conditions.

Project Overview
This program asks the user a sequence of yes/no questions to determine the species of a mushroom.

Supported Mushroom Species
Cèpe de Bordeaux
Agaric jaunissant
Coprin chevelu
Girolle
Amanite tue-mouche
Pied bleu
How It Works
The program uses nested if-else conditional statements in Java to create a decision tree. Depending on whether you answer yes or no to questions about gills, habitats, cap shapes, and rings, the program branches down a specific path until it matches and prints the correct mushroom species.
import java.util.Scanner;

Description: Imports the Scanner utility class from the java.util library so the program can read text typed by the user into the terminal window.

public class Assignment {

Description: Defines the public class named Assignment. In Java, every executable program must be enclosed inside a class, and the class name must match the filename (Assignment.java).

public static void main(String[] args) {

Description: The main method entry point. When the compiled Java program runs, the Java Virtual Machine (JVM) looks for this exact method signature to begin execution.

Scanner input = new Scanner(System.in);

Description: Instantiates a new Scanner object named input connected to System.in (standard console input), enabling the program to capture user keystrokes.

System.out.println(...) / System.out.print(...)

Description: Standard output statements that print text strings to the console. println moves the cursor to a new line afterward, while print keeps the cursor on the same line so user input appears right next to the question.

String gills = input.nextLine().trim().toLowerCase();

Description: Captures a full line of text from the user via nextLine(), strips leading and trailing whitespace using .trim(), and converts the entire string to lowercase using .toLowerCase(). This ensures that inputs like "YES ", "Yes", or "yes" are all normalized identically.

if (gills.equals("yes")) {

Description: A conditional if statement evaluating whether the normalized user string matches "yes". In Java, strings must be compared using .equals() rather than the == operator (which compares memory addresses instead of text content).

Nested if-else Branching Blocks:

Description: Subsequent inner if-else statements create a decision tree hierarchy. Depending on prior answers, the program navigates down specific branches:

Branch A (Gills = Yes): Checks habitat and cap characteristics to separate species like Amanita muscaria, Cantharellus cibarius, Coprinus comatus, and Lepista nuda.

Branch B (Gills = No / Pores): Checks flesh bruising behavior to distinguish between Agaric jaunissant and Cèpe de Bordeaux.

Prerequisites
Java Development Kit (JDK) version 8 or higher installed on your computer.

How to Run
Open a terminal in your project directory.
Compile the source file:
javac com/mycompany/sonia/Assignment.java

