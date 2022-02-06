package stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {
	public static void main(String[] args) throws IOException {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요.");
		
		int i; // i는 4 byte지만 System.in은 byte 단위로 읽어들이므로 1 byte만 읽는다
		try {
			i=System.in.read(); // read() 메서드로 1 byte 읽음
			System.out.println(i);
			System.out.println((char)i); // 문자로 변환하여 출력
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
