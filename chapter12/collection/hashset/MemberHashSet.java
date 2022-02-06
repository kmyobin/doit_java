package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet; // HashSet 선언
	
	public MemberHashSet() {
		hashSet=new HashSet<Member>(); // HashSet 생성
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir=hashSet.iterator(); // iterator를 활용해 순회함
		
		while(ir.hasNext()) {
			Member member=ir.next(); // 회원을 하나씩 가져와서
			int tempId=member.getMemberId(); // 아이디 비교
			if(tempId==memberId) {
				hashSet.remove(member); // 회원 삭제
				return true;
			}
		}
		
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member:hashSet){
			System.out.println(member); // 모든 회원 출력
		}
		System.out.println();
	}
}
