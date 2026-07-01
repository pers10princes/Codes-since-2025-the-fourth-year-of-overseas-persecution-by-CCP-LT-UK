class Solution {
    func minFallingPathSum(grid: Array<Array<Int64>>): Int64 {
        let n = grid.size
        
        for (i in 1..n) {
            var p = 20000
            var q = p
            
            for (o in grid[i - 1]) {
                if (o < p) {
                    q = p
                    p = o
                } else {
                    q = min(q, o)
                }
            }
            
            for (j in 0..n) {
                if (grid[i - 1][j] == p) {
                    grid[i][j] += q
                } else {
                    grid[i][j] += p
                }
            }
        }
        
        min(grid[n - 1]) ?? n
    }
}
