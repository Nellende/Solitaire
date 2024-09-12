package BackEnd;

public class Card {
	private int cardNum = 0;
	private String suit = "";
	
	public Card(String suit, int num) {
		this.suit = suit;
		this.cardNum = num;
	}

	public int getCardNum() {
		return cardNum;
	}

	public String getSuit() {
		return suit;
	}
}
