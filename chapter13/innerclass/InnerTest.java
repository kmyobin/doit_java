package innerclass;


class OutClass{ // 외부 클래스
	private int num=10; // 외부 클래스 private 변수
	private static int sNum=20; // 외부 클래스 정적 변수
	
	static class InStaticClass{ // 정적 내부 클래스
		int inNum=100; // 정적 내부 클래스의 인스턴스 변수
		static int sInNum=200; // 정적 내부 클래스의 정적 변수
	
	
		void inTest() { // 정적 내부 클래스의 일반 메서드
			//num+=10; // 외부 클래스의 인스턴스 변수는 사용 x (정적 클래스니까)
			System.out.println("InStaticClass inNum = "+inNum+"(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = "+sInNum+"(내부 클래스의 정적 변수 사용)");
			System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 정적 변수 사용)");
		}
		
		static void sTest() { // 정적 내부 클래스의 정적 메서드
			// num+=10; 
			// inNum+=10; // 외부 클래스와 내부 클래스의 인스턴스 변수 사용 x (정적 클래스니까)
			System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInNum = "+sInNum+"(내부 클래스의 정적 변수 사용)");
		}
	}
	// 인스턴스 내부 클래스
	/*private InClass inClass; // 내부 클래스 자료형 변수를 먼저 선언
	
	public OutClass() { // 외부 클래스 디폴트 생성자. 외부 클래스가 생성돼야 내부 클래스 생성 가능
		inClass=new InClass(); 
	}

	class InClass{
		int iNum=100; // 내부 클래스의 인스턴스 변수
		// static int sInNum=200; // 인스턴스 내부 클래스에 정적 변수 선언 x
		
		void inTest() {
			System.out.println("OutClass num = "+num+"(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 정적 변수)");
		}
		
		// static void sTest(){} 정적 메서드도 정의 x 
	}
	public void usingClass() {
		inClass.inTest();
	}*/

}
public class InnerTest {

	public static void main(String[] args) {
		OutClass.InStaticClass sInClass=new OutClass.InStaticClass(); // 외부 클래스 생성 안하고 정적 내부 클래스 생성 가능. 이게 바로 정적 내부 클래스의 장점!
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClass.InStaticClass.sTest();
		/*OutClass outClass=new OutClass(); // 인스턴스 내부 클래스는 외부 클래스를 무조건 먼저 생성
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass(); // 내부 클래스 기능 호출*/
		
	}

}
