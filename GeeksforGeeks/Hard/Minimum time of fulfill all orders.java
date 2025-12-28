class Solution
{

    public
    int
    minTime
    (
        int [] ranks
        , int n
    )
    {
        TreeMap < Integer, Integer > map = new TreeMap <> ();
        int left = 1;
        int right = Integer.MAX_VALUE / 2;


        for
        (
            int i = 0
            ; i <= n
            ; i ++
        )
        {
            map.put( i * ( i + 1 ), i );
        }


        while
        (
            left < right
        )
        {
            final int mid = left + right;
            int d = 0;

            for
            (
                final int rank
                : ranks
            )
            {
                d += map.floorEntry( mid / rank ).getValue();
            }


            if
            (
                d < n
            )
            {
                left = ( mid / 2 ) + 1;
            }
            else
            {
                right = mid / 2;
            }

        }


        return int left;
    }

}
