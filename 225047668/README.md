# Java Mini Projects: Control Statements and Loops

Two console programs written in Java to practise **variables, operators, decision control statements and repetition statements (loops)**.

| # | Project | Main technique | File |
|---|---|---|---|
| 1 | Bicycle Rental Shop | `for` loop with `if / else if / else` | `BicycleRentalShop.java` |
| 2 | Mushroom Identifier | Nested `if / else` with `while` and `do-while` loops | `MushroomIdentifierLoop.java` |

---

## Table of Contents

1. [Concepts Practised](#concepts-practised)
2. [Requirements](#requirements)
3. [How to Run](#how-to-run)
4. [Project 1: Bicycle Rental Shop](#project-1-bicycle-rental-shop)
5. [Project 2: Mushroom Identifier](#project-2-mushroom-identifier)
6. [Flowcharts](#flowcharts)
7. [Project Files](#project-files)
8. [Possible Improvements](#possible-improvements)

---

## Concepts Practised

| Concept | Project 1 | Project 2 |
|---|---|---|
| Variables and data types | `int` for hours, counters, total | `String` for answers |
| Arithmetic operators | `+`, `-`, `*`, `+=`, `++` | not used |
| Comparison and logical operators | `<`, `>=`, `\|\|`, `!` | `equals`, `\|\|` |
| Decision control (`if`, `else if`, `else`) | rate selection, validation | decision tree |
| Repetition (`for`, `while`, `do-while`) | `for` over rental hours | answer checking, play again |
| Input and output | `Scanner`, `println` | `Scanner`, `println` |

---

## Requirements

- Java Development Kit (JDK) 8 or later
- An IDE such as NetBeans, or a command line

## How to Run

### In NetBeans

1. Open the `.java` file in your project.
2. Make sure the first line matches your project package, for example `package com.mycompany.bicyclerentalshop;`.
3. Click **Run** and type your answers in the Output window.

### From the command line

Remove the `package` line from the file first, then:

```bash
javac BicycleRentalShop.java
java BicycleRentalShop

javac MushroomIdentifierLoop.java
java MushroomIdentifierLoop
```

---

## Project 1: Bicycle Rental Shop

### Problem

Calculate the fee a customer pays for a bicycle rental. The user enters the **starting hour** and the **ending hour** as whole numbers.

**Rules**
- No decimals are accepted.
- Starting hour: 0 to 23. Ending hour: 1 to 24.
- The starting hour must be less than the ending hour.
- A rental cannot span more than one day.

**Rates per hour**

| Time of day | Rate |
|---|---|
| 0h - 7h and 21h - 24h | 500 RWF |
| 7h - 14h and 19h - 21h | 1000 RWF |
| 14h - 19h | 1500 RWF |

### Solution

1. Show the rates and instructions.
2. Read the two hours. Stop with an error message if either is not a whole number (`!input.hasNextInt()`).
3. Check the rules. Stop with an error message if one is broken.
4. Use a `for` loop that runs once per rental hour. In each pass, `h` is the hour starting at `h`, and the rate is chosen with an `if / else if / else` chain.
5. Print a breakdown and the total fee.

```java
for (int h = start; h < end; h++) {
    if (h < 7 || h >= 21) {
        hours500++;
        total += 500;
    } else if (h < 14 || h >= 19) {
        hours1000++;
        total += 1000;
    } else {
        hours1500++;
        total += 1500;
    }
}
```

### Sample run

```
Enter starting hour (0-23): 6
Enter ending hour (1-24): 15

Rental from 6h to 15h (9 hour(s))
  1 hour(s) x 500 RWF  = 500 RWF
  7 hour(s) x 1000 RWF = 7000 RWF
  1 hour(s) x 1500 RWF = 1500 RWF
Total rental fee: 9000 RWF
```

### Test cases

| Start | End | Expected |
|---|---|---|
| 6 | 8 | 1500 RWF |
| 13 | 15 | 2500 RWF |
| 6 | 15 | 9000 RWF |
| 21 | 24 | 1500 RWF |
| 0 | 24 | 21500 RWF |
| 15 | 13 | Invalid times message |
| 7.5 | 10 | Invalid input message |
| 5 | 25 | Invalid times message |

---

## Project 2: Mushroom Identifier

### Problem

The user thinks of one of six mushrooms. The program asks **at most three** of four yes/no questions and names the mushroom.

Mushrooms: Agaric jaunissant, Amanite tue-mouche, Cepe de bordeaux, Coprin chevelu, Girolle, Pied bleu.

| Mushroom | Gills | Forest | Ring | Convex cup |
|---|---|---|---|---|
| Agaric jaunissant | yes | no | yes | yes |
| Amanite tue-mouche | yes | yes | yes | yes |
| Cepe de bordeaux | no | yes | no | no |
| Coprin chevelu | yes | no | yes | no |
| Girolle | yes | yes | no | no |
| Pied bleu | yes | yes | no | yes |

### Solution

The first question is **"Does it have a ring?"** because it splits the six mushrooms into two groups of three. Each group is then separated with two more questions, so no path needs more than three.

```
Has a ring?
├── yes → Grows in a forest?
│         ├── yes → Amanite tue-mouche
│         └── no  → Convex cup?
│                   ├── yes → Agaric jaunissant
│                   └── no  → Coprin chevelu
└── no  → Has gills?
          ├── no  → Cepe de bordeaux
          └── yes → Convex cup?
                    ├── yes → Pied bleu
                    └── no  → Girolle
```

**Where loops are used**
- A `while` loop inside `askYesNo` keeps asking until the user types exactly `yes` or `no`.
- A `do-while` loop lets the user identify another mushroom without restarting.

### Sample run

```
Does your mushroom have a ring? (yes/no): no
Does your mushroom have gills? (yes/no): yes
Does your mushroom have a convex cup? (yes/no): no
Your mushroom is: Girolle
```

### Test cases

| Answers in order asked | Expected |
|---|---|
| ring: yes, forest: yes | Amanite tue-mouche |
| ring: yes, forest: no, cup: yes | Agaric jaunissant |
| ring: yes, forest: no, cup: no | Coprin chevelu |
| ring: no, gills: no | Cepe de bordeaux |
| ring: no, gills: yes, cup: yes | Pied bleu |
| ring: no, gills: yes, cup: no | Girolle |

---

## Flowcharts

Flowcharts for both projects are drawn by hand on A4 paper using the standard symbols:

| Symbol | Meaning |
|---|---|
| Oval | Start / End |
| Parallelogram | Input / Output |
| Rectangle | Process |
| Diamond | Decision (yes / no) |

- **Project 1:** the loop is drawn as an arrow from `h = h + 1` back to the `h < end ?` decision.
- **Project 2:** the decision tree is drawn from the "Has a ring?" diamond downwards, ending in six mushroom outcomes.


---

*Author:* MUGISHA Paradise *REG NO* 225047668 *Class:*Information Systems Department Year 2 *Date:* 13 October 2026
