package abstractex;

public class ComputerTest {
// �߻� Ŭ������ �ν��Ͻ��� ������ �� ����(��� �޼��尡 �������� �ʾ����Ƿ�)
	public static void main(String[] args) {
		//Computer c1=new Computer(); // error : �߻�Ŭ������ ��� �޼��尡 �������� �ʾ����Ƿ�
		Computer c2=new DeskTop();
		//Computer c3=new NoteBook(); // error 
		Computer c4=new MyNoteBook();

	}

}
