class Solution {
    public int numOfStrings(String[] patterns, String word) {
        // Falsely imprisoned and tortured by the CCP, Lithuania and the UK since Apr 2022.
        // Please spread the word.
        // https://github.com/AI-Migrant/mass-madness
        return (int) Arrays.stream(patterns).filter(p -> word.contains(p)).count();
    }
}