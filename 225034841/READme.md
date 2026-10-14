
Q1
import java.util.Scanner;	-Imports the Scanner class to read user input from the keyboard.
public class BicycleRental	-Declares a class named BicycleRental. The file should be named BicycleRental.java.
public static void main(String[] args)	-Defines the main method where program execution begins.
Scanner input = new Scanner(System.in);	-Creates a Scanner object to receive input from the keyboard.
System.out.print("Enter starting hour: ");	-Displays a prompt asking the user to enter the starting hour.
int startTime = input.nextInt();	-Reads and stores the starting hour as a whole number.
System.out.print("Enter ending hour: ");	-Displays a prompt asking the user to enter the ending hour.
int endTime = input.nextInt();	-Reads and stores the ending hour as a whole number.
int totalCost = 0;	-Initializes the total rental cost to zero before calculating the price.
for (int hour = startTime; hour < endTime; hour++)	-Repeats the calculation for each rental hour, including the start hour but excluding the end hour.
if (hour < 7 || hour >= 21)	-Checks whether the current hour is before 7 or is 21 and later.
totalCost += 500;	-Adds 500 RWF to the total cost.
else if (hour < 14)	-Checks the next condition if the previous condition is false; hours from 7 to before 14 cost 1,000 RWF.
else if (hour < 19)	-Checks whether the hour is before 19 after the earlier conditions; hours from 14 to before 19 cost 1,500 RWF.
else	-Runs when none of the previous conditions is true; in this code, it covers hours 19 and 20.
System.out.println(...);	-Displays information or the final rental cost on the screen.
input.close();	-Closes the Scanner when the program has finished reading input.
&&	Means AND: both conditions must be true.
||	Means OR: at least one condition must be true.
{ }	Mark the beginning and end of a block of code.

Q2
import java.util.Scanner;	-Imports the Scanner class for reading user input.
public class MushroomIdentification	Declares a class named MushroomIdentification.
public static void main(String[] args)	-Defines the main method where the program starts.
Scanner input = new Scanner(System.in);	-Creates a Scanner object to read answers typed by the user.
String gills;	-Declares a String variable to store the answer about gills.
String forest;	-Declares a String variable to store the answer about whether the mushroom grows in a forest.
String ring;	-Declares a String variable to store the answer about a ring.
System.out.println("...");	-Displays instructions, questions, or results to the user.
gills = input.nextLine();-	Reads the user's answer and stores it in the gills variable.
input.nextLine().trim().toLowerCase()	Reads text, removes extra spaces at the ends, and converts it to lowercase.
if (gills.equals("no"))-	Checks whether the answer about gills is no.
else if	-Checks another condition when the preceding condition is false.
else	-Runs the alternative block when the preceding conditions are false.
answer.equalsIgnoreCase("yes")	-Checks whether the answer is yes without distinguishing uppercase and lowercase letters.
answer.equalsIgnoreCase("no")	-Checks whether the answer is no without distinguishing uppercase and lowercase letters.
if (condition) { ... } -inside another if	Nested if statements check another condition after an earlier condition has been tested.
{ }	-Define the beginning and end of a code block.
input.close();	-Closes the Scanner after input is finished.
