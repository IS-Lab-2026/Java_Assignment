# Bicycle Rental

A Java program that works out how much a customer owes for renting a bicycle, based on the hour they take it and the hour they bring it back.

## The problem

The program reads two whole numbers (decimals are not accepted):

- **start hour** (0 to 23)
- **end hour** (1 to 24)

The start must be earlier than the end, and a rental can't go past one day.

| Hours of the day | Rate per hour |
|------------------|---------------|
| 0 - 7 and 21 - 24 | 500 RWF |
| 7 - 14 and 19 - 21 | 1000 RWF |
| 14 - 19 | 1500 RWF |

## Solution summary

The program first checks that the two hours are valid. It then loops through each hour of the rental, and for every hour it finds the price band the hour belongs to and adds that rate to the total. The final total is printed in RWF.

## How to run

```
javac BicycleRental.java
java BicycleRental
```

Example: start 6, end 9 gives 500 + 1000 + 1000 = **2500 RWF**.

## Code explained (`BicycleRental.java`)

| Lines | What it does |
|-------|--------------|
| 5 | Creates the `Scanner` object to read keyboard input. |
| 8-9 | Asks for the start hour and stores it in `startHour`. |
| 11-12 | Asks for the end hour and stores it in `endHour`. `nextInt()` means decimals are not accepted. |
| 15-19 | Error and stop if `startHour` is outside 0-23. |
| 20-24 | Error and stop if `endHour` is outside 1-24. |
| 25-29 | Error and stop if `startHour >= endHour`. |
| 31 | Creates `totalCost` and sets it to 0. |
| 34 | The `for` loop goes through every rented hour, from `startHour` up to (but not including) `endHour`. |
| 37-38 | Hours 0-7 and 21-24: adds 500. |
| 41-42 | Hours 7-14 and 19-21: adds 1000. |
| 45-46 | Hours 14-19: adds 1500. |
| 51 | Prints the total rent in RWF. |
| 53 | Closes the `Scanner`. |

Looping hour by hour means a rental that crosses several price bands (for example 5 to 15) is charged correctly, with no special cases for the boundaries.

## Concepts used

Variables, `Scanner` input, relational and logical operators, `if / else if`, and a `for` loop.

#PROBLEM 2
# Mushroom Guessing Game

A Java program that guesses which of six mushrooms the user is thinking of by asking yes/no questions.

## The problem

Mushrooms: Agaric Jaunissant, Amanite Tue-Mouche, Cèpe de Bordeaux, Coprin Chevelu, Girolle, Pied Bleu.

- Cèpe de Bordeaux is the only one with pores. The others have gills.
- Coprin Chevelu and Agaric Jaunissant grow in meadows. The rest grow in forests.
- Only Agaric Jaunissant, Amanite Tue-Mouche and Pied Bleu have a convex cap.
- Only Agaric Jaunissant, Amanite Tue-Mouche and Coprin Chevelu have a ring.

## Solution summary

The program works as a decision tree. Each yes/no answer rules out some mushrooms, so the program asks only the questions it needs (gills, forest, convex cap, and the ring only when two mushrooms are still possible) until one mushroom is left and its name is printed.

## How to run

```
javac Mushroom.java
java Mushroom
```

Answer with `yes`/`y` or `no`/`n`. Invalid answers are asked again.

## The logic

The program is a decision tree. Each answer removes some mushrooms until only one is left.

```
Gills?
├── no  -> Cèpe de Bordeaux
└── yes -> Forest?
    ├── yes -> Convex cap?
    │   ├── no  -> Girolle
    │   └── yes -> Ring?
    │       ├── yes -> Amanite Tue-Mouche
    │       └── no  -> Pied Bleu
    └── no  -> Convex cap?
        ├── yes -> Agaric Jaunissant
        └── no  -> Coprin Chevelu
```

1. **Gills:** only Cèpe de Bordeaux has pores, so "no" ends the game at once.
2. **Forest:** splits the rest into forest (Amanite, Girolle, Pied Bleu) and meadow (Agaric, Coprin).
3. **Convex cap:** in the forest only Girolle lacks one. In the meadow, Agaric has one and Coprin does not.
4. **Ring:** only needed to tell Amanite from Pied Bleu, which makes that path the longest (4 questions).

## Code explained (`Mushroom.java`)

| Lines | What it does |
|-------|--------------|
| 6-17 | `askQuestion()` helper: prints the question, reads the answer, accepts `yes/y` or `no/n`, and repeats until the input is valid. Returns a `boolean`. |
| 20 | Creates the `Scanner` in `main`. |
| 21-23 | Prints the instructions and the list of six mushrooms. |
| 26 | Question 1: does the mushroom have gills? |
| 28-30 | No gills: prints Cèpe de Bordeaux. |
| 31-33 | Gills: moves on and asks if it grows in a forest. |
| 35-38 | Forest branch: asks if it has a convex cap. |
| 40-48 | Convex cap: asks about the ring. Ring prints Amanite Tue-Mouche (45), no ring prints Pied Bleu (47). |
| 49-51 | No convex cap: prints Girolle. |
| 53-56 | Meadow branch: asks if it has a convex cap. |
| 58-61 | Convex cap prints Agaric Jaunissant (59), otherwise Coprin Chevelu (61). |
| 66 | Closes the `Scanner`. |

## Concepts used

Variables, `Scanner` input, methods that return a value, nested `if / else`, and a `while` loop for input validation.



