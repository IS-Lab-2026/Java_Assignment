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

