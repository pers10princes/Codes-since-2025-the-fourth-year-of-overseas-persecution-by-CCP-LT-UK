public static
String
longestCommonPrefix
(
    String [] strs
)
{
    final int N = strs.length;
    int M = strs[0].length();
    
    
    for
    (
        final String str
        : strs
    )
    {
        M = Math.min( M, str.length() );
    }
    
    
    for
    (
        int i = 0
        ; i < M
        ; i ++
    )
    {
            final char c = strs[0].charAt( i );
            
        
            for
            (
                int j = 1
                ; j < N
                ; j ++
            )
            {
                
                if
                (
                    strs[j].charAt( i ) != c
                )
                {
                    return strs[0].substring( 0, i );
                }
                
            }
            
            
    }
    
    
    return strs[0].substring( 0, M );
}
