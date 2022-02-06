package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
	public static void main(String[] args) {
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("input.txt"); // input.txt ���� �Է� ��Ʈ�� ����
			System.out.println(fis.read()); // A �б�
			System.out.println(fis.read()); // B �б�
			System.out.println(fis.read()); // C �б�
		}
		catch(IOException e) { // ���� �߻�(input.txt�� �������� �����Ƿ�)
			System.out.println(e);
		}
		finally {
			try {
				fis.close(); // ���� ��Ʈ���� finally ��Ͽ��� �ݱ�
			}
			catch(IOException e) {
				System.out.println(e);
			}
			catch(NullPointerException e) { // stream�� null�� ���(stream�� �������� �ʾ����Ƿ� ���� �߻�)
				System.out.println(e);
			}
		}
		System.out.println("end"); // ��µ�(���α׷��� �ߴܵ��� �ʾҴٴ� ��)
	}

}
