package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf=new RandomAccessFile("random.txt", "rw"); // �а� ���� ��� ����
		
		rf.writeInt(100); // int�� 4byte�̹Ƿ� ���� ������ ��ġ 4�� �ٲ�
		System.out.println("���� ������ ��ġ : "+rf.getFilePointer()); // ���� ������ ��ġ�� ��ȯ�ϴ� �޼���
		
		rf.writeDouble(3.14); // 4 + 8 = 12
		System.out.println("���� ������ ��ġ : "+rf.getFilePointer());
		
		rf.writeUTF("�ȳ��ϼ���"); // 12 + �ѱ�(3byte)*5 + null����(2byte) = 17
		System.out.println("���� ������ ��ġ : "+rf.getFilePointer());
		
		rf.seek(0); // ���� ������ ��ġ�� 0���� �ű�
		System.out.println("���� ������ ��ġ : "+rf.getFilePointer());
		
		int i=rf.readInt();
		double d=rf.readDouble();
		String str=rf.readUTF();
		
		System.out.println("���� ������ ��ġ : "+rf.getFilePointer()); // �� �а� ���� �� ������
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	
	}

}
