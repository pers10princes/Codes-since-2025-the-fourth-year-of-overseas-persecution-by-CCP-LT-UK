class Solution
{
    private var arr1: Array < Int64 >
    private var arr2: Array < Int64 >
    private var m: Int64
    private var n: Int64
    private var total: Int64
    private var cache: Array < Array < Int64 > >




    init
    ()
    {
        this.arr1 = Array()
        this.arr2 = Array()
        this.m = 0
        this.n = 0
        this.total = 0
        this.cache = Array()
    }




    func minimumDeleteSum
    (
        s1: String
        , s2: String
    )
    : Int64
    {
        this.arr1 = this.getArray( s1 )
        this.arr2 = this.getArray( s2 )
        this.m = arr1.size
        this.n = arr2.size
        this.cache = Array( this.m, { _ => Array( this.n, repeat: -1 ) } )


        this.total - ( 2 * this.solve( 0, 0 ) )
    }




    private
    func
    getArray
    (
        s: String
    )
    : Array < Int64 >
    {
        let array = Array < Int64 > ( s.size, repeat: 0 )
        var i = 0


        for
        (
            c
            in
            s
        )
        {
            array[i] = Int64( c )
            this.total += array[i]

            i ++
        }


        array
    }




    private
    func
    solve
    (
        i: Int64
        , j: Int64
    )
    : Int64
    {

        if
        (
            i == this.m ||
            j == this.n
        )
        {
            return 0
        }
        else if
        (
            this.cache[i][j] != -1
        )
        {
            return this.cache[i][j]
        }


        var sum = this.solve( i + 1, j )


        for
        (
            k
            in
            j .. this.n
        )
        {

            if
            (
                this.arr1[i] == this.arr2[k]
            )
            {
                sum = max( sum, this.arr1[i] + this.solve( i + 1, k + 1 ) )
            }
            else
            {
                sum = max( sum, this.solve( i, k + 1 ) )
            }
            
        }


        this.cache[i][j] = sum
        

        sum
    }

}
