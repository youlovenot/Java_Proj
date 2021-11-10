package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet;	//HashSet 객체변수 선언
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();	//생성자 호출시에 객체 변수 생성
	}
	public void addMember(Member member) {
		hashSet.add(member);
	}
	public boolean removeMember(int memberid) {	//삭제를 할 경우 memberid에 해당한느 값을 검색
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {			//다음 값이 존재하면 true
			Member member = ir.next();	//객체를 가지고와서 member 변수에 저장
			int tempid = member.getMemberid();
			if(tempid == memberid) {
				hashSet.remove(member);		//방번호로 삭제하는것이 아니라 객체 이름으로 삭제
				return true;
			}
		}
		
		System.out.println("해당 아이디가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {			// hashSet에 저장된 모든 내용을 출력
		for (Member member:hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
