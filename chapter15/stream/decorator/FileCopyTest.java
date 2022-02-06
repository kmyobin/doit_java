package stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) {
		long milisecond=0;
		try(FileInputStream fis=new FileInputStream("a.zip"); 
				FileOutputStream fos=new FileOutputStream("copy.zip")){ 
			// FileInputStream은 바이트 단위로 자료를 읽고 i에 저장하기 때문에 오래 걸림
			milisecond=System.currentTimeMillis(); // 파일 복사 전 시간
			int i;
			while((i=fis.read())!=-1) {
				fos.write(i);
			}
			milisecond=System.currentTimeMillis()-milisecond; // 파일 복사 총 시간
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사하는 데 "+milisecond+" miliseconds 소요되었습니다."); //2524 miliseconds
	}

}
