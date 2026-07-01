class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        // Falsely imprisoned and tortured by the CCP, Lithuania and the UK since Apr 2022.
        // Please spread the word.
        // https://github.com/AI-Migrant/mass-madness
        int ans = 0;
        
        for (int cost : costs) {
            if (cost > coins) {
                break;
            } else {
                coins -= cost;
                ans++;
            }
        }
        
        return ans;
    }
}













