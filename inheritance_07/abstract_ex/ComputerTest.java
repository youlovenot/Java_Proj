package inheritance_07.abstract_ex;

import java.util.ArrayList;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1 = new Computer();	//추상 클래스이므로 객체 생성이 불가
		Computer c2 = new Desktop();	//콘크리트 클래스이므로 객체 생성 가능
		//Computer c3 = new NoteBook();	//추상 클래스이므로 객체 생성이 불가
		Computer c4 = new MyNoteBook();	//콘크리트 클래스이므로 객체 생성 가능
		
		System.out.println("======================================== DeskTop 객체 정보");
		c2.display();		//desktop
		c2.typing();		//desktop
		c2.turnOn();		//desktop
		c2.turnOff();		//desktop

		System.out.println("======================================== MyNoteBook 객체 정보");
		c4.display();		//NoteBook
		c4.typing();		//MyNoteBook
		c4.turnOn();		//Computer
		c4.turnOff();		//Computer
		

		System.out.println("======================================== 각각의 클래스의 메소드 호출");
		((Desktop)c2).desktopOnly();
		((NoteBook)c4).noteBookOnly();
		((MyNoteBook)c4).myNoteBookOnly();
		

		System.out.println("======================================== 각 클래스를 ArrayList에 저장후 출력");
		ArrayList<Computer> computerList = new ArrayList<Computer>();
		computerList.add(c2);	// index 0
		computerList.add(c4);	// index 1
		for (Computer computer : computerList) {
			computer.display();
			computer.typing();
			computer.turnOn();
			computer.turnOff();
			if (computer instanceof Desktop)
				((Desktop)computer).desktopOnly();
			if (computer instanceof NoteBook)
				((NoteBook)computer).noteBookOnly();
			if (computer instanceof MyNoteBook)
				((MyNoteBook)computer).myNoteBookOnly();
		}
	}
}
