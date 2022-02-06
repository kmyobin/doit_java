package singleton;

public class Company {
	private static Company instance=new Company(); // 인스턴스 하나가 필요하므로 Company class 내부에서 생성. 이게 유일한 인스턴스임
	private Company() {} // 우리는 하나의 회사만 필요함. public으로 만들면 여러개 만들 수 있으므로 외부 인스턴스를 사용할수 없게 private으로 선언
	
	public static Company getInstance() {
		if(instance==null) {
			instance=new Company();
		}
		return instance;
	}
}
