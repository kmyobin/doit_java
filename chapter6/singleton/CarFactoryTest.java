package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory=CarFactory.getInstance();
		Car mySonata=factory.createCar(); // createCar()���ο��� new�� ��������
		Car yourSonata=factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());

	}

}
