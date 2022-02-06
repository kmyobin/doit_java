package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class exercise {
	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("abc.txt");
				OutputStreamWriter osw=new OutputStreamWriter(fos)) {
			osw.write("지금까지 자바 공부 정말 재미있게 했어요^^");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("완료되었습니다.");
				
		
		try(FileInputStream fis=new FileInputStream("a.txt");
				InputStreamReader isr=new InputStreamReader(fis)){
			int i;
			while((i=isr.read())!=-1) {
				System.out.print((char)i); // 읽어오기
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
		System.out.println();
		System.out.println("읽기가 완료되었습니다.");
	}
}
