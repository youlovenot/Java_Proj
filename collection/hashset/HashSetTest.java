package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	/*
		Set: 1. 순서대로 저장되지 않는다. (index 방번호가 없다.)
			 2. 중복된 값을 저장 할 수 없다. (ID, 주민번호, 쇼핑몰에서 주문번호)
			 3. 출력/삭제 할때, Iterator를 사용함.
	 */

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();	//HashSet을 선언, 생성
		hashSet.add("임정순");
		hashSet.add("홍길동");
		hashSet.add("이순신");		// 순서대로 저장되지 않는다.
		hashSet.add("강감찬");		// 중복된 값은 저장되지 않는다.
		hashSet.add("강감찬");
		hashSet.add("강감찬");
		hashSet.add("강감찬");
		hashSet.add("강감찬");
		
		System.out.println(hashSet);	// toString() 메소드가 재정의 되어 있다.
		System.out.println("=====Iterator를 사용해서 출력=====");
		
		Iterator<String> ir = hashSet.iterator();	//Iterator 생성
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
		

/*		System.out.println("=====HashSet에서 값을 삭제=====");
		
		hashSet.remove("강감찬")
		Iterator<String> ir2 = hashSet.iterator();	//Iterator 생성
		while (ir2.hasNext()) {
			System.out.println(ir2.next());
		}
*/		
	}

}
