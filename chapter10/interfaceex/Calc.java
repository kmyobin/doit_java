package interfaceex;

public interface Calc {
	double PI=3.14;
	int ERROR=-999999999; // �������̽����� ������ ������ ������ �������� ����� ��ȯ
	
	int add(int num1, int num2); // ������ �������� �߻� �޼���� ��ȯ
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() { // ����Ʈ �޼���
		System.out.println("���� ���⸦ �����մϴ�.");
		myMethod(); // default �޼��忡�� private �޼��� ȣ��
	}
	
	static int total(int[] arr) { // ���� �޼���, Ŭ������ �����ϰ� ��� ����. �������̽��� �̸����� ���� ����
		int total=0;
		for(int i:arr) {
			total+=i;
		}
		
		myStaticMethod(); // ���� �޼��忡�� private static �޼��� ȣ��
		return total;
	}
	
	private void myMethod() {
		System.out.println("private �޼����Դϴ�.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static �޼����Դϴ�.");
	}
}
