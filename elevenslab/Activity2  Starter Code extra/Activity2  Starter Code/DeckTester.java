/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] r = {"jack", "queen", "king"};
    	String[] s = {"blue", "red"};
    	int[] pV = {11,12,13};
    	Deck test = new Deck(r, s, pV);
   	 
    	System.out.println(test.isEmpty());
    	System.out.println("Size: " + test.size());
    	System.out.println(test.deal());

        
        System.out.println("DECK NEW:");
        String[] ra = {"2","3","4","5","6","7","8","9","10", "jack", "queen", "king", "ace"};
        String[] su = {"ace", "spade", "diamond", "clove"};
        int[] poV = {2,3,4,5,6,7,8,9,10,10,10,10,11};
        Deck d = new Deck(ra, su, poV);
        
        System.out.println("isEmpty? " + d.isEmpty());
        System.out.println("size? " + d.size());
        System.out.println("deal? " + d.deal());
    }
}
        
