package inheritance;

public class OverridingTest3 {

	public static void main(String[] args) {
		int price=10000;
		
		Customer customerLee=new Customer(10010, "�̼���");
		System.out.println(customerLee.getCustomerName()+" ���� �����ؾ� �ϴ� �ݾ��� "+customerLee.calcPrice(price)+"���Դϴ�.");
		
		VIPCustomer customerKim=new VIPCustomer(10020, "������", 12345);
		System.out.println(customerKim.getCustomerName()+" ���� �����ؾ� �ϴ� �ݾ��� "+customerKim.calcPrice(10000)+"���Դϴ�.");

		Customer vc=new VIPCustomer(10030, "������", 2000); // VIPCustomer �ν��Ͻ��� Customer������ ��ȯ
		// ���� �޼��� ��Ŀ� ���� VIPCustomer �ν��Ͻ��� �޼��� ȣ��
		System.out.println(vc.getCustomerName()+" ���� �����ؾ� �ϴ� �ݾ��� "+vc.calcPrice(10000)+"���Դϴ�.");
	}

}
