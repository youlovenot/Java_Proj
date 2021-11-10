package ex1;

import java.util.Scanner;

public class No16 {
	public static void main(String[] args) {
		String course[] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("과목 이름 >> ");
			String name = sc.next();		//문자열을 인풋 받을때 next()메소드 사용.
			if("그만".equals(name)) break;	//break;를 만나면 while문을 빠져 나온다.
			int n = -1;
			for(int i=0; i<course.length;i++) {
				if(course[i].equals(name)) {
					n=score[i];
					System.out.println(course[i]+"의 점수는 "+n);
				}
			}
			if (n==-1)
				System.out.println("없는 과목입니다.");
		}
		sc.close();
	}
}
