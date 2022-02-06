package lambda;

public class CalcTest {

	public static void main(String[] args) {
		Calc calc=(num1, num2)->{return num1+num2;};
		System.out.println(calc.add(13, 34));
	}

}
