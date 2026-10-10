REGNo:225031384

JAVA LAB 1 ACTIVITIES — LINE-BY-LINE EXPLANATIONS
PROBLEM 1: BICYCLE RENTAL
1. What does the program do?
The program calculates the total cost of renting a bicycle based on the starting time and ending time.
The cost depends on the hour:
From 00:00 to 06:59: 500 RWF per hour.
From 07:00 to 13:59: 1000 RWF per hour.
From 14:00 to 18:59: 1500 RWF per hour.
From 19:00 to 20:59: 1000 RWF per hour.
From 21:00 to 23:59: 500 RWF per hour.
2. Java Code
import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting time (0-23): ");
        int startTime = input.nextInt();

        System.out.print("Enter ending time (1-24): ");
        int endTime = input.nextInt();

        if (startTime < 0 || startTime > 23 ||
            endTime < 1 || endTime > 24 ||
            startTime >= endTime) {
            System.out.println("Invalid time.");
            input.close();
            return;
        }

        int total = 0;

        for (int hour = startTime; hour < endTime; hour++) {
            int rate;

            if (hour < 7) {
                rate = 500;
            } else if (hour < 14) {
                rate = 1000;
            } else if (hour < 19) {
                rate = 1500;
            } else if (hour < 21) {
                rate = 1000;
            } else {
                rate = 500;
            }

            total += rate;
        }

        System.out.println("Total rental cost = " + total + " RWF");
        input.close();
    }
}
3. Line-by-Line Explanation
Line 1:
import java.util.Scanner;
This imports the Scanner class, which allows the program to receive input from the keyboard.
Line 2:
public class BicycleRental {
This declares a class named BicycleRental. The filename should be BicycleRental.java.
Line 3:
public static void main(String[] args) {
This is the main method. Java starts executing the program from this method.
Line 4:
Scanner input = new Scanner(System.in);
This creates a Scanner object named input to read information entered by the user.
Line 5:
System.out.print("Enter starting time (0-23): ");
This asks the user to enter the bicycle rental starting time.
Line 6:
int startTime = input.nextInt();
This reads the starting time and stores it in the integer variable startTime.
Line 7:
System.out.print("Enter ending time (1-24): ");
This asks the user to enter the ending time.
Line 8:
int endTime = input.nextInt();
This reads the ending time and stores it in endTime.
Lines 9–12:
if (startTime < 0 || startTime > 23 ||
    endTime < 1 || endTime > 24 ||
    startTime >= endTime) {
This checks whether the entered times are invalid.
startTime < 0: The starting time is less than 0.
startTime > 23: The starting time is greater than 23.
endTime < 1: The ending time is less than 1.
endTime > 24: The ending time is greater than 24.
startTime >= endTime: The starting time is equal to or later than the ending time.
|| means OR.
If any condition is true, the program considers the times invalid.
Line 13:
System.out.println("Invalid time.");
This displays an error message when the times are invalid.
Line 14:
input.close();
This closes the Scanner.
Line 15:
return;
This stops the program because the entered times are invalid.
Line 16:
}
This closes the if statement.
Line 17:
int total = 0;
This creates an integer variable named total and initializes it to zero. It will store the total rental cost.
Lines 18–19:
for (int hour = startTime; hour < endTime; hour++) {
This is a for loop that processes each rented hour.
int hour = startTime: Begins at the starting time.
hour < endTime: Continues while the hour is less than the ending time.
hour++: Increases the hour by one after each iteration.
The ending time is not included as a rented hour.
Line 20:
int rate;
This declares an integer variable named rate. It stores the price for the current hour.
Lines 21–22:
if (hour < 7) {
    rate = 500;
If the current hour is before 7, the rate is 500 RWF.
Lines 23–24:
} else if (hour < 14) {
    rate = 1000;
If the hour is 7 or later but before 14, the rate is 1000 RWF.
Lines 25–26:
} else if (hour < 19) {
    rate = 1500;
If the hour is 14 or later but before 19, the rate is 1500 RWF.
Lines 27–28:
} else if (hour < 21) {
    rate = 1000;
If the hour is 19 or later but before 21, the rate is 1000 RWF.
Lines 29–30:
} else {
    rate = 500;
}
If none of the previous conditions is true, the hour is 21, 22, or 23, so the rate is 500 RWF.
Line 31:
total += rate;
This adds the current hourly rate to the total cost.
It is equivalent to:
total = total + rate;
Line 32:
}
This closes the for loop.
Line 33:
System.out.println("Total rental cost = " + total + " RWF");
This displays the total rental cost.
Line 34:
input.close();
This closes the Scanner after the program finishes reading input.
Line 35:
}
This closes the main method.
Line 36:
}
This closes the BicycleRental class.
4. Example
Suppose the user enters:
Enter starting time (0-23): 13
Enter ending time (1-24): 16
The program calculates:
Hour 13: 1000 RWF.
Hour 14: 1500 RWF.
Hour 15: 1500 RWF.
Total:
1000 + 1500 + 1500 = 4000 RWF
Output:
Total rental cost = 4000 RWF

