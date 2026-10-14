## QUESTION 1
## 1. Program Overview & System Mechanics
The `BicycleRental` application is a computational utility designed to calculate the precise monetary fee for renting a bicycle over a specific time window. 

The application uses an **iterative accumulation approach**. Instead of multiplying the total duration by a single static rate, the system evaluates the rental window **hour-by-hour**. This dynamic approach allows the program to seamlessly adjust pricing when a customer's rental window crosses over different peak and off-peak tariff brackets during the day.

---

## 2. Decision Logic

Below is a detailed engineering analysis of how every line of code functions within the Java Virtual Machine (JVM):

### 2.1 Package Ingestion
```java
import java.util.Scanner;
```
*   **How it works:** This line imports the pre-built `Scanner` utility class from Java’s core utility package (`java.util`). It acts as a data pipeline, allowing the program to listen to and read text inputs entered by the user via the keyboard console.

### 2.2 Structure and Entry Point
```java
public class BicycleRental {
    public static void main(String[] args) {
```
*   **How it works:** Defines the blueprint of the program as a public class named `BicycleRental`. Inside it lies the `main` method, which serves as the absolute entry point where the operating system begins executing the program.

### 2.3 Variable Declaration & Stream Initialization
```java
        Scanner input = new Scanner(System.in);
        int start, end;
```
*   **How it works:** The first line instantiates a new `Scanner` object named `input` and hooks it into the standard system input stream (`System.in`). The second line reserves two blocks of memory as integers (`int`) to hold the user's upcoming chronological entries: `start` and `end`.

### 2.4 User Data Ingestion
```java
        System.out.print("Enter start time (0-23): ");
        start = input.nextInt();

        System.out.print("Enter end time (1-24): ");
        end = input.nextInt();
```
*   **How it works:** `System.out.print` prints out descriptive prompts onto the command line interface without pushing to a new line. The program then pauses at `input.nextInt()`, blocking execution until the user types an integer and presses Enter, storing the values inside the `start` and `end` variables.

### 2.5 Input Sanitization & Boundary Checking (Guard Gate)
```java
        if (start < 0 || start > 23 || end < 1 || end > 24 || start >= end) {
            System.out.println("Invalid input time.");
            return;
        }
```
*   **How it works:** This functions as a defensive security guard using logical OR (`||`) operators. It evaluates whether the parameters violate any core assignment constraints:
    *   Is the starting hour outside 0 to 23?
    *   Is the ending hour outside 1 to 24?
    *   Did the user input an end time that occurs before or at the exact same time as the start time (`start >= end`)?
    *   **Decision:** If any of these are true, it prints an error message and uses the `return` statement to violently terminate execution, protecting the program from running corrupted logic loops.

### 2.6 State Initialization
```java
        int totalCost = 0;
```
*   **How it works:** Initializes an integer accumulator variable named `totalCost` to 0. This variable will safely hold the running financial balance as the loop calculates the fee.

### 2.7 The Hour-by-Hour Iteration Loop
```java
        for (int hour = start; hour < end; hour++) {
```
*   **How it works:** A bounded `for` loop that manages the timeline sequence. 
    *   It initializes a counter variable `hour` at the exact start time (`int hour = start`).
    *   It executes the logic as long as `hour` is strictly less than the end time (`hour < end`).
    *   At the end of every loop cycle, it increments the clock time forward by exactly one hour (`hour++`).

### 2.8 The Tariff Decision-Making Matrix
Inside the loop, a mutually exclusive conditional structure processes each individual clock hour to decide its financial weight:

```java
            if ((hour >= 0 && hour < 7) || (hour >= 21 && hour < 24)) {
                totalCost += 500;
            }
```
*   **Decision:** If the current `hour` falls between 00:00 and 06:59, OR falls between 21:00 and 23:59, the program triggers an compound assignment operator (`+=`) to instantly add **500 RWF** to the running `totalCost`.

```java
            else if ((hour >= 7 && hour < 14) || (hour >= 19 && hour < 21)) {
                totalCost += 1000;
            }
```
*   **Decision:** If the first condition was false, the JVM evaluates this path. If the current `hour` falls between 07:00 and 13:59, OR between 19:00 and 20:59, it accumulates a standard tariff of **1000 RWF** into `totalCost`.

