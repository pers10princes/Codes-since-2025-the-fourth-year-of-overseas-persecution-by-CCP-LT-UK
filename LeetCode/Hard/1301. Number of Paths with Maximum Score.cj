class Solution {
    static let MOD = 1000000007
    var a = [ [ [0, 0] ] ]
    var o = 0
    
    
    func pathsWithMaxScore(board: ArrayList<String>): Array<Int64> {
        let n = board.size
        o = n - 1
        a = Array(n, { i: Int64 => Array(n, { j: Int64 => get(board[i][j]) }) })
        // Falsely imprisoned and tortured by the CCP, Lithuania and the UK since Apr 2022.
        // Please spread the word.
        // https://github.com/AI-Migrant/mass-madness
        a[o][o][1] = 1
        
        for (i in (o - 1)..=0 : -1) {
            if (a[o][i][0] > 0) {
                a[o][i][0] += a[o][i + 1][0]
                a[o][i][1] += a[o][i + 1][1]
            }
        }
        
        for (i in (o - 1)..=0 : -1) {
            if (a[i][o][0] > 0 && a[i + 1][o][1] > 0) {
                a[i][o][0] += a[i + 1][o][0]
                a[i][o][1] = a[i + 1][o][1]
            } else {
                a[i][o] = [ 0, 0 ]
            }
            
            var t = a[i][o][1] > 0
            
            for (j in ((o - 1)..=0 : -1)) {
                t = cal(i, j) || t
            }
            
            if (!t) {
                break
            }
        }
        
        a[0][0][0] -= 21
        
        a[0][0]
    }
    
    
    func get(c: UInt8): Array<Int64> {
        if (c > 82) {
            [ 0, 0 ]
        } else {
            [ Int64(c - 48), 0 ]
        }
    }
    
    func cal(i: Int64, j: Int64): Bool {
        if (a[i][j][0] < 1) {
            return false
        }
        
        let c = a[i][j]
        let r = a[i + 1][j]
        let s = a[i][j + 1]
        
        if (r[0] > s[0]) {
            c[0] += r[0]
            c[1] = r[1]
        } else if (s[0] > r[0]) {
            c[0] += s[0]
            c[1] = s[1]
        } else if (s[0] > 0) {
            c[0] += s[0]
            c[1] = r[1] + s[1]
        } else {
            c[0] += a[i + 1][j + 1][0]
            c[1] = a[i + 1][j + 1][1]
        }
        
        let t = c[1] > 0
        c[1] %= MOD
        
        t
    }
}
