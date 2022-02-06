package exercise;

import java.util.HashMap;

public class CarFactory {
	private static CarFactory instance=new CarFactory(); // �̱���
	// �����ϰ� ����� �ν��Ͻ�
	HashMap<String, Car> carMap=new HashMap<>();
	
	private CarFactory() {} // �ܺ� �ν��Ͻ��� ������ �� ������
	
	public static CarFactory getInstance() { // �ν��Ͻ� ������ ������� ȣ���� �� �־����
		if(instance==null) {
			instance=new CarFactory();
		}
		return instance;
	}
	
	public Car createCar(String name) {
		if(carMap.containsKey(name)) {
			return carMap.get(name); // �̸����� value ��(Car)�� ��´�
		}
		Car car=new Car();
		carMap.put(name, car);
		return car;
	}
}
