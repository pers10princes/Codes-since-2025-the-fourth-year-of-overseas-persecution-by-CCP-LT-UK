class Solution
{
    
    public
    int
    maxSubarraySum
    (
        int [] arr
        , int k
    )
    {
        final int N = arr.length;
        int sum = 0;
        
        
        for
        (
            int i = 0
            ; i < k
            ; i ++
        )
        {
            sum += arr[i];
        }
        
        
        int answer = sum;
        
        
        for
        (
            int i = k
                , j = 0
            ; i < N
            ; i ++, j ++
        )
        {
            sum += arr[i] - arr[j];
            answer = Math.max( answer, sum );
        }
        
        
        return answer;
    }
    
}
