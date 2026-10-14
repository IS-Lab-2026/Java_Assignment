1. MushroomGuess
Purpose
This program identifies a mushroom by asking the user questions that require yes or no answers.
Explanation
- package javaapplication1; : Places the class in the javaapplication1 package.
- import java.util.Scanner; : Imports Scanner so the program can read keyboard input.
- public class mushroomGuess :Declares the class.
- public static void main(String[] arg) :The main method where execution starts.
- Scanner input = new Scanner(System.in); :Creates an object to read the user's answers.
- System.out.print() / System.out.println() :Displays questions or results. println moves to a new line.
- input.nextLine() : Reads the user's answer as text.
- switch (answer) :Chooses a path based on the answer.
- case "yes" and case "no" : Handle the possible answers.
- break; : Exits the current switch case.
- Nested switch statements :Ask further questions to narrow down the mushroom type.


2. BicycleRental
Purpose
This program calculates the bicycle rental cost using the start time, end time, number of hours, and hourly rate.
Explanation
- package javaapplication1; : Places the class in the package.
- import java.util.Scanner; : Imports keyboard-input functionality.
- public class BicycleRental : Declares the class.
- main(String[] arg) : The program starts running here.
- Scanner input = new Scanner(System.in); : Reads the user's input.
- int startTime, endTime, hours, total, and rate : Store the starting hour, ending hour, duration, total cost, and hourly rate.
- System.out.print() : Asks the user to enter a time.
- input.nextInt() : Reads a whole number.
- if / else if / else : Checks the input and selects the appropriate action.
- || : Means OR; either condition may be true.
- startTime >= endTime : Checks that the ending time is less than the starting time.
- hours = endTime - startTime; : Calculates the rental duration.
- rate = 500, 1000, or 1500 — Selects the hourly rate based on the program's time conditions.
- total = hours * rate; : Calculates the amount to pay.
- System.out.println() : Displays the total cost in RWF.
Input rules
- Starting time must be from 0 to 23.
- Ending time must be from 1 to 24.
- The ending time must be greater than the starting time.
- Times are entered as whole hours, not minutes.