```java
            else if (hour >= 14 && hour < 19) {
                totalCost += 1500;
            }
```
*   **Decision:** If all previous conditions fail, the program verifies if the hour falls into the premium evening peak bracket (14:00 to 18:59). If true, it adds **1500 RWF** to the accumulation block.

### 2.9 Output Display Window
```java
        System.out.println("Your payment is: " + totalCost + " RWF");
    }
}
```
*   **How it works:** Once the loop runs out of hours and terminates, this line prints the final aggregated invoice value to the screen using string concatenation (`+`), displaying the calculated tariff balance cleanly followed by the "RWF" currency denomination label.

---

## 3. Required Tools & Environment Setup
To build, compile, and execute this project locally, your environment requires the following software:
1. **Java Development Kit (JDK):** Version 11 or newer installed on your machine.
2. **Terminal Console:** To pass standard system inputs and view output prints (`System.in` / `System.out`).

---

## 4. Compilation and Execution
To run this project from your command line terminal, execute the following commands inside your root project folder:

```sh
javac -d out src/BicycleRental.java
java -cp out BicycleRental
```

---

## 5. Execution Verification Example
```text
Enter start time (0-23): 13
Enter end time (1-24): 15
Your payment is: 2500 RWF
```
## QUESTION 2

## 1. Program Overview & System Mechanics
The `Mashroom` application is an interactive expert classification engine. It operates using a **Deterministic Finite Automaton (DFA)** structured as a binary decision tree. 

Instead of searching through a random data array, the application processes structural properties of a target specimen sequentially. By evaluating discrete morphological characteristics (such as a convex cap, structural rings, gills, or growth habitats), the system limits possibilities layer by layer until an absolute biological identification is resolved.

---

## 2. Line-by-Line Code Breakdown & Decision Logic

Below is a technical engineering analysis explaining exactly how every statement in your program handles state transitions to reach a classification decision:

### 2.1 Package Ingestion
```java
import java.util.Scanner;
```
*   **How it works:** This line pulls the pre-built `Scanner` utility class from Java's API packages. It acts as an open data conduit between the system's text input console and the running program.

### 2.2 Class Declaration and Execution Entry Point
```java
public class Mashroom {
    public static void main(String[] args) {
```
*   **How it works:** Allocates a public class structure named `Mashroom` (matching your precise physical file name). The second line sets up the mandatory `main` method, telling the Java Virtual Machine (JVM) exactly where execution threads must begin running.

### 2.3 Object Instantiation & Context Display
```java
        Scanner scanner = new Scanner(System.in);

        System.out.println("Think of one of the following mushrooms:");
        System.out.println("- Agaric Jaunissant");
        System.out.println("- Amanite tue-mouche");
        System.out.println("- Cepe de Bordeaux");
        System.out.println("- Coprin chevelu");
        System.out.println("- Girolle");
        System.out.println("- Pied bleu");
```
*   **How it works:** Instantiates a new memory reference named `scanner` bound to the system keyboard input stream (`System.in`). The subsequent `System.out.println` statements push text to the user's terminal window to define the available specimen profiles.

### 2.4 First Isolation Variable & Data Normalization Pipeline
```java
        System.out.print("Does your mushroom have a convex cup? (yes/no): ");
        String answer1 = scanner.nextLine().trim().toLowerCase();
```
*   **How it works:** Prompts the user for observations. The program halts at `scanner.nextLine()` until user response strings are submitted. To protect logic structures against keyboard errors, `.trim()` strips out accidental spacing padding, and `.toLowerCase()` shifts characters to lowercase before storing the safe result in the string object variable `answer1`.

### 2.5 Primary Tree Disjunction (Layer 1 Decision)
```java
        if (answer1.equals("yes")) {
```
*   **The Decision:** This conditional statement splits the entire mushroom kingdom in half. If the specimen features a convex cup, the execution scope steps inside this main `if` block, isolating the possibilities immediately down to just three potential profiles: **Agaric Jaunissant**, **Amanite tue-mouche**, or **Pied bleu**.

