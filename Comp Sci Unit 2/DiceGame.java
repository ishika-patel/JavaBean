
/**
 * class DiceGame is a simulation of rolling two die and trying to roll a 7. If you roll a 7 you win the game.
 *
 * Ishika Patel
 * 09/07/2018
 */
import java.lang.Math;
public class DiceGame
{
    public static void main(String[] args)
    {
    int numberA = (int) (Math.random () * 6 + 1);
    int numberB = (int) (Math.random () * 6 + 1);
    // for random number generator, multiply expression by max number generated
    int totalRoll = (int) numberA + numberB;
    System.out.println("You rolled a " + numberA + " and a " + numberB + ".");
        if (totalRoll == 7)
    // REMINDER: boolean had different notation, dont forget double equals sign!
        {
            System.out.println("Yes! Your roll is a 7. You win!");
        } else {
            System.out.println("Sorry your total roll is " + totalRoll + ". \nBetter luck next time!");
        }    
    }
}