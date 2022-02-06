package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer=new Customer(); // Buy형이자 Sell형인 customer
		
		Buy buyer=customer; // Customer 클래스형인 customer를 Buy 인터페이스형인 buyer에 대입하여 형 변환
		buyer.buy();
		
		Sell seller=customer; // Customer 클래스형인 customer를 Sell 인터페이스형인 seller에 대입하여 형 변환
		seller.sell();
		
		if(seller instanceof Customer) {
			Customer customer2=(Customer)seller; // seller를 하위 클래스형인 Customer로 다시 형 변환
			customer2.buy();
			customer2.sell();
		}
	}

}
