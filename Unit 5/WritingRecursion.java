
/**
 * Write a description of class WritingRecursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WritingRecursion
{
    public int fibonacci(int n)
    {
    if(n==0) {
        return 0;
    }
    if (n==1) {
        return 1;
        // starts the fib series
    }
    else {
        return fibonacci(n-1) + fibonacci(n-2);
        // fib(n-1) + fib(n-2) will get me the previous series of numbers and then the next number
    }
}
}
