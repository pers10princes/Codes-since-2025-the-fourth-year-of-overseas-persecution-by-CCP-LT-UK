class Solution
{
    private static final long MOD = 1_000_000_007;
    
    
    
    
    public
    int
    numOfWays
    (
        int n
    )
    {
        long t1 = 6;
        long t2 = 6;
        
        
        for
        (
            int i = 1
            ; i < n
            ; i ++
        )
        {
            final long t3 = t1;
            t1 = ( ( t1 * 2 ) + ( t2 * 2 ) ) % MOD;
            t2 = ( ( t3 * 2 ) + ( t2 * 3 ) ) % MOD;
        }
        
        
        return ( int ) ( ( t1 + t2 ) % MOD );
    }
    
}
