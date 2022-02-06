package singleton;

public class Company {
	private static Company instance=new Company(); // �ν��Ͻ� �ϳ��� �ʿ��ϹǷ� Company class ���ο��� ����. �̰� ������ �ν��Ͻ���
	private Company() {} // �츮�� �ϳ��� ȸ�縸 �ʿ���. public���� ����� ������ ���� �� �����Ƿ� �ܺ� �ν��Ͻ��� ����Ҽ� ���� private���� ����
	
	public static Company getInstance() {
		if(instance==null) {
			instance=new Company();
		}
		return instance;
	}
}
