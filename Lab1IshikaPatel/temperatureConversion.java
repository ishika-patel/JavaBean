import java.lang.Math;
import java.util.Scanner;

public class temperatureConversion
{
   public static void main(String[] args)
       {
     System.out.println("What is the temperature in Fahrenheit today?");
     Scanner temp=new Scanner(System.in);
     // user will enter temperature number in degrees F in place of temp.nextDouble()
     double userTempF= temp.nextDouble();
     double tempConversionOne = (userTempF - 32);
     double tempConversionTwo = (tempConversionOne *5);
     double tempConversionThree = (tempConversionTwo/9);
     double tempC = tempConversionThree;
     
     System.out.println(userTempF);
     System.out.println(userTempF + " Fahrenheit is equal to " + tempC + " in Celsius");   
     
     
    }
}
