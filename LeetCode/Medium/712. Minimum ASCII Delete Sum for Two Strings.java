class Solution
{
    private int [] array1;
    private int [] array2;
    private int total;
    private int [][] cache;




    public
    int
    minimumDeleteSum
    (
        String s1
        , String s2
    )
    {
        this.array1 = this.getArray( s1 );
        this.array2 = this.getArray( s2 );
        this.cache = new int [ s1.length() ][ s2.length() ];


        for
        (
            int i = 0
            ; i < cache.length
            ; i ++
        )
        {
            Arrays.fill( cache[i], -1 );
        }


        return this.total - ( 2 * solve( 0, 0 ) );
    }




    private
    int []
    getArray
    (
        String s
    )
    {
        final int [] array = new int [ s.length() ];
        int i = 0;


        for
        (
            char c
            : s.toCharArray()
        )
        {
            array[i] = c;
            this.total += c;

            i ++;
        }


        return array;
    }




    private
    int
    solve
    (
        final int i
        , final int j
    )
    {

        if
        (
            i == this.array1.length
            || j == this.array2.length
        )
        {
            return 0;
        }
        else if
        (
            this.cache[i][j] != -1
        )
        {
            return this.cache[i][j];
        }

        int sum = solve( i + 1, j );


        for
        (
            int k = j
            ; k < this.array2.length
            ; k ++
        )
        {

            if
            (
                this.array1[i] == this.array2[k]
            )
            {
                sum = Math.max
                    (
                        sum
                        , this.array1[i] + this.solve( i + 1, k + 1 )
                    );
            }
            else
            {
                sum = Math.max( sum, this.solve( i, k + 1 ) );
            }
            
        }


        this.cache[i][j] = sum;


        return sum;
    }

}
