package object06.hide;

public class StudentTest {

	public static void main(String[] args) {
		Student stdLee = new Student();
	//	stdLee.studentName = "이상훈";[x]		//private : 접근불가

		stdLee.setStudentName("이상훈");		//private으로 선언된 변수에 setter를 통한 변수값 할당.

		System.out.println("이름 출력 : "+stdLee.getStudentName());	//getter를 통해서 변수의 값을 받아온다.

	}

}
