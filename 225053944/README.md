This repository contains two beginner-friendly Java command-line applications designed to practice control flow, loops, and conditional logic.

Project 1: Rental Cost Calculator (Problem1.java)
Overview
The Rental Cost Calculator determines the total cost of a rental period based on a 24-hour schedule. It takes a starting hour and an ending hour, validates the input range, and applies tiered hourly pricing rates.

How It Works
Input Validation: Ensures the start time is between 0 and 23, the end time is between 1 and 24, and the start time is strictly before the end time.

Pricing Tiers: Iterates through each hour of the rental duration, adding costs based on the time of day:

Midnight to 07:00 & 21:00 to Midnight: 500 RWF per hour

07:00 to 14:00 & 19:00 to 21:00: 1000 RWF per hour

14:00 to 19:00: 1500 RWF per hour

Output: Displays the accumulated total rental cost in Rwandan Francs (RWF).

Project 2: Mushroom Identification Tool (Problem2.java)
Overview
The Mushroom Identification Tool is an interactive decision-tree program that helps identify different mushroom species by asking a series of binary questions about their physical characteristics.

How It Works
Binary Inputs: Uses 1 for YES and 0 for NO.

Decision Tree Logic: Navigates through nested conditional statements based on features such as:

Presence of gills

Habitat (growing in a forest)

Cap shape (convex cup)

Presence of a ring

Output: Matches the user's answers to identify specific mushroom species, including Cepe de bordeaux, Agaric jaunissant, Coprin chevelu, Amanite tue-mouches, Pied bleu, and Girolle.

Getting Started
Prerequisites
Make sure you have the Java Development Kit (JDK) installed on your system. You can verify your installation via your terminal:  java -version

Compiling and Running
Open your terminal and navigate to the folder containing the source files.

Compile either program using the Java compiler: 

javac Problem1.java
# or
javac Problem2.java

Run the compiled program:

java Problem1
# or
java Problem2
