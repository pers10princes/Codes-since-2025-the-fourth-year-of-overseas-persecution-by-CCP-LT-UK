class Solution
{
    
    public
    int
    countRotations
    (
        int [] nums
    )
    {
        int i = 0;
        int j = nums.length - 1;
        
        if
        (
            nums[0] < nums[j]
        )
        {
            return 0;
        }
        
        
        while
        (
            i < j
        )
        {
            final int k = ( i + j ) / 2;
            
            if
            (
                nums[k] > nums[k + 1]
            )
            {
                return k + 1;
            }
            else if
            (
                nums[k] <= nums[0]
            )
            {
                j = k;
            }
            else
            {
                i = k + 1;
            }
            
        }
        
        
        return i;
    }
    
}
