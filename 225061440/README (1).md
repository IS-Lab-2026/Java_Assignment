# Java Programming Assignment: Bicycle Rental and Mushroom Classification

## 1. Student Information

- **Registration Number:** 225061440
- **Student Name:** BARAKA Agnes
- **Course/Module:** Java Programming

## 2. Description of the Work

This project contains two Java console programs.

### Problem 1: Bicycle Rental

The `BicycleRental` program calculates the total cost of a bicycle rental. The user enters a starting hour and an ending hour as whole numbers. The program checks that the hours are valid and that the starting time is earlier than the ending time. It then calculates the cost for each hour and displays the total in Rwandan francs (RWF).

The hourly rates are:

| Hour range | Cost per hour |
|---|---:|
| Before 07:00 | 500 RWF |
| 07:00 to before 14:00 | 1,000 RWF |
| 14:00 to before 19:00 | 1,500 RWF |
| 19:00 to before 21:00 | 1,000 RWF |
| 21:00 to before 24:00 | 500 RWF |

### Problem 2: Mushroom Classification

The `MushroomClassification` program identifies one of six mushroom types using the user's truthful `yes` or `no` answers about the mushroom's features.

The possible results are:

- Agaric Jaunissant
- Amanite Tue-Mouches
- Cèpe de Bordeaux
- Coprin Chevelu
- Girolle
- Pied Bleu

The program uses nested `if` and `else` statements to choose the next question and identify the mushroom.

**Note:** The supplied flowchart can ask four questions on one path (gills, forest, ring, then convex cup), although the written question says to ask at most three. The program follows the supplied flowchart.

## 3. Explanation of Important Code

### Problem 1: `BicycleRental.java`

**Main class and method**

```java
public class BicycleRental {
    public static void main(String[] args) {
```

`BicycleRental` is the class that contains the bicycle rental program. The `main()` method is where execution begins.

**Reading input**

```java
Scanner input = new Scanner(System.in);

System.out.print("Enter starting time: ");
startTime = input.nextInt();

System.out.print("Enter ending time: ");
endTime = input.nextInt();
```

`Scanner` reads the hours entered by the user. The `int` data type is used because the assignment accepts whole-number hours, not decimal numbers.

**Checking the times**

```java
if (startTime < 0 || startTime > 23 || endTime < 1 || endTime > 24 || startTime >= endTime) {
    System.out.println("Invalid time.");
}
```

This condition checks that the starting hour is from 0 to 23, the ending hour is from 1 to 24, and the start is earlier than the end. If any condition is invalid, the program displays an error message.

**Calculating the cost**

```java
currentHour = startTime;

while (currentHour < endTime) {
    if (currentHour < 7) {
        totalCost += 500;
    } else if (currentHour < 14) {
        totalCost += 1000;
    } else if (currentHour < 19) {
        totalCost += 1500;
    } else if (currentHour < 21) {
        totalCost += 1000;
    } else {
        totalCost += 500;
    }

    currentHour++;
}
```

`currentHour` starts at the rental's starting hour. The `while` loop handles each hour up to, but not including, the ending hour. The conditional statements select the correct hourly rate, and `totalCost += ...` adds that rate to the total. `currentHour++` moves the loop to the next hour.

**Displaying the result**

```java
System.out.println("Total rental cost: " + totalCost + " RWF");
```

This displays the total rental cost.

### Problem 2: `MushroomClassification.java`

**Main class and input**

```java
public class MushroomClassification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;
```

`MushroomClassification` contains the mushroom identification program. The `main()` method starts it, and the `answer` variable stores the user's response.

**Reading answers and making decisions**

```java
answer = input.nextLine().trim().toLowerCase();

if (answer.equals("no")) {
    System.out.println("Your mushroom is Cepe de Bordeaux.");
} else {
    ...
}
```

`nextLine()` reads the answer. `trim()` removes extra spaces around it, and `toLowerCase()` makes it lowercase. The `if` and `else` statements determine which branch of the flowchart the program follows.

The nested decisions ask follow-up questions about where the mushroom grows, whether it has a ring, and whether it has a convex cup. The final `System.out.println()` statement displays the identified mushroom.

## 4. Technologies Used

- **Programming language:** Java
- **Input library:** `java.util.Scanner`
- **Interface:** Console or terminal
- **External dependencies:** None
- **Java version:** Not specified in the source code; a compatible JDK is required.

## 5. How to Run the Programs

1. Install a Java Development Kit (JDK).
2. Save the programs in separate files using the exact names that match their public class names:
   - `BicycleRental.java`
   - `MushroomClassification.java`
3. Open a terminal in the folder containing the files.
4. Compile and run each program separately.

### Run Problem 1: Bicycle Rental

```bash
javac BicycleRental.java
java BicycleRental
```

### Run Problem 2: Mushroom Classification

```bash
javac MushroomClassification.java
java MushroomClassification
```

## 6. Sample Input and Output

The examples below are illustrative and calculated from the program logic; they have not been verified by running the source files in this environment.

### Problem 1: Bicycle Rental

**Sample input**

```text
Enter starting time: 13
Enter ending time: 16
```

**Expected output**

```text
Total rental cost: 4000 RWF
```

The rental includes hour 13 at 1,000 RWF, hour 14 at 1,500 RWF, and hour 15 at 1,500 RWF. The total is 4,000 RWF.

### Problem 2: Mushroom Classification

**Sample input**

```text
Does your mushroom have gills? (yes/no): yes
Does your mushroom grow in a forest? (yes/no): no
Does your mushroom have a convex cup? (yes/no): yes
```

**Expected output**

```text
Your mushroom is Agaric Jaunissant.
```

This example follows the flowchart path for a mushroom with gills that grows outside a forest and has a convex cup.

## 7. Conclusion

This project demonstrates console input and output, integer and string variables, a `while` loop, arithmetic accumulation, and conditional decision-making. The bicycle rental program calculates a rental price based on hourly rates, while the mushroom classification program uses the mushroom's features to identify its type.
