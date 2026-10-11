# Java Mini Projects

## Problem 1: Bicycle Rental Calculatr
A console application that calculates the total rental fee for a bicycle business based on hourly rates in Rwandan Francs (RWF). 
* **Input:** Two integers representing the start hour (0-23) and end hour (1-24).
* **Rate Structure:** 
  * 00:00 - 07:00 & 21:00 - 24:00 -> 500 RWF/hour
  * 07:00 - 14:00 & 19:00 - 21:00 -> 1000 RWF/hour
  * 14:00 - 19:00 -> 1500 RWF/hour

## Problem 2: Mushroom Identifier
An interactive decision-tree program that identifies a specific mushroom type from a predefined list by asking the user at most three yes/no questions.
* **Supported Types:** *Agaric Jaunissant, Amanite tue-mouche, Cepe de bordeaux, Coprin chevelu, Girolle, and Pied bleu*.
* **Logic:** Analyzes physical characteristics (gills, pores, ring, convex cup) and growth environment (meadow or forest) to deduce the mushroom.

---
### How to Run the Programs
Ensure you have the Java Development Kit (JDK) installed. Navigate to your project folder in the terminal and compile/run the desired file:

**For Problem 1:**
```bash
javac BikeRental.java
java BikeRental
```

**For Problem 2:**
```bash
javac Mushroom1.java
java Mushroom1
```