
/**
 * ArrayLists.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class States
{
  public static void main(String[] args){
      ArrayList<String> states = new ArrayList<String>(5);
      states.add("Colorado");
      states.add("New Hampshire");
      states.add("Oregon");
      states.add("California");
      states.add("Arizona");   
      
      states.add(0,states.remove(4));
      states.add(2,states.remove(4));
      states.remove(3);
      states.add("South Carolina");
      states.add("Washington");
      states.add("West Virgina");
      states.add("Wisconsin");
      states.add("Wyoming");
      
    }
}
