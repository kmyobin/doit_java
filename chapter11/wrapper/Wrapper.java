package wrapper;

public class Wrapper {

	public static void main(String[] args) {
		Integer iValue=new Integer(100);
		int myValue=iValue.intValue(); // int �� ������. myValue ���� ����ϸ� 100�� ��µ�
		System.out.println(myValue);
		
		Integer number1=Integer.valueOf("100"); // String
		Integer number2=Integer.valueOf(100); // int
		System.out.println(number1);
		System.out.println(number2);
		
		int num=Integer.parseInt("100"); // ���ڿ��� � ���ڸ� ��Ÿ�� �� ���ڿ��� �ٷ� int�� ��ȯ
		System.out.println(num);
		
		Integer num1=new Integer(100);
		int num2=200;
		int sum=num1+num2; // num.intValue()�� ��ȯ (��ڽ�) : ��ü�� -> �⺻��
		Integer num3=num2; // Integer.valueOf(num2)�� ��ȯ (����ڽ�) : �⺻�� -> ��ü��
	}

}
