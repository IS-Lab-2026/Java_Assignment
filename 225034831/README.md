Java Lab 1: Bicycle Rental & Mushroom Finder

Two console programs written in Java for Individual Lab 1

 What it does 
>BicycleRental.java :Calculates the price of a bicycle rental from a start hour and an end hour 
>MushroomFinder.java :Guesses which of six mushrooms you are thinking of by asking yes/no questions 
 Project Structure

225034831
>README.md
> Bicylerental.java
> Mushroom.java
 
 How to Run
You need the Java Development Kit (JDK) installed. Open a terminal in the `225034831` folder, then compile and run each program.

Bicycle rental
javac Bicylerental.java
java Bicylerental

Mushroom finder
javac Mushroom.java
java MushroomF

 Problem 1: Bicycle Rental

The problem

A shop rents bicycles by the hour, but the price per hour changes during the day. The user types the hour the rental starts and the hour it ends. The program prints the total fee in RWF.

Rates

Hour `h` means the slot from `h:00` to `h+1:00`. For example, hour 6 is 06:00 to 07:00.

   Hours                Rate per hour 
 0 to 6 and 21 to 23 ---> 500 RWF 
7 to 13 and 19 to 20 ---> 1000 RWF 
 14 to 18 ---> 1500 RWF 
Input rules

- The start hour is a whole number from 0 to 23.
- The end hour is a whole number from 1 to 24.
- The start must be less than the end, so a rental stays within one day.

 How it works

The key idea is that one rental can pass through several price zones, so we cannot just multiply the number of hours by one rate. Instead, the program prices **each hour separately** and adds the prices up.

Step 1: Read the input. `Scanner` reads the start hour and the end hour as whole numbers (`int`).

Step 2: Check the input. A `boolean` variable called `valid` is true only when all three rules hold:

java
boolean valid = start >= 0 && start <= 23
             && end >= 1 && end <= 24
             && start < end;


`&&` means "and", so every condition must be true.

Step 3: Decide what to do. An `if / else` uses `valid`:

- If `valid` is "false", the program prints an error message and finishes.
- If `valid` is "true", it calculates the fee (steps 4 and 5).

Both branches reach the end of `main` naturally, so no `return` is needed.

Step 4: Loop over the hours. A `for` loop starts at `start` and runs while `h < end`, adding one to `h` each time:

java
for (int h = start; h < end; h++) { ... }

The loop stops before `end` because a rental that ends at 15:00 does not include the 15:00 to 16:00 slot.

Step 5: Pick the rate for each hour,Inside the loop, a chain of `if / else if / else` finds the price zone for `h` and adds it to `total`:

java
if (h < 7 || h >= 21) {
    total += 500;          // 0-6 and 21-23
} else if (h < 14 || h >= 19) {
    total += 1000;         // 7-13 and 19-20
} else {
    total += 1500;         // 14-18
}

`||` means "or". The order of the checks matters. The cheapest hours are tested first. Anything left that is before 14 or from 19 on must be 7-13 or 19-20. Whatever is still left can only be 14-18, so the final `else` needs no condition.

Step 6: Print the total after the loop ends.

 Worked example: start 6, end 15

| Hour `h` | Which check matches | Added | Running total |
|--->|--->|--->|--->|
| 6 | `h < 7` | 500 | 500 |
| 7 | `h < 14` | 1000 | 1500 |
| 8 | `h < 14` | 1000 | 2500 |
| 9 | `h < 14` | 1000 | 3500 |
| 10 | `h < 14` | 1000 | 4500 |
| 11 | `h < 14` | 1000 | 5500 |
| 12 | `h < 14` | 1000 | 6500 |
| 13 | `h < 14` | 1000 | 7500 |
| 14 | none (else) | 1500 | 9000 |

At `h = 15`, the loop condition `h < end` is false, so the loop stops. The program prints "9000 RWF".
Enter starting hour (0-23): 6
Enter ending hour (1-24): 15
Total rental fee: 9000 RWF

 Invalid input

Enter starting hour (0-23): 12
Enter ending hour (1-24): 8
Invalid input: start must be 0-23, end 1-24, and start < end.

Here `start < end` is false, so `valid` is false and the loop never runs.

 Problem 2: Mushroom 
 The problem

