Students Reg No:225076838

Program 1: BicyleRental.java
Description
This program calculates the total cost of bicycle rental based on the selected time period. Different hourly charges are applied depending on whether the time falls in off-peak, regular, or peak hours.

Line-by-Line Explanation
Line 1: import java.util.Scanner; imports the Scanner class used to receive input from the user.   


Line 3: public class BicycleRental { declares the public class. In Java, the class name should match the file name.


Line 4: public static void main(String[] args) { starts the main method, which is the program’s entry point.


Line 6: Scanner input = new Scanner(System.in); creates an object that reads data from the keyboard.


Line 8 to 11: variables startTime, endTime, total, and rate are declared to store the user’s input and calculated values.


Line 13: System.out.print("Enter starting time (0-23): "); asks the user for the start time.


Line 14: startTime = input.nextInt(); stores the start time entered by the user.


Line 16: System.out.print("Enter ending time (1-24): "); asks for the ending time.


Line 17: endTime = input.nextInt(); stores the ending time.


Line 19: for (int hour = startTime; hour < endTime; hour++) loops through each hour from start time to end time.


Line 21: if (hour < 7 || hour >= 21) checks if the hour is in the off-peak period.


Line 22: rate = 500; sets the rate to 500 RWF for off-peak hours.


Line 24: else if (hour < 14 || hour >= 19) checks if the hour is in the regular period.


Line 25: rate = 1000; sets the rate to 1000 RWF.


Line 27: else handles all remaining hours in the peak period.


Line 28: rate = 1500; sets the rate to 1500 RWF for peak hours.


Line 30: total = total + rate; adds the current hour’s cost to the total.


Line 33: System.out.println("Total rental cost = " + total + " RWF"); prints the final cost to the screen.



Line 35: input.close(); closes the Scanner so the program ends cleanly.


Program 2: MushroomIdentification.java
Description
This program asks a series of yes/no questions to identify a mushroom from a predefined decision tree. It matches the user’s answers to the correct mushroom type.

Line-by-Line Explanation
Line 1: import java.util.Scanner; imports the Scanner class for input.
Line 3: public class MushroomIdentification { declares the class.
Line 4: public static void main(String[] args) { starts the main method.
Line 6: Scanner input = new Scanner(System.in); creates a scanner object.
Line 8: String answer; stores the user’s response to each question.
Line 10 to 12: print the introduction messages explaining how the game works.
Line 14: System.out.print("Does your mushroom have gills? "); asks the first question.
Line 15: answer = input.nextLine(); stores the answer.
Line 17: if (answer.equals("no")) checks if the mushroom does not have gills.
Line 19: System.out.println("Your mushroom is Cepe de Bordeaux."); identifies the mushroom when the answer is "no".
Line 21: else { handles all other answers, which continue to the next question.
Line 22: System.out.print("Does your mushroom grow in a forest? "); asks the next question.
Line 23: answer = input.nextLine(); stores the result.
Line 25: if (answer.equals ("no")) checks if the mushroom does not grow in a forest.
Line 26: System.out.print("Does your mushroom have a convex cup? "); asks the third question.
Line 27: answer = input.nextLine(); stores the answer.
Line 29: if (answer.equals ("yes")) checks if the mushroom has a convex cup.
Line 30: System.out.println("Your mushroom is Agaric Jaunissant."); identifies the mushroom as Agaric Jaunissant.
Line 31 to 33: else block identifies the mushroom as Coprin chevelu if the answer is not yes.
Line 35: else { starts the branch for mushrooms that grow in a forest.
Line 36: System.out.print("Does your mushroom have a ring? "); asks the fourth question.
Line 37: answer = input.nextLine(); stores the answer.
Line 39: if (answer.equals ("yes")) checks whether the mushroom has a ring.
Line 41: System.out.println("Your mushroom is Amanite tue-mouche."); prints the final identification.
Line 43 to 44: an empty else block indicates no specific output for the remaining case.
Line 48: input.close(); closes the Scanner and ends the program.
