package exception_10;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int[] arr = new int[5];		// 배열의 방 5개 샐성
		
		for (int i=0;i<=arr.length;i++) {	// Exception 발생. 배열의 인덱스를 넘겨버림.
									//ArrayIndexOutOfBoundsException: 배열의 인덱스를 넘겨버렸을때 발생
			arr[i] = i;
			System.out.println(arr[i]);
		}
		System.out.println("프로그램 정상종료");
	}

}
