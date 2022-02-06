package innerclass;


class OutClass{ // �ܺ� Ŭ����
	private int num=10; // �ܺ� Ŭ���� private ����
	private static int sNum=20; // �ܺ� Ŭ���� ���� ����
	
	static class InStaticClass{ // ���� ���� Ŭ����
		int inNum=100; // ���� ���� Ŭ������ �ν��Ͻ� ����
		static int sInNum=200; // ���� ���� Ŭ������ ���� ����
	
	
		void inTest() { // ���� ���� Ŭ������ �Ϲ� �޼���
			//num+=10; // �ܺ� Ŭ������ �ν��Ͻ� ������ ��� x (���� Ŭ�����ϱ�)
			System.out.println("InStaticClass inNum = "+inNum+"(���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println("InStaticClass sInNum = "+sInNum+"(���� Ŭ������ ���� ���� ���)");
			System.out.println("OutClass sNum = "+sNum+"(�ܺ� Ŭ������ ���� ���� ���)");
		}
		
		static void sTest() { // ���� ���� Ŭ������ ���� �޼���
			// num+=10; 
			// inNum+=10; // �ܺ� Ŭ������ ���� Ŭ������ �ν��Ͻ� ���� ��� x (���� Ŭ�����ϱ�)
			System.out.println("OutClass sNum = "+sNum+"(�ܺ� Ŭ������ ���� ���� ���)");
			System.out.println("InStaticClass sInNum = "+sInNum+"(���� Ŭ������ ���� ���� ���)");
		}
	}
	// �ν��Ͻ� ���� Ŭ����
	/*private InClass inClass; // ���� Ŭ���� �ڷ��� ������ ���� ����
	
	public OutClass() { // �ܺ� Ŭ���� ����Ʈ ������. �ܺ� Ŭ������ �����ž� ���� Ŭ���� ���� ����
		inClass=new InClass(); 
	}

	class InClass{
		int iNum=100; // ���� Ŭ������ �ν��Ͻ� ����
		// static int sInNum=200; // �ν��Ͻ� ���� Ŭ������ ���� ���� ���� x
		
		void inTest() {
			System.out.println("OutClass num = "+num+"(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = "+sNum+"(�ܺ� Ŭ������ ���� ����)");
		}
		
		// static void sTest(){} ���� �޼��嵵 ���� x 
	}
	public void usingClass() {
		inClass.inTest();
	}*/

}
public class InnerTest {

	public static void main(String[] args) {
		OutClass.InStaticClass sInClass=new OutClass.InStaticClass(); // �ܺ� Ŭ���� ���� ���ϰ� ���� ���� Ŭ���� ���� ����. �̰� �ٷ� ���� ���� Ŭ������ ����!
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		
		System.out.println();
		System.out.println("���� ���� Ŭ������ ���� �޼��� ȣ��");
		OutClass.InStaticClass.sTest();
		/*OutClass outClass=new OutClass(); // �ν��Ͻ� ���� Ŭ������ �ܺ� Ŭ������ ������ ���� ����
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass(); // ���� Ŭ���� ��� ȣ��*/
		
	}

}
