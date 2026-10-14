# Java Assignment 1: BicycleRental & Mushroom Identification

This repository contains my Java solutions for Individual Lab 1. Both programs run entirely in the terminal, taking user inputs and calculating outputs based on the specific rules from our assignment sheet.

---

## QUESTION 1: Bicycle Rental System (`BicycleRental.java`)

### 1. Program Overview
This program is designed to act as an automated billing calculator for a bike rental business. It addresses a real-world scenario where rental pricing is dynamic rather than fixed. Instead of charging a flat rate for the entire trip, the program tracks the rental period from a specific start hour to an end hour and applies different rates depending on the time of day. This program ensures that customers who rent bikes across peak and off-peak hours are billed fairly and accurately according to the exact time slots their rental occupied.

### 2. How the Logic Works to Make Decisions
The program uses a **loop combined with conditional statements** to make its choices:
* **The Gatekeeper:** First, an `if` statement checks for mistakes. If a user types times outside the 0-24 range, or sets the start time equal to or ahead of the end time, the program prints an error and stops immediately.
* **The Clock Loop:** If the times are valid, a `for` loop starts counting from the `startTime` and moves forward 1 hour at a time until it hits the `endTime`.
* **The Price Picker:** Inside that loop, for every single hour, the computer runs through an `if-else` chain to match that specific hour against the assignment's tariff rules:
    * If the hour is between **0-7** or **21-24**, it chooses to add **500 RWF** to the bill.
    * If the hour is between **7-14** or **19-21**, it chooses to add **1000 RWF** to the bill.
    * If the hour is between **14-19**, it chooses to add **1500 RWF** to the bill.

### 3. Java Code Mechanics & Line-by-Line Explanation
* `import java.util.Scanner;`
  * **Role & Lore:** This tool imports Java's built-in **Scanner** class. Think of Scanner as an open ear or a direct communication pipeline. Without it, your program is completely deaf and cannot hear anything the user types into the keyboard.
* `Scanner input = new Scanner(System.in);`
  * **Role & Lore:** This creates a specific Scanner object named `input` and hooks it directly into the keyboard entry stream (`System.in`). It officially activates the system to start waiting for user typing.
* `System.out.print("Enter start time (0-23): ");`
  * **Role & Lore:** This line prints a message to the console screen explicitly **asking the user to type a whole number from the keyboard**.
* `start = input.nextInt();`
  * **Role & Lore:** This tells the Scanner to grab the integer value typed by the user on their keyboard and save it inside the memory box named `start`.
* `if (start < 0 || start > 23 || end < 1 || end > 24 || start >= end)`
  * **Role & Lore:** A conditional safety wall. It drops the program instantly if the keyboard numbers violate the assignment limits.
* `for (int hour = start; hour < end; hour++)`
  * **Role & Lore:** The looping machine that marches forward step-by-step through the timeline to calculate the final RWF costs.

### 4. User Interaction & Output Details
* **User and Program Interaction:** The interaction is a strict back-and-forth conversation. The program asks a question, freezes execution to wait for a human response, and only proceeds once the user hits the "Enter" key.
* **Keyboard Inputs & Keywords:** The user must enter raw numeric keywords (integers like `13` or `15`). Decimal values or letters will break the communication stream.
* **Output Display Window:** The standard terminal console behaves as our display window. Once all calculations finish, it instantly outputs the clear final balance string (e.g., `Your payment is: 2500 RWF`), printing it cleanly on a fresh line.

### 5. Console Test Example
```text
Enter start time (0-23): 13
Enter end time (1-24): 15
Your payment is: 2500 RWF
```

---

## QUESTION 2: Mushroom Classification System (`Mushroom.java`)

