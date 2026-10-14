
REG NO:225064914

1. BicycleRental Blocks

• BLOCK1 (Opening/Closing): Initializes the Scanner object to read keyboard input from the user.
• BLOCK2 (Opening/Closing): Prompts the user and reads the integer inputs for startTime and endTime.
• BLOCK3 (Opening/Closing): Performs input validation. It checks if the hours are out of bounds (0-23 and 1-24) or if the start time is ahead of the end time, stopping the program if an error is found.
• BLOCK4 (Opening/Closing): Contains the core pricing loop. It iterates hour-by-hour through the rental duration, checks which time bracket the hour falls into, and accumulates the total price in totalRent.

2. MushroomIdentifier Lines & Blocks

• LINE1 & LINE2: Prints the program header title and asks the user the primary question about whether the mushroom has gills.
• LINE3: Executed only if the user answers "no" to gills, immediately identifying the mushroom as a Cepe de bordeau.
• LINE4: Executed if the user answers "yes" to gills, moving down the decision tree to ask if the mushroom grows in a forest.
• BLOCK5 (Opening/Closing): Handles the nested classification logic once it is known the mushroom has gills. It splits into two main paths depending on the forest answer, checking for either a ring or a convex cup to make the final species identification.
