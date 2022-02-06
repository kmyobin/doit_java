package cooperation;

public class CafeTest {

	public static void main(String[] args) {
		Person Kim=new Person("Kim", 10000);
		Person Lee=new Person("Lee", 10000);
		
		Cafe Starbucks=new Cafe("Starbucks");
		Kim.takeCafe(Starbucks, 4000);
		
		Cafe Cafebeans=new Cafe("Cafebeans");
		Lee.takeCafe(Cafebeans, 4500);
		
		
		Kim.showInfo();Lee.showInfo();
	}

}
