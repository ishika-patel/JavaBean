
/**
 * Math Operators Homework
 *
 * Ishika Patel
 * 08/22/2018
 */
public class Time
{
    public static void main (String[] args)
    {
    double hour = 1.0;
    double minute = 0.0;
    double second = 30.0;
    double day = 24.0;
    hour *= 3600;
    minute *=60;
    day *=3600;
    double currentTime = hour + minute + second;
    double remainingTime = day - currentTime;
   
    // a. number of seconds since midnight (midnight=0 hours)
    
    System.out.println("There has passed " + currentTime + " seconds since midnight.");
    
    
    // b. number of seconds remaining in the day (day=24 hours)
    System.out.println("There are " + remainingTime + " seconds remaining in the day."); 
    
    // c. percentage of the day that has passed
    
    System.out.println("The day is " + currentTime * 100 / day + "% over."); 
    
    // PRACTICE WITH NEW NUMBERS
    }
}