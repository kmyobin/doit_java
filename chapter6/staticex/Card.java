package staticex;

public class Card {
	private static int serialNum=10000;
	int cardNum;
	public Card() {
		serialNum++;
		cardNum=serialNum;
	}
	
	public int getcardNum() {
		return cardNum;
	}
	
	/*public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setSerialNum(int ser) {
		serialNum=ser;
	}*/
}
