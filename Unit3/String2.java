
/**
 * String2 removes a random character from that string and prints out whatever is left. 
 *
 * Ishika Patel
 * 10/08/2018
 */
import java.util.Scanner;
public class String2
{
    public static void main(String []args)
    {
    System.out.println("Enter your string:");
    
    Scanner string = new Scanner(System.in);
    String userString = string.nextLine();
    
    System.out.println("your string has a length of " + userString.length());
    System.out.println("Pick a number 1 through " + userString.length());
    
    Scanner number = new Scanner(System.in);
    int userNumber = number.nextInt();
    
    char missingChar = userString.charAt(userNumber-1);
    String missing = Character.toString(missingChar);
    // recived help from Adi to decipher how to change charater to string
    // resource: https://www.javatpoint.com/java-char-to-string
       
    System.out.println("Your new string: " + userString.replace(missing,""));
}
}
    
    
    
   