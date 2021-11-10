package ex1;

import java.util.Scanner;

public class No17 {
	public static void main(String[] args) {
		String str[] = {"가위","바위","보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("가위 바위 보! >> ");
			String user = sc.next();
			if(user.equals("그만")) break;
			int n = (int)(Math.random()*3);	//n은 0, 1, 2 중에서 랜덤하게 결정
			if (str[n].equals(user))
				System.out.println("사용자 = "+user+", 컴퓨터 = "+str[n]+
						" 비겼습니다.");
			else if(user.equals("가위")) {
				if(str[n].equals("바위"))
					System.out.println("사용자 = "+user+", 컴퓨터 = "+str[n]+
							" 컴퓨터가 이겼습니다.");
				else if(str[n].equals("보"))
					System.out.println("사용자 = "+user+", 컴퓨터 = "+str[n]+
							" 사용자가 이겼습니다.");
			}
			else if(user.equals("바위")) {
				if(str[n].equals("가위"))
					System.out.println("사용자 = "+user+", 컴퓨터 = "+str[n]+
							" 사용자가 이겼습니다.");
				else if(str[n].equals("보"))
					System.out.println("사용자 = "+user+", 컴퓨터 = "+str[n]+
							" 컴퓨터가 이겼습니다.");
			}
			else if(user.equals("보")) {
				if(str[n].equals("가위"))
					System.out.println("사용자 = "+user+", 컴퓨터 = "+str[n]+
							" 컴퓨터가 이겼습니다.");
				else if(str[n].equals("바위"))
					System.out.println("사용자 = "+user+", 컴퓨터 = "+str[n]+
							" 사용자가 이겼습니다.");
			}
		}
		sc.close();
	}
}
