package template;

public abstract class Car {
	public abstract void drive(); // ���� ���� �ٸ� �� �����Ƿ� �߻� Ŭ����
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	
	final public void run() { // ���ø� �޼���
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
}
