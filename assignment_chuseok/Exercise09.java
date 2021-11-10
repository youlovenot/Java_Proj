package assignment_chuseok;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		ArrayList<Student> stdList = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				for (int i=0;i<studentNum;i++) {
					stdList.add(new Student());
					stdList.get(i).number=i;
				}
				break;
			case 2:
				for (Student student : stdList) {
					System.out.print("score["+student.number+"]> ");;
					student.setScore(sc.nextInt());
				}
				break;
			case 3:
				for (Student student : stdList) {
					System.out.println("score["+student.number+"]> "
							+student.getScore());;
				}
				break;
			case 4:
				int max=0;
				int sum=0;
				double avg=0;
				for (Student student : stdList) {
					max=max<student.getScore()?student.getScore():max;
					sum+=student.getScore();
				}
				avg = (double)sum/stdList.size();
				System.out.println("최고 점수: "+max+"\n평균 점수: "+avg);
				break;
			case 5:
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
