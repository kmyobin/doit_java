package abstractex;

public class ComputerTest {
// 추상 클래스는 인스턴스로 생성할 수 없다(모든 메서드가 구현되지 않았으므로)
	public static void main(String[] args) {
		//Computer c1=new Computer(); // error : 추상클래스는 모든 메서드가 구현되지 않았으므로
		Computer c2=new DeskTop();
		//Computer c3=new NoteBook(); // error 
		Computer c4=new MyNoteBook();

	}

}
