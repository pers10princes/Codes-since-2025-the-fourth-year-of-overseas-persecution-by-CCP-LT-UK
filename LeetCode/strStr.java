class Solution
{
    
    public
    int
    strStr
    (
        String haystack
        , String needle
    )
    {
        int n = haystack.length();
        int o = needle.length();
        
        if
        (
            n < o
        )
        {
            return -1;
        }
        
        int [] array = new int [ n ];
        array[0] = -1;
        int i = 0;
        int j = -1;
        
        
        while

        (
            i < o
        )
        {
            array[i] = j;


            while
            (
                j >= 0
                && needle.charAt( i ) != needle.charAt( j )
            )
            {
                j = array[j];
            }


            i ++;
            j ++;
        }


        i = 0;
        j = 0;

        
        while
        (
            i < n
            && j < o
        )
        {

            
            while
            (
                j >= 0
                && haystack.charAt( i ) != needle.charAt( j )
            )
            {
                j = array[j];
            }


            i ++;
            j ++;
        }


        if
        (
            j == o
        )
        {
            return i - j;
        }
        else
        {
            return -1;
        }

    }

}
