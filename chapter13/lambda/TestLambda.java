package lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		PrintString lambdaStr=s->System.out.println(s); // 인터페이스형 변수에 람다식 대임
		lambdaStr.showString("hello lamda_1"); // 람다식 구현부 호출
		showMyString(lambdaStr); // 메서드의 매개변수로 람다식을 대입한 변수 전달
		
		PrintString reStr=returnString(); // 변수로 반환받기
		reStr.showString("hello "); // 메서드 호출 // returnString() 인터페이스로 진행
	}
	
	public static PrintString returnString() {
		return s->System.out.println(s+"world"); // 람다식을 반환하는 메서드
	}
	public static void showMyString(PrintString p) { // 매개변수를 인터페이스형으로 받음
		p.showString("hello lamda_2");
	}

}
