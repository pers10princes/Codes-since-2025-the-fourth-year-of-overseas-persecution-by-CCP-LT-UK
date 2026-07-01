import java.util.*;




class Solution
{
    
    public static
    void
    main
    (
        String [] args
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
            final String S = scanner.next();
            final HashSet < Character > hashSet = new HashSet <> ();
            boolean match = false;
            
            
            for
            (
                final char c
                : S.toCharArray()
            )
            {
                
                if
                (
                    hashSet.contains( c )
                )
                {
                    System.out.println( "Yes" );
                    match = true;
                    
                    break;
                }
                else
                {
                    hashSet.add( c );
                }
                
            }
            
            
            if
            (
                !match
            )
            {
                System.out.println( "No" );
            }
            
        }
        
        
        scanner.close();
    }
    
}
