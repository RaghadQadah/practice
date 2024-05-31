import java.util.LinkedList;
import java.util.Queue;

public class numOfIslands {

//    public int numIslands(char[][] grid) {
//        if (grid == null || grid.length == 0) {
//            return 0;
//        }
//
//        int numIslands = 0;
//        int rows = grid.length;
//        int cols = grid[0].length;
//
//        // Directions for moving up, down, left, and right
//        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
//
//        // Iterate through each cell in the grid
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                if (grid[i][j] == '1') {
//                    numIslands++;
//                    bfs(grid, i, j, directions);
//                }
//            }
//        }
//
//        return numIslands;
//    }
//
//
//    private void bfs(char[][] grid, int i, int j, int[][] directions) {
//        int rows = grid.length;
//        int cols = grid[0].length;
//
//        Queue<int[]> queue = new LinkedList<>();
//        queue.add(new int[]{i, j});
//        grid[i][j] = '0';
//
//
//        while (!queue.isEmpty()) {
//            int[] cell = queue.poll();
//            int row = cell[0];
//            int col = cell[1];
//
//            for (int[] dir : directions) {
//                int newRow = row + dir[0];
//                int newCol = col + dir[1];
//
//                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == '1') {
//                    queue.add(new int[]{newRow, newCol});
//                    grid[newRow][newCol] = '0';
//
//
//                }
//            }
//
//        }
//    }


    public int numIslands(char[][] grid) {
        int numIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {

                    numIslands++;
                    dfs(grid, i, j);
                }
            }
        }
        return numIslands;
    }

    private void dfs(char[][] grid, int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'0', '1', '1', '1', '0', '0', '0'},
                {'0', '0', '1', '1', '0', '1', '0'}
        };

        numOfIslands obj = new numOfIslands();
        System.out.println(obj.numIslands(grid));
    }
}

