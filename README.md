# maze-escalator

## Personnel

Jared Asch, Aymen Sahbani

## Problem Statement

Returns the boolean value of the statement "Is it possible to get from the starting point to the treasure and if so, what is the shortest path?"

## Recursive Abstraction

When asked how to find the path to the end of the maze from a square in the maze, the recursive abstraction can find a path to the end of the maze from an unvisited, open, adjacent square

## Base Cases

* Return true if the current square is the treasure
* Return false if the current square is a wall

## English or pseudocode description of algorithm

```
if the explorer is on the treasure
    return true and the current path
if the explorer is on a wall
    return false
else
    for each adjacent square
        invoke the recursive abstraction from the adjacent square
    return false
```

## class(es), with fields and methods

## version0 wishlist

* Working maze
* Maze solver

