package object;

public class StringEquals {

	public static void main(String[] args) {
		String str1=new String("abc");
		String str2=new String("abc");
		
		System.out.println(str1==str2); // �� �ν��Ͻ� �ּ� ���� ��������
		System.out.println(str1.equals(str2)); // ���ڿ� ���� ������(String���� �����ǵ�)
		
		Integer i1=new Integer(100);
		Integer i2=new Integer(100);
		
		System.out.println(i1==i2); // �� �ν��Ͻ� �ּ� ���� ��������
		System.out.println(i1.equals(i2)); // ���� ���� ������(Integer���� �����ǵ�)
	}

}