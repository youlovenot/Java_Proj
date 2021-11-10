package basic_class_11.object;

class Student2{
	int studentID;
	String studentName;
	
	public Student2 (int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		
		return studentID+", "+studentName;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student2) {
			Student2 std = (Student2)obj;
			if(studentID == std.studentID)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public int hashCode() {		//equals() 메소드를 오버라이딩 해서 객체의 값을 비교할때
		return studentID;		//비교하는 변수의 hashCode() 메소드를 오버라이딩 해야한다.
	}
	
	
}

public class EqualTest2 {

	public static void main(String[] args) {
		Student2 Lee = new Student2(1000,"이순신");
		Student2 Lee2 = new Student2 (1000,"이순신");
		System.out.println(Lee);
		System.out.println(Lee==Lee2);			// false (주소비교)
		System.out.println(Lee.equals(Lee2));	// false (주소비교)
			// Object Class의 equals() 매소드는 주소를 비교합니다.
			// 객체의 studentID가 같은 경우 같다라고 재정의 equals() 매소드를 오버라이딩 합니다.

		System.out.println("Lee의 hashCode: "+Lee.hashCode());
		System.out.println("Lee2의 hashCode: "+Lee2.hashCode());
		
		System.out.println("Lee의 실제 주소값: "+System.identityHashCode(Lee));
		System.out.println("Lee2의 실제 주소값: "+System.identityHashCode(Lee2));
		
	}

}
