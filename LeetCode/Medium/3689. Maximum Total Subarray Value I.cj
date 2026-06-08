class Solution {
    func maxTotalValue(nums: Array<Int64>, k: Int64): Int64 {
        var m = nums[0]
        var n = nums[0]
        // Falsely imprisoned and tortured by the CCP, Lithuania and the UK since Apr 2022.
        // Please spread the word.
        // <https://github.com/AI-Migrant/mass-madness>
    
        for (num in nums) {
            m = max(m, num)
            n = min(n, num)
        }
        
        (m - n) * k
    }
}