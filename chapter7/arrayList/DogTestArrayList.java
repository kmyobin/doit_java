package arrayList;
import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dog_=new ArrayList<Dog>();
		dog_.add(new Dog("�ǵ���", "��Ʈ����"));
		dog_.add(new Dog("������", "Ǫ��"));
		dog_.add(new Dog("����", "��������"));
		dog_.add(new Dog("����", "�ҵ�"));
		dog_.add(new Dog("��", "��Ƽ��"));
		
		for(int i=0; i<dog_.size(); i++) {
			Dog temp=dog_.get(i);
			System.out.println(temp.showDogInfo());
		}
		System.out.println();
		
		System.out.println("=== ���� for�� ===");
		for(Dog x:dog_) {
			System.out.println(x.showDogInfo());
		}
	}

}
