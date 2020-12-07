
/**
 * Write a description of class RecursionPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecursionPractice
{
   public String s1(String s) {
       if (s.length() == 0)
       return "xyz";
       return s.substring(0,1) + s1(s.substring(1));       
   
    }
    public String s2(String s) {
        if(s.length()>0) 
        {
            System.out.print(s.substring(0,1));
            s2(s.substring(1));
        }
        
        return ".";
    }
     
    public void s3(String s) {
    { if (s.length()>0)
        {
            s3(s.substring(1));
            System.out.print(s.substring(0,1));
         }
        }          
}

public int a1(int[] a, int n) {
    if(n==0)
        return a[0];
    int m = a1(a,n-1);
    if (m>a[n])
        return m;
    else
        return a[n];
    }
}
