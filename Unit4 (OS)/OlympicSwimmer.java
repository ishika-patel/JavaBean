
/**
 * Write a description of class OlympicSwimmer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OlympicSwimmer
{
    private String name;
    private String gender;
    private String country;
    private int gold;
    private int silver;
    private int bronze;
    private double raceTime;
    
    public OlympicSwimmer()
    {
        name = "Michael Phelps";
        gender = "male";
        country = "United States";
        gold = 23;
        silver = 3;
        bronze = 2;
        raceTime = 51.25;
    }
    
    public OlympicSwimmer(String n, String g, String c, int gd, int s, int b, double r)
    {
        name = n;
        gender = g;
        country = c;
        gold = gd;
        silver = s;
        bronze = b;
        raceTime = r;
    }
    
    public String toString()
    {
        return "The swimmer's name is " + name + ". The swimmer is a " + gender + " swimming for " + country + ". " +
        name + " has earned " + gold + " gold medals, " + silver + " silver medals, " + bronze + " bronze medals. " + 
        name + "'s racetime is " + raceTime + ".";
}
}