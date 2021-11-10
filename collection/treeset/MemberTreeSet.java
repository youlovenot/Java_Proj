package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member2;

public class MemberTreeSet {
	/*
	 * TreeSet: 1. 정렬해서 저장, Comparable 인터페이스를 구현 CompareTo() 메소드를 재정의
	 * 			2. 중복된 데이터의 저장을 허용하지 않습니다.
	 * 			3. index를 가지고 있지 않습니다.(방번호가 없다)
	 */
	
	
	private TreeSet<Member2> treeSet;	//TreeSet 선언
	public MemberTreeSet() {
		treeSet = new TreeSet<Member2>();
	}
	public void addMember(Member2 member) {
		treeSet.add(member);
	}
	public boolean removeMember(int memberid) {
		Iterator<Member2> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member2 member = ir.next();
			int tempid = member.getMemberid();	//treeSet에 저장된 객체의 memberid
			if(tempid==memberid) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println("해당 memberid: "+memberid+"를 찾을 수 없습니다.");
		return false;
	}
	public void showAllMemeber() {
/*		for(Member2 m : treeSet) {
			System.out.println(m);
		}
*/		Iterator<Member2> ir = treeSet.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}
	
}
