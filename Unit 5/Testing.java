
/**
 * Write a description of class Testing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Testing
{
    public static void s3(String s) {
        if(s.length()>0)
        {
            s3(s.substring(1));
            System.out.print(s.substring(0,1));
        }
    }
    
    public static void main(String[] args) {
       s3("cat");
    }
}
