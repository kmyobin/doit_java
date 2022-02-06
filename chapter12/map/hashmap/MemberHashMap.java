package map.hashmap;

import java.util.HashMap;
// put(key, value) // containsKey(key) // keySet() : 모든 key 값이 set 객체로 반환 // get(key)
// Map 인터페이스는 모든 자료를 한 번에 순회할 수 없으므로 key 값을 먼저 가져와서 key 값에 해당하는 value를 찾아야함
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap; // HashMap으로 만듦
	
	public MemberHashMap() {
		hashMap=new HashMap<Integer, Member>(); // key = memberId, value = member
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member); // HashMap에 회원 추가 (key, value)
	}
	
	public boolean reomveMember(int memberId) {
		if(hashMap.containsKey(memberId)) { // hashMap에 매개변수로 받은 키 값이 있다면
			hashMap.remove(memberId); // 해당 회원 삭제
			return true;
		}
		System.out.println(memberId+"가 존재하지 않습니다."); // if문에 들어가지 않았다면 Id가 없는 것
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir=hashMap.keySet().iterator(); // HashMap은 순회 x이므로 iterator 사용 -> key 순회 가능
		while(ir.hasNext()) { // 다음 key가 있으면
			int key=ir.next(); // key값 가져오고
			Member member=hashMap.get(key); // key로부터 value 가져오기
			System.out.println(member);
		}
		System.out.println();
	}
}
