package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		long milisecond=0;
		
		try(FileInputStream fis=new FileInputStream("a.zip");
				FileOutputStream fos=new FileOutputStream("copy.zip");
				BufferedInputStream bis=new BufferedInputStream(fis); // BufferedInputStream�� �����ڴ� FileInputStream�̹Ƿ�
				BufferedOutputStream bos=new BufferedOutputStream(fos)){ // Buffered ��Ʈ���� �Ѳ����� 8KB�� ���� �� ����
			milisecond=System.currentTimeMillis();
			
			int i;
			while((i=bis.read())!=-1) {
				bos.write(i);
			}
			milisecond=System.currentTimeMillis()-milisecond;
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� �����ϴ� �� "+milisecond+" miliseconds �ҿ�Ǿ����ϴ�."); // 18 miliseconds
	}

}
