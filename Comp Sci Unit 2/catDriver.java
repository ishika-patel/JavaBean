
/**
 * Write a description of class catDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class catDriver
{
    public static void main(String[] args)
    {
        // object has been called
        Cat cat1 = new Cat();
        
        System.out.println(cat1.toString());
        
        Cat cat2 = new Cat("Felix",9);
        
        System.out.println(cat2.toString());
        
        String cat2Name = cat2.getName();
        int cat2Lives = cat2.getLives();
        System.out.println("The cat's name is " + cat2Name);
        System.out.println(cat2Name + " has " + cat2Lives + " lives");
        
        
        int cat1Life = cat1.lostLife();
        
        
        System.out.println(cat1.toString());   
        
        //call upon cat1 and insert the method sysntax = period between the two
        String cat1Name = cat1.getName();
        int cat1Lives = cat1.getLives();
        
        // elongated way
        
        
  
    }
    
}
