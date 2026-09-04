package DAY6.Session3;
import java.util.*;

public class RatInMaze {

    static void solve(int[][] maze, int row, int col,String path, ArrayList<String> ans,int n, boolean[][] visited) {

        if (row == n - 1 && col == n - 1) {
            ans.add(path);
            return;
        }

        if (isSafe(maze, row + 1, col, n, visited)) {
            visited[row][col] = true;

            solve(maze, row + 1, col, path + "D",ans, n, visited);

            visited[row][col] = false;
        }

        if (isSafe(maze, row, col - 1, n, visited)) {
            visited[row][col] = true;

            solve(maze, row, col - 1, path + "L",ans, n, visited);

            visited[row][col] = false;
        }

        if (isSafe(maze, row, col + 1, n, visited)) {
            visited[row][col] = true;

            solve(maze, row, col + 1, path + "R",ans, n, visited);

            visited[row][col] = false;
        }

        if (isSafe(maze, row - 1, col, n, visited)) {
            visited[row][col] = true;

            solve(maze, row - 1, col, path + "U",ans, n, visited);

            visited[row][col] = false;
        }
    }

    static boolean isSafe(int[][] maze, int row, int col, int n, boolean[][] visited) {

        return row >= 0 && row < n &&col >= 0 && col < n && maze[row][col] == 1 && !visited[row][col];
    }

    public static ArrayList<String> findPaths(int[][] maze, int n) {

        ArrayList<String> ans = new ArrayList<>();

        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return ans;
        }

        boolean[][] visited = new boolean[n][n];

        solve(maze, 0, 0, "", ans, n, visited);

        return ans;
    }

    public static void main(String[] args) {

        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        int n = maze.length;

        ArrayList<String> paths = findPaths(maze, n);

        System.out.println(paths);
    }
}