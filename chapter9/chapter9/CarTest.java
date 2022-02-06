package chapter9;
import java.util.ArrayList;

public class CarTest {
	public static void main(String[] args) {
		/*Bus bus=new Bus();
		AutoCar autoCar=new AutoCar();
		
		bus.run();
		autoCar.run();
		
		bus.refuel();
		autoCar.refuel();
		
		bus.takePassenger();
		autoCar.load();
		
		bus.stop();
		autoCar.stop();*/
		
		ArrayList<Car> carList=new ArrayList<Car>();
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		for(Car car:carList) {
			car.run();
			System.out.println("======================");
		}
		
	}
}
