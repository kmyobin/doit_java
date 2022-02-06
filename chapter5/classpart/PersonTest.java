package classpart;

public class PersonTest {

	public static void main(String[] args) {
		Person person=new Person();
		
		person.setAge(40);
		person.setName("James");
		person.setMarried(true);
		person.setChild(4);
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getMarried());
		System.out.println(person.getChild());

	}

}
