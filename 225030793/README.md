# Bicycle Rental System

A Java implementation for calculating total bicycle rental fees based on multi-tiered hourly rates, input validation, and time-slot boundaries.
## Program Overview
The `BicycleRental.java` program manages user input for rental start and end times, validates time ranges, and iterates through each active hour to compute the total rental cost.
### 1. Input & Validation
The program accepts rental start (`Stime`) and end (`Etime`) times in a 24-hour format:

Logic Error Check: Displays `"Invalid"` if the start time is greater than the end time (`Stime > Etime`).

Boundary Error Check:Ensures start time falls within `[0, 23]` and end time within `[1, 24]`. Displays `"Invalid"` if any input is out of bounds.

### 2. Calculating the cost using a loop
Once validated, the program loops hour-by-hour (`i = Stime; i < Etime`) to apply the appropriate rate:
Late Night / Early Morning 0 to 7 & 21 to 24 (500 per hour)
Day / Evening 7 to 14 & 19 to 21 (1000 per hour)
Peak Hours 14 to 19 (1500 per hour)
### 3. Displaying the final result
Once the loop finishes calculating the cost for all rented hours, the program prints the total amount the customer has to pay.

# Mushroom identification program
## 1. Overview
The Mushrooms program is a Java console application designed to identify different types of mushrooms based on user-provided physical characteristics. It uses a series of nested if-else conditional statements acting as a decision tree to classify the mushroom.
##  First Decision Tree Branch (Ring Presence) Question Asked: "Does your mashroom have a ring?" 
If Yes :   
It checks if the mushroom grows in a forest: "Does your mashroom grow in forest:"   
   If yes, the output is Amanite tue-mouche.   
   If no, it checks for a convex cup: "Does your mushroom have a convexcup?"   
      If yes, the output is Agaric Jaunissant.  
      If no, the output is Coprin chevelu.   
      Any other input results in an Invalid input message.   
   Any invalid forest input outputs Invalid input.  
## Second Decision Tree Branch (No Ring):  
It checks for gills: "Does your mashroom have gills:"   
  If yes, it checks for a convex cup: "Does your mashroom have a convex cup?"  
  If yes, the output is Pied bleu.  
  If no, the output is  Girolle.   
  Any other input outputs  Invalid input.   
If no (no gills), the output is  Cepe de bordeau.   
If the initial ring input is neither "yes" nor "no", the program displays Invalid input and terminates.   
