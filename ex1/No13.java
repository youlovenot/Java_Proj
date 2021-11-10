package ex1;

import java.util.Scanner;

public class No13 {
	public static void main(String[] args) {
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //환산할 돈의 종류 배열에 저장
		System.out.print("금액을 입력하시오 >> ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		for(int i=0;i<unit.length;i++) {
			int n = money/unit[i];
			money %= unit[i];
			System.out.printf("%d원짜리 : %d개%n",unit[i],n);
		}
		sc.close();
	}
}
