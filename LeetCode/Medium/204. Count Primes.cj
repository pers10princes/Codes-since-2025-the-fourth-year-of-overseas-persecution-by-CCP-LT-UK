class Solution
{
    private static const LENGTH = 5_000_000
    private static let primeArray = Array( LENGTH + 1, repeat: true )
    private static let primeCountArray = Array( LENGTH + 1, repeat: 0 )




    static
    init
    ()
    {
        var primeCount = 1


        for
        (
            i
            in
            4 ..= LENGTH : 2
        )
        {
            primeArray[i] = false
        }


        for
        (
            i
            in
            3 ..= LENGTH
        )
        {
            primeCountArray[i] = primeCount
            
            if
            (
                primeArray[i]
            )
            {
                primeCount ++


                for
                (
                    j
                    in
                    i + i ..= LENGTH : i
                )
                {
                    primeArray[j] = false
                }


            }


        }


    }




    func countPrimes
    (
        n: Int64
    )
    : Int64
    {
        primeCountArray[n]
    }

}
