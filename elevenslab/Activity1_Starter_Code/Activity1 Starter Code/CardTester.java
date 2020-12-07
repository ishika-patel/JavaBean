/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card number1 = new Card("Ace", "Hearts", 1);
		Card number2 = new Card("3", "Spades", 3);
		Card number3 = new Card("7", "Diamonds", 7);
		
		System.out.println("Card rank for Card 1");
		System.out.println(number1.rank());
		
		System.out.println("Testing equality!");
		System.out.println("Is card 1 equal to card 2? " + number1.matches(number2));
		System.out.println("Is card 3 equal to card 3? "+ number3.matches(number3));
		
		System.out.println("toString for Card 1");
		System.out.println(number1.toString());
		
	}
}
