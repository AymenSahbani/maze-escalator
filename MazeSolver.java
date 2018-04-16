/**
 *  A Maze Solver class that takes a Maze in solve() and finds if there is a valid solution
 */

public class MazeSolver {
    private static final int[] directions = {Maze.EAST, Maze.NORTH, Maze.WEST, Maze.SOUTH};

    public boolean solve(Maze maze){
        if(maze.explorerIsOnA() == Maze.WALL || maze.explorerIsOnA() == Maze.PATH)
            return false;
        if(maze.explorerIsOnA() == Maze.TREASURE){
            System.out.println(maze);
            return true;
        }
        maze.dropA(Maze.PATH);   // Prevent the explorer from going back

        for(int direction: directions){
            Maze snapshot = new Maze(maze);
            snapshot.go(direction);
            if(solve(snapshot)){
                return true;
            }
        }
        return false;
    }
}