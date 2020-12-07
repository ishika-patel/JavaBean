
/**
 * Write a description of class osm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class osm
{
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