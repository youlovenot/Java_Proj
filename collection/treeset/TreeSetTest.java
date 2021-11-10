package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	// 1. a~z(가나다순)정렬해서 저장. (오름차순)	<== HashSet과의 차이점
			//Comparable 인터페이스의 compareTo()메소드를 재정의 했기 때문이다
	// 2. 중복된 값을 저장하지 않음
	// 3. indext가 없다. (방번호가 없다) => Iterator를 사용

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();	//TreeSet선언
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		System.out.println(treeSet);
		System.out.println("=====foreach문으로 출력=====");
		
		treeSet.add("D");
		treeSet.add("K");
		treeSet.add("A");
		treeSet.add("G");
		treeSet.add("Z");
		treeSet.add("X");
		
		for (String s : treeSet) {			//향상된 For 문으로 출력
			System.out.print(s+" ");
		}
		System.out.println();
		
		System.out.println("=====Iterator로 출력=====");
		Iterator<String> ir = treeSet.iterator();
		while(ir.hasNext()) {
			String s = ir.next();
			System.out.print(s+" ");
		}
		System.out.println();
		
	}

}
