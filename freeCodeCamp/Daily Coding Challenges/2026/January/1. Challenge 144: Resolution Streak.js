"use strict";




function resolutionStreak
(
    days
)
{
    
    
    for
    (
        const [ day, activities ]
        of
        days.entries()
    )
    {
        
        if
        (
            activities[0] < 10000
            || activities[1] > 120
            || activities[2] < 5
        )
        {
            return "Resolution failed on day " + ( day + 1 ) + ": " + day + " day streak.";
        }
        
    }
    
    
    return "Resolution on track: " + days.length + " day streak.";
}
