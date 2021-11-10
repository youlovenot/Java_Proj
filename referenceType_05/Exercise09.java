package referenceType_05;
import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;			//종료 전까지 루프
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {	//학생수를 입력 받고, 배열의 크기를 입력받은 학생수로 지정.
				//작성위치
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			}else if(selectNo==2) {	//각각의 배열방에 학생들의 점수를 입력
				//작성위치
				for (int i=0;i<scores.length;i++) {
					System.out.print("scores["+i+"]: ");
					scores[i] = scanner.nextInt();
				}
			}else if(selectNo==3) {
				//작성위치
				for (int i=0;i<scores.length;i++)
					System.out.println("scores["+i+"]: "+scores[i]);
			}else if(selectNo==4) {
				//작성위치
				int max=0;
				int sum=0;
				double avg;
				for (int i=0;i<scores.length;i++) {
					max = (max<scores[i])? scores[i] : max;		//삼항연산자 (변수 = 조건식 ? 참 : 거짓)
					sum+=scores[i];
				}
				avg=(double)sum/studentNum;
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);
			}else if(selectNo==5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
