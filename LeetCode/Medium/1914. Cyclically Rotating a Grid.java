class Solution {
    int[][] grid;
    int[][] ans;
    int k, m, n, p, q, r, s;


    public int[][] rotateGrid(int[][] grid, int k) {
        this.k = k;
        m = grid.length;
        n = grid[0].length;
        this.grid = grid;
        ans = new int[m][n];
        p = 0;
        q = m - 1;
        r = 0;
        s = n - 1;

        for (int i = Math.min(m, n) / 2; i > 0; i--) {
            fill(getArr());
            p++;
            q--;
            r++;
            s--;
        }

        return ans;
    }


    int[] getArr() {
        int[] arr = new int[(q - p + s - r) * 2];
        int j = 0;

        for (int i = r; i < s; i++) {
            arr[j++] = grid[p][i];
        }

        for (int i = p; i < q; i++) {
            arr[j++] = grid[i][s];
        }

        for (int i = s; i > r; i--) {
            arr[j++] = grid[q][i];
        }

        for (int i = q; i > p; i--) {
            arr[j++] = grid[i][r];
        }

        return arr;
    }


    void fill(int[] arr) {
        int o = arr.length;
        int j = k % o;

        for (int i = r; i < s; i++) {
            ans[p][i] = arr[j++];
            j %= o;
        }

        for (int i = p; i < q; i++) {
            ans[i][s] = arr[j++];
            j %= o;
        }

        for (int i = s; i > r; i--) {
            ans[q][i] = arr[j++];
            j %= o;
        }

        for (int i = q; i > p; i--) {
            ans[i][r] = arr[j++];
            j %= o;
        }
    }
}
