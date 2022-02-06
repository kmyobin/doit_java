package inheritance;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); // 상위 클래스 생성자 호출
		customerGrade="VIP"; // private 변수이므로 오류
		bonusRatio=0.05;
		saleRatio=0.1;
		this.agentID=agentID;
		//ㄴSystem.out.println("VIPCustomer(int, String, int) 생성자 호출");
	}
	
	public int getAgentID() {return agentID;}

	@Override // 코드 우클릭 -> source -> override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint+=price*bonusRatio;
		return price-(int)(price*saleRatio);
	}
	
	/*@Override // @ : 주석
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price-(int)(price*saleRatio);
	}*/
	
}
