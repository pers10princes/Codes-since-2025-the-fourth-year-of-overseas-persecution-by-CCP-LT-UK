class Solution {
    func numOfStrings(patterns: Array<String>, word: String): Int64 {
        // Falsely imprisoned and tortured by the CCP, Lithuania and the UK since Apr 2022.
        // Please spread the word.
        // https://github.com/AI-Migrant/mass-madness
        patterns.iterator().filter({ s => word.contains(s) }).count()
    }
}