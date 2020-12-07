
/**
 * Descirbe a cat's name and its lives
 *
 * @ipatel
 * @09/17/2018
 */
public class Cat
{
    // instance variables - replace the example below with your own
    private String name;
    private int numLives;

    /**
     * Constructor for objects of class Cat
     */
    // default constructor
    public Cat()
    {
        // initialise instance variables
        name = "Garfield";
        numLives = 9;
    }
    // overload constructor
    public Cat(String catName, int lives)
    {
        name = catName;
        numLives = lives;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    // accesor method
    public String getName()
    {
        return name;
    }
    public int getLives()
    {
        return numLives;
    }
    public int lostLife()
    {
        return (numLives-1);
    }
    // mutator, modifier method
    public void setCat(String catName, int lives)
    {
        name = catName;
        numLives = lives;
    }
    
    public String toString()
    {
        return "The cat's name is  " + name + "\n" + name + " has " + numLives + " lives";
    
    }
}
