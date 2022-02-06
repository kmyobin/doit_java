package interfaceex;

public class Customer implements Buy, Sell { // customer 클래스는 Buy와 Sell 인터페이스를 모두 구현함

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}
	
}
