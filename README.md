# maze-escalator

## Personnel

Jared Asch, Aymen Sahbani

## Problem Statement

Is it possible to get from the starting point to the treasure and if so, what is the shortest path?

## Recursive Abstraction

When asked how to find the path to the end of the maze from a square in the maze, the recursive abstraction can find a path to the end of the maze from an unvisited, open, adjacent square

## version0 wishlist

* Working maze
* Maze solver

## base case

The base case has been reached when the current square is the end/target square

## English or pseudocode description of algorithm

'''
if the current square is the end sqare
    return true and the current path
else
    for each adjacent square
        if the adjacent square is not a part of the current path and it is not a wall
            solve the maze starting from adjacent square
'''

## class(es), with fields and methods
