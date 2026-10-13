QUESTION 1:
#WORK: Rental Cost Calculator

## Overview
The Work application is a console-based Java program that calculates the total rental fee based on the number of hours used and the hourly pricing schedule. The user provides the beginning and ending times, and the application calculates the amount to pay in Rwandan francs (RWF).

## Program Objectives
The application is designed to:
- Accept the rental starting and ending times.
- Verify that the entered times meet the program's requirements.
- Apply the correct hourly charge according to the time of day.
- Calculate and display the total rental fee.

## Implementation Process

### 1. Input Collection
The program uses the `Scanner` class to read two integer values from the keyboard. The variable `start` holds the beginning hour, while `end` represents the finishing hour.

### 2. Input Verification
Before calculating the cost, the program checks whether the times are within the allowed limits and whether the ending time is later than the starting time. If the values are invalid, the program displays an error message.

### 3. Hourly Price Selection
The variable `hour` is initialized with the starting time. A `while` loop then processes each hour until the ending time is reached.

The program applies these pricing rules:

| Time period | Hourly charge |
|---|---:|
| Before 7:00 AM | 500 RWF |
| 7:00 AM to before 2:00 PM | 1,000 RWF |
| 2:00 PM to before 7:00 PM | 1,500 RWF |
| 7:00 PM to before 9:00 PM | 1,000 RWF |
| 9:00 PM onward | 500 RWF |

### 4. Total Calculation
For every hour processed, the selected rate is added to the `total` variable. The `hour++` statement advances the calculation to the next hour.

### 5. Output
When the loop finishes, the program prints the final amount using a message that includes the total cost and the currency, RWF.

## Java Features Applied
- `Scanner` for keyboard input.
- Integer variables for storing time and prices.
- `if-else` statements for validation and price selection.
- A `while` loop for processing the rental period.
- Arithmetic addition for accumulating the cost.

## Sample Run
**Input:**
- Starting time: 6
- Ending time: 9

**Output:**
`Total cost = 2500 RWF`

QUESTION 2:
# MUSHROOMG: Interactive Mushroom Classification

## Project Description
MUSHROOMG is a Java console application that classifies mushrooms through a series of questions. The user responds with either `yes` or `no`, and the program follows different decision paths until it displays a mushroom name.

The application demonstrates how a sequence of user responses can be used to make decisions in a computer program.

## How to Use the Application
1. Run the program in a Java development environment or terminal.
2. Read the question displayed on the screen.
3. Enter `yes` or `no` in lowercase.
4. Continue answering the questions presented by the program.
5. Read the mushroom name displayed at the end of the selected decision path.

## Decision-Making Procedure

### First Decision: Presence of a Ring
The identification process starts by asking whether the mushroom has a ring. This answer determines which set of questions the user will receive.

### Path A: The Mushroom Has No Ring
If the response is `no`, the application checks whether the mushroom has gills.

- A `no` response leads to the result **Cèpe de Bordeaux**.
- A `yes` response leads to another question about the presence of a convex cup.
  - Answering `no` produces **Girolle**.
  - Answering `yes` produces **Pied bleu**.

### Path B: The Mushroom Has a Ring
If the initial response is `yes`, the application asks whether the mushroom grows in a forest.

- Answering `yes` displays **Amanite tue-mouche**.
- Answering `no` leads to a question about the convex cup.

For the final question in this branch:

- `yes` displays **Agaric Jaunissant**.
- `no` displays **Coprin chevelu**.

## Main Components of the Code

**Scanner object:** Reads the responses entered by the user.

**String variables:** Store answers to individual questions, such as `q1`, `q2`, `q3`, `q4`, and `q5`.

**Switch-case structure:** Selects the action corresponding to each response.

**Nested switch statements:** Allow the program to ask follow-up questions based on previous answers.

**Break statements:** Exit individual switch cases to help control the program's flow.

## Example Interaction

```text
use only 'yes' or 'no'

does it have ring? no
does it have gills? no
it is cepe de bordeau
```

In this example, the user reports that the mushroom does not have a ring and does not have gills. The program follows the matching cases and displays its corresponding classification.

## Learning Outcomes
By developing this program, students can practise:
- Reading and processing text input in Java.
- Using nested `switch` statements.
- Designing a question-based decision process.
- Organizing multiple possible outcomes.
- Understanding how user responses influence program execution.

## Conclusion
MUSHROOMG provides a basic example of an interactive classification program. It uses a question-and-answer approach to demonstrate branching logic in Java and shows how different inputs lead to different outputs.

**Important limitation:** The program requires lowercase answers and does not validate unexpected responses. The current implementation also needs a small control-flow correction in the ring/forest branch to prevent an additional question from appearing after the forest answer is `yes`. This is an educational classification exercise and should not be used to determine whether a wild mushroom is safe to consume.

The total is calculated by adding the charges for 6:00–7:00 AM, 7:00–8:00 AM, and 8:00–9:00 AM.

## Final Remarks
This application illustrates how repetition, arithmetic operations, and decision-making structures can be combined to solve a practical billing problem. Its calculation depends on the time interval entered by the user and the hourly rates defined in the program.
