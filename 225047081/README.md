# Lab 1: Bicycle Rental Services

## 1. Introduction
The Bicycle Rental Services program is a Java application designed to calculate the total cost of renting a bicycle. The cost depends on the starting time and ending time selected by the user.

## 2. How the Program Was Developed
The program was developed using the following steps:

**Step 1: Displaying the Rental Prices**

The program first displays a table showing the rental prices for different hours of the day. The prices are 500 RWF, 1,000 RWF, and 1,500 RWF per hour, depending on the time.

**Step 2: Receiving User Input**

The `Scanner` class is used to allow the user to enter the starting time and ending time of the bicycle rental.

**Step 3: Validating the Input**

The program checks whether the starting and ending times are within the allowed ranges. It also checks that the starting time is earlier than the ending time. If the entered times are invalid, the program displays an error message.

**Step 4: Calculating the Rental Hours**

The program subtracts the starting time from the ending time to calculate the total number of rental hours.

**Step 5: Calculating the Total Cost**

A `for` loop checks each rental hour. Using `if`, `else if`, and `else` statements, the program determines the price for that hour and adds it to the total cost.

**Step 6: Displaying the Results**

Finally, the program displays the total rental hours and the total cost in Rwandan francs (RWF).

## 3. Java Concepts Used
- **Scanner:** Receives input from the user.
- **Variables:** Store the starting time, ending time, rental hours, and total cost.
- **If-else statements:** Validate the input and select the correct hourly price.
- **For loop:** Calculates the cost for each rental hour.
- **Arithmetic operations:** Calculate the rental duration and total cost.

## 4. Conclusion
This project demonstrates how Java can be used to solve a simple real-life problem. It helped apply user input, conditional statements, loops, and calculations to develop a bicycle rental cost calculator.









# Lab 2: Mushroom Identification Program

## 1. Introduction
The Mushroom Identification Program is a Java application designed to identify a possible mushroom type by asking the user questions about its characteristics and where it grows.

## 2. How the Program Was Developed
The program was developed using the following steps:

**Step 1: Displaying the Program Title**

The program starts by displaying the title "Mushroom Identification Program" to inform the user about its purpose.

**Step 2: Asking the First Question**

The program asks the user whether the mushroom has gills. The user's answer determines the next step.

**Step 3: Checking the User's Answer**

If the user answers `no`, the program identifies the mushroom as Cepe de bordeaux. If the answer is `yes`, the program asks another question about whether the mushroom grows in a forest.

**Step 4: Asking Additional Questions**

Depending on the previous answers, the program asks about other characteristics, such as whether the mushroom has a ring or a convex cup.

**Step 5: Using Conditional Statements**

Nested `if`, `else if`, and `else` statements help the program follow different paths according to the user's answers. Each path leads to a possible mushroom name.

**Step 6: Displaying the Result**

After processing the answers, the program displays the possible mushroom name on the screen.

## 3. Java Concepts Used
- **Scanner:** Receives answers from the user.
- **String variables:** Store the user's answers.
- **toLowerCase():** Converts answers to lowercase so that answers such as `YES` and `yes` can be treated the same.
- **If-else statements:** Choose the next action based on the user's answer.
- **Nested conditions:** Allow the program to ask different questions depending on earlier answers.

## 4. Conclusion
This project demonstrates how Java conditional statements can be used to make decisions. It helped apply user input, string handling, and nested conditions to develop a simple question-based identification program.

**Note:** This program is for educational purposes only and should not be used to determine whether a real mushroom is safe to eat.

