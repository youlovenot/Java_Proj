package inheritance_07.lab2;

public class inheritanceEx {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.set();	//서브클래스의 set() 메소드 실행, 부모클래스의 필드에 값 할당
		
		System.out.println(s.age);		//슈퍼클래스의 나이출력
		System.out.println(s.name);		//슈퍼클래스의 이른을 출력
		System.out.println(s.height);	//슈퍼클래스의 키를 출력
		System.out.println(s.getWeight());	//슈퍼클래스의 몸무개를 출력
	}
}