package lamda_14.stream;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayStreamTest {	//배열의 스트림 생성과 컬렉션의 스트림 생성

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		System.out.println("스트림을 사용해서 출력 (람다식이 사용됨)");
		Arrays.stream(arr).forEach(s -> System.out.println(s));
		
		System.out.println("for 문을 사용해서 출력");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("스트림을 사용해서 합계 구하기");
		int sum = Arrays.stream(arr).sum();
		System.out.println("합계: " + sum);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int sum2 = list.stream().mapToInt(n -> n.intValue()).sum();
		System.out.println("합계2: " + sum2);
	}

}
