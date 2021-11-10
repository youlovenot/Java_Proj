package collection.linkedlist;

import java.util.LinkedList;

import collection.Member;

public class MemberLinkedList {
	
	private LinkedList<Member> linkedlist;	//선언
	
	
	public MemberLinkedList() {
		linkedlist = new LinkedList<Member>();
	}
	
	
	public void addMember(Member member) {	//LinkedList에 member 객체를 추가한다.
		linkedlist.add(member);
	}
	public void addMember(int a, Member member) {	//특정 방번호에 값을 출가
		linkedlist.add(a, member);
	}
	
	
	public boolean removeMember(int memberid) {	//Memberid를 인풋 받아 linkedlist에서 검색해서 삭제
		for (int i=0;i<linkedlist.size();i++) {
			Member member = linkedlist.get(i);
			int tempid = member.getMemberid();
			if (tempid==memberid) {
				linkedlist.remove(i);
				return true;
			}
		}
		System.out.println("아이디가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		/*
		for (Member member : linkedlist)
			System.out.println(member);
		*/
		for (int i= 0;i<linkedlist.size();i++) {
			Member member = linkedlist.get(i);
			System.out.println(member + " index 번호는: " + i);
		}
		
		System.out.println();
	}
}
