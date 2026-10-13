regnumber:225063222

                                                     #  Bicycle Rental Program

## Description
This Java program calculates the total amount a customer must pay for renting a bicycle based on the starting and ending hours.
 The price per hour changes depending on the time of day.

## Inputs
- Starting hour: an integer between 0 and 23.
- Ending hour: an integer between 1 and 24.

The starting hour must be less than the ending hour. A rental cannot last more than one day.

Each hour is charged by the hour in which it begins.
For example, renting from 6 to 8 charges the 6:00 hour (500 RWF) and the 7:00 hour (1,000 RWF).


## How it  Works
1. The program asks the user to enter the starting and ending hours.
2. It initializes the total cost to zero.
3. It uses a loop to check each rental hour.
4. It selects the appropriate hourly rate using `if`, `else if`, and `else` statements.
5. It adds each hourly rate to the total cost.
6. It displays the total rental cost in RWF.

Each hour is charged by the hour in which it begins.

## Example
Starting hour: 6
Ending hour: 9

Calculation:
- 6–7: 500 RWF
- 7–8: 1,000 RWF
- 8–9: 1,000 RWF

Total rental cost: 2,500 RWF

## notes

- The program does not validate input.
The start hour should be 0–23, the end hour 1–24, and the end hour must be greater than the start hour.
  If the end hour is less than or equal to the start hour, the total will be 0 RWF.
- Only whole hours are supported (no minutes).
- The rental must fall within a single day (no overnight rentals past 24:00).


                                                  #  Mushroom Identification Program

## Description
this Java  program that suggests the name of a mushroom by asking a short series of yes/no questions.
 It is a beginner exercise in using nested `if / else` statements and reading user input with `Scanner`.

## Mushroom Types
The program considers the following six mushroom types:
- Agaric Jaunissant
- Amanite tue-mouche
- Cepe de bordeaux
- Coprin chevelu
- Girolle
- Pied bleu

## Questions
The program uses the following questions to identify the mushroom:
1. Does your mushroom have gills?
2. Does your mushroom grow in a forest?
3. Does your mushroom have a ring?
4. Does your mushroom have a convex cup?

The user answers truthfully with yes or no. The program asks at most three of the four questions.

## Mushroom Characteristics
- Cepe de bordeaux is the only mushroom with pores; the other mushrooms have gills.
- Coprin chevelu and Agaric jaunissant grow in meadows; the other mushrooms grow in forests.
- Agaric jaunissant, Amanite tue-mouche, and Pied bleu have a convex cup.
- Agaric jaunissant, Amanite tue-mouche, and Coprin chevelu have a ring.

## How the Program Works
1. The program asks the user questions about the mushroom.
2. It reads the user's answers using `Scanner`.
3. It uses `if` and `else` statements to make decisions.
4. It displays the identified mushroom based on the answers.
 

## Note
- Answers must be typed in lowercase (`yes` or `no`). The check uses `equals`, so `No` or `NO` will not match.
- Any answer other than `no` is treated as `yes`, since only `no` is checked directly. For example, a typing mistake like `nope` counts as `yes`.
- The program does not repeat a question if the answer is invalid.
- Only five mushrooms are included, and the questions are very simplified.

 
  thanks.

