package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList=new MemberArrayList();
		
		Member memberLee=new Member(1001,"������"); // ���ο� ȸ�� �ν��Ͻ� ����
		Member memberSon=new Member(1002,"�չα�");
		Member memberPark=new Member(1003,"�ڼ���");
		Member memberHong=new Member(1004,"ȫ�浿");
		Member memberSong=new Member(1005,"�ۻ��");
		
		memberArrayList.addMember(memberLee); // ���� �� ArrayList�� ȸ�� �߰�
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.addMember(6, memberSong);
		
		System.out.println(memberArrayList.size()); // ����(�߰��� �� �ε����� ����)
		
		/*memberArrayList.addMember(memberLee); // ���� �� ArrayList�� ȸ�� �߰�
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberId()); // ��� ����
		memberArrayList.showAllMember();*/
	}

}
