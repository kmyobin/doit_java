package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer=new Customer(); // Buy������ Sell���� customer
		
		Buy buyer=customer; // Customer Ŭ�������� customer�� Buy �������̽����� buyer�� �����Ͽ� �� ��ȯ
		buyer.buy();
		
		Sell seller=customer; // Customer Ŭ�������� customer�� Sell �������̽����� seller�� �����Ͽ� �� ��ȯ
		seller.sell();
		
		if(seller instanceof Customer) {
			Customer customer2=(Customer)seller; // seller�� ���� Ŭ�������� Customer�� �ٽ� �� ��ȯ
			customer2.buy();
			customer2.sell();
		}
	}

}
