package interfaceex;

public class Customer implements Buy, Sell { // customer Ŭ������ Buy�� Sell �������̽��� ��� ������

	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");
	}

	@Override
	public void buy() {
		System.out.println("�����ϱ�");
	}
	
}
