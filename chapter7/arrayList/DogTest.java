package arrayList;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dog=new Dog[5];
		
		dog[0]=new Dog("�ǵ���", "��Ʈ����");
		dog[1]=new Dog("������", "Ǫ��");
		dog[2]=new Dog("����", "��������");
		dog[3]=new Dog("����", "�ҵ�");
		dog[4]=new Dog("��", "��Ƽ��");
		
		for(int i=0; i<dog.length; i++) {
			System.out.println(dog[i].showDogInfo());
		}
		System.out.println();
		
		System.out.println("=== ���� for�� ===");
		for(Dog x:dog) {
			System.out.println(x.showDogInfo());
		}

	}

}
