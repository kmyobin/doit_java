package classpart;

public class ShoppingTest {

	public static void main(String[] args) {
		Shopping shopping=new Shopping();
		shopping.setInum("201803120001");
		shopping.setId("abc123");
		shopping.setDate(2018, 03, 12);
		shopping.setName("ȫ���");
		shopping.setPnum("PD0345-12");
		shopping.setAddress("����� �������� ���ǵ��� 20����");
		
		System.out.println("�ֹ� ��ȣ: "+shopping.getInum());
		System.out.println("�ֹ��� ���̵�: "+shopping.getId());
		System.out.println("�ֹ� ��¥: "+shopping.getYear()+"�� "+shopping.getMonth()+"�� "+shopping.getDay()+"��");
		System.out.println("�ֹ��� �̸�: "+shopping.getName());
		System.out.println("�ֹ� ��ǰ ��ȣ: "+shopping.getPnum());
		System.out.println("��� �ּ�: "+shopping.getAddress());

	}

}
