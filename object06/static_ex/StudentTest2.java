package object06.static_ex;

public class StudentTest2 {

	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.studentName="이자바";
		System.out.println(studentLee.serialNum);
		System.out.println();

		Student2 studentKim = new Student2();
		studentLee.studentName="김자바";
		System.out.println(studentKim.serialNum);
		System.out.println();

		Student2 studentHong = new Student2();
		studentLee.studentName="홍자바";
		System.out.println(studentHong.serialNum);
		System.out.println();
		
	}

}
