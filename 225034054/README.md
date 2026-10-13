**Student Registration Number:** 225034054

---

# Problem 1: Bicycle Rentals

**File:** `Bicyclerentals.java`

## What the program does

The program calculates the total cost of renting a bicycle based on the starting hour and the ending hour entered by the user. The rate per hour changes depending on the time of day, so the program loops through every hour of the rental and adds the correct rate to a running total.

### Rates

| Time Range | Rate (RWF/hour) |
|---|---|
| 0 – 7 and 21 – 24 | 500 |
| 7 – 14 and 19 – 21 | 1000 |
| 14 – 19 | 1500 |

## Line-by-Line Explanation

```java
package com.mycompany.bicyclerentals;
```
Declares the package the class belongs to. It tells Java that this file lives inside the folder structure `com/mycompany/bicyclerentals/`.

```java
import java.util.Scanner;
```
Imports the `Scanner` class from the `java.util` package so we can read input from the keyboard.

```java
public class BicycleRentals {
```
Declares a public class called `BicycleRentals`. The class name must match the file name.

```java
public static void main(String[] args) {
```
The main method — the entry point of the program.

```java
Scanner sc = new Scanner(System.in);
```
Creates a `Scanner` object called `sc` that reads input from the keyboard.

```java
System.out.print("\nEnter start time (0 - 23): ");
```
Prints a prompt asking the user to enter the starting hour.

```java
int startTime = sc.nextInt();
```
Reads an integer from the user and stores it in `startTime`.

```java
System.out.print("\nEnter end time (1 - 24): ");
```
Prompts the user to enter the ending hour.

```java
int endTime = sc.nextInt();
```
Reads the ending hour from the user and stores it in `endTime`.

```java
if (startTime < 0 || startTime >= 23 || endTime < 1 || endTime > 24 || startTime >= endTime) {
    System.out.println("Invalid Range! Enter the valid time range.");
}
```
Validates the input. If any of these are true, it prints an error message:
- Start time is less than 0
- Start time is 23 or more
- End time is less than 1
- End time is more than 24
- Start time is greater than or equal to end time

```java
int totalCost = 0;
```
Declares an integer `totalCost` and initializes it to 0. This holds the running total.

```java
for (int hour = startTime; hour < endTime; hour++) {
```
A `for` loop that starts at `startTime`, runs while `hour < endTime`, and increases `hour` by 1 each time. It goes through every hour of the rental.

```java
if (hour < 7 || hour >= 21) {
    totalCost += 500;
}
```
If the hour is before 7am or from 9pm onwards, add 500 RWF to the total.

```java
else if ((hour >= 7 && hour < 14) || (hour >= 19 && hour < 21)) {
    totalCost += 1000;
}
```
If the hour is between 7am and 2pm, or between 7pm and 9pm, add 1000 RWF.

```java
else if (hour >= 14 && hour < 19) {
    totalCost += 1500;
}
```
If the hour is between 2pm and 7pm, add 1500 RWF.

```java
System.out.println("\nTotal rent to pay: " + totalCost + " RWF \n");
```
Prints the total cost with the currency "RWF".

```java
sc.close();
```
Closes the Scanner.

## Sample Run

```
Enter start time (0 - 23): 5
Enter end time (1 - 24): 9
Total rent to pay: 3000 RWF
```

## Key Concepts Used

- `Scanner` for user input
- `for` loop for iterating through hours
- `if-else if-else` chain for multiple rate conditions
- `+=` operator for cumulative addition
- Input validation using logical OR (`||`) and AND (`&&`)

---

# Problem 2: Mushroom Identification

**File:** `Mushrooms.java`

## What the program does

The program asks the user to think of one of six mushrooms. It then asks yes/no questions to identify which mushroom the user is thinking of. It always identifies the mushroom in at most three questions.

The six mushrooms are:
- Agaric Jaunissant
- Amanite tue-mouche
- Cepe de bordeaux
- Coprin chevelu
- Girolle
- Pied bleu

## Line-by-Line Explanation

```java
package com.mycompany.mushrooms;
```
Declares the package name. The file must be located in `com/mycompany/mushrooms/` on disk.

```java
import java.util.Scanner;
```
Imports the `Scanner` class so we can read user input.

```java
public class Mushrooms {
```
Declares a public class called `Mushrooms`. The class name matches the file name.

