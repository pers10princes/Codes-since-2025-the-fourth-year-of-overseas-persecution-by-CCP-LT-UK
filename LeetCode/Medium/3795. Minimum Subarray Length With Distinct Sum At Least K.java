class Solution
{
    
    public
    int
    minLength
    (
        int [] nums
        , int k
    )
    {
        final int N = nums.length;
        final HashMap <Integer, Integer > map = new HashMap <> ( N );
        long sum = 0;
        int answer = Integer.MAX_VALUE;  
        
        for
        (
            int i = 0
                , j = 0
            ; i < N
            ; i ++
        )
        {
            
            if
            (
                map.containsKey( nums[i] )
            )
            {
                map.put( nums[i], map.getOrDefault( nums[i], 0 ) +1 );
                
                continue;
            }
            
            map.put( nums[i], 1 );
            sum += nums[i];
            
            if
            (
                sum < k
            )
            {
                continue;
            }
            
            while
            (
                sum >= k
                && j <= i
            )
            {
                
                if
                (
                    map.get( nums[j] ) == 1
                )
                {
                    map.remove( nums[j] );
                    sum -= nums[j];
                }
                else
                {
                    map.put( nums[j], map.get( nums[j] ) - 1 );
                }
                
                j ++;
            }
            
            
            answer = Math.min( answer, i - j );
        }
        
        
        if
        (
            answer == Integer.MAX_VALUE
        )
        {
            return -1;
        }
        else
        {
            return answer + 2;
        }
        
    }
    
}
