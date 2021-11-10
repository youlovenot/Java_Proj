package ex1;

public class No14 {
	public static void main(String[] args) {
		int[] array = new int[10];	//배열 선언및 방의 갯수
		double avg=0;				//배열의 각방의 평균을 구하는 변수
		System.out.print("랜덤한 정수들 :");
		for(int s : array) {
			s = (int)(Math.random()*10+1);	//각 방에 랜덤한 정수값을 저장 (1~10)
			System.out.printf(" %d",s);;
			avg+=s;	//avg = avg + array[i]
		}
		avg/=array.length;
		System.out.println("\n평균은 "+avg);
	}
}
