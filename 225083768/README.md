
 1. Bicycle Rental

 Description

The program asks for a starting hour and an ending hour, then computes the total rental cost. Each hour of rental is billed individually, and the hourly rate depends on the time of day.

Pricing

| Hours of the day | Rate per hour |

| 00:00 – 06:59 and 21:00 – 23:59 | 500 RWF |
| 07:00 – 13:59 and 19:00 – 20:59 | 1000 RWF |
| 14:00 – 18:59 | 1500 RWF |

An hour `h` is billed when `start <= h < end`. For example, renting from 8 to 10 bills the hours 8 and 9.

Input rules

- Starting hour: integer from **0 to 23**
- Ending hour: integer from **1 to 24**
- The starting hour must be **strictly less** than the ending hour

If any rule is broken, the program prints `Invalid input.` and stops.

Example runs


Enter starting hour (0-23): 8
Enter ending hour (1-24): 16
Total rental cost: 9000 RWF


(Hours 8–13 at 1000 RWF = 6000, hours 14–15 at 1500 RWF = 3000.)


Enter starting hour (0-23): 22
Enter ending hour (1-24): 24
Total rental cost: 1000 RWF


Enter starting hour (0-23): 15
Enter ending hour (1-24): 10
Invalid input.


 How it works

1. Reads `start` and `end` with `Scanner.nextInt()`.
2. Validates the range and order of the two values.
3. Loops over every hour from `start` up to (but not including) `end`.
4. Adds 500, 1000 or 1500 RWF to `totalCost` depending on the hour.
5. Prints the total.

 Compile and run

```bash
javac -d out BicycleRental.java
java -cp out com.mycompany.bicyclerental.BicycleRental
```

---

2. Mushroom Finder

 Description

An interactive guessing program based on a decision tree. The user thinks of one of six mushrooms, answers a few yes/no questions, and the program names the mushroom.

 Supported mushrooms

- Agaric jaunissant
- Coprin chevelu
- Amanite tue-mouche
- Pied bleu
- Girolle
- Cepe de bordeau

Decision tree

```
Grows in a forest?
├── No  → Has a convex cup?
│         ├── Yes → Agaric jaunissant
│         └── No  → Coprin chevelu
└── Yes → Has a convex cup?
          ├── Yes → Has a ring?
          │         ├── Yes → Amanite tue-mouche
          │         └── No  → Pied bleu
          └── No  → Has gills?
                    ├── Yes → Girolle
                    └── No  → Cepe de bordeau
```

Input rules

Answers must be `yes` or `no`. Input is trimmed and case-insensitive (`YES`, ` No `, etc. are accepted). Any other answer causes the question to be asked again.

Example run

```
Think of a mushroom (one of the six).
Does your mushroom grow in a forest? (yes/no): yes
Does your mushroom have a convex cup? (yes/no): no
Does your mushroom have gills? (yes/no): yes
Your mushroom is: Girolle
```

 How it works

- `ask(String question)` prints the question and loops until the user enters `yes` or `no`, then returns `true` or `false`.
- `main` uses nested `if`/`else` statements that mirror the decision tree above and stores the final answer in `result`.
- A single shared `Scanner` (static field) is used for all questions.

Compile and run

```bash
javac -d out MushroomFinder.java
java -cp out com.mycompany.mushroomfinder.MushroomFinder
```

---

## Running in NetBeans

1. Create (or open) a Java project and place each file in its matching package (`com.mycompany.bicyclerental` and `com.mycompany.mushroomfinder`).
2. Right-click the file and choose **Run File** (or press `Shift + F6`).
3. Type your input in the **Output** window at the bottom.
