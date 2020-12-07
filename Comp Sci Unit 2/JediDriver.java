/**
 * Jedi Training Driver
 *
 * @Ishika & Helen
 * 9/19
 */
public class JediDriver
{
   public static void main(String[] args)
    {
        Jedi jediLuke = new Jedi();
        
        System.out.println("A long time ago in a galaxy far, far away...");
        System.out.println(jediLuke.toString());
        
        Jedi yoda = new Jedi("Yoda", 5);
        String yodaName = yoda.getName();
        int yodaFL = yoda.getForceLevel();
        System.out.println(yodaName + " the Master Jedi, has a force level of " + yodaFL + ".");
       
        int luke = jediLuke.newFL();
        System.out.println("Yoda trained Luke Skywalker.");
        System.out.println("After his training, Luke Skywalker had a force level of " + luke + ".");
    }
}

