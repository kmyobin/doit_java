package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee=new Customer(10010, "�̼���");
		//customerLee.setCustomerID(10010);
		//customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim=new VIPCustomer(100020, "������", 1111);
		//customerKim.setCustomerID(100020);
		//customerKim.setCustomerName("������");
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
