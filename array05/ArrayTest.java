package array05;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] number = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		number[0] = 50;				//배열 index : 0에 50 값을 할당
		number[1] = 60;
		number[2] = 70;
		number[3] = 80;
		
		System.out.println(number[3]);
		
		System.out.println("length : "+number.length);
		
		for (int i=0;i<number.length;i++)
			System.out.println(number[i]);
		System.out.println("===========================================");
		System.out.println(number[0]);
		
	}
}
