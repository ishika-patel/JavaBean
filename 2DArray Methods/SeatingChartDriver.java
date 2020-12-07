public class SeatingChartDriver
{
    public static void main (String[] args)
    {
        SeatingChart test1 = new SeatingChart();
        
        test1.printmyArray();
        System.out.println(test1.getClassNum());
        System.out.println(test1.countC());
        test1.changeCs("Fred");
        test1.printmyArray();
        /* uncomment the code to test each method
         test1.printmyArray();
         * System.out.println(test1.getClassNum());
         * System.out.println(test1.countC());
         * 
         *
         * test1.changeCs("Fred");
         * test1.printmyArray();
         * 
         * System.out.println(test1.count5());
         * 
         * test1.switchRows();
         * test1.printMyArray();
        */
        
    }
}