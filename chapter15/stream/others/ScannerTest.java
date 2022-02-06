package stream.others;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name=scanner.nextLine(); // 문자열을 입력 받는 nextLine()
		
		System.out.println("직업 : ");
		String job=scanner.nextLine(); // 문자열을 입력 받는 nextLine()
		
		System.out.println("사번 : ");
		int num=scanner.nextInt(); // 정수를 입력 받는 nextInt()
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
		
		scanner.close();
	}

}
