package cooperation;

public class Person {
	int money;
	String name;
	
	public Person(String n, int m) {
		name=n;
		money=m;
	}
	
	public void takeCafe(Cafe cafe, int mn) {
		cafe.take(mn);
		money-=mn;
	}
	
	public void showInfo() {
		System.out.println(name+"���� ���� ���� "+money+"���Դϴ�.");
	}
}
