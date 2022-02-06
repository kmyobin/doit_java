package map.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberHashMap=new MemberTreeMap();
		
		Member memberPark=new Member(1003,"�ڼ���");
		Member memberLee=new Member(1001,"������");
		Member memberHong=new Member(1004,"ȫ�浿");
		Member memberSon=new Member(1002,"�չα�");
		
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberPark);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004); // ȸ�� ���̵� 1004�� ȸ�� ����
		memberHashMap.showAllMember();
	}

}
