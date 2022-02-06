package arrayList;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dog=new Dog[5];
		
		dog[0]=new Dog("뽀돌이", "리트리버");
		dog[1]=new Dog("깜둥이", "푸들");
		dog[2]=new Dog("콩이", "슈나우저");
		dog[3]=new Dog("제리", "불독");
		dog[4]=new Dog("톰", "말티즈");
		
		for(int i=0; i<dog.length; i++) {
			System.out.println(dog[i].showDogInfo());
		}
		System.out.println();
		
		System.out.println("=== 향상된 for문 ===");
		for(Dog x:dog) {
			System.out.println(x.showDogInfo());
		}

	}

}
