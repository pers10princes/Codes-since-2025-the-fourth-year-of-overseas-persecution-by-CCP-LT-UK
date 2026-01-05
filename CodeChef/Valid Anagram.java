public static
boolean
isAnagram
(
    String s
    , String t
)
{
    
    if
    (
        s.length() != t.length()
    )
    {
        return false;
    }
    
    final HashMap < Character, Integer > hashMap = new HashMap <> ();
    
    
    for
    (
        final char c
        : s.toCharArray()
    )
    {
        hashMap.put( c, hashMap.getOrDefault( c, 0 ) + 1 );
    }
    
    
    for
    (
        final char c
        : t.toCharArray()
    )
    {
        
        if
        (
            !hashMap.containsKey( c )
            || hashMap.get( c ) < 1
        )
        {
            return false;
        }
        else
        {
            hashMap.put( c, hashMap.get( c ) - 1 );
        }
        
    }
    
    
    return true;
}
