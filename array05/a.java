package array05;
import java.util.Scanner;
public class a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 >> ");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.print(n+"개의 정수를 입력하세요 >> ");
		for (int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		int sum=0;
		System.out.println("입력한 정수는 다음과 같습니다.");
		for(int a:array) {
			System.out.printf("%-2d",a); sum+=a;
		}
		double avg = (double)sum/array.length;
		System.out.println("\n평균 : "+avg);
		sc.close();
	}
}