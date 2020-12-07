//this class tests code for Integer Practice
public class IntegerPracticeTester
{
    public static void main (String[] args)
    {
        IntegerPractice array1 = new IntegerPractice();
        array1.printMyArray();
        System.out.println(array1.getRow());
        System.out.println(array1.getColumn());
        System.out.println(array1.getUnder10());
        /* uncomment to test printMyArray, getRow,getColumn, and getUnder10
         * array1.printMyArray();
         * System.out.println(array1.getRow());
         * System.out.println(array1.getColumn());
         * System.out.println(array1.getUnder10());
         */
        
        array1.multiplyMyArray(5);
        array1.printMyArray();
        /* uncomment to test multiplyMyArray
         * array1.multiplyMyArray(5);
         * array1.printMyArray();
         */ 
        array1.switchRows();
        array1.printMyArray();
        /* uncomment to test switchRows
         * array1.switchRows();
         * array1.printMyArray();
         */ 
        
        
}
}