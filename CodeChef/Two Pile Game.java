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
            final int X = scanner.nextInt();
            final int Y = scanner.nextInt();
            
            if
            (
                X % 2 == 1
            )
            {
                System.out.println( "Alice" );
            }
            else
            {
                System.out.println( "Bob" );
            }
            
        }


        scanner.close();
    }

}
