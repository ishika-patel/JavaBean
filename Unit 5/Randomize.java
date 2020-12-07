
/**
 * Write a description of class Randomize here.
 *
 * @Ishika Patel
 * @01/10/2019
 */
public class Randomize
{
   public static void main(String[] args) {
       double numb;
       for(int i=0;i<500;i++) {
           numb = (int) (10 * Math.random()+4);
           System.out.print(numb + "\t");
           if (i%5==0) System.out.println();
        }
    }
}
