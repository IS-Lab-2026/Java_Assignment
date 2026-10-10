# Java Programs

This repository contains two small Java programs:

- `work` identifies one of six mushrooms by asking a sequence of yes/no questions.
- `home` calculates a bicycle rental cost from a starting hour to an ending hour, using different prices at different times of day.

Both programs use Java's `Scanner` class to read input from the keyboard. They are independent programs, so compile and run the one you want to use.
## Requirements

- A Java Development Kit (JDK) must be installed. The `javac` compiler and `java` launcher should be available in your terminal.
- Run commands from the directory containing the `.java` files.

Check the Java tools are available with:

```sh
javac -version
java -version
```

## Compile and Run

Compile either program:

```sh
javac work.java
javac home.java
```

Or compile both at once:

```sh
javac work.java home.java
```

Run a compiled program using its class name, without the `.java` or `.class` extension:

```sh
java work
```

```sh
java home
```
## work.java 
this java progrm is started by creating input function scanner which will help to input element using keyboard
and on line 17 we declared the variable answer which will help to hold input element from the user.
A simple Java console application that acts as an interactive guessing game to identify one of six specific types of mushrooms based on their physical characteristics and habitat.
Interactive Console Prompt: Asks the user a series of yes/no questions to narrow down the mushroom type.
Decision Tree Logic: Uses nested conditional statements ("if-else") to efficiently traverse characteristics such as rings, gills, habitat (forest), and cap shape.
Predefined Mushroom Database: Capable of identifying any of the following six mushrooms:
  1. Agaric jaunissant.
  2. Amanite tue-mouche.
  3. Cepe de Bordeaux.
  4. Coprin chevelu.
  5. Girolle.
  6. Pied bleu.

Compilation creates `.class` files. If using a recent Java version, you can also run a source file directly without a separate compile step:

```sh
java work.java
java home.java
```
