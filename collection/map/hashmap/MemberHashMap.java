package collection.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;
	/*
	 * Map: 1. Key-Value 쌍으로 저장
	 * 		2. Key에는 중복된 값을 넣을 수 없다
	 * 			- Value는 중복된 값을 넣을 수 있다.
	 * 		3. 방번호가 없다. (index 값을 가지지 않는다.)
	 * 		4. Key는 Hash 알고리즘을 사용해서 검색이 빠르다. ( index = hash(key) )
	 * 			- Hash알고리즘은 검색이 제일 빠른 알고리즘이다.
	 * 		5. HashMap - 순서없이 저장
	 * 		6. TreeMap - 순서를 가지고 저장, 출력 (오름차순, 내림차순)
	 */
public class MemberHashMap {
	private HashMap<Integer,Member> hashMap;	//HashMap: <Key, Values>
	public MemberHashMap() {	//생성자
		hashMap = new HashMap<Integer, Member>();	//HashMap 생성
	}
	public void addMember(Member member) {
		hashMap.put(member.getMemberid(), member);	//HashMamp에 값을 저장할때 put() 메소드 사용.
	}
	public boolean removeMember(int memberid) {
		if (hashMap.containsKey(memberid)) {	//HashMap에서 값을 검색할때 key를 이용
												//containsKey() 키 값을 검색.
			hashMap.remove(memberid);	//HashMap에서는 Key를 삭제하면 Key-Value가 삭제
			return true;
		}
		System.out.println(memberid+"가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		//Iterator를 사용해서 출력
		System.out.println("=====Iterator를 사용해서 출력=====");
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);	//get(key): key에 대한 Value값을 가져온다.
			System.out.println(member);
		}
		System.out.println();
		
		//for문을 사용해서 출력
		System.out.println("=====foreach문을 사용해서 출력=====");
		for(Integer i : hashMap.keySet()) {
			Member member = hashMap.get(i);
			System.out.println(member);
		}
	}
}
