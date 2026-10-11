# Bicycle Rental Calculator

## What this project does
This is a simple Java program  made to calculate bicycle rent price in RWF.
You enter start hour and end hour, and it tells you total money to pay.

## How the price works
I made 3 time zones like in real life:
- **Night time (0h - 7h and 21h - 24h):** 500 RWF per hour - cheap because few people
- **Normal time (7h - 14h and 19h - 21h):** 1000 RWF per hour
- **Busy time (14h - 19h):** 1500 RWF per hour - expensive because many people want bicycle

## Tools I used
- Java
- Scanner for user input
- For loop to calculate hour by hour
- VS Code

## How to run it
1. Download the file `BicycleRental.java`
2. Open terminal
3. Compile: `javac BicycleRental.java`
4. Run: `java BicycleRental`
5. Enter start hour (0-23)
6. Enter end hour (1-24)
7. See total rent!


# Mushroom Identifier - Java Program

## What this project does
This program helps to know mushroom type by answering yes/no questions.
You answer questions like "does it have a ring?" and it tells you the name of mushroom.

It's like a small game for identifying mushrooms in forest.

## How it works
The program asks questions step by step:

**If mushroom has a ring:**
- Does it grow in forest?
    - YES = Amanite tue-mouche
    - NO = Is cap convex?
        - YES = Agaric Jaunissant
        - NO = Coprin chevelu

**If mushroom has NO ring:**
- Does it have gills?
    - NO (it has pores) = Cepe de Bordeaux
    - YES = Is cap convex?
        - YES = Pied bleu
        - NO = Girolle

## Tools I used
- Java
- Scanner for input
- Method `getValidInput()` to check if user types only yes or no
- If-else conditions
- I used `trim().toLowerCase()` so YES, Yes, yes all work

## How to run it
1. File name: `Mushroom_Identifier.java`
2. Compile: `javac Mushroom_Identifier.java`
3. Run: `java Mushroom_Identifier`
4. Answer only `yes` or `no`
5. Program will tell you mushroom name


