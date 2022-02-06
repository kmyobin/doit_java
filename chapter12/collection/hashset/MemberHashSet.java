package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet; // HashSet ����
	
	public MemberHashSet() {
		hashSet=new HashSet<Member>(); // HashSet ����
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir=hashSet.iterator(); // iterator�� Ȱ���� ��ȸ��
		
		while(ir.hasNext()) {
			Member member=ir.next(); // ȸ���� �ϳ��� �����ͼ�
			int tempId=member.getMemberId(); // ���̵� ��
			if(tempId==memberId) {
				hashSet.remove(member); // ȸ�� ����
				return true;
			}
		}
		
		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member:hashSet){
			System.out.println(member); // ��� ȸ�� ���
		}
		System.out.println();
	}
}
