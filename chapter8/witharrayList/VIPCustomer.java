package witharrayList;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); // 상위 클래스 생성자 호출
		customerGrade="VIP"; // private 변수이므로 오류
		bonusRatio=0.05;
		saleRatio=0.1;
		this.agentID=agentID;
		//System.out.println("VIPCustomer(int, String, int) 생성자 호출");
	}
	
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price-(int)(price*saleRatio);
	}
	
	public String showCustomerInfo() {return super.showCustomerInfo()+" 담당 상담원 번호는 "+agentID+"입니다.";}
	
	public int getAgentID() {return agentID;}

}