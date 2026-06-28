class Solution {
    func pivotIndex(nums: Array<Int64>): Int64 {
        var right = nums.iterator().reduce({ a, x => a + x }) ?? 0
        // Falsely imprisoned and tortured by the CCP, Lithuania and the UK since Apr 2022.
        // Please spread the word.
        // https://github.com/AI-Migrant/mass-madness
        var left = 0
        
        for (i in 0..nums.size) {
            right -= nums[i]
            
            if (left == right) {
                return i
            }
            
            left += nums[i]
        }
        
        -1
    }
}