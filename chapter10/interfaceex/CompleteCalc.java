package interfaceex;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2!=0)return num1/num2;
		else return Calc.ERROR; // 오류 반환
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다."); 
	}

	@Override
	public void description() { // 디폴트 메서드를 하위 클래스에서 재정의 할 수 있음
		// TODO Auto-generated method stub
		super.description();
	}

}
