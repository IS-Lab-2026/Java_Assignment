# Bicycle Rental Calculator (Java)

## Description
This console program calculates the cost of a bicycle rental from a starting hour to an ending hour. It charges for each hour in the rental period according to the specified hourly rates.

## Hourly rates

| Hour of rental | Rate per hour |
|---|---:|
| 00:00–07:00 | 500 RWF |
| 07:00–14:00 | 1,000 RWF |
| 14:00–19:00 | 1,500 RWF |
| 19:00–21:00 | 1,000 RWF |
| 21:00–24:00 | 500 RWF |

The ending hour is not charged as an additional hour. For example, a rental from hour 6 to hour 9 costs 500 + 1,000 + 1,000 = 2,500 RWF.

## Requirements
- Java Development Kit (JDK) installed.
- A terminal or command prompt.

## Compile
Open a terminal in the folder containing `BicycleRental.java` and run:

```bash
javac BicycleRental.java
```

## Run

```bash
java BicycleRental
```

Enter the starting hour (0–23), then the ending hour (1–24). Both inputs must be whole numbers, and the start must be less than the end.

## Example

```text
Enter starting hour (0-23): 6
Enter ending hour (1-24): 9
Total rental cost: 2500 RWF
```

## Implementation notes
The program loops through every rented hour and adds the rate for that hour. It rejects values outside the allowed ranges and rentals where the starting hour is not less than the ending hour.

# Mushroom Identifier (Java)

## Description
This console program tries to identify one of six mushrooms from the user's truthful yes/no answers to questions about its characteristics. It asks no more than three questions and chooses each question to split the remaining candidates as evenly as possible.

## Mushrooms and characteristics

The characteristics are stored in this order: gills, grows in a forest, has a ring, has a convex cup.

| Mushroom | Gills | Forest | Ring | Convex cup |
|---|---|---|---|---|
| Agaric jaunissant | Yes | No | Yes | Yes |
| Amanite tue-mouche | Yes | Yes | Yes | Yes |
| Cèpe de Bordeaux | No | Yes | No | No |
| Coprin chevelu | Yes | No | Yes | No |
| Girolle | Yes | Yes | No | No |
| Pied bleu | Yes | Yes | No | Yes |

## Requirements
- Java Development Kit (JDK) installed.
- A terminal or command prompt.

## Compile
Open a terminal in the folder containing `MushroomIdentifier.java` and run:

```bash
javac -encoding UTF-8 MushroomIdentifier.java
```

## Run

```bash
java MushroomIdentifier
```

Think of one of the six mushrooms and answer each displayed question with `yes` or `no`.

## Important limitation
The four supplied characteristics cannot always identify every mushroom uniquely in only three questions. For example, some mushrooms share the same answers to several characteristics. If three questions leave more than one candidate, the program lists the remaining possibilities instead of guessing. It asks no more than three questions, as required.

## Implementation notes
- Each mushroom is represented by its four boolean characteristics.
- After each answer, mushrooms that do not match are removed.
- The next question is chosen to divide the remaining candidates into two groups as evenly as possible.
- Answers other than `yes` or `no` are rejected and prompted again.

