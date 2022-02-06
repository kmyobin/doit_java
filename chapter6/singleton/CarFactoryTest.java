package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory=CarFactory.getInstance();
		Car mySonata=factory.createCar(); // createCar()내부에서 new로 선언해줌
		Car yourSonata=factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());

	}

}
