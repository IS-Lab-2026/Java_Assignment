Java Programs

This project contains two Java programs:

1. BicycleRental.java: calculates the cost of a bicycle rental.
2. Mushroom.java: is a yes/no guessing program that identifies a mushroom.

 1. BicycleRental.java

 What it does

It calculates how much a customer must pay to rent a bicycle. The price depends on how many hours the bicycle is rented and what time the rental starts.

 How it works

1. The program asks for the starting time and the ending time, Both are whole numbers on a 24-hour clock .
2. It calculates the rental hours:

   hours = endTime - startTime

3. It chooses the rate per hour using the starting time only:

   Starting time  Rate per hour 
   Before 7      500 RWF      
   7 to 13       1000 RWF
   14 to 18      1500 RWF     
   19 to 20      1000 RWF
   21 or later   500 RWF      

5. It calculates the total:

   total = hours * rate

6. It prints the rental hours, the rate per hour, and the total cost.

The program checks the conditions from top to bottom and stops at the first one that is true. That is why else if (startTime < 14) only needs to say "less than 14": a start time below 7 was already handled by the first "if".


java codes
import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int startTime;
        int endTime;
        int hours;
        int rate;
        int total;

        System.out.print("Enter starting time: ");
        startTime = input.nextInt();

        System.out.print("Enter ending time: ");
        endTime = input.nextInt();

        hours = endTime - startTime;

        if (startTime < 7) {
            rate = 500;
        }
        else if (startTime < 14) {
            rate = 1000;
        }
        else if (startTime < 19) {
            rate = 1500;
        }
        else if (startTime < 21) {
            rate = 1000;
        }
        else {
            rate = 500;
        }

        total = hours * rate;

        System.out.println("Rental hours = " + hours);
        System.out.println("Rate per hour = " + rate + " RWF");
        System.out.println("Total cost = " + total + " RWF");
    }
}


Example :
Enter starting time: 8
Enter ending time: 11
Rental hours = 3
Rate per hour = 1000 RWF
Total cost = 3000 RWF
Why: 11 - 8 = 3 hours. Start time 8 falls in the 7 to 13 range, so the rate is 1000. 3 x 1000 = 3000.

Notice this:
- The rate is decided by the "start time only". A rental that starts at 13 and ends at 16 is charged 1000 RWF for all 3 hours, even though part of it runs into the 1500 RWF period.
- If the ending time is smaller than the starting time, the result will be negative, because the program does not check for that.


 2. Mushroom.java

What it does

It is a yes/no guessing program. The user secretly thinks of one of six mushrooms, the program asks a few questions, and then it tells the user which mushroom they were thinking of.

The six mushrooms are:

- Agaric jaunissant
- Coprin chevelu
- Amanite tue-mouches
- Pied bleu
- Girolle
- Cepe de Bordeaux

 How it works

The program works like a decision tree. Each answer sends it down a different path until it reaches one mushroom.


Does it grow in a forest?
|
+-- NO --> Does it have a convex cup?
|            +-- YES --> Agaric jaunissant
|            +-- NO  --> Coprin chevelu
|
+-- YES -> Does it have a convex cup?
             +-- YES --> Does it have a ring?
             |             +-- YES --> Amanite tue-mouches
             |             +-- NO  --> Pied bleu
             |
             +-- NO  --> Does it have gills?
                           +-- YES --> Girolle
                           +-- NO  --> Cepe de Bordeaux

Every mushroom is reached by a different combination of answers, so the program always ends with exactly one result. It asks at most three questions.

java codes

import java.util.Scanner;

public class Mushroom {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String forest;
        String convex;
        String ring;
        String gills;

        System.out.println("Think of one of the six mushrooms.");

        System.out.print("Does your mushroom grow in a forest? ");
        forest = input.nextLine();

        if (forest.equalsIgnoreCase("no")) {

            System.out.print("Does your mushroom have a convex cup? ");
            convex = input.nextLine();

            if (convex.equalsIgnoreCase("yes")) {
                System.out.println("Your mushroom is Agaric jaunissant.");
            }
            else {
                System.out.println("Your mushroom is Coprin chevelu.");
            }
        }

        else {

            System.out.print("Does your mushroom have a convex cup? ");
            convex = input.nextLine();

            if (convex.equalsIgnoreCase("yes")) {

                System.out.print("Does your mushroom have a ring? ");
                ring = input.nextLine();

                if (ring.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is Amanite tue-mouches.");
                }
                else {
                    System.out.println("Your mushroom is Pied bleu.");
                }
            }

            else {

                System.out.print("Does your mushroom have gills? ");
                gills = input.nextLine();

                if (gills.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is Girolle.");
                }
                else {
                    System.out.println("Your mushroom is Cepe de Bordeaux.");
                }
            }
        }
    }
}


 Example : a mushroom outside the forest

Think of one of the six mushrooms.
Does your mushroom grow in a forest? no
Does your mushroom have a convex cup? yes
Your mushroom is Agaric jaunissant.


Notice this:
- Answers are not case-sensitive. "yes", "Yes" and "YES" all work, because the program uses `equalsIgnoreCase`.
- For the forest question, only the exact word "no" counts as no. Any other input (including a typo such as "nope") is treated as yes.
- For the cup, ring and gills questions, only the exact word "yes" counts as yes. Any other input is treated as no.
  