### 1. Program Overview
This program serves as an interactive biological expert system for identifying fungi varieties. It handles a classic classification problem by translating a botanical dichotomous key into software logic. Given six target mushroom types with overlapping characteristics, the program is engineered to isolate the exact species using the minimum number of steps possible. By prompting the user with simple, targeted features sequentially, the system systematically clears out incorrect matches, ensuring a definitive identification is reached in **at most three questions**.

### 2. How the Logic Works to Make Decisions
The program uses **nested selection paths** (a decision tree) to isolate the right mushroom:
* **The First Split:** The program asks if the mushroom has a ring. The computer branches based on this answer. This instantly eliminates half of the possibilities.
* **Branch A (Has a Ring):** If the answer is yes, the logic moves into a closed path. It then asks about the forest environment. If yes, it decides it is **Amanite tue-mouche**. If no, it asks about the cup shape to decide between **Agaric Jaunissant** and **Coprin chevelu**.
* **Branch B (No Ring):** If the answer is no, the logic enters a different path. It asks if it has gills. If the user says no, the computer instantly decides it is **Cepe de Bordeaux** (since it is the only one with pores). If yes, it asks about the cup shape to choose between **Pied bleu** and **Girolle**.

### 3. Java Code Mechanics & Line-by-Line Explanation
* `import java.util.Scanner;`
  * **Role & Lore:** Just like in the bike program, this activates the standard **Scanner** class. Its entire purpose here is to act as a bridge that brings textual text choices directly from the user's keyboard straight into the matching code logic blocks.
* `Scanner scanner = new Scanner(System.in);`
  * **Role & Lore:** Sets up your reading tool (named `scanner`) to start listening closely for any text answers or keys pressed inside the terminal panel.
* `System.out.print("Does your mushroom have a ring? (yes/no): ");`
  * **Role & Lore:** This displays a clear textual query on screen **asking the user to type their response directly on the keyboard**.
* `String answerRing = scanner.next().trim().toLowerCase();`
  * **Role & Lore:** This reads the user's typed response from the keyboard and runs two text cleanup tools to keep the code safe from human errors:
    * **`.trim()` Explanation:** This cuts away any accidental empty spaces that the user might have pressed before or after typing their word. It makes sure `" yes "` becomes a clean `"yes"`.
    * **`.toLowerCase()` Explanation:** This converts any capital letters straight into small letters. It ensures that inputs like `"YES"`, `"Yes"`, or `"yEs"` all instantly convert to lowercase `"yes"` so the system can match it without crashing.
* `if (answerRing.equals("yes"))`
  * **Role & Lore:** Instead of using standard symbols like `==`, this dedicated text tool safely compares the word stored in memory against the option string `"yes"` to pick the next step on the classification tree.

### 4. User Interaction & Output Details
* **User and Program Interaction:** The interaction runs like a conversational diagnostic quiz. The program prints the initial game instructions, and then asks specific questions where each answer directly guides what choice the program presents to the user next.
* **Keyboard Inputs & Keywords:** The program relies on explicit string keywords: `"yes"` or `"no"`. Any random phrases outside of these expected triggers will cleanly fall through to an unrecognized error branch.
* **Output Display Window:** The console log tracks the conversation path in real-time. When a final answer node is triggered, it completely stops asking questions and logs a bold final verdict string (e.g., `Your mushroom is: Girolle`) right at the bottom of the window.

### 5. Console Test Example
```text
Think of one of the following mushrooms:
- Agaric Jaunissant...
Does your mushroom have a ring? (yes/no): no
Does your mushroom have gills? (yes/no): yes
Does your mushroom have a convex cup? (yes/no): no
Your mushroom is: Girolle
```

---

## How to Compile and Run

Make sure you have the Java Development Kit (JDK) installed, open your terminal, and run these commands:

1. **Compile both files:**
   ```bash
   javac BicycleRental.java Mushroom.java
   ```
2. **Run the Bike Rental program:**
   ```bash
   java BicycleRental
   ```
3. **Run the Mushroom program:**
   ```bash
   java Mushroom
   ```

---

