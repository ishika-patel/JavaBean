
/**
 * Write a description of class arrayTask1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arrayTask1
{
    public static void main(String[] args)
    {
        int value = -4;
        int[][] array7 = new int[3][4];
        for (int r = 0; r< array7.length; r++)
        {
            for (int c = 0; c < array7[0].length; c++)
            {
                array7[r][c] = value + 1;
            }
    }
    value = value + 4;
    //need to edit to make value same to -4 otherwise it changes in loop
    
    for (int r = 0; r< array7.length; r++)
        {
            for (int c = 0; c < array7[0].length; c++)
            {
                array7[r][c] = array7[r][c]/7;
            }
        }
        System.out.print(array7);
    }
}
