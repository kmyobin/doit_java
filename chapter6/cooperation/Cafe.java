package cooperation;

public class Cafe {
	int benefit;
	String cafename;
	String menu;
	
	public Cafe(String cn) {
		cafename=cn;
		//menu=mn;
		benefit=0;
	}
	
	public void take(int mn) {
		benefit+=mn;
	}
	
	public void showInfo() {
		System.out.println(cafename+"의 이득은 "+benefit+"원입니다.");
	}
}
