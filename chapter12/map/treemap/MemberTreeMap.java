package map.treemap; // 이진 검색 트리로 구현되어있어 비교 연산자가 필요하나, Integer형에서는 이미 구현되어있으므로 여기서는 구현 생략

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {
	private TreeMap<Integer, Member> treeMap; 
	
	public MemberTreeMap() {
		treeMap=new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member); // key, value 쌍으로 추가
	}
	
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir=treeMap.keySet().iterator(); // key가 integer 값이므로
		while(ir.hasNext()) {
			int key=ir.next();
			Member member=treeMap.get(key); // value를 가져옴
			System.out.println(member);
		}
		System.out.println();		
	}
}
