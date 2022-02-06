package exercise;

import java.util.HashMap;

public class CarFactory {
	private static CarFactory instance=new CarFactory(); // 싱글톤
	// 유일하게 사용할 인스턴스
	HashMap<String, Car> carMap=new HashMap<>();
	
	private CarFactory() {} // 외부 인스턴스를 생성할 수 없도록
	
	public static CarFactory getInstance() { // 인스턴스 생성과 상관없이 호출할 수 있어야함
		if(instance==null) {
			instance=new CarFactory();
		}
		return instance;
	}
	
	public Car createCar(String name) {
		if(carMap.containsKey(name)) {
			return carMap.get(name); // 이름으로 value 값(Car)을 얻는다
		}
		Car car=new Car();
		carMap.put(name, car);
		return car;
	}
}
