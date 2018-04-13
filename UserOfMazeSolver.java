/**
 *  A class that provides test cases for the MazeSolver class
 */

import java.io.FileNotFoundException;

public class UserOfMazeSolver {
    public static void main(String[] args) throws FileNotFoundException {
        MazeSolver ms = new MazeSolver();

        Maze m1 = new Maze("./mazes/4cell_treasureWest.txt", 0, 2);
        System.out.println(ms.solve(m1) + " ... expecting true ");

        Maze m2 = new Maze("./mazes/intersection_treasureNorth.txt", 2, 1);
        System.out.println(ms.solve(m2) + " ... expecting true ");

        Maze m3 = new Maze("./mazes/intersection_treasureNorth.txt", 2, 0); // Start in wall
        System.out.println(ms.solve(m3) + " ... expecting false ");
    }
}