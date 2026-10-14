CODES DESCRIPTION

BICYCLE RENT

1. Overview
The program calculates the total bicycle rental cost based on the starting and ending times using a for loop and if-else statements.

3. Getting input
- Scanner: Reads the user's input.
- int start, end: Stores starting and ending hours as whole numbers.
- total = 0: Initializes the cost at zero.
- nextInt(): Reads integer values.
Why use int? Because decimal times are not accepted.

3. Checking each hour
The for loop calculates the cost for every rented hour.
- hour = start: Starts at the beginning.
- hour < end: Stops before the ending time.
- hour++: Moves to the next hour.
Example: Start = 6, end = 9 means 3 hours: 6, 7 and 8.

4. Applying hourly rates
- 500 RWF: Before 7:00 or from 21:00 onward.
- 1,000 RWF: From 7:00–14:00 or 19:00–21:00.
- 1,500 RWF: From 14:00–19:00.
Important operators:
- if: Checks a condition.
- else if: Checks another condition if the first is false.
- else: Handles the remaining case.
- ||: OR — either condition can be true.
- &&: AND — both conditions must be true.
- total += 500: Adds 500 to the total cost.
- 
5. Displaying the result
System.out.println() displays the final cost, and + joins the message with the amount and currency.
6. Example
Start = 6, End = 10.
- Hour 6: 500 RWF
- Hours 7, 8 and 9: 1,000 RWF each
Total = 3,500 RWF

7. Closing Scanner
input.close() closes the scanner after input is finished.


MUSHROOM

1. Overview
The Mushrooms program is a Java console application designed to identify different types of mushrooms based on answers provided by the user. It uses nested if-else statements to make decisions and display the mushroom's name.
2. First Decision: Does the mushroom grow in a forest?
   
Question asked: “Does your mushroom grow in a forest?”
- If No: The program asks, “Does your mushroom have a convex cap?”
  - If Yes, the output is Agaric jaunissant.
  - If No, the output is Coprin chevelu.
- If Yes: The program asks, “Does your mushroom have gills?”
  - If No, the output is Cepe de Bordeaux.
  - If Yes, the program asks, “Does your mushroom have a ring?”
    - If Yes, the output is Amanite tue-mouche.
    - If No, the output is Pied bleu.
      
3. How the code makes decisions
The program uses if to check whether the user's answer matches a condition and else to handle the alternative answer. Nested if-else statements allow it to ask more questions depending on previous answers.
It uses Scanner to read the user's answers and equalsIgnoreCase() to compare text without considering capital letters.

5. Handling invalid input
The current code does not display Invalid input when the user types something other than yes or no. It treats any answer other than no as yes in the first decision, and any answer other than yes as no in later decisions.
To handle invalid answers correctly, the program needs additional conditions to check whether the input is either yes or no.
Important: The decision tree you provided starts with the ring question, but the Java code you shared starts with whether the mushroom grows in a forest. The explanation above follows your actual Java code.
