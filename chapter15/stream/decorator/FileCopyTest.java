package stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) {
		long milisecond=0;
		try(FileInputStream fis=new FileInputStream("a.zip"); 
				FileOutputStream fos=new FileOutputStream("copy.zip")){ 
			// FileInputStream�� ����Ʈ ������ �ڷḦ �а� i�� �����ϱ� ������ ���� �ɸ�
			milisecond=System.currentTimeMillis(); // ���� ���� �� �ð�
			int i;
			while((i=fis.read())!=-1) {
				fos.write(i);
			}
			milisecond=System.currentTimeMillis()-milisecond; // ���� ���� �� �ð�
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� �����ϴ� �� "+milisecond+" miliseconds �ҿ�Ǿ����ϴ�."); //2524 miliseconds
	}

}
