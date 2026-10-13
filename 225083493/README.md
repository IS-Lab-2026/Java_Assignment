#1. Mushroom Identifier (Java)

This is a simple, interactive console-based Java program designed to identify one of six specific mushroom types based on physical characteristics (gills, habitat, rings, and cap shape) through a series of yes/no questions.

---

## **Supported Mushroom Types**
1. **Cèpe de Bordeaux** (Identified if it has no gills)
2. **Agaric Jaunissant**
3. **Amanite Tue-Mouche**
4. **Coprin Chevelu**
5. **Pied Bleu**
6. **Girolle**

## **How It Works**
The program follows a decision tree logic:
* **Step 1:** The program asks if the mushroom has gills. If the answer is **no**, it immediately identifies it as a *Cèpe de Bordeaux*.
* **Step 2:**If the answer is yes (the mushroom has gills), the program prompts the user for additional descriptive features:
* Habitat: Does it grow in a forest or in meadows?
* Ring: Does it have a ring?
* Cup Shape: Does it have a convex cup (vs. flat/other)?   
* **Step 3:** Evaluates your answers against logical rules and outputs the correct mushroom species.
* Coprin chevelu: Gills + Meadows + Ring + No convex cup
* Agaric Jaunissant: Gills + Meadows + Ring + Convex cup
* Amanite tue-mouches: Gills + Forest + Ring + Convex cup
* Pied bleu: Gills + Forest + No ring + Convex cup
*Girolle: Gills + Forest + No ring + No convex cup   

## **Requirements**
* **Java Development Kit (JDK)** installed on your system (Java 8 or higher recommended)

## **How to Run**

1. Ensure your file is saved as **`MushroomSale.java`**.
2. Open your terminal or command prompt in the directory containing the file.




#2. Bicycle Rental Cost Calculator (Java)

A simple Java program that runs in the command prompt to figure out how much a customer owes for renting a bicycle, using hourly prices that change depending on how long they keep the bike..


## **Pricing Rates & Time Intervals**
The program computes the bill hour-by-hour using the following rate tiers:
* **500 RWF per hour:** Hours between $00\text{h}–07\text{h}$ and $21\text{h}–24\text{h}$ (Night Rate)
* **1000 RWF per hour:** Hours between $07\text{h}–14\text{h}$ and $19\text{h}–21\text{h}$ (Standard Rate)
* **1500 RWF per hour:** Hours between $14\text{h}–19\text{h}$ (Peak Rate)
  

## **Features & Validation Rules**
* **Input Validation:** Ensures the starting time is between `0` and `23`, and the ending time is between `1` and `24`.
* **Logical Checks:** Verifies that the starting time is strictly less than the ending time.
* **Hourly Accumulation:** Iterates through each hour of the rental period to accurately aggregate the final cost in Rwandan Francs (RWF).


## **Requirements**
* **Java Development Kit (JDK)** installed on your system (Java 8 or higher recommended).


## **How to Run**

1. Ensure your file is saved as **`Javatrials.java`**.
2. Open your terminal or command prompt in the folder containing your file.
3. Compile the program using:
   ```bash
   javac Javatrials.java

**Author**: UWASE Sandra **REG N:** 225083493 **DEPARTMENT:** Information Systems Year 2  
