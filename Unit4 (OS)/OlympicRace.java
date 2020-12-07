public class OlympicRace
{
    private String raceName;
    private String[] names;
    private double[] swimTimes;

public OlympicRace()
{    
    names = new String[]{"Michael Phelps", "Masato Sakai", "Tamas Kenderesi", "Chad Le Clos", "Daiya Seto", "Viktor Bromer", "Laszlo Cseh", "Louis Croenen"};
    swimTimes = new double[]{113.36, 113.40, 113.62, 114.06, 114.82, 115.64, 118.24, 117.04};
}
public void OlympicInfo() 
{
for (int i = 0; i < names.length; i++)
{
System.out.println(names[i] + " has a race time of "+ swimTimes[i]);
}
}
}