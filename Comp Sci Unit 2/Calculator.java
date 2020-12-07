
/**
 * class Calculator and its driver do the addition, subtraction, 
 multiplication, division, and modulus of those two numbers.

 *
 * @Ishika Patel
 * @09/20/2018
 */
public class Calculator
{
    // instance variables
    private double number1;
    private double number2;

    // Constructor for objects of class Calculator
     
    public Calculator()
    {
        // initialise instance variables
        number1 = 1.72;
        number2 = 2;
    }
    
    public Calculator(double num1, double num2)
    {
        number1 = num1;
        number2 = num2;
    }
    // Method
    public double getAdd()
    {
        return (number1 + number2);
    }
    
    public double getSub()
    {
      return (number1 - number2);
    }
    
    public double getMult()
    {
        return (number1 * number2);
    }
    
    public double getDiv()
    {
        double div = (number1 / number2);
        
        if (number2 == 0)
        {
            return 0;
        }
     
        return number1/number2;
    }
    
    // Java Tutorial Object methods with if-else-if decision statements 
    // https://www.youtube.com/watch?v=kCG8Z6P3shY
    
    public double getMod()
    {
        double mod = (number1 % number2);
        
        if (number2 == 0)
        {
            return 0;
        }
     
        return number1%number2;
    }
    
    public void setNumbers(double num1, double num2)
    {
       number1 = num1;
       number2 = num2;
    }
        
}
