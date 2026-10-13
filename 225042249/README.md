PROBLEM 1:
# WORK HOURLY RENTAL COST CALCULATION SYSTEM

## 1. Introduction
The Work program is a Java-based application designed to calculate the total rental cost according to the starting time and ending time entered by the user. The program applies different hourly rates depending on the time of day and calculates the total amount payable in Rwandan francs (RWF).

## 2. Purpose of the Program
The main purpose of this program is to automate the calculation of rental charges by applying the correct hourly rate to each hour of the rental period. It also validates the user's input to ensure that the starting and ending times are within the permitted ranges.

## 3. How the Program Works

### Step 1: Importing Required Tools
The program imports `java.util.Scanner`, which allows it to receive input from the user through the keyboard.

### Step 2: Declaring Variables
The program declares the following variables:
- `start`: Stores the starting time of the rental.
- `end`: Stores the ending time of the rental.
- `hour`: Tracks each hour during the rental period.
- `rate`: Stores the applicable hourly charge.
- `total`: Stores the accumulated rental cost and is initialized to zero.

### Step 3: Collecting User Input
The program asks the user to enter the starting time between 0 and 23 and the ending time between 1 and 24. The program uses `input.nextInt()` to read the entered values.

### Step 4: Validating the Input
An `if` statement checks whether:
- The starting time is less than 0 or greater than 23.
- The ending time is less than 1 or greater than 24.
- The starting time is greater than or equal to the ending time.

If any of these conditions is true, the program displays **"Invalid time."** Otherwise, it proceeds with the calculation.

### Step 5: Initializing the Hour
The variable `hour` is assigned the value of `start`. This allows the program to begin calculating the rental cost from the first hour of the rental period.

### Step 6: Calculating the Hourly Rate
A `while` loop repeats as long as `hour` is less than `end`. During each iteration, the program uses `if-else` statements to determine the correct hourly rate:

- **500 RWF per hour:** When the hour is before 7:00 AM or at/after 9:00 PM.
- **1,000 RWF per hour:** When the hour is before 2:00 PM (but not before 7:00 AM) or at/after 7:00 PM (but before 9:00 PM).
- **1,500 RWF per hour:** When the hour is between 2:00 PM and before 7:00 PM.

After selecting the rate, the program adds it to the total using `total = total + rate`. It then increases `hour` by one using `hour++` to move to the next rental hour.

### Step 7: Displaying the Result
Once the loop finishes, the program displays the final rental cost using:

`System.out.println("Total cost = " + total + " RWF");`

The result represents the sum of all hourly charges during the rental period.

## 4. Technologies and Programming Concepts Used
- **Java:** The programming language used to develop the application.
- **Scanner:** Used to collect input from the user.
- **Variables:** Used to store the starting time, ending time, current hour, hourly rate, and total cost.
- **Conditional statements (`if-else`):** Used to validate input and determine the appropriate hourly rate.
- **While loop:** Used to process each hour between the starting and ending times.
- **Arithmetic operations:** Addition accumulates the total cost, while incrementing advances the current hour.

## 5. Example of Execution
Suppose the user enters:
- Starting time: 6
- Ending time: 9

The program calculates three hourly charges:
- 6:00–7:00 AM = 500 RWF
- 7:00–8:00 AM = 1,000 RWF
- 8:00–9:00 AM = 1,000 RWF

**Total cost = 2,500 RWF**

## 6. Conclusion
The Work program demonstrates how Java can be used to solve a practical cost-calculation problem. Through input collection, validation, conditional statements, and a `while` loop, the program calculates the total rental cost based on the applicable hourly rates. It provides a simple way to automate rental calculations and display the final amount payable.

PROBLEM 2:
# MUSHROOMG  MUSHROOM IDENTIFICATION SYSTEM

## 1. Introduction
MUSHROOMG is a Java-based program designed to identify different types of mushrooms by asking the user a series of questions about their physical characteristics and growing environment. Based on the user's answers, the program follows a decision-making process and displays the corresponding mushroom name.

