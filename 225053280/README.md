#  My Java  Projects

Welcome to my Java  repository!  
This repository contains two console applications I wrote while learning the basics of Java.  
They’re simple but meaningful — each one helped me understand how **loops, conditionals, and user input** work in real programs.  

I wanted to keep them here not just as code, but as a record of my learning journey.

---

##  Bicycle Rental Program
**File:** `BicycleRental.java`  
**Package:** `my.bicyclerental`

###  Overview
This program simulates renting a bicycle. The user enters the starting and ending hours, and the program calculates the total cost based on the time of day.  
It’s a practical example of how businesses can charge different rates depending on demand.

###  How It Works
- The program asks for two inputs: **starting hour (0–23)** and **ending hour (1–24)**.  
- It loops through each hour in that range and applies a rental rate depending on the time of day.  
- Rates are defined as:
  - **Early morning (0–7) and late night (21–24):** 500 RWF/hour  
  - **Morning (7–14) and evening (19–21):** 1000 RWF/hour  
  - **Afternoon (14–19):** 1500 RWF/hour  
- The program adds up the hourly costs and prints the total.
###  Example Run
 example of how it works:
Enter starting hour (0-23):
7
Enter the ending hour (1-24):
10
Total Rental cost: 3000 RWF


###  Concepts Practiced
- **For-loops** to repeat calculations across hours.  
- **If-else conditions** to apply different rates.  
- **Scanner class** for user input.  

---
2.
##  Mushroom Finder Program
**File:** `MushroomFinder.java`  
**Package:** `com.mycompany.mushroomfinder`

###  Overview
This program  asks a series of yes/no questions about a mushroom and tries to identify it.  
It’s a  way to practice decision-making logic in Java.

###  How It Works
- The program starts by asking if the mushroom has gills.  
- Based on the answer, it follows different paths (forest vs meadow, ring vs no ring, convex cup vs flat).  
- Each path leads to a possible mushroom type:
  - **No gills → Cepe de Bordeaux**  
  - **Gills + Meadow habitat → Coprin Chevelu or Agaric Jaunissant**  
  - **Gills + Forest habitat + Ring → Amanite tue‑mouche**  
  - **Gills + Forest habitat + No ring + Convex cup → Pied Bleu**  
  - **Otherwise → Girolle**

###  Example Run
Does your mushroom have gills? (yes/no): yes
Does your mushroom grow in a forest? (yes/no): yes
Does your mushroom have a ring? (yes/no): no
Does your mushroom have a convex cup? (yes/no): yes
Your mushroom is Pied Bleu.

 
###  Concepts Practiced
- **Nested if-else statements** to build a decision tree.  
- **Scanner class** for user input.  
- Logical thinking: structuring questions so they lead to clear outcomes.  

---

##  How to Run These Programs
1. Clone or download this repo.
2. Open it in your Java IDE (IntelliJ, Eclipse, VS Code).
3. Compile and run whichever program you want:

   **Bicycle Rental:**
   ```bash
   javac BicycleRental.java
   java my.bicyclerental.BicycleRental
Mushroom finder:
 javac MushroomFinder.java
java com.mycompany.mushroomfinder.MushroomFinder

author:NIYUBAHWE BENI DEOLIS 
REG NO:225053280
