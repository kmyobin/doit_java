package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("input.txt")){
			int i;
			while((i=fis.read())!=-1) { // i가 -1이면 파일의 끝임. 1 byte씩 읽어 들이고 있음
				System.out.println((char)i); 
			}
			System.out.println("end");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
