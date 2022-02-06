package interfaceex;

public abstract class Calculator implements Calc{ // 4개의 추상 메서드 중 2개만 구현했으므로 abstract class

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1-num2;
	}


}
