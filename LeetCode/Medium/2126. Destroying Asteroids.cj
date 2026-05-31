class Solution {
    func asteroidsDestroyed(mass: Int64, asteroids: Array<Int64>): Bool {
        asteroids.sort()
        var m = mass
        
        for (a in asteroids) {
            if (m < a) {
                return false
            }
            
            m += a
        }
        
        true
    }
}
