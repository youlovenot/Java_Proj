package array05;
public class ReturnArray {
	static int[] makeArray() {
		int temp[] = new int[4];	//정수형 배열 방 4개 생성
		for (int i=0;i<temp.length;i++) {	//for문을 사용해서 각방에 정수값을 할당
			temp[i] = i;	//배열의 각방에 값 : 0,1,2,3
		}
		return temp;
	}
	public static void main(String[] args) {
		int intArray[];		//int[] intArray
		intArray = makeArray();		//메소드로 부터 배열을 전달받음.
		for (int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println("\n======================");
		intArray[0] = 50;
		intArray[1] = 60;
		intArray[2] = 70;
		intArray[3] = 80;
		
		for(int a : intArray) {
			System.out.print(a+" ");
		}
	}
}

//P 154
//P 157 A
//P 158