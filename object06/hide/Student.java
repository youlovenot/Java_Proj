package object06.hide;

public class Student {
	int studentID;					//학번
	private String studentName;		//학생이름, private : <정보의 은닉>, setter를 사용해서 외부에서 값을 할당.
	int grade;						//학년
	String address;					//주소
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
			//getter : 변수의 값을 돌려줄때 사용하는 메소드, public
			//setter : 변수의 값을 할당할때 사용하는 메소드, public
	/*
	public String getStudentName() {					//getter
		return studentName;
	}
	public void setStudentName(String studentName) {	//setter
		this.studentName = studentName;
	}
	 */
	
	//자동으로 getter, setter만들기
	
}
