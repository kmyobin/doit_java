package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList=new MemberArrayList();
		
		Member memberLee=new Member(1001,"이지원"); // 새로운 회원 인스턴스 생성
		Member memberSon=new Member(1002,"손민국");
		Member memberPark=new Member(1003,"박서훤");
		Member memberHong=new Member(1004,"홍길동");
		Member memberSong=new Member(1005,"송상민");
		
		memberArrayList.addMember(memberLee); // 생성 후 ArrayList에 회원 추가
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.addMember(6, memberSong);
		
		System.out.println(memberArrayList.size()); // 오류(중간에 빈 인덱스가 생김)
		
		/*memberArrayList.addMember(memberLee); // 생성 후 ArrayList에 회원 추가
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberId()); // 멤버 삭제
		memberArrayList.showAllMember();*/
	}

}
