# Bicycle Rental Cost Calculator
A simple Java console program that calculates the total cost of renting a bicycle based on how long it was rented.
## How It Works
1. The program asks for a **starting time** and an **ending time** (whole numbers).
2. It calculates the rental duration: `ending time - starting time`.
3. It picks a rate based on the duration and multiplies it by the duration to get the total cost.
If the starting time is greater than or equal to the ending time, the program reports `Invalid time.`
## Pricing
The rate depends on the **total rental duration**, and that rate applies to the whole duration.
| Duration | Rate per unit |
|----------|---------------|
| Less than 7 | 500 |
| 7 to 13 | 1000 |
| 14 to 18 | 1500 |
| 19 to 20 | 1000 |
| 21 or more | 500 |
## Requirements
- Java Development Kit (JDK) 8 or higher
## Run the Program
```bash
javac BicycleRental.java
java BicycleRental
## Example Runs
**Example 1**
Enter starting time: 8
Enter ending time: 12
Total cost = 2000
Duration is 4, so the rate is 500: 4 × 500 = 2000.
**Example 2**
Enter starting time: 0
Enter ending time: 15
Total cost = 22500
Duration is 15, so the rate is 1500: 15 × 1500 = 22500.
**Example 3 (invalid input)**
Enter starting time: 10
Enter ending time: 5
Invalid time.
Total cost = 0
```
## Project Structure
```.
├── BicycleRental.java
└── README.md
```
## Possible Improvements
- Only print the total cost when the input is valid.
- Validate that the input is a number so the program doesn't crash on text.
- Move the rates into constants so they are easy to change.






 










   



