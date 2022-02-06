package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet=new MemberTreeSet();
		
		Member memberPark=new Member(1003,"박서훤");
		Member memberLee=new Member(1001,"이지원");
		Member memberSon=new Member(1002,"손민국");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		
		Member memberHong=new Member(1003,"홍길동"); // 아이디 중복 회원 추가
		memberTreeSet.addMember(memberHong); // 안됨.. 무슨 기준으로 정렬할 건지 설명을 안해줬잔하
		memberTreeSet.showAllMember();
	}

}
