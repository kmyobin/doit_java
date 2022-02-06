package classpart;

public class Person {
	String name;
	int age;
	int height;
	double weight;
	char gender;
	int child;
	boolean married;
	
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	}
	public void setAge(int a) {
		age=a;
	}
	public int getAge() {
		return age;
	}
	public void setMarried(boolean b) {
		married=b;
	}
	public boolean getMarried() {
		return married;
	}
	public void setChild(int c) {
		child=c;
	}
	public int getChild() {
		return child;
	}
}
