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

## Project Structure
```.
├── BicycleRental.java
└── README.md
```
## Possible Improvements
- Only print the total cost when the input is valid.
- Validate that the input is a number so the program doesn't crash on text.
- Move the rates into constants so they are easy to change.






 










   



