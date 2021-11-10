package inheritance_07.lab10_downcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s= new Student("홍길동");		//s는 Person,Student의 필드와 메소드 접근
		
		p=s;		//업캐스팅 Person p = new Student();
				//업캐스팅된 p는 Person의 필드와 메소드만 접근
				//단, 메소드 오버라이딩된 메소드에 접근했을때 동적바인딩에의해서 자식의 메소드를 호출
		
		System.out.println(p.name);
		
		p.fly();	//동적바인딩 적용, 자식클래스의 fly()가 출력
		
		//p.grade = "A";			//오류
		//p.department = "Com";	//오류
	}
}