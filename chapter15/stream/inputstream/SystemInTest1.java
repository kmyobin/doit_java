package stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {
	public static void main(String[] args) throws IOException {
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������.");
		
		int i; // i�� 4 byte���� System.in�� byte ������ �о���̹Ƿ� 1 byte�� �д´�
		try {
			i=System.in.read(); // read() �޼���� 1 byte ����
			System.out.println(i);
			System.out.println((char)i); // ���ڷ� ��ȯ�Ͽ� ���
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
