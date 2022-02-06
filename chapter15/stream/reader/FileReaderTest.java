package stream.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		try(FileReader fr=new FileReader("reader.txt")){ // reader -> 문자 읽기
			int i;
			while((i=fr.read())!=-1) {
				System.out.print((char)i); // 읽어오기
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
