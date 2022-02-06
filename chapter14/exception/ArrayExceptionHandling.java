package exception;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int[] arr=new int[5];
		
		try {
			for(int i=0; i<=5; i++) {
				arr[i]=i;
				System.out.println(arr[i]); // 예외가 발생할 수 있으므로 try 블록에 작성
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("에외 처리 부분"); // 예외가 발생하면 catch 블록 수행
		}
		System.out.println("프로그램 종료");
	}

}
