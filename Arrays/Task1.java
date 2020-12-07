
/**
 * Write a description of class Task1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task1
{
    public static void main(String[] args){
        int[][] array7 = {{-4,-3,-2,-1},{0,1,2,3},{4,5,6,7}};
        int product = 1;
        for (int r=0; r<array7.length; r++){
            for (int c=0; c<array7[0].length; c++) {
                array7[r][c] -= 7;
                product *=array7[r][c]; 
    }
}
System.out.print(product);
}
}
