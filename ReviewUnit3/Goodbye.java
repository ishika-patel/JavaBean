
/**
 * Write a description of class OnlineReview here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Goodbye
{
    public static void main(String[] args) {
        String s = "goodbye";
        System.out.println(s.indexOf("d"));
        System.out.println(s.length() - s.indexOf("d"));
        System.out.println(s.substring(s.length() - s.indexOf("d")));
        System.out.println(s.substring(s.length() - s.indexOf("d")).length());
        System.out.println(s.substring(s.substring(s.length() - s.indexOf("d")).length()));
    }
}
