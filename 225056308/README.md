PROGRAM 1: BicycleRental
This program calculates the total bicycle rental cost according to the starting time, ending time, and hourly rates.

- "import java.util.Scanner;" — Imports Scanner to read user input.
- "public class BicycleRental" — Defines the class named BicycleRental.
- "public static void main(String[] args)" — The main method where the program starts.
- "Scanner input = new Scanner(System.in);" — Creates a Scanner object to receive input.
- "int startTime;" — Stores the starting time.
- "int endTime;" — Stores the ending time.
- "int total = 0;" — Initializes the total cost to zero.
- "System.out.print(...)" — Displays a message asking the user to enter a time.
- "startTime = input.nextInt();" — Reads the starting time.
- "endTime = input.nextInt();" — Reads the ending time.
- "if (...)" — Checks whether the entered times are invalid.
- "System.out.println("Invalid time.");" — Displays an error message.
- "return;" — Stops the program if the times are invalid.
- "for (int hour = startTime; hour < endTime; hour++)" — Repeats the calculation for each rental hour.
- "if (hour < 7)" — Checks whether the hour is before 7:00.
- "total += 500;" — Adds 500 RWF to the total.
- "else if (hour < 14)" — Checks whether the hour is before 14:00.
- "total += 1000;" — Adds 1,000 RWF to the total.
- "else if (hour < 19)" — Checks whether the hour is before 19:00.
- "total += 1500;" — Adds 1,500 RWF to the total.
- "else if (hour < 21)" — Checks whether the hour is before 21:00.
- "total += 1000;" — Adds 1,000 RWF to the total.
- "else" — Handles hours from 21:00 onward.
- "total += 500;" — Adds 500 RWF to the total.
- "System.out.println(...)" — Displays the final rental cost.
- "}" — Closes a method, loop, or class.
-   Example Output

Enter starting time (0-23): 6
Enter ending time (1-24): 9
Total rental cost = 2500 RWF


PROGRAM 2: MushroomIdentification

This program identifies a mushroom by asking questions about its cap, habitat, gills, and ring. It uses the user's answers to select a mushroom name.

2. Explanation of Each Line

- "import java.util.Scanner;" — Imports Scanner for reading user input.
- "public class MushroomIdentification" — Defines the class name.
- "public static void main(String[] args)" — The starting point of the program.
- "Scanner input = new Scanner(System.in);" — Creates a Scanner object.
- "String answer;" — Declares a variable to store the user's answer.
- "System.out.println(...)" — Displays the program title.
- "System.out.print(...)" — Asks the user a question.
- "answer = input.nextLine();" — Reads the user's answer as text.
- "if (answer.equalsIgnoreCase("yes"))" — Checks whether the answer is yes, ignoring uppercase and lowercase differences.
- "else" — Executes another path when the previous condition is false.
- "if (answer.equalsIgnoreCase("no"))" — Checks whether the answer is no.
- "System.out.println("Your mushroom is: ...");" — Displays the identified mushroom's name.
- Nested "if-else" statements — Ask further questions and select the mushroom based on the answers.
- "input.close();" — Closes the Scanner after the program finishes.
- "}" — Closes a block or the class.
