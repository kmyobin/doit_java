package operator;

public class OperationEx5 {

	public static void main(String[] args) {
		int num=0B00000101;
		
		System.out.println(num<<2); // 00010100
		System.out.println(num>>2); // 00000001
		System.out.println(num>>>2); // 00000001
		
		System.out.println(num); // 기존 값 출력
		
		num=num<<2; // 00010100 대입
		System.out.println(num);

	}

}
