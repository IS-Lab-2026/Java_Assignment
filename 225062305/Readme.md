
**Time-Tiered Cost Calculator**
A Java command-line application that calculates service or usage costs based on specific time tiers and hourly rates.

Project Overview
This application calculates total costs based on the start and end times provided by the user. It enforces input validation to ensure valid time ranges and applies specific hourly rates depending on the time tier selected.

⚙️ Code Structure & Statement Descriptions

Below is a breakdown of every major Java statement and logic component used in this program:

* `import java.util.Scanner;`
  * **Description:** Imports the `Scanner` class from the Java standard library, which allows the program to read keyboard input entered by the user in the console.

* `public class TimeTieredCostCalculator { ... }`
  * **Description:** Defines the main class block. In Java, all code must reside inside a class, and the class name must match the `.java` filename.

* `public static void main(String[] args) { ... }`
  * **Description:** The entry point of the Java program where execution begins.

* `Scanner scanner = new Scanner(System.in);`
  * **Description:** Instantiates a new `Scanner` object bound to `System.in` (standard input stream) to listen for user input.

* `System.out.print(...)` / `System.out.println(...)`
  * **Description:** Prints output messages to the console screen for the user to read.

* `int startTime = scanner.nextInt();` / `int endTime = scanner.nextInt();`
  * **Description:** Reads integer inputs representing the user's start time and end time (in military/24-hour format or hours).

* `if (startTime < 0 || endTime > 24 || startTime >= endTime) { ... }`
  * **Description:** A validation check using relational (`<`, `>`, `>=`) and logical OR (`||`) operators to ensure inputs fall within valid 24-hour ranges and that start time precedes end time.

* `int totalCost = 0;`
  * **Description:** Initializes an integer variable to accumulate the running total cost as the time hours are processed.

* `for (int hour = startTime; hour < endTime; hour++) { ... }`
  * **Description:** A `for` loop that iterates hour-by-hour from the `startTime` up to the `endTime`.

* `if (hour >= 0 && hour < 7) { totalCost += 500; }`
  * **Description:** Evaluates if the current hour falls within **Tier 1 (00:00 – 07:00)** and adds 500 to the running total.

* `else if (hour >= 7 && hour < 14) { totalCost += 1000; }`
  * **Description:** Evaluates if the current hour falls within **Tier 2 (07:00 – 14:00)** and adds 1000 to the running total.

* `else if (hour >= 14 && hour < 19) { totalCost += 1500; }`
  * **Description:** Evaluates if the current hour falls within **Tier 3 (14:00 – 19:00)** and adds 1500 to the running total.

* `scanner.close();`
  * **Description:** Closes the `Scanner` stream to release underlying system resources and prevent memory leaks.
Pricing Tiers
Tier 1 (00:00 – 07:00): 500 per hour Tier 2 (07:00 – 14:00): 1000 per hour Tier 3 (14:00 – 19:00): 1500 per hour

Prerequisites
Java Development Kit (JDK): Version 8 or higher installed on your computer.

How to Run
Open a terminal or command prompt in your project directory.
Compile the Java source file by running:
javac TimeTieredCostCalculator.java












**Mushroom Identification Program**
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

* **Description:** Imports the Scanner utility class from the java.util library so the program can read text typed by the user into the terminal window.

public class Assignment {

* **Description:** Defines the public class named Assignment. In Java, every executable program must be enclosed inside a class, and the class name must match the filename (Assignment.java).

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

