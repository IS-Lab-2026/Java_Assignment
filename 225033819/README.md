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

Compilation creates `.class` files. If using a recent Java version, you can also run a source file directly without a separate compile step:

```sh
java work.java
java home.java
```
