
/**
 * Write a description of class Review here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Review
{
    public static void main(String[] args){
        String word = "Hello there!";
        int total = 0;
        for (int i=0; i<word.length(); i++) {
        if (word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u') {
            total++;
        }
    }
    System.out.print("There are " + total + " vowels in " + word + ".");
    }
}

