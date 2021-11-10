package lamda_14.stream;

import java.util.Arrays;

public class InArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};		//배열의 스트림 사용: Arrays.stream(arr) <==스트림생성
		
		int sum = 0;
		for(int i = 0; i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("직접 계산한 합은: "+sum);
		
		System.out.println("===스트림을 통한 값===");
		
		int sumVal = Arrays.stream(arr).sum();	//배열의 모든 값을 더한값
		int count = (int)Arrays.stream(arr).count();	//배열의 방의 갯수를 리턴
		
		double avgVal = Arrays.stream(arr).average().getAsDouble();	//배열 방의 평균 값을 리턴
		int minVal = Arrays.stream(arr).min().getAsInt();
		int maxVal = Arrays.stream(arr).max().getAsInt();
		
		System.out.println("합: " + sumVal);
		System.out.println("방의 갯수: " + count);
		System.out.println("평균값: " + avgVal);
		System.out.println("최솟값: " + minVal);
		System.out.println("최댓값: " + maxVal);
		
	}

}
