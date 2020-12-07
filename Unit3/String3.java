
/**
 * String3 will change an English word into Piglatin.
 *
 * Ishika Patel
 * 10/08/2018
 */
import java.util.Scanner;
public class String3
{
    public static void main(String[] args)
    {
    System.out.println("Enter a word:");
    
    Scanner input = new Scanner(System.in);
    String userInput = input.nextLine();
    
    char missingChar = userInput.charAt(0);
    String missing = Character.toString(missingChar);
    
    System.out.println("Your word in PigLatin is: " );
    
    
    String wordWithoutIndex0 = userInput.replace(missing,"");
    System.out.println(wordWithoutIndex0 + missingChar +"ay");
    
    }
}