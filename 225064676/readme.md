REGNO:225064676

This project contains two Java programs: Bicycle Rental and Mushroom Identification. The programs demonstrate how basic Java concepts such as variables, user input, decision statements, loops, and operators can be used to solve practical problems.

1. Bicycle Rental Program
   
The Bicycle Rental Program calculates the total cost of renting a bicycle based on the starting and ending hours entered by the user. The rental price changes depending on the time of day. The program automatically checks each rental hour, selects the correct price, and calculates the total amount the customer must pay.
How the Program Works
First, the program imports the Scanner class to allow the user to enter information through the keyboard. It then declares three integer variables: starthour, endhour, and total. The first two store the starting and ending hours, while total is initialized to zero to store the final rental cost.
The program asks the user to enter the starting hour between 0 and 23 and the ending hour between 1 and 24. It stores these values in the appropriate variables.
After receiving the input, the program uses a for loop to process each rental hour. The loop begins at the starting hour and continues until it reaches the ending hour. For each hour, the program uses conditional statements to determine the applicable rental rate.
The rental cost is 500 RWF per hour from hour 0 to before hour 7, and from hour 21 to before hour 24. From hour 7 to before hour 14, and from hour 19 to before hour 21, the cost is 1,000 RWF per hour. From hour 14 to before hour 19, the cost is 1,500 RWF per hour.
Once the hourly rate has been selected, the program adds it to the total variable. This process repeats until all rental hours have been processed. Finally, the program displays the total rental cost in RWF.

Example
If the user enters 7 as the starting hour and 10 as the ending hour, the program calculates the cost for hours 7, 8, and 9. Each hour costs 1,000 RWF, so the total rental cost is 3,000 RWF.

2.Mushroom Identification program

The Mushroom Identification Program identifies a mushroom based on its characteristics and growing environment. It asks the user questions about the mushroom and uses the answers to determine its name. The program uses decision statements to follow the appropriate path until it displays an identification result.

How the Program Works

At the beginning, the program imports the Scanner class and declares four String variables: gills, forest, ring, and convex. These variables store the user's answers about the mushroom's characteristics.
The program displays the title "Mushroom identification" and asks whether the mushroom has gills. If the user answers no, the program identifies it as Cepe de Bordeaux and displays the result.
If the user answers yes, the program asks whether the mushroom grows in the forest. If the answer is no, it asks whether the mushroom has a convex cup. If the answer is yes, the result is Agaric Jaunissant. Otherwise, the result is Coprin Chevelu.
If the mushroom grows in the forest, the program asks whether it has a ring. If the user answers yes, the mushroom is identified as Amanite Tue-Mouche. If the answer is no, the program asks whether it has a convex cup. If the answer is yes, the mushroom is identified as Pied Bleu. Otherwise, it is identified as Girolle.
Finally, the program displays the name of the mushroom according to the answers provided by the user.

3. Java Concepts Used

•	Variables and data types: Variables store information such as rental hours, total cost, and mushroom characteristics. The int type stores whole numbers, while String stores text.
•	User input: The Scanner class reads information entered by the user.
•	Output: System.out.println() displays questions, messages, and results.
•	Decision statements: The if, else if, and else statements allow the programs to choose actions based on conditions.
•	Loops: The for loop repeats the rental cost calculation for each hour.
•	Operators: Arithmetic operators perform calculations, while comparison and logical operators check conditions.
•	Nested decisions: The Mushroom Identification Program places decision statements inside other decision statements to determine the final result.

