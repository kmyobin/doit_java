package stream.others;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("�̸� : ");
		String name=scanner.nextLine(); // ���ڿ��� �Է� �޴� nextLine()
		
		System.out.println("���� : ");
		String job=scanner.nextLine(); // ���ڿ��� �Է� �޴� nextLine()
		
		System.out.println("��� : ");
		int num=scanner.nextInt(); // ������ �Է� �޴� nextInt()
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
		
		scanner.close();
	}

}
