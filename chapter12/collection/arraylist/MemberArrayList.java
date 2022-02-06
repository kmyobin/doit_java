package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member; // Member Ŭ������ collection ��Ű���� �����Ƿ� ����Ϸ��� import �ؾ���

public class MemberArrayList {
	private ArrayList<Member> arrayList; // ArrayList ����
	
	public MemberArrayList() {
		arrayList=new ArrayList<Member>(); // Member������ ������ ArrayList ����
	}
	
	public void addMember(Member member) { // ArrayList�� ȸ���� �߰��ϴ� �޼���
		arrayList.add(member);
	}
	
	public void addMember(int index, Member member) {
		arrayList.add(index, member);
	}
	
	public boolean removeMember(int memberId) {
		// ������ ���� set �������̽������� get(i) �޼��� ��� �Ұ�
		// iterator ���
		Iterator<Member> ir=arrayList.iterator(); // Iterator ��ȯ
		while(ir.hasNext()) { // ��Ұ� �ִ� ����
			Member member=ir.next(); // ���� ȸ���� ��ȯ ����
			int tempId=member.getMemberId(); 
			if(tempId==memberId) { // ȸ�� ���̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(member); // �ش� ȸ�� ����
				return true; // true ��ȯ
			}
		}
		// ���� ������ �����Ϸ��� ���� ã�� ���� ���
		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		return false;
		/*for(int i=0; i<arrayList.size(); i++) {
			Member member=arrayList.get(i); // ȸ���� ���������� ������
			int tempId=member.getMemberId(); // member���� id�� �����ͼ� tempId�� ����
			if(tempId==memberId) { // ȸ�� ���̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(i); // �ش� ȸ�� ����
				return true;
			}
		}
	
		System.out.println(memberId+"�� �������� �ʽ��ϴ�."); // ��ã������
		return false;*/
	}
	
	public int size() {
		return arrayList.size();
	}
	
	public void showAllMember() {
		for(Member member:arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}
