package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String className)  // FileInputStream�� ���� Class�� �������� �ε��Ͽ� ��ȯ
			throws FileNotFoundException, ClassNotFoundException { // �� ���ܸ� �޼��尡 ȣ��� �� ó���ϵ��� �̷�
		FileInputStream fis=new FileInputStream(fileName); // FileNotFoundException �߻� ����
		Class c=Class.forName(className); // ClassNotFoundException �߻� ����
		return c;
	}
	
	public static void main(String[] args) {
		ThrowsException test=new ThrowsException();
		try {
			test.loadClass("a.txt", "java.lang.String");
		}
		catch(FileNotFoundException e) { // ������ ã�� �� ���ų�
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) { // Ŭ������ ã�� �� ���� ��
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace(); // Exception Ŭ����(��� ���� Ŭ������ �ֻ���)�� �� �� ���� ��Ȳ ó��
		}
		
		/*ThrowsException test=new ThrowsException();
		test.loadClass("a.txt", "java.lang.String"); // �޼��带 ȣ���� �� ���ܸ� ó����*/
	}

}
