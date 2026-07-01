class Solution
{
    
    public
    int
    countSubstr
    (
        String s
        , int k
    )
    {
        final char [] array = s.toCharArray();
        final int N = array.length;
        final HashMap < Character, Integer > hashMap = new HashMap <> ();
        int i = 0;
        int p = 0;
        int q = -1;
        int answer = 0;
        
        
        while
        (
            i < N
            &&
            (
                hashMap.size() < k - 1
                || hashMap.containsKey( array[i] )
            )
        )
        {
            hashMap.put( array[i], hashMap.getOrDefault( array[i], 0 ) + 1 );
            
            i ++;
        }
        
        
        while
        (
            i < N
        )
        {
            hashMap.put( array[i], hashMap.getOrDefault( array[i], 0 ) + 1 );
            
            if
            (
                hashMap.size() > k
            )
            {
                q = p;
            }
            
            
            while
            (
                hashMap.size() > k
                || hashMap.get( array[p] ) > 1
            )
            {
                
                if
                (
                    hashMap.get( array[p] ) == 1
                )
                {
                    hashMap.remove( array[p] );
                }
                else
                {
                    hashMap.put( array[p], hashMap.get( array[p] ) - 1 );
                }
                
                p ++;
            }
            
            
            answer += p - q;
            
            i ++;
        }
        
        
        return answer;
    }
    
}
