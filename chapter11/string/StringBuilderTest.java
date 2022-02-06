package string;

public class StringBuilderTest {
	public static void main(String[] args) {
		String javaStr=new String("Java"); // 새로운 메모리 할당
		System.out.println("javaStr 문자열 주소 : "+System.identityHashCode(javaStr));
		
		// StringBuffer : 문자열이 안전하게 변경
		// StringBuilder : 문자열이 안정하게 변경되는게 보장되지 않음. 하지만 속도는 빠름
		StringBuilder buffer=new StringBuilder(javaStr); 
		System.out.println("연산 전 buffer 메모리 주소 : "+System.identityHashCode(buffer));
		
		buffer.append(" and"); // 문자열 추가되어도 주소는 불변. char[] 배열이 확장되기 때문
		buffer.append(" android");
		buffer.append(" programming is fun!!");
		System.out.println("연산 후 buffer 메모리 주소 : "+System.identityHashCode(buffer));
		
		javaStr=buffer.toString(); // buffer을 문자열로 변환
		System.out.println(javaStr); // 출력
		System.out.println("새로 만들어진 javaStr 문자열 주소 : "+System.identityHashCode(javaStr));
		// javaStr --> "java"
		// buffer --> "java" + "and" + "android" + "programming is fun"
		// javaStr --> "Java and android programming is fun"
	}
}
