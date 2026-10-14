# Bicycle Rental Cost Calculator
A simple Java console program that calculates the total cost of renting a bicycle based on how long it was rented.
## How It Works
1. The program asks for a **starting time** and an **ending time** (whole numbers).
2. It calculates the rental duration: `ending time - starting time`.
3. It picks a rate based on the duration and multiplies it by the duration to get the total cost.
If the starting time is greater than or equal to the ending time, the program reports `Invalid time.`
## Pricing
The rate depends on the **total rental duration**, and that rate applies to the whole duration.
| Duration | Rate per unit |
|----------|---------------|
| Less than 7 | 500 |
| 7 to 13 | 1000 |
| 14 to 18 | 1500 |
| 19 to 20 | 1000 |
| 21 or more | 500 |
## Requirements
- Java Development Kit (JDK) 8 or higher

## Project Structure
```.
├── BicycleRental.java
└── README.md
```
## Possible Improvements
- Only print the total cost when the input is valid.
- Validate that the input is a number so the program doesn't crash on text.
- Move the rates into constants so they are easy to change.
# Mushroom Identifier

A simple Java console program that identifies a mushroom by asking a short series of yes/no questions. It is a beginner-friendly example of nested `if/else` decision logic.

> **Disclaimer:** This is a learning project only. Never use it to decide whether a wild mushroom is safe to eat. Some mushrooms are deadly, and real identification requires an expert.

## How It Works

The program asks up to three yes/no questions and, based on your answers, prints the name of a mushroom. The questions cover:

- Does it have gills?
- Does it grow in a forest?
- Does it have a ring?
- Does it have a convex cup?

## Decision Tree

```
Does it have gills?
├── no  → Cepe de Bordeaux
└── yes → Does it grow in a forest?
          ├── no  → Does it have a convex cup?
          │         ├── yes → Agaric Jaunissant
          │         └── no  → Coprin chevelu
          └── yes → Does it have a ring?
                    ├── yes → Amanite tue-mouche
                    └── no  → Does it have a convex cup?
                              ├── yes → Pied bleu
                              └── no  → Girolle
## Mushrooms Covered
| Mushroom | Path of answers |
|----------|-----------------|
| Cepe de Bordeaux | Gills: no |
| Agaric Jaunissant | Gills: yes, Forest: no, Convex cup: yes |
| Coprin chevelu | Gills: yes, Forest: no, Convex cup: no |
| Amanite tue-mouche | Gills: yes, Forest: yes, Ring: yes |
| Pied bleu | Gills: yes, Forest: yes, Ring: no, Convex cup: yes |
| Girolle | Gills: yes, Forest: yes, Ring: no, Convex cup: no |
## Run the Program
```bash
javac Mushroom.java
java Mushroom
```## Example Run
Does it have gills? yes/no: yes
Does it grow in a forest? yes/no: yes
Does it have a ring? yes/no: no
Does it have a convex cup? yes/no: no
Your mushroom is: Girolle
```## Input Notes
- Answer with `yes` or `no` in lowercase.
- The program only checks for an exact match of `no` (or `yes` on the ring and cup questions). Any other input, such as `No`, `n`, or a typo, is treated as the opposite answer.
## Project Structure.
├── Mushroom.java
└── README.md
## Possible Improvements
- Accept uppercase answers and short forms such as `y` and `n` (for example with `equalsIgnoreCase`).
- Re-ask the question when the answer is not `yes` or `no`.
- Let the user play again without restarting the program.
- Store the questions and results in a data structure instead of nested `if/else` blocks.





 










   