PROBLEM 2: MUSHROOM IDENTIFICATION

1. What does the program do?
The program identifies one of six mushrooms by asking questions about its characteristics.
It asks about:
Whether the cap is convex.
Whether the mushroom has gills.
Whether it grows in a forest.
Whether it has a ring.
Based on the user's answers, it displays the mushroom's name.
The six mushrooms are:
Agaric jaunissant
Amanite tue-mouche
Cepe de bordeaux
Coprin chevelu
Girolle
Pied bleu
2. Java Code
import java.util.Scanner;

public class MushroomIdentification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;

        System.out.println("MUSHROOM IDENTIFICATION");
        System.out.println();

        System.out.print("Does your mushroom have a convex cap? (yes/no): ");
        answer = input.nextLine().trim();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.print("Does your mushroom grow in a forest? (yes/no): ");
            answer = input.nextLine().trim();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Your mushroom is: Agaric jaunissant");
            } else {
                System.out.print("Does your mushroom have a ring? (yes/no): ");
                answer = input.nextLine().trim();

                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is: Amanite tue-mouche");
                } else {
                    System.out.println("Your mushroom is: Pied bleu");
                }
            }
        } else {
            System.out.print("Does your mushroom have gills? (yes/no): ");
            answer = input.nextLine().trim();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Your mushroom is: Cepe de bordeaux");
            } else {
                System.out.print("Does your mushroom grow in a forest? (yes/no): ");
                answer = input.nextLine().trim();

                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is: Girolle");
                } else {
                    System.out.println("Your mushroom is: Coprin chevelu");
                }
            }
        }

        input.close();
    }
}
3. Line-by-Line Explanation
Line 1:
import java.util.Scanner;
This imports the Scanner class so the program can read answers entered by the user.
Line 2:
public class MushroomIdentification {
This declares a class named MushroomIdentification. The filename should be MushroomIdentification.java.
Line 3:
public static void main(String[] args) {
This is the main method where Java begins executing the program.
Line 4:
Scanner input = new Scanner(System.in);
This creates a Scanner object named input to receive the user's answers.
Line 5:
String answer;
This declares a String variable named answer. It stores the answers entered by the user, such as yes or no.
Line 6:
System.out.println("MUSHROOM IDENTIFICATION");
This displays the program's title.
Line 7:
System.out.println();
This prints an empty line to make the output easier to read.
Line 8:
System.out.print("Does your mushroom have a convex cap? (yes/no): ");
This asks the first question: Does the mushroom have a convex cap?
Line 9:
answer = input.nextLine().trim();
This reads the user's answer.
input.nextLine() reads a line of text.
.trim() removes spaces at the beginning and end.
The answer is stored in answer.
Line 10:
if (answer.equalsIgnoreCase("yes")) {
This checks whether the user answered yes, ignoring uppercase and lowercase differences.
For example, yes, YES, and Yes are all accepted.
If the answer is yes, the program follows the first branch.
Line 11:
System.out.print("Does your mushroom grow in a forest? (yes/no): ");
This asks whether the mushroom grows in a forest.
Line 12:
answer = input.nextLine().trim();
This reads and stores the answer to the forest question.
Line 13:
if (answer.equalsIgnoreCase("no")) {
This checks whether the user answered no to the forest question.
Line 14:
System.out.println("Your mushroom is: Agaric jaunissant");
If the cap is convex and the mushroom does not grow in a forest, the program identifies it as Agaric jaunissant.
Line 15:
} else {
If the answer is not no, the program follows the alternative branch.
Line 16:
System.out.print("Does your mushroom have a ring? (yes/no): ");
This asks whether the mushroom has a ring.
Line 17:
answer = input.nextLine().trim();
This reads and stores the user's answer.
Line 18:
if (answer.equalsIgnoreCase("yes")) {
This checks whether the mushroom has a ring.
Line 19:
System.out.println("Your mushroom is: Amanite tue-mouche");
If the cap is convex, the mushroom grows in a forest, and it has a ring, the program identifies it as Amanite tue-mouche.
Line 20:
} else {
If the answer is not yes, the program follows the alternative branch.
Line 21:
System.out.println("Your mushroom is: Pied bleu");
This identifies the mushroom as Pied bleu when the cap is convex, it grows in a forest, and it does not have a ring.
Line 22:
}
This closes the inner if-else statement that checks whether the mushroom has a ring.
Line 23:
}
This closes the if-else statement that checks whether the mushroom grows in a forest.
Line 24:
} else {
If the answer to the first question is not yes, the program follows this branch. It assumes that the cap is not convex.
Line 25:
System.out.print("Does your mushroom have gills? (yes/no): ");
This asks whether the mushroom has gills.
Line 26:
answer = input.nextLine().trim();
This reads and stores the answer.
Line 27:
if (answer.equalsIgnoreCase("no")) {
This checks whether the user answered no, meaning the mushroom does not have gills.
Line 28:
System.out.println("Your mushroom is: Cepe de bordeaux");
If the cap is not convex and the mushroom has no gills, the program identifies it as Cepe de bordeaux.
Line 29:
} else {
If the answer is not no, the program follows the alternative branch and assumes the mushroom has gills.
Line 30:
System.out.print("Does your mushroom grow in a forest? (yes/no): ");
This asks whether the mushroom grows in a forest.
Line 31:
answer = input.nextLine().trim();
This reads and stores the answer.
Line 32:
if (answer.equalsIgnoreCase("yes")) {
This checks whether the mushroom grows in a forest.
Line 33:
System.out.println("Your mushroom is: Girolle");
If the cap is not convex, the mushroom has gills, and it grows in a forest, the program identifies it as Girolle.
Line 34:
} else {
If the answer is not yes, the program follows the alternative branch.
Line 35:
System.out.println("Your mushroom is: Coprin chevelu");
This identifies the mushroom as Coprin chevelu when the cap is not convex, it has gills, and it does not grow in a forest.
Line 36:
}
This closes the inner if-else statement that checks the forest answer.
Line 37:
}
This closes the if-else statement that checks whether the mushroom has gills.
Line 38:
}
This closes the main if-else statement that checks whether the cap is convex.
Line 39:
input.close();
This closes the Scanner after the program has finished reading answers.
Line 40:
}
This closes the main method.
Line 41:
}
This closes the MushroomIdentification class.
4. Example
Suppose the user answers:
MUSHROOM IDENTIFICATION

Does your mushroom have a convex cap? (yes/no): yes
Does your mushroom grow in a forest? (yes/no): yes
Does your mushroom have a ring? (yes/no): no
The program displays:
Your mushroom is: Pied bleu
