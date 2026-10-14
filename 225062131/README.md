Java Programming Projects

1. Introduction

This repository contains two Java programming projects developed to demonstrate the application of basic programming concepts in solving practical problems.

The projects included are:

Bicycle Rental System – a program that calculates the cost of renting a bicycle based on the rental time.

Mushroom Identification System – a program that identifies a mushroom by asking questions about its physical characteristics.

Both programs run through a console interface and allow users to interact with the application by entering information.

2. Project Objectives

The main objectives of these projects are to:

Practice writing and organizing Java programs.

Understand how to receive and process user input.

Apply conditional statements to make decisions.

Use loops to perform repeated operations where necessary.

Understand how to work with variables, strings, and data types.

Develop simple applications that solve practical problems.

Improve problem-solving and logical thinking skills.

3. Bicycle Rental System

3.1 Description

The Bicycle Rental System is a Java application designed to calculate the cost of bicycle rental according to the starting and ending times entered by the user.

The program processes the rental time and applies the relevant hourly rates to determine the total amount payable. The result is displayed in Rwandan francs (RWF).

3.2 Objectives

The objectives of this program are to:

Accept rental time information from the user.

Calculate the rental duration.

Apply the appropriate hourly rental rates.

Determine the total rental cost.

Display the result clearly to the user.

3.3 Main Features

User input: Allows the user to enter the rental starting and ending times.

Time processing: Uses the entered times to determine the rental period.

Rate calculation: Applies the relevant rental rates according to the time of day.

Cost calculation: Calculates the total amount payable.

Output display: Presents the calculated rental cost.

3.4 Rental Rates

The rates associated with the project are:

Time period

Rental rate per hour

Early morning and late evening

500 RWF

Morning and selected evening hours

1,000 RWF

Afternoon

1,500 RWF

The program applies these rates according to its implemented time conditions.

3.5 Programming Concepts Used

Variables and data types

Variables store the rental times, calculated values, and rental cost.

User input

The program receives information from the user to determine the rental period.

Conditional statements

if-else statements allow the program to select the appropriate rental rate based on the specified conditions.

Loops

A for loop can be used to process each hour of the rental period and calculate the corresponding cost.

Arithmetic operations

Mathematical operations are used to calculate the rental duration and total amount.

3.6 Program Workflow

Start the program.

Request the bicycle rental starting time.

Request the bicycle rental ending time.

Process the rental period.

Determine the applicable rate for each relevant hour.

Calculate the total rental cost.

Display the amount payable.

End the program.

3.7 Requirements

Java Development Kit (JDK)

A Java development environment, such as NetBeans, IntelliJ IDEA, or Eclipse

A computer capable of running Java applications

3.8 How to Run

Open the bicycle rental project in your Java IDE.

Locate the main Java source file.

Compile the program.

Run the application.

Enter the requested rental information.

Read the calculated rental cost.

If using a terminal, compile the source file with:

javac BicycleRental.java

Run it with:

java BicycleRental

These commands assume that the source file and public class are named BicycleRental.

3.9 Expected Result

The program should display the total bicycle rental cost after processing the times entered by the user.

The exact result depends on the rental duration and the hourly rates applied by the program.

3.10 Possible Improvements

Validate the entered times.

Prevent the ending time from being earlier than the starting time when overnight rentals are not supported.

Handle rentals that cross midnight.

Allow users to enter different rental durations.

Display a detailed breakdown of the cost for each time period.

Improve the output formatting for easier reading.

4. Mushroom Identification System

4.1 Description

The Mushroom Identification System is a Java console application that identifies a mushroom based on answers provided by the user.

The program asks a series of questions about physical characteristics, including whether the mushroom has a ring, whether it has gills, whether it has a convex cup, and whether it grows in a forest.

The answers are processed using nested switch statements to determine which mushroom name to display.

4.2 Objectives

The objectives of this program are to:

Collect information about mushroom characteristics.

Use a sequence of questions to guide the identification process.

Apply decision-making logic to process the answers.

Display the resulting mushroom name.

Practice using nested switch statements in Java.

4.3 Main Features

Interactive questions: Requests answers from the user.

Characteristic checking: Uses observable features to guide the identification process.

Decision-making: Follows different branches depending on the answers.

