
/**
 * prints numbers from 1 to 100. multiple of 3 prints "fizz". multiple of 5 prints "buzz". multiple of 2 and 5 prints "fizzbuzz".
 *
 * Ishika Patel
 * 10/23/2018
 */
public class InterviewQ
{
    public static void main(String[] args)
    {
     for(int i = 1; i <=100; i++)      
     if (i%3 == 0 && i%5==0){
          System.out.println("FizzBuzz");
        }
      else if (i%3 == 0) {
          System.out.println("Fizz");
        }
      else if (i%5==0) {
          System.out.println("Buzz");
        }
     else{
     System.out.println(i);
    }
    }
}
