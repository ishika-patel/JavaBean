/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"jack","queen","king"};
        String[] suits = {"blue", "red"};
        int[] pointValues = {11,12,13};
        Deck d = new Deck(ranks, suits, pointValues);

System.out.println("Deck 1 toString method reports:"); 
System.out.println("    " + d);  
System.out.println("The individual accessor method calls below should return the same values:"); 
System.out.println("isEmpty: " + d.isEmpty()); 
System.out.println("numUndealtCards: " + d.size()); 
System.out.println("deal: " + d.deal());
    }
}
