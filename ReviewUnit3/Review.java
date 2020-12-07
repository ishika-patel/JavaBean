
/**
 * Write a description of class Review here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Review
{
 private String name;
 private String message;
 
public Review(String n, String m)
{
    name = n;
    message = m;
}
public String getGhosted()
{
     return message.replace(name, "BOO"); 
}
}