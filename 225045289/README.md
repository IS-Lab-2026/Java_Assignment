# Bicycle Rental

A small Java program that works out how much a customer owes for renting a bicycle, based on the hours they take it and bring it back.

## The problem

You own a bicycle rental business. The program takes two whole numbers:

- **start hour** (0 to 23)
- **end hour** (1 to 24)

The start must be earlier than the end, and a rental can't go past one day. Decimals are not accepted.

The price per hour depends on the time of day:

| Hours of the day | Rate per hour |
|------------------|---------------|
| 0 - 7 and 21 - 24 | 500 RWF |
| 7 - 14 and 19 - 21 | 1000 RWF |
| 14 - 19 | 1500 RWF |

## How to run

```
javac BicycleRental.java
java BicycleRental
```

Example:

```
Enter start hour (0-23): 6
Enter end hour (1-24): 9
Total rent: 2500 RWF
```

(6-7 costs 500, then 7-8 and 8-9 cost 1000 each.)

## How it works

1. **Read the input.** Two `int` values are read with `Scanner`. Since `nextInt()` is used, decimal values are not accepted.
2. **Check the input.** The program stops with an error message if the start is outside 0-23, the end is outside 1-24, or the start is not less than the end.
3. **Add up the cost hour by hour.** A `for` loop goes through every hour the bike is rented, from `startHour` up to (but not including) `endHour`. Each loop turn stands for one full hour, so the hour `hour` means the slot from `hour` to `hour + 1`. An `if / else if` chain checks which price band that hour falls in and adds the matching rate to `totalCost`.
4. **Print the result.** The total is shown in RWF.

### Why loop hour by hour?

A rental can cross several price bands (for example 5 to 15). Looping through each hour means every hour is charged at its own rate, with no special cases to handle for the boundaries.

## Concepts used

- Variables and `Scanner` input
- Relational and logical operators (`<`, `>=`, `||`, `&&`)
- Decision statements (`if`, `else if`)
- Repetition (`for` loop)

#PROBLEM 2
# Mushroom Guessing Game

A Java program that guesses which mushroom the user is thinking of by asking yes/no questions.

## The problem

The user thinks of one of six mushrooms:

- Agaric Jaunissant
- Amanite Tue-Mouche
- Cèpe de Bordeaux
- Coprin Chevelu
- Girolle
- Pied Bleu

Known facts:

- Cèpe de Bordeaux is the only one with pores. All the others have gills.
- Coprin Chevelu and Agaric Jaunissant grow in meadows. The rest grow in forests.
- Only Agaric Jaunissant, Amanite Tue-Mouche and Pied Bleu have a convex cap.
- Only Agaric Jaunissant, Amanite Tue-Mouche and Coprin Chevelu have a ring.

The program asks yes/no questions (gills, forest, convex cap, ring) and works out the mushroom from the answers.

## How to run

```
javac Mushroom.java
java Mushroom
```

Answers can be `yes`, `y`, `no` or `n`. Anything else is rejected and the question is asked again.

## The logic

The program is a decision tree made of nested `if / else` statements. Each answer removes some mushrooms from the list until only one is left.

```
Has gills?
├── no  -> Cèpe de Bordeaux
└── yes
    Grows in a forest?
    ├── yes  (Amanite, Girolle, Pied Bleu)
    │   Convex cap?
    │   ├── no  -> Girolle
    │   └── yes (Amanite, Pied Bleu)
    │       Has a ring?
    │       ├── yes -> Amanite Tue-Mouche
    │       └── no  -> Pied Bleu
    └── no   (Agaric, Coprin)
        Convex cap?
        ├── yes -> Agaric Jaunissant
        └── no  -> Coprin Chevelu
```

Step by step:

1. **Gills.** Only Cèpe de Bordeaux has pores, so a "no" ends the game straight away.
2. **Forest.** With gills, the choice is split by habitat. Forest leaves Amanite, Girolle and Pied Bleu. Meadow leaves Agaric and Coprin.
3. **Convex cap.** In the forest, only Girolle has no convex cap. In the meadow, Agaric has one and Coprin does not, so the meadow branch is finished here.
4. **Ring.** Only needed for Amanite versus Pied Bleu, since both are forest mushrooms with a convex cap and only Amanite has a ring.

Most paths end in 1 to 3 questions. The Amanite / Pied Bleu path needs a fourth (the ring question), so it is the longest branch.

## Code structure

- `askQuestion(...)` is a helper method that prints a question, reads the answer and keeps looping (`while (true)`) until the input is valid. It returns a `boolean`, which keeps the main logic short and readable.
- `main` holds the decision tree and prints the final result.

## Concepts used

- Variables and `Scanner` input
- Methods that return a value
- Decision control statements (nested `if / else`)
- Repetition (`while` loop for input validation)
- String handling (`trim()`, `toLowerCase()`, `equals()`)
