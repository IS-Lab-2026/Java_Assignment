1.Bicycle rental fees 
Description
This is a simple Java program that calculates the total cost of renting a bicycle based on the starting and ending times.
Features
- Accepts the starting time from 0 to 23.
- Accepts the ending time from 1 to 24.
- Checks whether the entered times are valid.
- Calculates the rental cost for each hour.
- Displays the total rental cost in Rwandan Francs (RWF).

Rental Rates

- 00:00–07:00: 500 RWF per hour
- 07:00–14:00: 1,000 RWF per hour
- 14:00–19:00: 1,500 RWF per hour
- 19:00–21:00: 1,000 RWF per hour
- 21:00–24:00: 500 RWF per hour

Explanation:
•import java.util.Scanner; : Imports keyboard-input functionality.
•public class BicycleRental : Declares the class BicycleRental
•main(String[] arg) : This is where the program starts to run.
•Scanner input = new Scanner(System.in); : used for user's inputs
•int startTime, endTime, hours, total: Store the starting hour, ending hour,  total cost.
•System.out.print() : Asks the user to input
•input.nextInt() : used to read an integer number inputed
•if / else if / else : check a condition before running the program
•|| : Means OR; either condition may be true.
•startTime >= endTime : Checks that the starting time less than end time 
•hours = endTime - startTime; : Calculates the duration of rent

2.MUSHROOMS IDENTIFICATION
Description 
This is a Java program that identifies a mushroom by asking the user three questions about its characteristics.

Questions Asked
1. Does the mushroom have gills?
2. Does the mushroom grow in a forest?
3. Does the mushroom have a ring?

Mushrooms Identified
- Cèpe de Bordeaux
- Coprin chevelu
- Agaric jaunissant
- Amanite tue-mouche
- Girolle or Pied bleu

How the Program Works

The program asks the user three questions and uses the answers to identify the possible mushroom type. It then displays the result on the screen
Mushroom Identification Program


 Explanations

• "import java.util.Scanner;":Imports Scanner to read user input.

•"public class MushroomIdentification {" : Creates a class named MushroomIdentification.

•"public static void main(String[] args) {": Starts the program.

•"Scanner input = new Scanner(System.in);": Allows the program to read keyboard input.

•"String gills, forest, ring;" : Stores the user's answers.

•"String mushroom;":Stores the mushroom name.

•"System.out.print(...)":Displays a question to the user.

•"input.nextLine();": Reads the user's answer.

•The program asks about gills, forest habitat, and a ring.

•"if (gills.equalsIgnoreCase("no"))": Checks if the mushroom has no gills.

•"else if (forest.equalsIgnoreCase("no"))": Checks if the mushroom does not grow in a forest.

•"if (ring.equalsIgnoreCase("yes"))":Checks if the mushroom has a ring.

•"else": Runs when the previous condition is false.

•"mushroom = "Cepe de bordeau";":Stores the selected mushroom name.

•The other conditions assign Coprin chevelu, Agaric jaunissant, Amanite tue-mouche, or Girolle or Pied bleu.

•"System.out.println("Your mushroom is: " + mushroom);":Displays the identified mushroom.

•"input.close();": Closes the Scanner.

• "}" : Marks the end of code blocks
