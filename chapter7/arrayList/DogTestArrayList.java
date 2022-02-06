package arrayList;
import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dog_=new ArrayList<Dog>();
		dog_.add(new Dog("뽀돌이", "리트리버"));
		dog_.add(new Dog("깜둥이", "푸들"));
		dog_.add(new Dog("콩이", "슈나우저"));
		dog_.add(new Dog("제리", "불독"));
		dog_.add(new Dog("톰", "말티즈"));
		
		for(int i=0; i<dog_.size(); i++) {
			Dog temp=dog_.get(i);
			System.out.println(temp.showDogInfo());
		}
		System.out.println();
		
		System.out.println("=== 향상된 for문 ===");
		for(Dog x:dog_) {
			System.out.println(x.showDogInfo());
		}
	}

}
