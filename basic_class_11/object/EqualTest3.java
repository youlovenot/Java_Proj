package basic_class_11.object;
class Student3{
	int studentID;
	String studentName;
	int grade;
	public Student3(int studentID, String studentName,int grade) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
	}
	/* 문제:
	 * 1. toString() 메소드 재정의 해서 객체를 출력했을때, 이름과 학년을 출력
	 * 2. equals() 메소드 재정의 해서 studentName 같을때 True를 리턴 받도록 재정의,
	 * 3. hashcode() 메소드도 재정의
	 */
	@Override
	public String toString() {
		return studentName+", "+grade;
	}
	@Override
	public boolean equals (Object o) {		//업캐스팅
		if(o instanceof Student3) {
			Student3 std = (Student3)o;		//다운캐스팅
			if(studentName==std.studentName)
				return true;
			else
				return false;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return studentID;
	}
}
public class EqualTest3 {

	public static void main(String[] args) {
		Student3 std3 = new Student3(100, "강감찬", 3);
		Student3 std4 = new Student3(200, "강감찬", 4);
		Student3 std5 = new Student3(300, "홍길동", 5);
		Student3 std6 = std5;
		
		System.out.println(std3);								//16진수, Hashcode: 메모리
		System.out.println(System.identityHashCode(std3));		//10진수
		System.out.println(System.identityHashCode(std4));
		System.out.println(System.identityHashCode(std5));
		System.out.println(System.identityHashCode(std6));
		System.out.println(std3==std4);				// 객체의 주소 비교
		
		System.out.println(std3.equals(std4));
				// Object Class의 상속되는 equals()메소드는 주소값을 비교
		System.out.println(std4.equals(std5));
		
	}

}
