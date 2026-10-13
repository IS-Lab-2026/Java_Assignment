# Bicycle Rental System

## 1. Project Description
The Bicycle Rental System is a simple Java program that calculates the cost of renting a bicycle based on the starting time and ending time entered by the user.
## 2. Objectives
- Practice basic Java programming.
- Accept user input using the `Scanner` class.
- Calculate rental duration and cost.
- Use conditional statements to determine the rental rate.
- Detect invalid rental times.
## 3. Technologies Used
- **Language:** Java
- **Input:** Scanner class
- **Editor:** VS Code or any Java IDE
## 4. How It Works
1. The user enters the starting and ending times.
2. The program calculates the rental duration.
3. It checks whether the rental time is valid.
4. It selects the hourly rate based on the rental duration.
5. It calculates and displays the total cost.
**Formula:**

Total Cost = Rental Duration × Hourly Rate
## 5. Rental Pricing Rules
| Rental Duration | Rate per Hour |
|---|---:|
| Less than 7 hours | 500 |
| 7 to less than 14 hours | 1,000 |
| 14 to less than 19 hours | 1,500 |
| 19 to less than 21 hours | 1,000 |
| 21 hours or more | 500 |
## 6. Example Output
Enter starting time: 8
Enter ending time: 12
Total cost = 2000
**Explanation:** The rental lasts 4 hours. At 500 per hour, the total cost is 4 × 500 = 2,000.
## 7. How to Run
1. Save the code as `BicycleRental.java`.
2. Open the terminal in the project folder.
3. Compile the program:
4. Run the program:

## 8. Limitations
- Accepts integer values only.
- Does not support rentals across midnight.
- Does not validate actual clock times.
- Uses one hourly rate for the entire rental duration.





# Mushroom Identification System

## 1. Project Description
The Mushroom Identification System is a simple Java program that identifies a mushroom based on its characteristics. It asks the user questions about the mushroom, such as whether it has gills, grows in a forest, or has a ring.

## 2. Objectives
- Practice basic Java programming.
- Accept user input using the `Scanner` class.
- Use `if`, `else if`, and `else` conditional statements.
- Identify mushrooms based on their characteristics.

## 3. Technologies Used
- **Programming Language:** Java
- **Input:** Scanner class
- **Editor:** VS Code or any Java IDE

## 4. How It Works
1. The program asks whether the mushroom has gills.
2. Depending on the answer, it asks additional questions about the mushroom.
3. It uses conditional statements to determine the mushroom's name.
4. It displays the identified mushroom.

## 5. Example Output

```text
Does it have gills? yes/no: yes
Does it grow in a forest? yes/no: no
Does it have a convex cup? yes/no: yes
Your mushroom is: Agaric Jaunissant
```

## 6. How to Run
1. Save the code as `Mushroom.java`.
2. Open the terminal in the project folder.
3. Compile the program:

   `javac Mushroom.java`

4. Run the program:

   `java Mushroom`

5. Answer the questions displayed on the screen.

## 7. Java Concepts Demonstrated
- Variables and data types
- User input using `Scanner`
- String comparison using `.equals()`
- Conditional statements
- Output using `System.out.println()`










   



