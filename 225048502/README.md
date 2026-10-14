
### 1. Import Scanner

```java
import java.util.Scanner;
```

- `import` makes a class from a Java package available to this program.
- `java.util` is the package containing `Scanner`.
- `Scanner` is used to read input from the keyboard.

### 2. Declare the class

```java
public class timemanager {
```

- `public` means the class can be accessed from outside its package.
- `class` declares a Java class.
- `timemanager` is the class name.
- `{` begins the class body.

The source filename is `timemanager.java`, matching the class name.

### 3. Main method

```java
public static void main(String[] args) {
```

This is the method Java runs first when starting this program.

- `public`: accessible to the Java runtime.
- `static`: can be called without first creating an object.
- `void`: returns no value.
- `main`: the program's entry-point method.
- `String[] args`: holds optional command-line arguments.
- `{` begins the method body.

### 4. Create a Scanner

```java
Scanner input = new Scanner(System.in);
```

Creates a Scanner object named `input`. `System.in` tells it to read keyboard input.

### 5. Ask for the starting time

```java
System.out.print("Enter starting time: ");
int begining = input.nextInt();
```

- `System.out.print(...)` displays the prompt without moving to a new line.
- `int` declares a whole-number variable.
- `begining` stores the starting hour (the variable is spelled this way in the supplied code).
- `=` assigns a value.
- `input.nextInt()` reads an integer entered by the user.

### 6. Ask for the ending time

```java
System.out.print("Enter ending time: ");
int end = input.nextInt();
```

Displays the ending-time prompt and stores the user's integer answer in `end`.

### 7. Validate the starting time

```java
if (begining < 0) {
    System.out.println("Invalid start time.");
} else if (begining > 23) {
    System.out.println("Invalid start time.");
}
```

- `if` tests a condition.
- `<` means less than. The first condition rejects a starting time below `0`.
- `else if` tests another condition when the earlier condition is false.
- `>` means greater than. The second condition rejects a starting time above `23`.
- `System.out.println(...)` prints a message and moves to the next line.

### 8. Validate the ending time

```java
else if (end < 1) {
    System.out.println("Invalid end time.");
} else if (end > 24) {
    System.out.println("Invalid end time.");
}
```

`end < 1` rejects ending times below `1`; `end > 24` rejects ending times above `24`. Each invalid condition prints `Invalid end time.`

### 9. Check that the start is earlier than the end

```java
else if (begining >= end) {
    System.out.println("Start time must be before end time.");
}
```

`>=` means greater than or equal to. This rejects a starting time that is the same as, or later than, the ending time.

### 10. Start calculating the cost

```java
else {
    int totalCost = 0;
    int currentHour = begining;
```

The `else` block runs only if none of the earlier validation conditions matched. `totalCost = 0` initializes the running cost, and `currentHour = begining` starts the calculation at the starting hour.

### 11. Repeat for each hour

```java
while (currentHour < end) {
```

`while` repeats its block as long as the condition is true. The loop stops when `currentHour` reaches `end`, so the ending hour is not included.

### 12. Add the rate for hours 0–6

```java
if (currentHour >= 0 && currentHour < 7) {
    totalCost = totalCost + 500;
}
```

`>=` means greater than or equal to. `&&` means AND, so both conditions must be true. For hours `0` through `6`, the program adds `500` RWF to the previous total.

### 13. Add the rate for hours 21–23

```java
else if (currentHour >= 21 && currentHour < 24) {
    totalCost = totalCost + 500;
}
```

For current hours `21`, `22`, or `23`, this branch adds `500` RWF.

### 14. Add the rate for hours 7–13

```java
else if (currentHour >= 7 && currentHour < 14) {
    totalCost = totalCost + 1000;
}
```

For current hours `7` through `13`, this branch adds `1,000` RWF.

### 15. Add the rate for hours 19–20

```java
else if (currentHour >= 19 && currentHour < 21) {
    totalCost = totalCost + 1000;
}
```

For current hours `19` and `20`, this branch adds `1,000` RWF.

### 16. Add the rate for hours 14–18

```java
else if (currentHour >= 14 && currentHour < 19) {
    totalCost = totalCost + 1500;
}
```

For current hours `14` through `18`, this branch adds `1,500` RWF.

### 17. Move to the next hour

```java
currentHour = currentHour + 1;
```

Adds one to `currentHour` so the loop processes the next hour and eventually stops.

### 18. Display the final cost

```java
System.out.println("Total rent cost: " + totalCost + " RWF");
```

Displays the text, the calculated value of `totalCost`, and the currency label `RWF`. The `+` operator joins these parts into one output message.

### 19. Close the Scanner

```java
input.close();
```

Closes the Scanner after the program has finished reading input.

### 20. Closing braces

The `}` symbols close the blocks opened by the class, `main` method, validation conditions, `while` loop, and `else` block.

## Hourly rate summary

| Current hour | Rate added |
|---|---:|
| 0–6 | 500 RWF per hour |
| 7–13 | 1,000 RWF per hour |
| 14–18 | 1,500 RWF per hour |
| 19–20 | 1,000 RWF per hour |
| 21–23 | 500 RWF per hour |

## Example

Starting time: `8`  
Ending time: `12`

The loop processes hours `8`, `9`, `10`, and `11`. Each adds `1,000` RWF:

`1,000 + 1,000 + 1,000 + 1,000 = 4,000 RWF`

Output:

```text
Total rent cost: 4000 RWF
```



