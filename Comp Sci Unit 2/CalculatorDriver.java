/**
 * class Calculator and its driver do the addition, subtraction, 
 multiplication, division, and modulus of those two numbers.

 *
 * @Ishika Patel
 * @09/20/2018
 */
public class CalculatorDriver
{
    public static void main(String[] args)
    {
        Calculator myCalculator = new Calculator(7,7.5);
        
        double numberAdd = myCalculator.getAdd();
        System.out.println("Addition: " + numberAdd);
        
        double numberSub = myCalculator.getSub();
        System.out.println("Subtraction: " + numberSub);
        
        double numberMult = myCalculator.getMult();
        System.out.println("Multiplication: " + numberMult);
     
        double numberDiv = myCalculator.getDiv();
        System.out.println("Division: " + numberDiv);
        
        double numberMod = myCalculator.getMod();
        System.out.println("Modulus: " + numberMod);
        
        // extra
        double challenge1 = numberAdd * 5 - 200;
        System.out.println("Challenge 1: " + challenge1);
        
    }
}