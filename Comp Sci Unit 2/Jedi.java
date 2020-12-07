/**
 * Jedi training for Luke Skywalker
 *
 * @Ishika & Helen
 * 9/19/2018
 */
public class Jedi
{
    private String name;
    int forceLevel;
    
    public Jedi()
    {
        name = "Luke Skywalker";
        forceLevel = 3;
        
    }
    
    public Jedi(String n, int fL)
    {
        name = n;
        forceLevel = fL;
    }

    public String getName()
    {
        return name;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public int getForceLevel()
    {
        return forceLevel;
    }
    
    public void setForceLevel(int fL)
    {
        if (fL > 5 )
        {
        System.out.println("Force level cannot exceed level 5");
    }
        if (fL < 0 )
        {
        System.out.println("Force level cannot fall below level 0");
    }
        if (fL <= 5 && fL >= 0)
        {
            forceLevel = fL;
        }
        
    }
    
       public String toString()
    {
        return "Before his training, " + name + " had a force level of " + forceLevel + ".";
        
    }
    
    public int newFL()
    {
        return (forceLevel+1);
    }
    
    
}

