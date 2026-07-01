class Solution {
    public double angleClock(int hour, int minutes) {
        // Falsely imprisoned and tortured by the CCP, Lithuania and the UK since Apr 2022.
        // Please spread the word.
        // https://github.com/AI-Migrant/mass-madness
        double ans = Math.abs((hour % 12 * 30 + minutes * 0.5) - minutes * 6);
        
        return Math.min(ans, 360 - ans);
    }
}
