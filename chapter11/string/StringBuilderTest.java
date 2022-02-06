package string;

public class StringBuilderTest {
	public static void main(String[] args) {
		String javaStr=new String("Java"); // ���ο� �޸� �Ҵ�
		System.out.println("javaStr ���ڿ� �ּ� : "+System.identityHashCode(javaStr));
		
		// StringBuffer : ���ڿ��� �����ϰ� ����
		// StringBuilder : ���ڿ��� �����ϰ� ����Ǵ°� ������� ����. ������ �ӵ��� ����
		StringBuilder buffer=new StringBuilder(javaStr); 
		System.out.println("���� �� buffer �޸� �ּ� : "+System.identityHashCode(buffer));
		
		buffer.append(" and"); // ���ڿ� �߰��Ǿ �ּҴ� �Һ�. char[] �迭�� Ȯ��Ǳ� ����
		buffer.append(" android");
		buffer.append(" programming is fun!!");
		System.out.println("���� �� buffer �޸� �ּ� : "+System.identityHashCode(buffer));
		
		javaStr=buffer.toString(); // buffer�� ���ڿ��� ��ȯ
		System.out.println(javaStr); // ���
		System.out.println("���� ������� javaStr ���ڿ� �ּ� : "+System.identityHashCode(javaStr));
		// javaStr --> "java"
		// buffer --> "java" + "and" + "android" + "programming is fun"
		// javaStr --> "Java and android programming is fun"
	}
}
