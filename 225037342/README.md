HARORIMANA J Baptiste
Reg Number: 225037342
Information Systems
Java Programming
YEAR 2

Java Programming Problems

This project contains two Java programs: Bicycle Rental Cost Calculator and Mushroom Identifier.

Problem 1: Bicycle Rental Cost Calculator

Description

The Bicycle Rental program calculates the total rental cost based on the starting hour and ending hour entered by the user.

Objectives

- Accept the starting and ending hours from the user.
- Check whether the entered rental time is valid.
- Calculate the rental cost for each hour.
- Display the total rental cost in Rwandan Francs (RWF).

Rental Rates

Time| Cost per Hour
Before 7:00 AM| 500 RWF
7:00 AM to before 2:00 PM| 1,000 RWF
2:00 PM to before 7:00 PM| 1,500 RWF
7:00 PM to before 9:00 PM| 1,000 RWF
9:00 PM onwards| 500 RWF

How It Works

1. The program asks the user to enter the starting and ending hours.
2. It checks whether the hours are within the accepted range and whether the starting hour is less than the ending hour.
3. If the time is invalid, it displays an error message.
4. If the time is valid, a "for" loop calculates the cost of each rental hour using conditional statements.
5. Finally, it displays the starting hour, ending hour, and total rental cost.

Technologies Used

- Java
- "Scanner" for user input
- "if-else" statements for checking conditions and selecting rates
- "for" loop for calculating the hourly cost

How to Run

1. Save the code in a file named "BicycleRental.java".

2. Open a terminal in the directory containing the file.

3. Compile the program:
   
   javac BicycleRental.java

4. Run the program:
   
   java BicycleRental

Example Output

Enter starting hour (0-23): 6
Enter ending hour (1-24): 9
Starting hour: 6
Ending hour: 9
Total rental cost: 2500 RWF



Problem 2: Mushroom Identifier

Description

The Mushroom Identifier program identifies a mushroom based on the answers the user provides to a series of yes-or-no questions about its characteristics.

Objectives

- Ask the user questions about the mushroom.
- Accept yes-or-no answers.
- Use conditional statements to follow the identification process.
- Display the identified mushroom.

How It Works

1. The program asks whether the mushroom has a convex cup.
2. Depending on the answer, it asks additional questions about the mushroom's ring, gills, and growing environment.
3. The "askYesNo()" method accepts "yes", "no", "y", or "n".
4. If the user enters an invalid answer, the program asks the question again.
5. Nested "if-else" statements determine the mushroom's name.
6. The program displays the identified mushroom.

Possible Results

- Amanite tue-mouche
- Agaric jaunissant
- Pied bleu
- Cepe de Bordeaux
- Girolle
- Coprin chevelu

Technologies Used

- Java
- "Scanner" for user input
- Methods for reusable code
- Boolean variables for storing yes-or-no answers
- "while" loop for validating user input
- "if-else" statements for making decisions
- Nested conditional statements for identifying mushrooms

How to Run

1. Save the code in a file named "MushroomIdentifier.java".

2. Open a terminal in the directory containing the file.

3. Compile the program:
   
   javac MushroomIdentifier.java

4. Run the program:
   
   java MushroomIdentifier

Example Output

Does your mushroom have a convex cup? (yes/no): yes
Does your mushroom have a ring? (yes/no): no
The identified mushroom is: Pied bleu
