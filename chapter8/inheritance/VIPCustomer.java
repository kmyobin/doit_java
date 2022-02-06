package inheritance;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); // ���� Ŭ���� ������ ȣ��
		customerGrade="VIP"; // private �����̹Ƿ� ����
		bonusRatio=0.05;
		saleRatio=0.1;
		this.agentID=agentID;
		//��System.out.println("VIPCustomer(int, String, int) ������ ȣ��");
	}
	
	public int getAgentID() {return agentID;}

	@Override // �ڵ� ��Ŭ�� -> source -> override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint+=price*bonusRatio;
		return price-(int)(price*saleRatio);
	}
	
	/*@Override // @ : �ּ�
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price-(int)(price*saleRatio);
	}*/
	
}
