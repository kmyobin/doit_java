package chapter9;

public abstract class Car {
	//String name;
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	/*public void stop() {
		System.out.println("차가 멈춥니다.");
	}*/
	
	final public void run() {
		start();
		drive();
		stop();
		turnOff();
		washCar();
	}
	public void washCar() {
		System.out.println("세차를 합니다.");
	}
}
