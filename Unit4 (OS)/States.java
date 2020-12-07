import java.util.ArrayList;
/**
 * Write a description of class States here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class States
{
    public static void main(String[] args)
    {
        ArrayList<String> States = new ArrayList<String>();
        States.add("Colorado");
        States.add("California");
        States.add("Florida");
        States.add("Las Vegas");
        States.add("New York");
        
        States.add(0, States.remove(1));
        States.remove(2);
        States.add("Oregon");
        States.add("Pennsylvania");
        States.add("Texas");
        States.add("Washington");
        
    }
}
