package array05;

public class ArrayCopy {	//배열의 복사, 배열은 초기에 배열방의 갯수가 선언되고 자동으로 늘어나지 않습니다.
							//배열의 더많은 정보를 넣기 위해서는 새로운 배열을 만들고 기존 배열의 값을 복사

	public static void main(String[] args) {
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1,2,3,4,5};
		int[] array3 = new int[10];	// 새로운 배열의 방 10개 생성
		int[] array4 = new int[20];

		//System.arraycopy(<복사할원본>, <원본주소>, <복사할대상>, <대상주소>, <복사할갯수>);
		System.arraycopy(array1, 0, array2, 1, 4);
		System.arraycopy(array2, 0, array3, 0, 5);
		System.arraycopy(array1, 2, array4, 0, 3);
		
		for (int i=0;i<array2.length;i++) {
			System.out.printf("%-5d", array2[i]);
		}
		System.out.println("\n================================================");
		for (int i=0;i<array3.length;i++) {
			System.out.printf("%-5d",array3[i]);
		}
		System.out.println("\n================================================");
		array3[5] = 500;
		array3[6] = 600;
		array3[7] = 700;
		for (int i=0;i<array3.length;i++) {
			System.out.printf("%-5d",array3[i]);
		}
		System.out.println("\n================================================");
		for (int i=0;i<array4.length;i++) {
			System.out.printf("%-5d",array4[i]);
		}
	}
}
