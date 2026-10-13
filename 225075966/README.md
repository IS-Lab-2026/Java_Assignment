Rental Price Calculator
A small Java program that calculates how much a customer pays for renting something by the hour. The price per hour is not the same all day, it depends on the time of the day, so the program checks every hour one by one and adds them up. The currency is Rwandan Francs (RWF).

Price per hour
Time of day Price per hour 00:00 - 07:00 500 RWF
07:00 - 14:00 1000 RWF
14:00 - 19:00 1500 RWF
19:00 - 21:00 1000 RWF
21:00 - 24:00 500 RWF

An hour is charged by the time it starts. For example, if you rent from 6 to 8, you pay for the hour starting at 6 (500) and the hour starting at 7 (1000).

How to run it
You need Java (JDK) installed. Save the code as Rental.java, then in the terminal: javac Rental.java java Rental

How it works
The program asks for a start time (0 to 23) and an end time (1 to 24).
It checks the input. If the start or end is out of range, or the start is greater than end, it prints Invalid input! and stops.
If the input is valid, a for loop goes through each hour from the start up to (but not including) the end.
For each hour, it uses if / else if to find which price range the hour falls in, and adds that price to total.
At the end it prints the total price to pay.
Example runs
Rent from 6 to 9: Enter start time (0 to 23): 6 Enter end time (1 to 24): 9 Totalprice to pay: 2500 RWF

Wrong input: Enter start time (0 to 23): 10 Enter end time (1 to 24): 5 Invalid input! (It is invalid because the start time is greater than end time)

Notes
Only whole hours are accepted, the program does not handle minutes.
Entering letters instead of numbers will crash the program, because there is no check for that.
The rental cannot go past midnight (the end time is at most 24).
Mushroom Identification
This is a small Java program that guesses a mushroom. You think of one mushroom from a list of six, and the program asks you some yes or no questions until it finds which one it is. The six mushrooms are Agaric Jaunissant, Amanite Tue-mouche, Cepe de Bordeaux, Coprin Chevelu, Girolle and Pied Bleu.

How to Run
Save the code into a file named Mushroom.java.
Compile and run it from your terminal or command prompt: javac Mushroom.java java Mushroom
How It Works
How the program works

At the top of the file we import java.util.Scanner. This class lets the program read what the user types on the keyboard. Inside main, a Scanner called input is created to do this.

Then the program prints a message telling the user to think of one of the six mushrooms and to answer only with yes or no.

After that it asks the first question: "Does your mushroom have a ring?". The answer is saved in a String variable called ring. Then it asks the second question: "Does your mushroom have a convex cup?" and saves the answer in a variable called cup.

Now the program looks at the two answers together using if and else if.

If the mushroom has a ring and has no cup, the program says it is Coprin Chevelu and stops there.

If the mushroom has no ring but has a cup, the program says it is Pied Bleu and stops there.

If the mushroom has both a ring and a cup, one question is not enough to know, so the program asks a third question: "Does your mushroom grow in a forest?". The answer is saved in a variable called forest. If the answer is yes, the mushroom is Amanite Tue-mouche. If the answer is no, the mushroom is Agaric Jaunissant.

The last case is the else part, which happens when the mushroom has no ring and no cup. Here the program asks: "Does your mushroom have gills?" and saves the answer in a variable called gills. If the answer is yes, the mushroom is Girolle. If it is no, the mushroom is Cepe de Bordeaux. So the program never asks more than three questions, and every path ends with one mushroom name printed on the screen. Note:But when you are entering answer make sure you enter yes or no in small letters.

Example run

Think of one of the 6 mushroom(Agaric Jaunissant,Amanite Tue-mouche, Cepe de Bordeaux, Cprin Chivelu, Gillore, Pied Bleu). Answer yes or no Does your mushroom have a ring? no Does your mushroom have a convex cup? no Does your mushroom have gills? yes Your mushroom is Girolle

Name: Iragena Ruweli Promesse Reg N:225075966 Department: Information System
