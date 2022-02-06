package stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		try(InputStreamReader isr=new InputStreamReader(new FileInputStream("reader.txt"))){ // 보조 스트림인 InputStreamReader의 매개변수로 FileInputStream을 받아 생성
			// FileInputStream은 바이트 단위로 자료를 읽기 때문에 한글을 못읽음. 그래서 InputStreamReader로 바이트를 문자로 변환(사실 FileReader로 바로 읽으면 됨)
			int i;
			while((i=isr.read())!=-1) { // 보조스트림으로 읽어 들임
				System.out.print((char)i);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
