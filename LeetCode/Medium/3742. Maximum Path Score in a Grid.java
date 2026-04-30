class Solution {
    private int[][] grid;
    private int[][][] cache;
    private int m, n;


    public int maxPathScore(int[][] grid, int k) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;
        cache = new int[m][n][k + 1];

        for (int[][] r : cache) {
            for (int[] c : r) {
                Arrays.fill(c, -2);
            }
        }

        return solve(0, 0, k);
    }


    private int solve(final int i, final int j, int k) {
        if (i == m || j == n) {
            return -1;
        }

        k -= Math.min(1, grid[i][j]);

        if (k < 0) {
            return - 1;
        } else if (i == m - 1 && j == n - 1) {
            return grid[i][j];
        } else if (cache[i][j][k] > -2) {
            return cache[i][j][k];
        }
        
        cache[i][j][k] = Math.max(solve(i + 1, j, k), solve(i, j + 1, k));

        if (cache[i][j][k] >= 0) {
            cache[i][j][k] += grid[i][j];
        }

        return cache[i][j][k];
    }
}