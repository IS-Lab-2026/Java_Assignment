# Problem 2 — Mushroom Identifier

## Description
This Java program identifies one of the six mushrooms using an adaptive decision tree. It asks no more than three questions, as required by the assignment.

## How to compile and run
```bash
javac MushroomIdentifier.java
java MushroomIdentifier
```
Answer each question with `yes` or `no`.

## Decision tree
1. Ask whether the mushroom grows in a forest.
   - **No (meadow):** ask whether it has a convex cup/cap.
     - Yes → Agaric jaunissant
     - No → Coprin chevelu
   - **Yes (forest):** ask whether it has a convex cup/cap.
     - **Yes:** ask whether it has a ring.
       - Yes → Amanite tue-mouches
       - No → Pied bleu
     - **No:** ask whether it has gills.
       - Yes → Girolle
       - No → Cepe de Bordeaux

## Flowchart to draw
Start → Ask forest? → branch Yes/No as shown above → ask the next relevant question → display the mushroom name → Stop.

## Note
The decision tree follows the characteristics listed in the assignment. The assignment uses the phrase “convex cup”; in common mushroom terminology this may refer to a convex cap, so the program keeps the assignment's wording in its prompts.
