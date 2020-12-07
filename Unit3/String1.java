
/**
 * String1prints out the length of the string, and prompts the user to enter two integers from 1 and prints that. 
 *
 * Ishika Patel
 * 10/08/2018
 */

import java.util.Scanner;
public class String1
{
    public static void main(String []args)
    {
     System.out.println("Enter your string");
     // Creating an object in Scanner class
     Scanner string = new Scanner(System.in);
     // initializng variable and declaring object name
     // Method "nextLine" is used to gather user input
     String userString = string.nextLine();
    
     
     System.out.println("your string has a length of " + userString.length() + " Enter the numbers you want to look between.");
     
     Scanner number1 = new Scanner(System.in);
     Scanner number2 = new Scanner(System.in);
     int userNumber1 = number1.nextInt();
     int userNumber2 = number2.nextInt();
     
     
     String part = userString.substring(userNumber1 - 1,userNumber2);
     
     
     System.out.println("The part of the string between " + userNumber1 + " and " + userNumber2 + " is: " + part);
     
    }
}