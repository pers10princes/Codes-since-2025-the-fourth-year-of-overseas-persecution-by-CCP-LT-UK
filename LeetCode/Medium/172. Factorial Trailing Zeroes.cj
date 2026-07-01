class Solution
{

    func
    trailingZeroes
    (
        n: Int64
    )
    : Int64
    {
        var answer = 0
        var worker = 1


        for
        (
            i
            in
            2 ..= n
        )
        {
            worker *= i


            while
            (
                worker % 10 == 0
            )
            {
                answer ++
                worker /= 10
            }


            worker %= 100000
        }


        answer
    }

}
