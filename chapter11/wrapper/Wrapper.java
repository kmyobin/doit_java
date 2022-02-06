package wrapper;

public class Wrapper {

	public static void main(String[] args) {
		Integer iValue=new Integer(100);
		int myValue=iValue.intValue(); // int 값 갖오기. myValue 값을 출력하면 100이 출력됨
		System.out.println(myValue);
		
		Integer number1=Integer.valueOf("100"); // String
		Integer number2=Integer.valueOf(100); // int
		System.out.println(number1);
		System.out.println(number2);
		
		int num=Integer.parseInt("100"); // 문자열이 어떤 숫자를 나타날 때 문자열을 바로 int로 반환
		System.out.println(num);
		
		Integer num1=new Integer(100);
		int num2=200;
		int sum=num1+num2; // num.intValue()로 변환 (언박싱) : 객체형 -> 기본형
		Integer num3=num2; // Integer.valueOf(num2)로 변환 (오토박싱) : 기본형 -> 객체형
	}

}
