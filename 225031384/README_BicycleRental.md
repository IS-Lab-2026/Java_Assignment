# Bicycle Rental Cost Calculator

## Description
This Java program calculates the total cost of renting a bicycle using the starting hour and ending hour. It calculates the rate for each hour separately because the hourly price changes throughout the day.

## Pricing Rules
- Hours 0 to before 7: 500 RWF per hour
- Hours 7 to before 14: 1,000 RWF per hour
- Hours 14 to before 19: 1,500 RWF per hour
- Hours 19 to before 21: 1,000 RWF per hour
- Hours 21 to 24: 500 RWF per hour

## Input
- Starting hour: integer from 0 to 23
- Ending hour: integer from 1 to 24
- The starting hour must be less than the ending hour.

## Java Code
Save the program as `BicycleRental.java`.

```java
import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting time (0-23): ");
        int startTime = input.nextInt();

        System.out.print("Enter ending time (1-24): ");
        int endTime = input.nextInt();

        if (startTime < 0 || startTime > 23 ||
            endTime < 1 || endTime > 24 ||
            startTime >= endTime) {
            System.out.println("Invalid time.");
            input.close();
            return;
        }

        int total = 0;

        for (int hour = startTime; hour < endTime; hour++) {
            int rate;

            if (hour < 7) {
                rate = 500;
            } else if (hour < 14) {
                rate = 1000;
            } else if (hour < 19) {
                rate = 1500;
            } else if (hour < 21) {
                rate = 1000;
            } else {
                rate = 500;
            }

            total += rate;
        }

        System.out.println("Total rental cost = " + total + " RWF");
        input.close();
    }
}
```

## Example
Input:
- Starting time: `13`
- Ending time: `16`

Output:
```text
Total rental cost = 4000 RWF
```

## Compile and Run
```bash
javac BicycleRental.java
java BicycleRental
```