Result display: Prints the corresponding mushroom name.

Console interface: Allows the user to interact with the program through text.

4.4 Questions Used by the Program

The program follows these questions:

Does the mushroom have a ring?

If the answer is no, does it have gills?

If it has gills, does it have a convex cup?

If the mushroom has a ring, does it grow in a forest?

Depending on the answers, the program displays a mushroom name.

Not every question is asked in every case. The next question depends on the user's previous answer.

4.5 Mushroom Names Displayed

The current source code includes the following names:

Cèpe de Bordeaux

Girolle

Pied bleu

Amanite tue-mouche

Agaric jaunissant

Coprin chevelu

These names are displayed according to the decision branches implemented in the program.

4.6 Programming Concepts Used

Java strings

The program stores the user's responses as strings, such as yes and no.

Scanner class

The Scanner class reads the user's responses from the console.

Nested switch statements

The program uses nested switch statements to evaluate the answers and choose the next action.

Break statements

The break statement ends a switch branch when appropriate.

Decision-making logic

The program follows different paths based on the mushroom characteristics entered by the user.

Console output

The System.out.println() method displays questions, instructions, and identification results.

4.7 Program Workflow

Start the program.

Display an instruction to answer using yes or no.

Ask whether the mushroom has a ring.

If the answer is no, ask whether it has gills.

If it has gills, ask whether it has a convex cup.

If the answer to the first question is yes, ask whether the mushroom grows in a forest.

Follow the corresponding decision branch.

Display the resulting mushroom name.

End the program.

4.8 Requirements

Java Development Kit (JDK)

A Java IDE or terminal

A computer capable of running Java applications

4.9 How to Run

Open the project in your Java IDE.

Locate Mushrooms.java.

Compile the source file.

Run the program.

Answer each question using lowercase yes or no.

Read the identification result displayed in the console.

To compile the program:

javac Mushrooms.java

To run it:

java Mushrooms

4.10 Example Interaction

The following is an illustrative example of the interaction based on the current program logic.

use only 'yes' or ,'no'

Does the mushroom hane ring?
no
Does it have gills?
no
It is cepe de bordeau.

The output depends on the answers provided by the user.

4.11 Limitations

The program expects lowercase yes or no.

Invalid answers are not handled consistently.

The identification depends on the characteristics and branches included in the source code.

The program does not use a comprehensive mushroom database.

The identification result should not be treated as confirmation that a mushroom is safe to eat.

4.12 Possible Improvements

Validate user input before continuing.

Accept uppercase and lowercase answers.

Provide an error message when an invalid answer is entered.

Improve the spelling and presentation of the mushroom names.

Organize the identification logic into separate methods.

Add more characteristics to the identification process.

Include a database of mushroom characteristics.

Improve the program's structure and readability.

Safety note: Mushroom identification based on a few characteristics can be unreliable. This program is intended for programming practice and should not be used to decide whether a wild mushroom is safe to eat.

5. Technologies and Tools

The two projects use or are intended to use the following technologies:

Technology

Purpose

Java

Programming language

JDK

Compiling and running Java applications

Java IDE

Writing, compiling, and testing source code

Console interface

Receiving input and displaying results

Git and GitHub (optional)

Managing and sharing project source code

6. General Installation and Execution

To run either project:

Install a suitable JDK.

Install or open a Java IDE, or use a terminal.

Open the relevant project folder.

Compile the Java source file.

Run the program.

Follow the instructions displayed on the screen.

Each program can be run independently.

7. Learning Outcomes

Working on these projects provides practice in:

Understanding Java syntax and program structure.

Declaring variables and working with data types.

Reading input from users.

Applying conditional statements.

Using loops to process repeated operations.

Working with strings and the Scanner class.

Using nested switch statements.

Testing program behavior with different inputs.

Identifying limitations and opportunities for improvement.

8. Conclusion

The Bicycle Rental System and Mushroom Identification System demonstrate two different applications of Java programming.

The Bicycle Rental System focuses on processing rental times and calculating costs, while the Mushroom Identification System focuses on using questions and decision-making logic to produce an identification result.

Together, the projects provide practical experience with user input, conditional logic, loops, arithmetic operations, and console output. They can also serve as a foundation for developing more advanced Java applications.
