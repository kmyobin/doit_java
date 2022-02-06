package lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		PrintString lambdaStr=s->System.out.println(s); // �������̽��� ������ ���ٽ� ����
		lambdaStr.showString("hello lamda_1"); // ���ٽ� ������ ȣ��
		showMyString(lambdaStr); // �޼����� �Ű������� ���ٽ��� ������ ���� ����
		
		PrintString reStr=returnString(); // ������ ��ȯ�ޱ�
		reStr.showString("hello "); // �޼��� ȣ�� // returnString() �������̽��� ����
	}
	
	public static PrintString returnString() {
		return s->System.out.println(s+"world"); // ���ٽ��� ��ȯ�ϴ� �޼���
	}
	public static void showMyString(PrintString p) { // �Ű������� �������̽������� ����
		p.showString("hello lamda_2");
	}

}
