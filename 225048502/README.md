# Time Manager – Rental Cost Calculator

## 1. Project Description

`timemanager.java` is a Java program that asks the user for a starting time and an ending time, checks whether the entered times are valid, and calculates the total rental cost using different hourly rates.

## 2. Features

- Reads the starting and ending hours from the keyboard.
- Checks for invalid starting and ending times.
- Ensures that the starting time is earlier than the ending time.
- Calculates the rental cost hour by hour.
- Displays the total rental cost in Rwandan francs (RWF).

## 3. Requirements

- Java Development Kit (JDK)
- A Java editor or terminal, such as VS Code, NetBeans, or Command Prompt

## 4. How to Run the Program

1. Save the source code in a file named `timemanager.java`.
2. Open a terminal in the folder containing the file.
3. Compile the program:

   ```bash
   javac timemanager.java
   ```

4. Run the program:

   ```bash
   java timemanager
   ```

5. Enter the starting and ending times when prompted.

## 5. Hourly Rates

The program uses these hourly rates:

| Hour values | Cost per hour |
|---|---:|
| 0–6 | 500 RWF |
| 7–13 | 1,000 RWF |
| 14–18 | 1,500 RWF |
| 19–20 | 1,000 RWF |
| 21–23 | 500 RWF |

The program counts each whole hour from the starting time up to, but not including, the ending time.

## 6. Example

### Input

```text
Enter starting time: 8
Enter ending time: 12
```

### Calculation

- Hour 8: 1,000 RWF
- Hour 9: 1,000 RWF
- Hour 10: 1,000 RWF
- Hour 11: 1,000 RWF

Total: 1,000 + 1,000 + 1,000 + 1,000 = 4,000 RWF

### Output

```text
Total rent cost: 4000 RWF
```

## 7. Line-by-Line Code Explanation

### Importing Scanner

```java
import java.util.Scanner;
```

Imports the `Scanner` class so the program can read keyboard input.

### Declaring the class

```java
public class timemanager {
```

Declares a public class named `timemanager`. The source file should be named `timemanager.java`.

### The main method

```java
public static void main(String[] args) {
```

This is the main method where Java begins running the program.

- `public`: makes the method accessible to the Java runtime.
- `static`: lets Java call the method without creating an object first.
- `void`: means the method does not return a value.
- `main`: the method Java looks for to start the program.
- `String[] args`: receives optional command-line text arguments.

### Creating a Scanner

```java
Scanner input = new Scanner(System.in);
```

Creates a Scanner named `input` that reads data typed by the user.

### Reading the starting time

```java
System.out.print("Enter starting time: ");
int begining = input.nextInt();
```

Displays a prompt and reads the starting hour as an integer. The variable `begining` stores the value.

### Reading the ending time

```java
System.out.print("Enter ending time: ");
int end = input.nextInt();
```

Displays a prompt and reads the ending hour into the variable `end`.

### Validating the times

```java
if (begining < 0) {
    System.out.println("Invalid start time.");
} else if (begining > 23) {
    System.out.println("Invalid start time.");
} else if (end < 1) {
    System.out.println("Invalid end time.");
} else if (end > 24) {
    System.out.println("Invalid end time.");
} else if (begining >= end) {
    System.out.println("Start time must be before end time.");
}
```

The `if` and `else if` statements check conditions in order:

- `begining < 0`: rejects a starting hour below 0.
- `begining > 23`: rejects a starting hour above 23.
- `end < 1`: rejects an ending hour below 1.
- `end > 24`: rejects an ending hour above 24.
- `begining >= end`: rejects a starting time that is equal to or later than the ending time.

`<` means less than, `>` means greater than, and `>=` means greater than or equal to. `System.out.println()` displays a message and moves to a new line.

### Initializing the cost and current hour

```java
int totalCost = 0;
int currentHour = begining;
```

Sets the total cost to zero and starts the hourly calculation at the entered starting hour.

### Repeating for each hour

```java
while (currentHour < end) {
```

Repeats the calculation while `currentHour` is less than the ending time. The ending hour itself is not counted.

### Adding the hourly rate

```java
if (currentHour >= 0 && currentHour < 7) {
    totalCost = totalCost + 500;
} else if (currentHour >= 21 && currentHour < 24) {
    totalCost = totalCost + 500;
} else if (currentHour >= 7 && currentHour < 14) {
    totalCost = totalCost + 1000;
} else if (currentHour >= 19 && currentHour < 21) {
    totalCost = totalCost + 1000;
} else if (currentHour >= 14 && currentHour < 19) {
    totalCost = totalCost + 1500;
}
```

Checks which time range contains the current hour and adds the corresponding rate to `totalCost`.

- `&&` means AND: both conditions must be true.
- `totalCost = totalCost + 500` adds 500 to the previous total.
- The same addition pattern is used for the 1,000 RWF and 1,500 RWF rates.

### Moving to the next hour

```java
currentHour = currentHour + 1;
```

Increases `currentHour` by one so the loop can calculate the next hour and eventually stop.

### Displaying the total

```java
System.out.println("Total rent cost: " + totalCost + " RWF");
```

Displays the calculated total followed by the currency label `RWF`.

### Closing the Scanner

```java
input.close();
```

Closes the Scanner after the program has finished reading input.

### Closing braces

The `}` symbols close the blocks opened by the class, main method, loop, and conditional statements.

## 8. Important Java Concepts Used

- **Variables:** `begining`, `end`, `totalCost`, and `currentHour` store values.
- **Input:** `Scanner` and `nextInt()` read keyboard input.
- **Conditions:** `if`, `else if`, `<`, `>`, `>=`, and `&&` make decisions.
- **Loop:** `while` repeats the hourly calculation.
- **Arithmetic:** addition accumulates the cost and increments the hour.
- **Output:** `System.out.print()` and `System.out.println()` display messages.

## 9. Author

Add your name here.

---

This README describes the behavior of the supplied source code. The program expects whole-number hours and calculates the cost using the hourly rates defined in the code.
