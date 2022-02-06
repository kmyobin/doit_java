package exception;

public class AutoCloseObjTest {

	public static void main(String[] args) {
		try(AutoCloseObj obj=new AutoCloseObj()){
			throw new Exception(); // 강제 예외 시킴
		}
		catch(Exception e) {
			System.out.println("예외 부분입니다.");
		}
	}

}
// 리소스가 해제된 후(close) catch 구문 출력