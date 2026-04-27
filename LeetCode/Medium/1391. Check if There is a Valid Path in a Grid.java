class Solution {
    private static final int[][][] streets = { { { 0, 0 }, { 1, 1 } }, { { 0, 1 }, { 0, -1 } }, { { -1, 0 }, { 1, 0 } }, { { 0, -1 }, { 1, 0 } }, { { 0, 1 }, { 1, 0 } }, { { -1, 0 }, { 0, -1 } }, { { -1, 0 }, { 0, 1 } } };


    public boolean hasValidPath(int[][] grid) {
        return solve(grid, streets, new boolean[grid.length][grid[0].length], streets[grid[0][0]][0][0], streets[grid[0][0]][0][1], 0, 0);
    }


    private boolean solve(final int[][] grid, final int[][][] streets, final boolean[][] cache, final int px, final int py, final int x, final int y) {
        if (x < 0 || x == grid.length || y < 0 || y == grid[0].length || cache[x][y])  {
            return false;
        }

        cache[x][y] = true;
        boolean p = false;
        boolean q = false;

        for (final int[] street : streets[grid[x][y]]) {
            if  (x + street[0] == px && y + street[1] == py) {
                if (x == grid.length - 1 && y == grid[0].length - 1) {
                    return true;
                }

                p = true;
            }

            if (solve(grid, streets, cache, x, y, x + street[0], y + street[1])) {
                q = true;
            }
        }

        return p && q;
    }
}