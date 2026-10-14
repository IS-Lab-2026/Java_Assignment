Java Problem Solutions: README
This repository contains two Java programs solving different logic and algorithmic problems: Bicycle Rental Cost Calculator (Problem 1) and an interactive Mushroom Identifier decision tree (Problem 2).
Prerequisites
 * Java Development Kit (JDK): Version 8 or higher installed on your system.
Problem 1: Bicycle Rental Cost Calculator
Description
The BicycleRental program calculates the total cost of renting a bicycle based on the starting and ending hours provided by the user. The pricing structure varies depending on the time of day:
 * Night / Early Morning (00:00 - 06:59 and 21:00 - 23:59): 500 RWF per hour
 * Morning / Evening Transition (07:00 - 13:59 and 19:00 - 20:59): 1,000 RWF per hour
 * Peak Hours (14:00 - 18:59): 1,500 RWF per hour
It includes validation to ensure the input hours fall within valid ranges (0-23 for start, 1-24 for end) and that the starting hour precedes the ending hour.
How to Run
 * Compile the file:
   javac BicycleRental.java

 * Run the program:
   java BicycleRental

Problem 2: Mushroom Identifier
Description
The MushroomIdentifier program is an interactive text-based decision tree that guides the user through a series of yes/no questions to identify specific types of mushrooms (such as Amanite tue-mouche, Cepe de Bordeaux, Girolle, etc.).
It features input sanitization to ensure users enter valid responses (yes/y or no/n).
Supported Mushroom Types
 * Amanite tue-mouche
 * Agaric jaunissant
 * Pied bleu
 * Cepe de Bordeaux
 * Girolle
 * Coprin chevelu
How to Run
 * Compile the file:
   javac MushroomIdentifier.java

 * Run the program and follow the on-screen prompts:
   java MushroomIdentifier