---

### 2.6 Path Alpha Execution (Processing Bounded Convex Cup Specimens)

```java
            System.out.print("Does your mushroom have a ring? (yes/no): ");
            String answer2 = scanner.nextLine().trim().toLowerCase();

            if (answer2.equals("yes")) {
```
*   **The Decision:** Inside the convex cup cluster, the system prompts for structural ring markers. If `answer2` equals `"yes"`, it drops into a nested scope, leaving only two candidates left: *Agaric Jaunissant* or *Amanite tue-mouche*.

```java
                System.out.print("Does your mushroom grow in a forest? (yes/no): ");
                String answer3 = scanner.nextLine().trim().toLowerCase();

                if (answer3.equals("yes")) {
                    System.out.println("\nYour mushroom is: Amanite tue-mouche");
                } else {
                    System.out.println("\nYour mushroom is: Agaric Jaunissant");
                }
```
*   **The Decision:** Layer 3 environment check. If the ring-bearing convex specimen is native to a forest domain, it matches the definitive invariants for **Amanite tue-mouche**. If the condition fails (`else`), it outputs **Agaric Jaunissant**.

```java
            } else {
                 System.out.println("\nYour mushroom is: Pied bleu");
            }
```
*   **The Decision:** This `else` matches the Layer 2 ring question. If a specimen has a convex cup but completely lacks a structural ring, it bypasses any further questions and declares the specimen as **Pied bleu**.

---

### 2.7 Path Beta Execution (Processing Bounded Non-Convex Cup Specimens)

```java
        } else {
```
*   **The Decision:** This structural `else` catches all scenarios where `answer1` was `"no"`. Execution inside this fallback block means the mushroom *does not* have a convex cup, isolating the possibilities to **Cepe de Bordeaux**, **Coprin chevelu**, or **Girolle**.

```java
            System.out.print("Does your mushroom have a ring? (yes/no): ");
            String answer2 = scanner.nextLine().trim().toLowerCase();

            if (answer2.equals("yes")) {
                System.out.println("\nYour mushroom is: Coprin chevelu");
            }
```
*   **The Decision:** Evaluates ring structures for non-convex specimens. Because **Coprin chevelu** is uniquely defined as the only non-convex mushroom in your pool containing a ring signature, matching `"yes"` resolves the diagnosis immediately and drops out of the tree.

```java
            else {
                System.out.print("Does your mushroom have gills? (yes/no): ");
                String answer3 = scanner.nextLine().trim().toLowerCase();

                if (answer3.equals("yes")) {
                    System.out.println("\nYour mushroom is: Girolle");
                } else {
                    System.out.println("\nYour mushroom is: Cepe de Bordeaux");
                }
            }
        }
```
*   **The Decision:** Triggers if a non-convex mushroom lacks a ring structure. The program moves down to evaluate the presence of a gill structure. If the specimen handles respiratory gas exchanges via gills (`"yes"`), the program returns **Girolle**. If it lacks gills entirely (indicating it uses pores under its cap), the program falls through to the absolute terminal state: **Cepe de Bordeaux**.

 .

---

## 3. Required Tools & Environment Setup
To build, compile, and execute this project locally, your environment requires the following software:
1. **Java Development Kit (JDK):** Version 11 or newer configured on your operating system paths.
2. **Terminal Console:** To execute build instructions and process runtime interactive feedback loops (`System.in`/`System.out`).

---

## 4. Compilation and Execution
To execute this logic model directly from your system console, run the following sequential directives within the project root folder:

```sh
javac -d out src/Mashroom.java
java -cp out Mashroom
```

---

## 5. Execution Verification Example
```text
Think of one of the following mushrooms:
- Agaric Jaunissant
- Amanite tue-mouche
- Cepe de Bordeaux
- Coprin chevelu
- Girolle
- Pied bleu

Does your mushroom have a convex cup? (yes/no): yes
Does your mushroom have a ring? (yes/no): yes
Does your mushroom grow in a forest? (yes/no): no

Your mushroom is: Agaric Jaunissant











