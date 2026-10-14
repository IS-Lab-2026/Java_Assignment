# Java Lab Assignment: Practical Logic Exercises

This repository contains two pure Java console-based applications that implement conditional logic, loops, and user input validation to solve real-world logic problems.

---

##  Table of Contents
1. [Program 1: Bicycle Rental Cost Calculator](#1-program-1-bicycle-rental-cost-calculator)
2. [Program 2: Mushroom Identification Game](#2-program-2-mushroom-identification-game)
3. [💻 How to Run the Programs](#-how-to-run-the-programs)

---

## 1. Program 1: Bicycle Rental Cost Calculator

###  Problem Description
A program that determines the total rental cost for a bicycle based on a starting hour and ending hour provided by the user.

###  Rental Rate Structure
The program loops hourly through the rental duration and applies rates based on these brackets:
* **00:00 – 07:00** & **21:00 – 24:00** ➡️ `500 RWF` per hour
* **07:00 – 14:00** & **19:00 – 21:00** ➡️ `1,000 RWF` per hour
* **14:00 – 19:00** ➡️ `1,500 RWF` per hour

###  Sample Output
```text
Enter the starting time in hours (0-23):
6
Enter the ending time in hours (1-24):
10
here
here
here
TOTAL RENT: 3500
```

---

## 2. Program 2: Mushroom Identification Game

###  Problem Description
An interactive guessing game that acts as a binary decision tree. By asking the user up to 3 `true/false` questions about a mushroom's physical traits, the program correctly identifies the specific mushroom species.

###  Supported Mushroom Species
* **Agaric jaunissant**
* **Amanite tue-mouche**
* **Coprin chevelu**
* **Pied bleu**
* **Girolle**
* **Cepe de bordeaux**

###  Sample Output
```text
Mushroom guess game (Type true for YES and false for NO)
Does your mushroom have a ring?
true
Does your mushroom have a convex cup?
true
Does your mushroom grow in meadows?
false
Mushroom: Amanite tue-mouche
```

---

##  How to Run the Programs

### Prerequisites
* Ensure you have the **Java Development Kit (JDK)** installed.

### Compilation and Execution Steps

1. Open your terminal/command prompt in the directory containing the source files.
2. Compile both Java classes:
   ```bash
   javac BicyRent.java Mushroom.java
   ```

3. To run the **Bicycle Rental** program:
   ```bash
   java BicyRent
   ```

4. To run the **Mushroom Guess Game**:
   ```bash
   java Mushroom
   ```
