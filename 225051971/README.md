# Java Assignment - Simple Code Explanation

This README explains the two Java programs in this folder in a simple way.

## File 1: assign1.java

This program calculates the total cost of electricity or service charges during a time range.

```java
package school;
```
- `package school;` tells Java that this class belongs to the `school` package.

```java
import java.util.Scanner;
```
- This imports the `Scanner` class, which is used to read user input from the keyboard.

```java
public class assign1 {
```
- Creates the Java class named `assign1`.

```java
public static void main(String[] args) {
```
- This is the main method, where the program starts running.

```java
int startHour;
int endHour;
int totalCost = 0;
```
- `startHour` stores the beginning time.
- `endHour` stores the ending time.
- `totalCost` starts at `0` and is used to add the total cost later.

```java
Scanner input = new Scanner(System.in);
Scanner input2 = new Scanner(System.in);
```
- Creates two `Scanner` objects to read the two time values.

```java
System.out.println("enter the starting hour: ");
startHour = input.nextInt();
```
- Prints a message asking the user for the start hour.
- Reads the number entered by the user.

```java
System.out.println("enter the ending hour: ");
endHour = input2.nextInt();
```
- Prints a message asking for the finish hour.
- Reads the end time from the user.

```java
if (startHour < 0 || endHour > 24 || startHour >= endHour) {
    System.out.println("invalid hours");
}
```
- Checks whether the entered hours are valid.
- If the start time is negative, the end time is more than 24, or the start time is not earlier than the end time, it prints `invalid hours`.

```java
for (int h = startHour; h < endHour; h++) {
```
- Starts a loop that goes through each hour from the start hour to just before the end hour.

```java
if ((h >= 0 && h < 7) || (h >= 21 && h < 24)) {
    totalCost += 500;
} else if ((h >= 7 && h < 14) || (h >= 19 && h < 21)) {
    totalCost += 1000;
} else if (h >= 14 && h < 19) {
    totalCost += 1500;
}
```
- This checks what time range the current hour falls in.
- If the hour is between 00:00 and 06:59 or 21:00 and 23:59, it adds `500`.
- If the hour is between 07:00 and 13:59 or 19:00 and 20:59, it adds `1000`.
- If the hour is between 14:00 and 18:59, it adds `1500`.
- `totalCost += ...` means "add this value to the total cost".

```java
System.out.println("the total cost= " + totalCost);
```
- Prints the final total amount calculated by the program.

```java
}
```
- Ends the `main` method.

```java
}
```
- Ends the class.

### Summary of assign1.java
This program asks for a start time and an end time, checks if they are valid, and calculates the cost based on the time of day.

---

## File 2: assign2.java

This program acts like a simple mushroom identification quiz. It asks a few yes/no questions and then tells the user which mushroom they are thinking of.

```java
package school;
```
- Declares that this class belongs to the `school` package.

```java
import java.util.Scanner;
```
- Imports the `Scanner` class to read user answers.

```java
public class assign2 {
```
- Defines the Java class named `assign2`.

```java
public static void main(String[] args) {
```
- Main method where the program starts.

```java
Scanner input = new Scanner(System.in);
char ans;
```
- Creates a scanner for input.
- Declares a variable `ans` to store the user's answer as a single character (`y` or `n`).

```java
System.out.println("Think of one of these mushrooms:");
```
- Displays the heading for the mushroom quiz.

```java
System.out.println(" Agaric jaunissant");
System.out.println(" Amanite tue-mouche");
System.out.println(" Cepe de bordeaux");
System.out.println(" Coprin chevelu");
System.out.println(" Pied bleu");
```
- Shows the list of mushrooms the user can think of.

```java
System.out.print("Does your mushroom grow in a forest? (y/n): ");
ans = input.next().charAt(0);
```
- Asks the user whether the mushroom grows in a forest.
- Reads the first letter of the answer and stores it in `ans`.

```java
if (ans == 'n') {
```
- If the answer is `n` (no), the program follows one path.

```java
System.out.print("Does your mushroom have a convex cap? (y/n): ");
ans = input.next().charAt(0);
```
- Asks another question: does the mushroom have a convex cap?

```java
if (ans == 'y') {
    System.out.println("Your mushroom is: Agaric jaunissant");
} else {
    System.out.println("Your mushroom is: Coprin chevelu");
}
```
- If the answer is `y`, it identifies the mushroom as `Agaric jaunissant`.
- Otherwise, it identifies it as `Coprin chevelu`.

```java
} else {
```
- This runs when the first answer is `y` (yes, it grows in a forest).

```java
System.out.print("Does your mushroom have gills? (y/n): ");
ans = input.next().charAt(0);
```
- Asks whether the mushroom has gills.

```java
if (ans == 'n') {
    System.out.println("Your mushroom is: Cepe de bordeaux");
} else {
```
- If there are no gills, the mushroom is `Cepe de bordeaux`.
- Otherwise, the program continues to another question.

```java
System.out.print("Does your mushroom have a ring? (y/n): ");
ans = input.next().charAt(0);
```
- Asks whether the mushroom has a ring around its stem.

```java
if (ans == 'y') {
    System.out.println("Your mushroom is: Amanite tue-mouche");
} else {
    System.out.println("Your mushroom is: Pied bleu");
}
```
- If the answer is `y`, the mushroom is `Amanite tue-mouche`.
- If not, the mushroom is `Pied bleu`.

```java
input.close();
```
- Closes the scanner to free up system resources.

```java
}
```
- Ends the `main` method.

```java
}
```
- Ends the class.

### Summary of assign2.java
This program asks the user a few yes/no questions to identify the mushroom they are thinking of using a decision tree.

---

## Final note
Both programs are simple Java programs that use:
- user input
- conditions (`if` and `else`)
- loops (`for`)
- output messages (`System.out.println`)

They are good examples of basic Java programming for academic study.
