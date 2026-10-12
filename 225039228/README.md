#  Bicycle Rental System

## 1. Project Description

The **Bicycle Rental System** is a simple Java program that calculates the total cost of renting a bicycle based on the starting time and ending time entered by the user.

The program uses conditional statements (`if`, `else if`, and `else`) to determine the rental rate per hour and calculate the total rental cost.

This project demonstrates basic Java programming concepts, including user input, variables, arithmetic operations, and decision-making statements.

## 2. Objectives

The main objectives of this project are to:

* Practice using Java programming.
* Accept user input using the `Scanner` class.
* Calculate the rental duration.
* Apply conditional statements to determine the rental cost.
* Detect invalid rental times.

## 3. Technologies Used

* **Programming Language:** Java
* **Input Method:** `Scanner` class
* **Development Tools:** Any Java-compatible IDE or code editor, such as VS Code.

## 4. How the Program Works

The program follows these steps:

1. **Import the Scanner class:** The program imports `java.util.Scanner` to allow the user to enter information through the keyboard.

2. **Declare variables:** The program declares variables to store the starting time, ending time, rental duration, and total cost.

3. **Ask for the starting time:** The user enters the time when the bicycle rental begins.

4. **Ask for the ending time:** The user enters the time when the bicycle rental ends.

5. **Calculate rental duration:** The program subtracts the starting time from the ending time.

   `time = endtime - starttime;`

6. **Validate the time:** If the starting time is greater than or equal to the ending time, the program displays `"Invalid time."`

7. **Calculate the rental cost:** If the time is valid, the program uses conditional statements to select a rate based on the rental duration.

8. **Display the result:** The program prints the total rental cost.

## 5. Variables Used

| Variable    | Data type | Purpose                          |
| ----------- | --------- | -------------------------------- |
| `starttime` | `int`     | Stores the starting time.        |
| `endtime`   | `int`     | Stores the ending time.          |
| `time`      | `int`     | Stores the rental duration.      |
| `totalCost` | `int`     | Stores the total rental cost.    |
| `input`     | `Scanner` | Reads input entered by the user. |

## 6. Rental Pricing Rules

The program uses the following pricing conditions:

| Rental duration          | Rate per hour |
| ------------------------ | ------------: |
| Less than 7 hours        |           500 |
| 7 to less than 14 hours  |         1,000 |
| 14 to less than 19 hours |         1,500 |
| 19 to less than 21 hours |         1,000 |
| 21 hours or more         |           500 |

The total cost is calculated by multiplying the rental duration by the selected hourly rate.

**Formula:**

`Total Cost = Rental Duration × Hourly Rate`

*Note:* These rules describe the code as written. The program applies one rate to the entire rental duration, rather than charging different rates for different portions of the rental.

## 7. Java Concepts Demonstrated

### a. Variables

Variables store data used by the program, such as the starting time, ending time, and total rental cost.

### b. User Input

The statement `input.nextInt()` reads an integer entered by the user.

### c. Arithmetic Operations

The subtraction operator (`-`) calculates the rental duration, while the multiplication operator (`*`) calculates the cost.

### d. Conditional Statements

The `if`, `else if`, and `else` statements allow the program to choose the appropriate rental rate based on the duration.

### e. Output

The `System.out.println()` statement displays messages and the final rental cost.

## 8. Example Output

**Example 1: Valid rental time**

```text
Enter starting time: 8
Enter ending time: 12
Total cost = 2000
```

Explanation:

* Starting time = 8
* Ending time = 12
* Rental duration = 12 − 8 = 4 hours
* Hourly rate = 500
* Total cost = 4 × 500 = 2,000

**Example 2: Invalid rental time**

```text
Enter starting time: 10
Enter ending time: 10
Invalid time.
```

Explanation: The starting time is equal to the ending time, so the program identifies the rental time as invalid.

## 9. How to Run the Program

1. Install the Java Development Kit (JDK).

2. Open your code editor or IDE.

3. Create a file named `BicycleRental.java`.

4. Copy the Java source code into the file.

5. Save the file.

6. Open the terminal in the project folder.

7. Compile the program using:

   ```bash
   javac BicycleRental.java
   ```

8. Run the program using:

   ```bash
   java BicycleRental
   ```

9. Enter the starting and ending times when prompted.

## 10. Limitations

* The program accepts integer values only.
* It does not validate whether the entered times represent actual clock times.
* It does not support rentals that cross midnight.
* It does not use different rates for different portions of the rental period.
* The current code prints the total cost even when the rental time is invalid, because the final output statement is outside the `else` block.

## 11. Possible Improvements

The program could be improved by:

* Moving the total-cost output inside the valid-time `else` block.
* Validating the entered times.
* Supporting rentals that cross midnight.
* Handling decimal rental durations.
* Adding clearer error messages.

## 12. Conclusion

The Bicycle Rental System is a beginner-friendly Java project that demonstrates how to accept user input, perform calculations, and use conditional statements to solve a practical problem.

It provides a foundation for developing more advanced rental systems with improved validation, pricing rules, and user-friendly features.

