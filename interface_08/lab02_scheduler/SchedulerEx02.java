package interface_08.lab02_scheduler;

import java.util.Scanner;

public class SchedulerEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("전화 상담 할당 방식을 선택하세요.");
			System.out.println("R : 한명씩 차례로 할당");
			System.out.println("L : 쉬고있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P : 우선순위가 가장 높은 고객에게 할당");
			System.out.print("위의 문자를 넣으세요 >> ");
			
			String ch = sc.next();
			Scheduler scheduler = null;
			
			if (ch.equals("R") || ch.equals("r")) {
				scheduler = new RoundRobin();
			} 
			else if(ch.equals("L") ||ch.equals("l")) {
				scheduler = new LeastJob();
			} 
			else if(ch.equals("P")||ch.equals("p")) {
				scheduler = new PriorityAllocation();
			} 
			else if(ch.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			} 
			else {
				System.out.println("지원되지 않는 기능입니다.");
				return ;
			}
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
			System.out.println();;
			System.out.println("==============================================");
		}
		
		sc.close();;

	}

}
