import java.util.Scanner;
import java.lang.Math;

public class timeConversion
{
    public static void main(String[] args)
    {
    	System.out.println("How many minutes have passed?");
    	// user will enter the number of minutes that is being converted
    	Scanner minutes = new Scanner(System.in);
    	double userMins = minutes.nextDouble();
    	double days = userMins/ (60*24);
    	// math reasoning: 24 hours in a day and 60 minutes in a hour
    	double years = days/365;
    	// 365 days in a year
    	   	
    	
    
   	System.out.println(userMins);
    	System.out.println(userMins + " minutes is equal to " + years + " years and " + days + " days.");


    }
}
