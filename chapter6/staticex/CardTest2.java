package staticex;

public class CardTest2 {

	public static void main(String[] args) {
		CardCompany company=CardCompany.getInstance();
		
		Card card1=company.createCard();
		Card card2=company.createCard();
		
		System.out.println(card1.getcardNum());
		System.out.println(card2.getcardNum());

	}

}
