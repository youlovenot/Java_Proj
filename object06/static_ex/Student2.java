package object06.static_ex;

public class Student2 {
	
	public static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public static int getSerialNum() {
		int i=10;
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {	//무결성을 제공 할 수 있다.
		Student.serialNum=serialNum;
	}

}

// P 238, 239. Calculator.java , CaculatorExample.java