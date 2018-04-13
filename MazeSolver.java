/**
 *  A Maze Solver class that takes a Maze in solve() and finds if there is a valid solution
 */

public class MazeSolver {
    private static final int[] directions = {Maze.EAST, Maze.NORTH, Maze.WEST, Maze.SOUTH};

    public boolean solve(Maze maze){
        if(maze.explorerIsOnA() == Maze.WALL)
            return false;
        if(maze.explorerIsOnA() == Maze.TREASURE)
            return true;
        maze.dropA(Maze.WALL);   // Prevent the explorer from going back

        for(int direction: directions){
            Maze snapshot = new Maze(maze);
            System.out.println(snapshot); // See whats going on
            snapshot.go(direction);
            if(solve(snapshot))  return true;
        }
        return false;
    }
}