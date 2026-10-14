Java Individual Lab 1

Student Name: Ishimwe Gorreth
Registration Number:225041999       

This repository contains my solutions to Individual Lab 1, which covers variables, operators, decision control statements and repetition statements (loops) in Java. Each problem has a handwritten flow chart (submitted on paper) and a Java implementation.

---

Repository Structure


.
├── BicycleRental.java             Problem 1 - bicycle rental cost calculator
├── MushroomIdentification.java    Problem 2 - mushroom identification program
└── README.md


 Problem 1: Bicycle Rental Cost Calculator
 Description

The program calculates how much a customer must pay for a bicycle rental. The user enters two whole numbers:

1. The starting hour
2. The ending hour

Input Rules

- Only integers are accepted (no decimals).
- Start time is between 0 and 23.
- End time is between 1 and 24.
- Start time is always less thanthe end time (a rental never spans more than one day).

Pricing

| Time range (hours) | Rate per hour |
|--------------------|---------------|
| 0 – 7              | 500 RWF       |
| 7 – 14             | 1000 RWF      |
| 14 – 19            | 1500 RWF      |
| 19 – 21            | 1000 RWF      |
| 21 – 24            | 500 RWF       |

Logic

1. Read the start and end times using `Scanner.nextInt()`, so decimal numbers are not accepted.
2. Set a running `total` to 0.
3. Use a **`for` loop** to go through every hour of the rental, from `start` up to, but not including, `end`.
4. For each hour, use an **if / else if** chain to find the rate and add it to `total`:
   - 0 to before 7 → 500 RWF
   - 7 to before 14 → 1000 RWF
   - 14 to before 19 → 1500 RWF
   - 19 to before 21 → 1000 RWF
   - 21 to before 24 → 500 RWF
5. Display the total cost in RWF.

> Note: The program assumes the input follows the rules above (start between 0 and 23, end between 1 and 24, start less than end). It does not currently check for invalid input.
Example
Enter starting time: 13
Enter ending time: 16
Total rental cost = 4000 RWF

| Hour slot | Rate |
|-----------|------|
| 13 – 14   | 1000 |
| 14 – 15   | 1500 |
| 15 – 16   | 1500 |



 Problem 2: Mushroom Identification

 Description

The user thinks of one of six mushrooms and answers yes/no questions. The program asks at most three of the four available questions and then tells the user which mushroom they were thinking of.

 Mushrooms

- Agaric jaunissant
- Amanite tue-mouches
- Cèpe de Bordeaux
- Coprin chevelu
- Girolle
- Pied bleu

Mushroom Characteristics

| Mushroom           | Gills      | Grows in forest | Has ring | Convex cap |
|--------------------|:----------:|:---------------:|:--------:|:----------:|
| Agaric jaunissant  | Yes        | No (meadow)     | Yes      | Yes        |
| Amanite tue-mouches| Yes        | Yes             | Yes      | Yes        |
| Cèpe de Bordeaux   | No (pores) | Yes             | No       | No         |
| Coprin chevelu     | Yes        | No (meadow)     | Yes      | No         |
| Girolle            | Yes        | Yes             | No       | No         |
| Pied bleu          | Yes        | Yes             | No       | Yes        |

How the Program Works

The program uses nested if / else statements and reads each answer with the Scanner class. Answers are compared with `equalsIgnoreCase`, so `yes`, `YES` and `Yes` all work.

1. Question 1:Does your mushroom grow in a forest?
2. If NO (meadow): Only two mushrooms are left, so one question is enough.
   - Convex cap? Yes → Agaric jaunissant, No → Coprin chevelu
3. If YES (forest): Four mushrooms are left, so the next question is whether it has a convex cap.
   - No convex cap: Cèpe de Bordeaux or Girolle. Ask: *Does it have gills?* Yes → Girolle, No Cèpe de Bordeaux (the only one with pores).
   - Convex cap: Amanite tue-mouches or Pied bleu. Ask: *Does it have a ring?* Yes → Amanite tue-mouches, No → Pied bleu.

Every path asks at most 3 questions, which meets the requirement.

Decision Tree

Grows in a forest?
├── NO  → Convex cap?
│         ├── YES → Agaric jaunissant
│         └── NO  → Coprin chevelu
└── YES → Convex cap?
          ├── NO  → Gills?
          │         ├── YES → Girolle
          │         └── NO  → Cèpe de Bordeaux
          └── YES → Ring?
                    ├── YES → Amanite tue-mouches
                    └── NO  → Pied bleu


Example Run


Think of one of the six mushrooms.
Answer only yes or no.
Does your mushroom grow in a forest? yes
Does your mushroom have a convex cap? no
Does your mushroom have gills? yes
Your mushroom is Girolle.

---

Concepts Used

- Variables and data types (int, String)
- Arithmetic and relational/logical operators
- Decision control statements (if, else if, else, nested if)
- Repetition statements (for loop)
- User input with the Scanner class

Flow Charts

The flow charts for both problems were drawn by hand on a paper and was submitted separately, as  it was required in the assignment.

Author

Name:Ishimwe Gorreth – Reg No: 225041999
