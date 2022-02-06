package string;

public class StringTest1 {

	public static void main(String[] args) {
		String str1=new String("abc"); // new : 새로운 메모리가 할당되고 새로운 객체가 생성됨
		String str2=new String("abc");
		
		System.out.println(str1==str2); // 둘이 같은 주소인지?
		System.out.println(str1.equals(str2)); // 둘이 같은 문자열인지? (재정의)
		
		String str3="abc"; // 상수 풀. 문자열 상수의 메모리 주소를 가리키게 됨
		String str4="abc";
		
		System.out.println(str3==str4); // 주소가 같은지?(true)
		System.out.println(str3.equals(str4)); // 둘이 같은 문자열인지? (재정의)
	}

}
