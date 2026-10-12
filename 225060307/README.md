# java-practice
Lab 1 Assignment – Java

This assignment contains two Java programs: Bicycle Rental and Mushroom Identification. They use input, conditions, and loops to solve the given problems.

1. Bicycle Rental

The program calculates the amount a customer has to pay for renting a bicycle. The user enters the starting and ending hours.

Input and validation

The program uses a "Scanner" to read the two hours. Before calculating the price, it checks whether the hours are valid. The starting hour must be between 0 and 23, the ending hour must be between 1 and 24, and the starting hour must be less than the ending hour.

if((start<0||start>23) || (end<1||end>24) || (start>=end)){
    System.out.println("invalid inputed hour");
}

This block checks the user's input and displays an error message if the hours are invalid.

Calculating the rental cost

The "for" loop goes through each hour of the rental period. The "if", "else if", and "else" statements select the rate for each hour.

- From 0 to 7 and from 21 to 24: 500 RWF per hour.
- From 7 to 14 and from 19 to 21: 1,000 RWF per hour.
- From 14 to 19: 1,500 RWF per hour.

The amount for each hour is added to "total".

for(int i=start; i<end; i++){
    if(i<7){
        rate=500;
    }
    else if(i<14){
        rate=1000;
    }
    else if(i<19){
        rate=1500;
    }
    else if(i<21){
        rate=1000;
    }
    else {
        rate=500;
    }
    total=total+rate;
}

Output

After the calculation, the program displays the total amount to be paid in RWF.

2. Mushroom Identification

This program identifies a mushroom based on the answers provided by the user. It uses conditions to choose the mushroom that matches the answers.

Input

The program uses a "Scanner" to read the user's answers. The user enters "1" for yes and "0" for no.

The first two questions ask whether the mushroom grows in a forest and whether it has a convex cup.

Decision-making

The program uses "if" and "else if" statements to check the answers and identify the mushroom.

- If the mushroom does not grow in a forest and has a convex cup, the result is Agaric jaunissant.
- If it does not grow in a forest and has no convex cup, the result is Coprin chevelu.
- If it grows in a forest and has a convex cup, the program asks whether it has a ring. The answer determines whether the result is Amanite tue-mouche or Pied bleu.
- If it grows in a forest and has no convex cup, the program asks whether it has gills. The answer determines whether the result is Girolle or Cepe de bordeaux.

The program asks the third question only when it is needed.

Output

The program displays the identified mushroom after checking the user's answers.

Conclusion

Both programs apply the Java concepts covered in this assignment. The Bicycle Rental program uses input validation, loops, and conditions to calculate a rental cost. The Mushroom Identification program uses input and conditional statements to identify a mushroom based on its characteristics.
