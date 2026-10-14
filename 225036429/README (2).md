# Java_Assignment

## 1. Introduction

This project contains two Java console programs that demonstrate basic programming concepts: variables, user input, arithmetic operations, conditional statements, logical operators, and output.

- **Problem 1** calculates the cost of renting a bicycle from a starting hour and an ending hour.
- **Problem 2** identifies a mushroom from the user's yes/no answers to a few questions.

Both programs run in the console and use the `Scanner` class to read input.

## 2. Objectives

- Understand the basic structure of a Java program.
- Declare and use variables.
- Read keyboard input with `Scanner`.
- Perform arithmetic calculations.
- Apply decision control statements (`if`, `else if`, `else`).
- Use relational and logical operators.
- Use nested conditional statements.
- Display results with `System.out.print()` and `System.out.println()`.
- Develop problem-solving skills through practical exercises.

## 3. Technologies Used


| Item | Details |
|---|---|
| Language | Java |
| Input | java.util.Scanner |
| Output | Java console |
| Environment | Java IDE (e.g. Apache NetBeans) or a configured terminal |
| Control structures | if, else if, else |



## 4. Problem 1: Bicycle Rental Cost Calculator

### 4.1 Description

The program asks for two integers: the **starting hour** and the **ending hour** of the rental. It calculates the total cost in Rwandan francs (RWF), charging each rented hour at the rate of the time range it falls in.

### 4.2 Input Rules

- Both values must be **integers** (decimal numbers are not accepted).
- The starting hour is between **0 and 23**.
- The ending hour is between **1 and 24**.
- The starting hour is always **less than** the ending hour.
- A rental cannot span more than one day.

### 4.3 Rental Rate Rules

| Time range | Rate per hour |
|---|---|
| 0 – 7 | 500 RWF |
| 7 – 14 | 1,000 RWF |
| 14 – 19 | 1,500 RWF |
| 19 – 21 | 1,000 RWF |
| 21 – 24 | 500 RWF |

### 4.4 Calculation

```
Rental duration = Ending hour − Starting hour
Total cost      = Sum of the rate of each rented hour
```

For example, a rental from 13 to 15 costs 1,000 RWF for the hour 13–14 plus 1,500 RWF for the hour 14–15, which is 2,500 RWF.

### 4.5 How the Program Works

1. Import the `Scanner` class.
2. Ask the user for the starting hour and the ending hour.
3. Check that the input follows the rules in 4.2.
4. Go through each rented hour and use `if`, `else if`, and `else` to select its rate.
5. Add up the cost of every hour.
6. Display the duration and the total cost.
7. Close the `Scanner`.

### 4.6 Example Execution

```
Enter starting time: 8
Enter ending time: 12
Rental duration: 4 hours
Rate: 1000 RWF per hour
Total cost: 4000 RWF
```

Explanation: the hours 8 to 12 all fall in the 7–14 range, so 4 hours × 1,000 RWF = 4,000 RWF.

### 4.7 Java Concepts Applied

- Integer variables
- Keyboard input with `Scanner`
- Arithmetic operators
- Relational operators (`>=`, `<`, `<=`)
- Logical operators (`&&`, `||`)
- Decision making with `if`, `else if`, `else`
- Console output



## 5. Problem 2: Mushroom Identification Program

### 5.1 Description

The user thinks of one of six mushrooms. The program asks **at most three** yes/no questions and then displays the mushroom's name.

The six mushrooms are:

- Agaric jaunissant
- Amanite tue-mouche
- Cèpe de Bordeaux
- Coprin chevelu
- Girolle
- Pied bleu

### 5.2 Information About the Mushrooms

- The Cèpe de Bordeaux is the only one with pores; the others have gills.
- Coprin chevelu and Agaric jaunissant grow in meadows; the others grow in forests.
- The only mushrooms with a convex cup are Agaric jaunissant, Amanite tue-mouche, and Pied bleu.
- The only mushrooms with a ring are Agaric jaunissant, Amanite tue-mouche, and Coprin chevelu.

### 5.3 Questions the Program Can Ask

- Does your mushroom have a convex cup?
- Does your mushroom grow in a forest?
- Does your mushroom have a ring?
- Does your mushroom have gills?

Not every question is asked every time. Which questions appear depends on the previous answers.

### 5.4 Decision Rules

| Convex cup | Forest | Ring | Gills | Result |
|---|---|---|---|---|
| Yes | No | – | – | Agaric jaunissant |
| Yes | Yes | Yes | – | Amanite tue-mouche |
| Yes | Yes | No | – | Pied bleu |
| No | – | – | No | Cèpe de Bordeaux |
| No | No | – | Yes | Coprin chevelu |
| No | Yes | – | Yes | Girolle |

A dash (–) means the question is not asked for that path.

### 5.5 How the Program Works

1. Import the `Scanner` class.
2. Declare four `String` variables: `cup`, `forest`, `ring`, and `gills`.
3. Ask whether the mushroom has a convex cup and store the lowercase answer.
4. If yes, ask about the forest, and about the ring if needed.
5. If no, ask about the gills, and about the forest if needed.
6. Use nested `if-else` statements to display the correct name.
7. Close the `Scanner`.

### 5.6 Example Execution

```
Does the mushroom have a convex cup? (yes/no): yes
Does the mushroom grow in a forest? (yes/no): yes
Does the mushroom have a ring? (yes/no): no
The mushroom is Pied bleu.
```

Explanation: a convex cup and a forest lead to the ring question. With no ring, the program displays Pied bleu.

### 5.7 Java Concepts Applied

- Class declaration and the `main()` method
- `String` variables
- Keyboard input with `Scanner`
- String comparison with `equals()`
- Case conversion with `toLowerCase()`
- Nested `if-else` structures
- Console output

### 5.8 Limitations

- The program expects answers to be exactly `yes` or `no`. Other answers may be treated as `no`.
- The rules are for educational purposes only. This program must **not** be used to decide whether a real mushroom is safe to eat.



## 6. How to Run the Programs

### 6.1 Requirements

- A Java Development Kit (JDK)
- A Java IDE (e.g. Apache NetBeans) or a terminal with Java configured
- The two Java source files

### 6.2 Source Files

| File | Contents |
|---|---|
| `BicycleRental.java` | Problem 1 |
| `MushroomIdentification.java` | Problem 2 |

Each file name must match its public class name.

### 6.3 Running in an IDE

1. Open your Java IDE.
2. Create or open a Java project.
3. Add the two classes to the project.
4. Run the class you want to test.
5. Enter the requested values in the console.

### 6.4 Running from a Terminal

```bash
javac BicycleRental.java
java BicycleRental
```

```bash
javac MushroomIdentification.java
java MushroomIdentification
```

Run each program separately.



## 7. Repository Structure

```
Java_Assignment/
├── README.md
├── BicycleRental.java
└── MushroomIdentification.java
```



## 8. Conclusion

These exercises give practical experience with Java fundamentals. The Bicycle Rental Cost Calculator uses arithmetic, relational and logical operators, and conditional statements. The Mushroom Identification Program uses string handling, keyboard input, and nested decision structures. Together they develop logical thinking and an understanding of how Java programs process input and make decisions.

## 9. Author
**Name:** Esther Uwimana

**Registration number:** 225036429

**Assignment:** Java Programming, Problems 1 and 2