The user thinks of one of six mushrooms. The program asks yes/no questions and names the mushroom. It uses at most three questions.

The mushrooms are Agaric Jaunissant, Amanite tue-mouche, Cepe de Bordeaux, Coprin chevelu, Girolle and Pied bleu.

 Facts used

| Mushroom | Gills / pores | Habitat | Convex cup | Ring |
|--->|--->|--->|--->|--->|
| Agaric Jaunissant | Gills | Meadow | Yes | Yes |
| Amanite tue-mouche | Gills | Forest | Yes | Yes |
| Cepe de Bordeaux | Pores | Forest | No | No |
| Coprin chevelu | Gills | Meadow | No | Yes |
| Girolle | Gills | Forest | No | No |
| Pied bleu | Gills | Forest | Yes | No |
 How it works

The idea is to ask questions that "split the remaining possibilities", so each answer rules out some mushrooms until only one is left.

]Choosing the questions

The first question is "convex cup?". It splits the six mushrooms into two groups of three:

- "Yes:" Agaric Jaunissant, Amanite tue-mouche, Pied bleu
- "No",Cepe de Bordeaux, Coprin chevelu, Girolle

Each group then needs only two more questions:

- In the yes group, "forest?" separates Agaric (meadow) from the other two. "Ring?" then separates Amanite (ring) from Pied bleu (no ring).
- In the no group, "gills?" separates Cepe (pores) from the other two. "Forest?" then separates Girolle (forest) from Coprin chevelu (meadow).

So every path ends within three questions.

 Decision tree

```
convex cup?
├─ yes → forest?
│        ├─ no  → Agaric Jaunissant
│        └─ yes → ring?
│                 ├─ yes → Amanite tue-mouche
│                 └─ no  → Pied bleu
└─ no  → gills?
         ├─ no  → Cepe de Bordeaux
         └─ yes → forest?
                  ├─ yes → Girolle
                  └─ no  → Coprin chevelu

 In the code

"The helper method", The same kind of question is asked many times, so it is written once as a method:

java
static boolean ask(Scanner in, String question) {
    System.out.print(question + " (yes/no): ");
    String answer = in.next();
    return answer.equals("yes");
}

- It prints the question and reads the user's answer.
- `answer.equals("yes")` is `true` if the user typed `yes` and `false` otherwise.
- `return` sends that `true` or `false` back to whoever called `ask`.

`.equals()` is used instead of `==` because `==` does not reliably compare the text of two strings in Java.

"Using it in `if` statements" Because `ask` gives back a `boolean`, it can be used directly as a condition:

java
if (ask(in, "Does your mushroom have a convex cup?")) { ... }

A `!` in front means "not", so `!ask(in, "...forest?")` is true when the answer is "no".

"Following the tree" In `main`, nested `if / else` blocks match the decision tree exactly. Each question is one `if`, and each branch sets a variable `result` to the mushroom's name.

"Printing once" After all the branches, a single line prints the result:

java
System.out.println("\nYour mushroom is: " + result);

 Worked example: Girolle

You think of a Girolle (no convex cup, has gills, grows in a forest).

| Question | Your answer | What the program does |
|---|---|---|
| Convex cup? | no | goes to the `else` part, which asks about gills |
| Gills? | yes | has gills, so the next question is forest |
| Forest? | yes | sets `result = "Girolle"` |

Think of one of: Agaric Jaunissant, Amanite tue-mouche, Cepe de Bordeaux,
Coprin chevelu, Girolle, Pied bleu.

Does your mushroom have a convex cup? (yes/no): no
Does your mushroom have gills? (yes/no): yes
Does your mushroom grow in a forest? (yes/no): yes

Your mushroom is: Girolle

> Type answers in lowercase (`yes` or `no`). Any answer other than `yes` is treated as `no`.
 Concepts Practised

- Variables and data types (`int`, `String`, `boolean`)
- Operators: arithmetic (`+=`), comparison (`<`, `>=`) and logical (`&&`, `||`, `!`)
- Decisions: `if / else if / else`, nested `if`
- Repetition: the `for` loop
- Methods: a `static boolean` helper with parameters and `return`
- Reading input with `Scanner`
- Comparing strings with `.equals()`

Author:
> Name: Munezero Eden
> Reg number: 225034831
