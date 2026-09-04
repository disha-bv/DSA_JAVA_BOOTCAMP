package DAY8.Session3;
import java.util.*;


public class UniquePathsIIIMemoization {

    static int rows, cols;
    static int[][] grid;
    static int[][][] memo;

    public static int uniquePathsIII(int[][] grid) {

        UniquePathsIIIMemoization.grid = grid;

        rows = grid.length;
        cols = grid[0].length;

        int startR = 0;
        int startC = 0;
        int totalCells = 0;


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] != -1) {
                    totalCells++;
                }

                if (grid[i][j] == 1) {
                    startR = i;
                    startC = j;
                }
            }
        }


        int totalMasks = 1 << (rows * cols);

        memo = new int[rows][cols][totalMasks];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }

    
        int startBit = 1 << (startR * cols + startC);

        return dfs(startR, startC, startBit, totalCells);
    }

    static int dfs(int r, int c, int mask, int totalCells) {

        
        if (grid[r][c] == 2) {

            if (Integer.bitCount(mask) == totalCells) {
                return 1;
            }

            return 0;
        }

        if (memo[r][c][mask] != -1) {
            return memo[r][c][mask];
        }

        int count = 0;

    
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {

            int nr = r + dr[i];
            int nc = c + dc[i];

        
            if (nr < 0 || nr >= rows || nc < 0 || nc >= cols) {
                continue;
            }


            if (grid[nr][nc] == -1) {
                continue;
            }

        
            int nextBit = 1 << (nr * cols + nc);

            
            if ((mask & nextBit) != 0) {
                continue;
            }

            
            count += dfs(
                nr,
                nc,
                mask | nextBit,
                totalCells
            );
        }

        return memo[r][c][mask] = count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int[][] grid = new int[m][n];

        System.out.println("Enter the grid:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int answer = uniquePathsIII(grid);

        System.out.println("Number of unique paths: " + answer);

        sc.close();
    }
}