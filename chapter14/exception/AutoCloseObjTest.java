package exception;

public class AutoCloseObjTest {

	public static void main(String[] args) {
		try(AutoCloseObj obj=new AutoCloseObj()){
			throw new Exception(); // ���� ���� ��Ŵ
		}
		catch(Exception e) {
			System.out.println("���� �κ��Դϴ�.");
		}
	}

}
// ���ҽ��� ������ ��(close) catch ���� ���