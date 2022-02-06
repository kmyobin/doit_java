package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member; // Member 클래스는 collection 패키지에 있으므로 사용하려면 import 해야함

public class MemberArrayList {
	private ArrayList<Member> arrayList; // ArrayList 선언
	
	public MemberArrayList() {
		arrayList=new ArrayList<Member>(); // Member형으로 선언한 ArrayList 생성
	}
	
	public void addMember(Member member) { // ArrayList에 회원을 추가하는 메서드
		arrayList.add(member);
	}
	
	public void addMember(int index, Member member) {
		arrayList.add(index, member);
	}
	
	public boolean removeMember(int memberId) {
		// 순서가 없는 set 인터페이스에서는 get(i) 메서드 사용 불가
		// iterator 사용
		Iterator<Member> ir=arrayList.iterator(); // Iterator 반환
		while(ir.hasNext()) { // 요소가 있는 동안
			Member member=ir.next(); // 다음 회원을 반환 받음
			int tempId=member.getMemberId(); 
			if(tempId==memberId) { // 회원 아이디가 매개변수와 일치하면
				arrayList.remove(member); // 해당 회원 삭제
				return true; // true 반환
			}
		}
		// 끝날 때까지 삭제하려는 값을 찾지 못한 경우
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
		/*for(int i=0; i<arrayList.size(); i++) {
			Member member=arrayList.get(i); // 회원을 순차적으로 가져옴
			int tempId=member.getMemberId(); // member들의 id를 가져와서 tempId에 대입
			if(tempId==memberId) { // 회원 아이디가 매개변수와 일치하면
				arrayList.remove(i); // 해당 회원 삭제
				return true;
			}
		}
	
		System.out.println(memberId+"가 존재하지 않습니다."); // 못찾았으면
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
