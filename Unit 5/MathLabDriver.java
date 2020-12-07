
/**
 * Write a description of class MathLabDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathLabDriver
{
    public static void main(String[] args) {
   MathClassLab testingObject = new MathClassLab();
   System.out.println("numTails(100): " + testingObject.numTails(100));
   System.out.println("count rolls(3,-4): " + testingObject.countRolls(3,-4));
   System.out.println("Magic 8 ball shake answer: " + testingObject.magic8Ball("yes"));
   System.out.println("Medical Study: " + testingObject.medicalStudy(122));
}


}