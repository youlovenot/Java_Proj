package Practice;

import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Unum=-1;
		int Cnum = (int)(Math.random()*100+1);
		System.out.println("컴퓨터가 1~100 중 랜덤 숫자 하나를 정합니다.\n"
				+ "이 숫자를 맞춰 주세요.");
		for(int i=1;Unum!=Cnum;i++) {
			System.out.print("1~100 숫자 입력: ");
			Unum = sc.nextInt();
			if(Unum>Cnum)
				System.out.println("Down");
			else if(Unum<Cnum)
				System.out.println("Up");
			else
				System.out.println("정답입니다! "+i+"회 만에 맞췄어요.");
		}
		sc.close();
	}

}
