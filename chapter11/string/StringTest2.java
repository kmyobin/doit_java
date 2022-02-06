package string;

public class StringTest2 {

	public static void main(String[] args) {
		String javaStr=new String("java"); // new로 할당된 건 수정이 불가능
		String androidStr=new String("android"); 
		System.out.println(javaStr); 
		System.out.println("처음 문자열 주소 값: "+System.identityHashCode(javaStr));
		
		javaStr=javaStr.concat(androidStr); // 문자열 javaStr+androidStr을 대입
		// 새로 생성된 문자열 가리킴
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소 값: "+System.identityHashCode(javaStr));
	}
	
	
	/*
	 javaStr -x-> "java"             androidStr --> "android"
	         ---> "javaandroid" 새로 생성된 문자열 가리킴
	 */

}
