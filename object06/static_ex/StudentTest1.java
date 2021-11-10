package object06.static_ex;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.setStudentName("이자바");
		System.out.println(studentLee.serialNum);	//객체를 생성후 static맴버 출력
		studentLee.serialNum++;
		
		Student studentKim = new Student();
		studentKim.setStudentName("김자바");
		System.out.println(studentKim.serialNum);
		studentKim.serialNum++;
		
		System.out.println();
		
		System.out.println(Student.serialNum);		//객체 생성없이 static맴버 호출가능
		
		Student.serialNum++;
		
		System.out.println();
		
		System.out.println(Student.getSerialNum());

	}

}
