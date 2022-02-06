package stream.others;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		Console console=System.console(); // 콘솔 클래스 반환(이클립스에선 안보임)
		// cmd 창에서 해봄
		
		System.out.println("이름 : ");
		String name=console.readLine();
		
		System.out.println("직업 : ");
		String job=console.readLine();
		
		System.out.println("비밀번호 : ");
		char[] pass=console.readPassword(); // cmd에선 비밀번호를 입력 받으므로 화면에 나타나지 않음
		String strPass=new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}

}
