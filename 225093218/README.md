PROGRAM 1: MushroomGuess

Line 1: Imports the Scanner class, which is used to read keyboard input.
Line 3: Declares the class named MushroomGuess. The class name must match the file name.
Line 4: The main method, where the program starts running.
Line 6: Creates a Scanner object called input that reads from the keyboard.
Line 8: Prints the instruction "Think of one of these mushrooms:".
Lines 9 to 14: Print the list of the 6 mushrooms the user can choose from.
Line 15: Prints an empty line for spacing.
Line 17: Asks whether the mushroom has gills. It uses print, so the answer is typed on the same line.
Line 18: Reads the typed answer, converts it to lowercase so "NO" and "no" both work, and stores it in the variable gills.
Line 20: Checks whether the answer is "no".
Line 22: If there are no gills, prints Cepe de Bordeaux, the only mushroom without gills.
Line 24: The else part. The mushroom has gills, so the program asks more questions.
Line 26: Asks whether the mushroom grows in a forest.
Line 27: Reads the answer in lowercase and stores it in forest.
Line 29: Checks whether the answer is "no", meaning it does not grow in a forest.
Line 30: Asks whether the mushroom has a ring.
Line 31: Reads the answer in lowercase and stores it in ring.
Line 33: Checks whether the ring answer is "yes".
Line 34: Prints Agaric Jaunissant (gills, not in a forest, has a ring).
Line 35: The else part, meaning there is no ring.
Line 36: Prints Coprin Chevelu (gills, not in a forest, no ring).
Line 38: Ends the "not in a forest" branch.
Line 39: The else part. The mushroom grows in a forest.
Line 40: Asks whether the mushroom has a convex cup.
Line 41: Reads the answer in lowercase and stores it in cup.
Line 43: Checks whether the cup answer is "yes".
Line 45: Asks whether the mushroom has a ring.
Line 46: Reads the answer in lowercase and stores it in ring.
Line 48: Checks whether the ring answer is "yes".
Line 49: Prints Amanite tue-mouche (forest, cup, ring).
Line 50: The else part, meaning there is no ring.
Line 51: Prints Pied bleu (forest, cup, no ring).
Line 53: The else part, meaning there is no convex cup.
Line 54: Prints Girolle (forest, no cup).
Lines 55 to 57: Close the remaining if and else blocks.
Line 59: Closes the Scanner to free the input resource.
Line 60: Ends the main method.
Line 61: Ends the class.

PROGRAM 2: BicycleRental

Line 1: Imports the Scanner class for keyboard input.
Line 2: Declares the class named BicycleRental.
Line 3: The main method, where the program starts running.
Line 4: Creates a Scanner object called input that reads from the keyboard.
Line 5: Asks for the starting hour (0 to 23). It uses println, so the cursor moves to the next line.
Line 6: Reads a whole number and stores it in startTime.
Line 7: Asks for the ending hour (1 to 24). It uses print, so the cursor stays on the same line.
Line 8: Reads a whole number and stores it in endTime.
Line 10: Checks whether the hours are invalid. The symbol || means "or", so it is true if the start is below 0 or above 23, or the end is below 1 or above 24.
Line 11: Prints an error message for invalid hours.
Line 12: The return statement stops the program immediately.
Line 13: Ends the first validation block.
Line 14: Checks whether the starting time is greater than or equal to the ending time, which would make no sense.
Line 15: Prints an error message saying the start must be less than the end.
Line 16: Stops the program immediately.
Line 17: Ends the second validation block.
Line 19: Creates the variable totalCost and sets it to 0.
Line 20: Starts a for loop that runs once for each rented hour. The variable h starts at startTime and increases by 1 each time, while h is less than endTime. For example, renting from 8 to 10 covers hours 8 and 9.
Line 21: Checks whether the hour is from 0 to 6 or from 21 to 23 (night hours).
Line 22: Adds 500 RWF to the total for that hour.
Line 23: Otherwise, checks whether the hour is from 7 to 13 or from 19 to 20.
Line 24: Adds 1000 RWF to the total for that hour.
Line 25: Otherwise, checks whether the hour is from 14 to 18 (the busiest hours).
Line 26: Adds 1500 RWF to the total for that hour.
Line 27: Ends the if/else chain.
Line 28: Ends the for loop.
Line 29: Prints the final total followed by "RWF".
Line 31: Closes the Scanner to free the input resource.
Line 32: The two closing braces end the main method and the class.
