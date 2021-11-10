package interface_08.lab02_scheduler;

import java.io.IOException;

public class SchedulerEx {

	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 쉬고있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 가장 높은 고객에게 할당");
		System.out.print("위의 문자를 넣으세요 >> ");
		
		int ch = System.in.read();	//예외 처리가 필요함.
		Scheduler scheduler = null;		//Scheduler 객체 선언
		
		if (ch =='R' || ch == 'r') {		//ch변수의 값이 R, r이면
			scheduler = new RoundRobin();	//scheduler 인스턴스 변수에 RoundRobin() 객체를 할당
		} else if(ch=='L' ||ch=='l') {
			scheduler = new LeastJob();		// 업캐스팅
		} else if(ch=='P'||ch=='p') {
			scheduler = new PriorityAllocation();	//업캐스팅
		}else {
			System.out.println("지원되지 않는 기능입니다.");
			return ;
		}
		scheduler.getNextCall();		//메소드 호출
		scheduler.sendCallToAgent();	
		
	}

}
