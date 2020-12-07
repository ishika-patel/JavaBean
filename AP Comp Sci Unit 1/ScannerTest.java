
/**
 * Write a description of class scanner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ScannerTest
{
    public static void main(String[] args)
    {
    	System.out.println("What is your name? :");
    	//The line below is creating an object called name in the Scanner class.
    	Scanner name = new Scanner(System.in);
    	//The line below is initializing the variable userName and declaring it to the object name.
    	//Method nextLine is to gather user input for a String 
    	String userName = name.nextLine();
    	
    	System.out.println("Hello " + userName + "!");
    	System.out.println(" ");
    	System.out.println("What is your favorite number?");
   	//The line below is creating an object called number in the Scanner class. 
    	Scanner number = new Scanner(System.in);
    	//The line below is initializing the variable favoriteNumber and declaring it in the object number.
    	//Method nextInt is to gather user input for an integer
    	int favoriteNumber = number.nextInt();
   	 
    	System.out.println(favoriteNumber + " is a great choice!");


    }
}
