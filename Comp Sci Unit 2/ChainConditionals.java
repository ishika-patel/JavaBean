
/**
 * Write a description of class ChainConditionals here.
 *
 * Ishika Patel
 * @version (a version number or a date)
 */
public class ChainConditionals
{
    public static void main(String[] args)
    {
    int x = 60;
    if (x%2 == 0)
    {
    System.out.println("multiple of 2");
    // dont close the code here to link the ifs
    if (x%3==0)
    {
    System.out.println("multiple of 3");}
    if (x%4 == 0)
    {
    System.out.println("multiple of 4");}
    if (x%5 ==0)
   {
   System.out.println("multiple of 5");}
}
else {
    System.out.println("Sorry");
// the else needs to encompass all of the if statements
}
}
}
