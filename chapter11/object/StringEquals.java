package object;

public class StringEquals {

	public static void main(String[] args) {
		String str1=new String("abc");
		String str2=new String("abc");
		
		System.out.println(str1==str2); // 두 인스턴스 주소 값이 동일한지
		System.out.println(str1.equals(str2)); // 문자열 값이 같은지(String에서 재정의됨)
		
		Integer i1=new Integer(100);
		Integer i2=new Integer(100);
		
		System.out.println(i1==i2); // 두 인스턴스 주소 값이 동일한지
		System.out.println(i1.equals(i2)); // 정수 값이 같은지(Integer에서 재정의됨)
	}

}
