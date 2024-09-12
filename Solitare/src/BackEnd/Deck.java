package BackEnd;

import java.util.Random;

public class Deck {
	private Card[] deck = new Card[52];
	Random rand = new Random();

	public Deck() {
		String cardSuit = "";
		for (int suit = 0; suit < 4; suit++) {
			switch (suit) {
			case 0:
				cardSuit = "S";
				break;
			case 1:
				cardSuit = "C";
				break;
			case 2:
				cardSuit = "H";
				break;
			case 3:
				cardSuit = "D";
				break;
			default:
				break;
			}
			for (int num = 1; num < 14; num++) {
				for (boolean exit = false; !exit;) {
					Card temp = new Card(cardSuit, num);
					int tempNum = Math.round((rand.nextInt(52)));
					if (deck[tempNum] == null) {
						deck[tempNum] = temp;
						exit = true;
					}
				}
			}
		}
	}
}
