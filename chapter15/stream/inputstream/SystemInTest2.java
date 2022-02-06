package stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요.");
		
		int i;
		try {
			while((i=System.in.read())!='\n') { // enter키 누르기 전까지 입력받음
				System.out.print((char)i);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
