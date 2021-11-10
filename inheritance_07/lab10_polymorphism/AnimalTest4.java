package inheritance_07.lab10_polymorphism;
import java.util.ArrayList;		//객체를 저장하는 배열,
public class AnimalTest4 {
	
	ArrayList<Animal> aniList = new ArrayList<Animal>();	//선언
	public void addAnimal() {	//ArrayList에 객체를 추가하는 메소드
		aniList.add(new Human());	//객체가 ArrayList에 저장이 될때 업캐스팅이 된다.
		aniList.add(new Tiger());	//<Animal 타입으로>
		aniList.add(new Eagle());
		
		for (Animal ani : aniList) {	//배열의 저장된 객체를 순환하면서 출력
			ani.move();				//오버라이딩된 메소드 호출됨
		}
	}
	public void testCasting() {	//다운 캐스팅
		for (int i=0;i<aniList.size();i++) {	//aniList.size(): 배열의 방의 갯수
			Animal ani = aniList.get(i);	//aniList.get(i): 각방의 값을 가지고 올때
			if(ani instanceof Human) {
				Human h = (Human) ani;	//다운캐스팅
				h.readBook();
			} else if(ani instanceof Tiger) {
				Tiger t = (Tiger) ani;	//다운캐스팅
				t.hunting();
			} else if(ani instanceof Eagle) {
				Eagle e = (Eagle) ani;	//다운캐스팅
				e.flying();
			}else {
				System.out.println("지원되지 않는 타입입니다.");
			}
		}
	}

	public static void main(String[] args) {
		AnimalTest4 aTest = new AnimalTest4();
		aTest.addAnimal();
		System.out.println("==========================");
		System.out.println("<원래 타입으로 다운캐스팅 정보 출력>");
		System.out.println("==========================");
		aTest.testCasting();
	}
}