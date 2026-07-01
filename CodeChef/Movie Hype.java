import java.util.*;




public class Main
{

    public static
    void
    main
    (
        String args []
    )
    {
        final Scanner scanner = new Scanner( System.in );
        final int T = scanner.nextInt();


        for
        (
            int t = 0
            ; t < T
            ; t ++
        )
        {
            final int N = scanner.nextInt();
            int prev = scanner.nextInt();
            int answer = 100;
            
            
            for
            (
                int i = 1
                ; i <= N
                ; i ++
            )
            {
                final int next = scanner.nextInt();
                answer = Math.min( answer, Math.max( prev, next ) );
                prev = next;
            }
            
            
            System.out.println( answer );
        }


        scanner.close();
    }

}
