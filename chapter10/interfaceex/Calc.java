package interfaceex;

public interface Calc {
	double PI=3.14;
	int ERROR=-999999999; // 인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환
	
	int add(int num1, int num2); // 컴파일 과정에서 추상 메서드로 변환
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() { // 디폴트 메서드
		System.out.println("정수 계산기를 구현합니다.");
		myMethod(); // default 메서드에서 private 메서드 호출
	}
	
	static int total(int[] arr) { // 정적 메서드, 클래스와 무관하게 사용 가능. 인터페이스의 이름으로 직접 참조
		int total=0;
		for(int i:arr) {
			total+=i;
		}
		
		myStaticMethod(); // 정적 메서드에서 private static 메서드 호출
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메서드입니다.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드입니다.");
	}
}
