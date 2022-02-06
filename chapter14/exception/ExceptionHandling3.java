package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		
		try { // ���� ����
			fis=new FileInputStream("a.txt");
		} 
		catch(FileNotFoundException e) { // ���� ó��
			System.out.println(e);
			return;
		}
		finally { // �׻� ����Ǵ� �κ�
			if(fis!=null) {
				try {
					fis.close(); // ���� �Է� ��Ʈ�� �ݱ�
				} 
				catch(IOException e) {
					e.printStackTrace(); // ������ ������ ���� ó��
				}
			}
			System.out.println("�׻� ����˴ϴ�."); // �׻� ����Ǵ� finally���� Ư¡
		}
		System.out.println("���⵵ ����˴ϴ�."); // return ������ �ȵ�
	}
}
