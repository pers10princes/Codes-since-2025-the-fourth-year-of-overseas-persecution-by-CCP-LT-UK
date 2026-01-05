class Solution
{
    
    public
    long
    maxMatrixSum
    (
        int [][] matrix
    )
    {
        int m = Integer.MAX_VALUE;
        long answer = 0;
        boolean o = false;
        boolean t = true;
        
        
        for
        (
            final int [] row
            : matrix
        )
        {
            
            
            for
            (
                final int num
                : row
            )
            {
                
                if
                (
                    num < 0
                )
                {
                    t = !t;
                    m = Math.min( m, -num );
                    answer += -num;
                }
                else if
                (
                    num > 0
                )
                {
                    m = Math.min( m, num );
                    answer += num;
                }
                else
                {
                    o = true;
                }
                
            }
            
            
        }
        
        
        if
        (
            o
            || t
        )
        {
            return answer;
        }
        else
        {
            return answer - ( m * 2 );
        }
        
    }
    
}