The program uses simple input and output operations and nested `switch` statements to guide the identification process.

## 2. Purpose of the Program
The main purpose of this program is to demonstrate how Java can be used to identify mushrooms based on specific characteristics. Instead of selecting a mushroom manually from a list, the user answers questions using only **"yes" or "no"**, and the program uses those answers to determine the result.

## 3. How the Program Works

### Step 1: Importing the Required Library
The program imports `java.util.Scanner`, which allows it to receive answers entered by the user through the keyboard.

### Step 2: Displaying Instructions
At the beginning, the program displays a message instructing the user to answer questions using only **"yes" or "no"**. This helps guide the user throughout the identification process.

### Step 3: Checking Whether the Mushroom Has a Ring
The program begins by asking: **"Does it have ring?"**

The answer determines which branch of the identification process the program follows.

- If the answer is **"no"**, the program asks whether the mushroom has gills.
- If the answer is **"yes"**, the program asks whether the mushroom grows in a forest.

### Step 4: Identifying Mushrooms Without a Ring
When the user answers "no" to the first question, the program asks: **"Does it have gills?"**

Depending on the answer, the following decisions are made:

- If the answer is **"no"**, the program identifies the mushroom as *Cèpe de Bordeaux*.
- If the answer is **"yes"**, the program asks whether the mushroom has a convex cup.
  - If the answer is **"no"**, the result is *Girolle*.
  - If the answer is **"yes"**, the result is *Pied bleu*.

This branch uses nested `switch` statements to evaluate the answers and display the appropriate mushroom name.

### Step 5: Identifying Mushrooms With a Ring
When the user answers "yes" to the first question, the program asks: **"Does it grow in forest?"**

- If the answer is **"yes"**, the program identifies the mushroom as *Amanite tue-mouche*.
- If the answer is **"no"**, the program proceeds to ask whether the mushroom has a convex cup.

The answer to the convex-cup question determines the final result:

- If the answer is **"yes"**, the program displays *Agaric Jaunissant*.
- If the answer is **"no"**, the program displays *Coprin chevelu*.

### Step 6: Displaying the Result
After evaluating the user's answers, the program displays the name of the mushroom corresponding to the selected decision path. This allows the user to identify a mushroom through a series of simple questions.

## 4. Programming Concepts Used

- **Java:** The programming language used to develop the identification system.
- **Scanner:** Used to collect the user's answers from the keyboard.
- **String variables:** Used to store the answers to the identification questions.
- **Switch statements:** Used to evaluate the answers and determine which branch of the program should execute.
- **Nested switch statements:** Used when one answer leads to additional questions and decisions.
- **Break statements:** Used to exit a `switch` case and prevent unintended execution of subsequent cases.
- **Conditional decision-making:** The program follows different paths depending on the user's answers.

## 5. Example of Execution

An example of how the program works:

```text
use only 'yes' or 'no'

does it have ring? no
does it have gills? yes
does it have convex cup? no
it is Girolle
```

In this example, the user answers "no" when asked whether the mushroom has a ring, then answers "yes" when asked whether it has gills, and finally answers "no" when asked whether it has a convex cup. The program follows the corresponding decision path and displays **Girolle**.

## 6. Conclusion
The MUSHROOMG program demonstrates the use of Java input, output, string variables, and nested `switch` statements to create a simple mushroom identification system. It guides the user through a sequence of yes-or-no questions and produces a result based on the answers provided.

**Note:** The program expects answers in lowercase (`yes` or `no`). Also, in the current code, answering "yes" to the ring question and "yes" to the forest question prints *Amanite tue-mouche* but does not stop the program from continuing to the next question. The code may need a small correction to ensure the identification process ends at the correct point. This program is an educational exercise, not a reliable method for deciding whether a wild mushroom is safe to eat.
