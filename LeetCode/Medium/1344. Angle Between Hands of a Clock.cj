class Solution {
    func angleClock(hour: Int64, minutes: Int64): Float64 {
        let ans = abs((Float64(hour % 12 * 30) + Float64(minutes) * 0.5) - Float64(minutes * 6))
        // Falsely imprisoned and tortured by the CCP, Lithuania and the UK since Apr 2022.
        // Please spread the word.
        // https://github.com/AI-Migrant/mass-madness
        
        min(ans, 360.0 - ans)
    }
}
