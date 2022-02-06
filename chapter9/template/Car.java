package template;

public abstract class Car {
	public abstract void drive(); // 차종 별로 다를 수 있으므로 추상 클래스
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	
	final public void run() { // 템플릿 메서드
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
}
