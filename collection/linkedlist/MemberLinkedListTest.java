package collection.linkedlist;

import collection.Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {
		MemberLinkedList memberArrayList = new MemberLinkedList();
		
		Member memberLee = new Member(1001,"이지원");		//Member객체 생성
		Member memberSon = new Member(1002,"손민국");
		Member memberPark = new Member(1003,"박서원");
		Member memberHong = new Member(1004,"홍길동");
		
		memberArrayList.addMember(memberLee);	//LinkedList에 객체 추가
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		System.out.println("=====LinkedList 모든 객체 출력=====");
		memberArrayList.showAllMember();
		
		System.out.println("=====LinkedList의 특정방에 값을 추가=====");
		memberArrayList.addMember(1, memberHong);
		memberArrayList.showAllMember();
		
		System.out.println("=====특정회원 삭제=====");
		memberArrayList.removeMember(1002);		//memberid 값을 직접 넣어서 삭제
		memberArrayList.removeMember(memberHong.getMemberid());
		memberArrayList.showAllMember();
	}

}
