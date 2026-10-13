# Individual Lab 1 – Java Solutions

Two console programs written in plain Java (no external libraries).

| Problem | File | Purpose |
|---------|------|---------|
| 1 | `BicycleRental.java` | Calculates the price of a bicycle rental |
| 2 | `MushroomIdentifier.java` | Identifies a mushroom using at most three yes/no questions |

## How to compile and run

```bash
javac BicycleRental.java
java BicycleRental

javac MushroomIdentifier.java
java MushroomIdentifier
```

---

## Problem 1 – Bicycle Rental Calculator

### Rules from the assignment

- Input: two whole numbers, the starting hour and the ending hour.
- Start hour is between 0 and 23, end hour is between 1 and 24.
- Start is always less than end (a rental never spans more than one day).
- Decimal numbers are not accepted.

| Hour range | Rate per hour |
|------------|---------------|
| 0 – 7 and 21 – 24 | 500 RWF |
| 7 – 14 and 19 – 21 | 1000 RWF |
| 14 – 19 | 1500 RWF |

### Program flow

1. **START**
2. Ask for the starting time and the ending time.
3. If either value is outside its range (start 0–23, end 1–24), show an error and stop.
4. If the start time is not less than the end time, show an error and stop.
5. Set `totalCost = 0`.
6. **Loop** with `hour` going from `startTime` up to (but not including) `endTime`. Each pass represents one hour of rental:
   1. If `hour < 7` or `hour >= 21` → add 500
   2. Else if `hour < 14` or `hour >= 19` → add 1000
   3. Else → add 1500
7. Display `totalCost`.
8. **END**

### Why each hour is billed separately

A rental can cross several price zones (for example 13h to 16h touches the 1000 and 1500 zones). Billing hour by hour using the hour the slot begins in guarantees every hour gets the right rate without special-case logic.

### Example

Input: start `6`, end `15`

| Hour slot | Rate |
|-----------|------|
| 6 | 500 |
| 7 – 13 (7 hours) | 7 × 1000 = 7000 |
| 14 | 1500 |

Total = 500 + 7000 + 1500 = **9000 RWF**

---

## Problem 2 – Mushroom Identifier

### Mushroom characteristics

| Mushroom | Gills | Habitat | Ring | Convex cup |
|----------|-------|---------|------|------------|
| Agaric Jaunissant | Yes | Meadow | Yes | Yes |
| Amanite tue-mouche | Yes | Forest | Yes | Yes |
| Cepe de Bordeaux | No (pores) | Forest | No | No |
| Coprin chevelu | Yes | Meadow | Yes | No |
| Girolle | Yes | Forest | No | No |
| Pied bleu | Yes | Forest | No | Yes |

### Choosing the questions

Only three of the four questions may be asked, so the order matters. Six mushrooms need at least three yes/no answers to be told apart, so every question has to split the remaining candidates as evenly as possible.

- **Forest?** splits the six into four forest mushrooms and two meadow mushrooms.
- **Convex cup?** then splits the forest group into `{Amanite, Pied bleu}` and `{Cepe, Girolle}`, and splits the meadow group into `{Agaric}` and `{Coprin}`.
- The third question (ring or gills) only separates the remaining pair.

The **forest → cup → ring/gills** order is the one that always finishes within three questions.

### Program flow (decision tree)

```
START
 |
 Q1: Does it grow in a forest?
 |
 +-- NO (meadow)
 |     |
 |     Q2: Does it have a convex cup?
 |     +-- YES --> Agaric Jaunissant
 |     +-- NO  --> Coprin chevelu
 |
 +-- YES (forest)
       |
       Q2: Does it have a convex cup?
       |
       +-- YES
       |     |
       |     Q3: Does it have a ring?
       |     +-- YES --> Amanite tue-mouche
       |     +-- NO  --> Pied bleu
       |
       +-- NO
             |
             Q3: Does it have gills?
             +-- YES --> Girolle
             +-- NO  --> Cepe de Bordeaux
END
```

### Step-by-step description

1. **START**, display the list of six mushrooms and ask the user to think of one.
2. Ask **"Does your mushroom grow in a forest?"** and store the answer.
3. Ask **"Does your mushroom have a convex cup?"** and store the answer.
4. **If forest = yes**
   - **If convex cup = yes**: ask about the ring. Ring means Amanite tue-mouche, no ring means Pied bleu.
   - **If convex cup = no**: ask about gills. Gills means Girolle, no gills (pores) means Cepe de Bordeaux.
5. **If forest = no**
   - Convex cup means Agaric Jaunissant, no convex cup means Coprin chevelu. No third question is needed.
6. Print the identified mushroom.
7. **END**

### Input validation

An answer of `yes` (any letter case) counts as yes; any other answer counts as no.

---

## Style notes

- Simple, beginner-friendly code using only `Scanner`, `if / else` and a `for` loop.
- No comments; variable names describe their purpose (`startTime`, `totalCost`, `growsInForest`, `hasConvexCup`).
