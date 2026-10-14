 PROGRAMS DESCRIPTION
 
1. Project Overview
This project contains two Java console-based applications.

The applications demonstrate basic Java programming concepts, including user input, conditional statements, loops, string handling, and arithmetic operations.

The two programs are:

.BicycleRental: Calculates the total cost of renting a bicycle based on the starting and ending hours.
.MushroomGuess: Identifies a mushroom from a list of six mushrooms by asking the user a series of yes/no questions.
Both programs run in the terminal or command prompt.

2. Project Objectives
The objectives of this project are to:

Practice Java programming fundamentals.
Learn how to collect user input using the Scanner class.
Apply if, else if, and else statements.
Use for loops to repeat operations.
Perform calculations using integer variables.
Work with strings and string comparison.
Build simple interactive console applications.
Organize Java code into classes and methods.

3. Technologies Used
Programming Language: Java
Input Handling: java.util.Scanner
Execution Environment: Java Virtual Machine (JVM)
Interface: Command-line interface (CLI)
Output: Console messages using System.out.println() and System.out.print()

5. Project Structure
The project contains the following Java files:

Java coonsole Applications
.BicycleRental.java
.MushroomGuess.java
.README.md
Each Java program has its own public class and should be saved in a separate file with the corresponding class name.

5. Application One: Bicycle Rental
   
5.1 Description,
The BicycleRental program calculates the total rental cost according to the number of hours a bicycle is rented and the hourly rates defined in the program.

The user enters a starting hour and an ending hour.

The program then checks each rental hour, determines the applicable rate, and adds the rate to the total cost.

Finally, it displays the total rental cost in Rwandan francs (RWF).

5.2 How It Works
The program imports the Scanner class.
It asks the user to enter a starting hour between 0 and 23.
It asks the user to enter an ending hour between 1 and 24.
It initializes the total rental cost to zero.
A for loop processes every hour from the starting hour up to, but not including, the ending hour.
Conditional statements determine the hourly rental rate.
The hourly rate is added to the total.
The final rental cost is displayed.
The scanner is closed.

5.3 Bicycle Rental Pricing
The program uses the following hourly pricing rules:

Time Period	Hourly Rate
Before 07:00	500 RWF
07:00–13:59	1,000 RWF
14:00–18:59	1,500 RWF
19:00–20:59	1,000 RWF
21:00 onward	500 RWF
These prices follow the conditional logic in the provided code.

5.4 Example Execution
Enter starting hour (0-23): 6
Enter ending hour (1-24): 9
Total rental cost: 2500 RWF
Explanation:

06:00–07:00 costs 500 RWF.
07:00–08:00 costs 1,000 RWF.
08:00–09:00 costs 1,000 RWF.
Total cost: 2,500 RWF.

5.5 Java Concepts Used
Scanner for reading keyboard input.
int variables for storing hours and costs.
A for loop for processing rental hours.
if, else if, and else for selecting hourly rates.
The += operator for accumulating the total cost.
System.out.print() and System.out.println() for displaying messages.

6. Application Two: Mushroom Guessing

6.1 Description
The MushroomGuess program identifies a mushroom from six possible choices by asking a sequence of yes/no questions about its characteristics.

The user thinks of a mushroom and answers the questions.

Based on the answers, the program follows a decision tree and displays its predicted mushroom identification.

6.2 Available Mushrooms
The program includes the following six mushrooms:

Agaric Jaunissant
Amanite tue-mouche
Cepe de Bordeaux
Coprin chevelu
Girolle
Pied bleu

6.3 How It Works
The program imports the Scanner class.
It displays the list of six mushrooms.
It asks whether the mushroom has gills.
It uses the answer to select the next question or identify a mushroom.
If the mushroom has gills, it asks whether it grows in a forest.
Depending on the answer, it may ask whether the mushroom has a ring.
For forest-growing mushrooms, it asks whether the mushroom has a convex cup.
The program uses nested conditional statements to evaluate the answers.
It displays the predicted mushroom name.
The scanner is closed.

6.4 Decision Rules
The program follows these rules:

If the mushroom does not have gills, it identifies it as Cepe de Bordeaux.
If it has gills and does not grow in a forest, the program checks for a ring.
If a ring is present, it identifies Agaric Jaunissant.
If a ring is absent, it identifies Coprin Chevelu.
If the mushroom grows in a forest, the program checks for a convex cup.
If a convex cup is present, it checks for a ring.
If both the convex cup and ring are present, it identifies Amanite tue-mouche.
If a convex cup is present but a ring is absent, it identifies Pied bleu.
If the mushroom grows in a forest but does not have a convex cup, it identifies Girolle.
These rules describe the decision logic implemented in the supplied code.

6.5 Example Execution
Think of one of these mushrooms:
1. Agaric Jaunissant
2. Amanite tue-mouche
3. Cepe de Bordeaux
4. Coprin chevelu
5. Girolle
6. Pied bleu

Does your mushroom have gills? (yes/no): yes
Does your mushroom grow in a forest? (yes/no): no
Does your mushroom have a ring? (yes/no): yes
Your mushroom is: Agaric Jaunissant

6.6 Java Concepts Used
Scanner for reading user responses.
String variables for storing answers.
nextLine() for reading text input.
toLowerCase() for converting answers to lowercase.
equals() for comparing strings.
Nested if and else statements for decision-making.
Console output for displaying questions and results.

7. Requirements
   
Before running the applications, ensure that you have:

A computer with Java installed.
A Java Development Kit (JDK).
A terminal or command prompt.
A text editor or Java IDE, such as IntelliJ IDEA, Eclipse, or Visual Studio Code.

8. Installation and Setup
   
Step 1: Install Java
Install a suitable JDK if Java is not already installed.

Verify the installation with:

java -version
javac -version
Step 2: Create the Project Folder
Create a folder named Java-Console-Applications.

Step 3: Create the Java Files

Save the bicycle rental code in BicycleRental.java.

Save the mushroom guessing code in MushroomGuess.java.

Save this documentation as README.md in the same folder.

Step 4: Open the Terminal
Navigate to the project folder using the terminal or command prompt.

9. How to Compile and Run
    
9.1 Run the Bicycle Rental Program
Compile the program:

javac BicycleRental.java
Run it:

java BicycleRental
Enter the starting and ending hours when prompted.

9.2 Run the Mushroom Guessing Program
Compile the program:

javac MushroomGuess.java
Run it:

java MushroomGuess
Answer each question with yes or no.

Note: The two Java classes should be compiled and executed separately because each contains its own main() method.

10. Input and Output
    
BicycleRental
Inputs:

Starting hour.
Ending hour.
Output:

Total bicycle rental cost in RWF.
MushroomGuess
Inputs:

Whether the mushroom has gills.
Whether it grows in a forest, when asked.
Whether it has a ring, when asked.
Whether it has a convex cup, when asked.
Output:

The mushroom name predicted by the decision tree
The mushroom program does not verify mushroom identification against a scientific database.
Neither program saves information to a file or database.
