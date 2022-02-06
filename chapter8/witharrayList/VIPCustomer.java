package witharrayList;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); // ���� Ŭ���� ������ ȣ��
		customerGrade="VIP"; // private �����̹Ƿ� ����
		bonusRatio=0.05;
		saleRatio=0.1;
		this.agentID=agentID;
		//System.out.println("VIPCustomer(int, String, int) ������ ȣ��");
	}
	
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price-(int)(price*saleRatio);
	}
	
	public String showCustomerInfo() {return super.showCustomerInfo()+" ��� ���� ��ȣ�� "+agentID+"�Դϴ�.";}
	
	public int getAgentID() {return agentID;}

}