```java
public static void main(String[] args) {
```
The main method where the program starts.

```java
Scanner sc = new Scanner(System.in);
```
Creates a `Scanner` object called `sc` to read input from the keyboard.

```java
System.out.println("Think of one of the following mushrooms:");
System.out.println("- Agaric Jaunissant");
System.out.println("- Amanite tue-mouche");
System.out.println("- Cepe de bordeaux");
System.out.println("- Coprin chevelu");
System.out.println("- Girolle");
System.out.println("- Pied bleu");
System.out.println();
```
Prints the list of six mushrooms to the user so they know what to think of.

```java
boolean forest = askYesNo(sc, "Does your mushroom grow in a forest?");
```
Calls the helper method `askYesNo`, asking if the mushroom grows in a forest. Returns `true` for yes, `false` for no. Stored in `forest`.

```java
if (!forest) {
```
If the mushroom does NOT grow in a forest.

```java
boolean convex = askYesNo(sc, "Does your mushroom have a convex cup?");
```
Asks if the mushroom has a convex cup. Stored in `convex`.

```java
if (convex) {
    System.out.println("\nYour mushroom is: Agaric Jaunissant");
} else {
    System.out.println("\nYour mushroom is: Coprin chevelu");
}
```
Only two mushrooms don't grow in a forest: Agaric Jaunissant (has convex cup) and Coprin chevelu (does not).

```java
} else {
```
If the mushroom DOES grow in a forest.

```java
boolean convex = askYesNo(sc, "Does your mushroom have a convex cup?");
```
Asks again about the convex cup. Stored in `convex`.

```java
if (convex) {
    boolean ring = askYesNo(sc, "Does your mushroom have a ring?");
    if (ring) {
        System.out.println("\nYour mushroom is: Amanite tue-mouche");
    } else {
        System.out.println("\nYour mushroom is: Pied bleu");
    }
}
```
If the mushroom grows in a forest and has a convex cup, only Amanite tue-mouche (has ring) and Pied bleu (no ring) remain.

```java
} else {
    boolean gills = askYesNo(sc, "Does your mushroom have gills?");
    if (gills) {
        System.out.println("\nYour mushroom is: Girolle");
    } else {
        System.out.println("\nYour mushroom is: Cepe de bordeaux");
    }
}
```
If the mushroom grows in a forest but has no convex cup, only Girolle (has gills) and Cepe de bordeaux (has pores, no gills) remain.

```java
sc.close();
```
Closes the Scanner.

```java
private static boolean askYesNo(Scanner sc, String question) {
```
Declares a helper method called `askYesNo`. Takes a Scanner and a question. Returns `true` for yes, `false` for no.

```java
while (true) {
```
An infinite loop — keeps asking until a valid answer is given.

```java
System.out.print(question + " (yes/no): ");
```
Prints the question with a yes/no prompt.

```java
String answer = sc.nextLine().trim().toLowerCase();
```
Reads the input, removes extra spaces, converts to lowercase.

```java
if (answer.equals("yes") || answer.equals("y")) {
    return true;
}
```
Returns `true` if the answer is yes or y.

```java
else if (answer.equals("no") || answer.equals("n")) {
    return false;
}
```
Returns `false` if the answer is no or n.

```java
else {
    System.out.println("Please answer 'yes' or 'no'.");
}
```
If anything else is typed, prints an error and asks again.

```java
}
```
Closes the `while` loop.

```java
}
```
Closes the `askYesNo` method.

```java
}
```
Closes the `Mushrooms` class.

## Sample Run

```
Think of one of the following mushrooms:
- Agaric Jaunissant
- Amanite tue-mouche
- Cepe de bordeaux
- Coprin chevelu
- Girolle
- Pied bleu

Does your mushroom grow in a forest? (yes/no): yes
Does your mushroom have a convex cup? (yes/no): no
Does your mushroom have gills? (yes/no): yes
Your mushroom is: Girolle
```

## Key Concepts Used

- Nested `if-else` statements for decision-making
- Helper method `askYesNo` for input validation
- `while (true)` loop for repeated input until valid
- String methods: `.trim()`, `.toLowerCase()`, `.equals()`
- Boolean logic: `!`, `&&`, `||`

---

**Author:** Student Registration Number 225034054

