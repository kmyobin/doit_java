package stream.others;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		Console console=System.console(); // �ܼ� Ŭ���� ��ȯ(��Ŭ�������� �Ⱥ���)
		// cmd â���� �غ�
		
		System.out.println("�̸� : ");
		String name=console.readLine();
		
		System.out.println("���� : ");
		String job=console.readLine();
		
		System.out.println("��й�ȣ : ");
		char[] pass=console.readPassword(); // cmd���� ��й�ȣ�� �Է� �����Ƿ� ȭ�鿡 ��Ÿ���� ����
		String strPass=new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}

}
