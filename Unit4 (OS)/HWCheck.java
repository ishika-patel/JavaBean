
/**
 * Write a description of class HWCheck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HWCheck
{
    public static void main(String[] args)
    {
        int[] scores = new int[3];
        int sum = 0;
        
        scores[0] = 8;
        scores[1] = 5;
        scores[2] = 7;
        
        for (int i = 0; i < 3; i++)
        {
            sum += scores[i];
        }
        System.out.println(sum/scores.length);
    }
}
