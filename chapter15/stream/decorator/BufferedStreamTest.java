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
				BufferedInputStream bis=new BufferedInputStream(fis); // BufferedInputStream의 생성자는 FileInputStream이므로
				BufferedOutputStream bos=new BufferedOutputStream(fos)){ // Buffered 스트림은 한꺼번에 8KB를 읽을 수 있음
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
		System.out.println("파일 복사하는 데 "+milisecond+" miliseconds 소요되었습니다."); // 18 miliseconds
	}

}
