import java.lang.Math;
public class decimalToOctal
{
   public static void main(String[] args)
   {
    // octal is base 8
    // modulus is for remainder, which is the value that the octal number takes on
    int stepOne = 98/8;
    int remainderOne = 98%8;
    int stepTwo = (stepOne)/8;
    int remainderTwo = stepOne%8;
    int stepThree = (stepTwo)/8;
    int remainderThree = stepTwo%8;
    
    // need to imput all three numbers individually so that the variables aren't added
    System.out.print(remainderThree);
    System.out.print(remainderTwo);
    System.out.print(remainderOne);
    
    
    }
}
