package collection.map.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member2;

/*
 * TreeMap: 1. Ket-Value 쌍으로 저장, Ket는 중복된 값을 넣을 수 없다. Value는 다른 키에 중복된 값을 넣을수 있다.
 * 			2. Tree는 정렬해서 저장, 출력 <<Comparable 인터페이스의 CompareTo() 메소드를 재정의 해줘야한다.
 * 					compareTo(): 정렬의 정의, (오름차순, 내림차순)
 */
public class MemberTreeMap {
	private TreeMap<Integer,Member2> treeMap;	//TreeMap 선언
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer,Member2>();	//TreeMap 생성
	}
	public void addMember(Member2 member) {
		treeMap.put(member.getMemberid(), member);
	}
	public boolean removeMember(int memberid) {
		if(treeMap.containsKey(memberid)) {
			treeMap.remove(memberid);		//Map에서 remove(삭제) => Key를 삭제
			return true;
		}
		System.out.println(memberid+"가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		System.out.println("=====Iterator를 사용해서 출력=====");
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member2 member = treeMap.get(key);	//key의 value값(member 객체)을 가져온다
			System.out.println(member);
		}
		System.out.println("=====foreach문을 사용해서 출력=====");
		for (int key : treeMap.keySet()) {
			Member2 member = treeMap.get(key);
			System.out.println(member);
		}
	}
}
