package map.hashmap;

import java.util.HashMap;
// put(key, value) // containsKey(key) // keySet() : ��� key ���� set ��ü�� ��ȯ // get(key)
// Map �������̽��� ��� �ڷḦ �� ���� ��ȸ�� �� �����Ƿ� key ���� ���� �����ͼ� key ���� �ش��ϴ� value�� ã�ƾ���
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap; // HashMap���� ����
	
	public MemberHashMap() {
		hashMap=new HashMap<Integer, Member>(); // key = memberId, value = member
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member); // HashMap�� ȸ�� �߰� (key, value)
	}
	
	public boolean reomveMember(int memberId) {
		if(hashMap.containsKey(memberId)) { // hashMap�� �Ű������� ���� Ű ���� �ִٸ�
			hashMap.remove(memberId); // �ش� ȸ�� ����
			return true;
		}
		System.out.println(memberId+"�� �������� �ʽ��ϴ�."); // if���� ���� �ʾҴٸ� Id�� ���� ��
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir=hashMap.keySet().iterator(); // HashMap�� ��ȸ x�̹Ƿ� iterator ��� -> key ��ȸ ����
		while(ir.hasNext()) { // ���� key�� ������
			int key=ir.next(); // key�� ��������
			Member member=hashMap.get(key); // key�κ��� value ��������
			System.out.println(member);
		}
		System.out.println();
	}
}
