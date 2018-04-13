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

## Class(es), with fields and methods

Maze:
* A constructor to initialize a maze given a file path
* A constructor to initialize a maze given another maze
* A method to move the explorer in a certain direction
* A method to check if the explorer's current position is legal
* A field holding the location of the explorer
* toString method to help debug and visualize progress
 Maze Solver:
* A method to solve a maze

## version0 wishlist

* Working maze
* Maze solver

## Known bugs

* Walls sometimes disappear after being explored

