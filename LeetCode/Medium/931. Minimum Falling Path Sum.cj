class Solution {
    func minFallingPathSum(grid: Array<Array<Int64>>): Int64 {
        let n = grid.size
        let p = n - 2
        let q = n - 1
        
        for (i in 1..n) {
            grid[i][0] += min(grid[i - 1][0], grid[i - 1][1])
            grid[i][q] += min(grid[i - 1][p], grid[i - 1][q])
            
            for (j in 1.. q) {
                grid[i][j] += min(grid[i - 1][j], min(grid[i - 1][j - 1], grid[i - 1][j + 1]))
            }
        }
        
        min(grid[q]) ?? q
    }
}