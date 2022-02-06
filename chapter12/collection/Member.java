package collection;

public class Member implements Comparable<Member> {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId=memberId;
		this.memberName=memberName;
	}
	
	public int getMemberId() {return memberId;}
	
	public void setMemberId(int memberId) {this.memberId=memberId;}
	
	public String getMemberName() {return memberName;}
	
	public void setMemberNAme(String memberName) {this.memberName=memberName;}
	
	@Override
	public String toString() {
		return memberName+" 회원님의 아이디는 "+memberId+"입니다."; // toString() 메서드 재정의
	}

	@Override
	public int hashCode() {
		return memberId; // 회원 아이디를 반환하도록 재정의
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member=(Member)obj;
			if(this.memberId==member.memberId) {return true;} 
			else {return false;}
		}
		return false;
	}

	@Override
	public int compareTo(Member member) { // this 값 크면 오름차순 정렬. this 값 작으면 내림차순 정렬
		// 객체가 TreeSet에 요소를 추가할 때 호출되는 메서드
		return (this.memberId-member.memberId); // 새 아이디 - 기존 아이디 
		// 새 아이디가 더 크면 양수.(오른쪽)
		// 새 아이디가 더 작으면 음수.(왼쪽)
		
		/*
		 * 내림차순 정렬하려면
		 * return (this.memberId-member.memberId)*(-1)); // 내림차순으로 정렬하기 위해 반환 값을 음수로 만듦
		 */
	}
}
