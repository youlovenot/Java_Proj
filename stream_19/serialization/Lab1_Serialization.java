package stream_19.serialization;

import java.io.*;	//java.io.* : java.io하위의 모든 클래스 import됨

class Student implements Serializable {
	
	private static final long serialVersionUID = 5806071770177472040L;
	
	String name;			//직렬화해서 (C:\\Temp\\student.dat)
	transient int id;					//역직렬화: 직렬화된 파일에서 변수의 값을 읽어온다.
	transient String phoneNumber;		//객체 3개 생성
	String email;
	
	Student(String name,int id,String phoneNumber,String email ){
		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + "\n학번: " + id +
				"\n전화번호: " + phoneNumber + "\n이메일: " + email;
	}
	
}

public class Lab1_Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Student studentA = new Student("홍길동", 1, "010-1111-1111", "aaa@aaa.com");
		Student studentB = new Student("이순신", 2, "010-2222-2222", "bbb@bbb.com");
		Student studentC = new Student("김유신", 3, "010-3333-3333", "ccc@ccc.com");
		
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\student.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(studentA);
		oos.writeObject(studentB);
		oos.writeObject(studentC);

		FileInputStream fis = new FileInputStream("C:\\Temp\\student.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s1=(Student)ois.readObject();
		Student s2=(Student)ois.readObject();
		Student s3=(Student)ois.readObject();
		
		System.out.println("=== 객체 정보 출력 toString(): 객체 자체 ===");
		System.out.println(s1);
		System.out.println();
		System.out.println(s2);
		System.out.println();
		System.out.println(s3);
		
		System.out.println();
		System.out.println("=== 객체의 내용으로 출력 ===");
		System.out.println(s1.name + ", " + s1.id + ", " + s1.phoneNumber + ", " + s1.email);
		System.out.println(s2.name + ", " + s2.id + ", " + s2.phoneNumber + ", " + s2.email);
		System.out.println(s3.name + ", " + s3.id + ", " + s3.phoneNumber + ", " + s3.email);

		oos.close();
		ois.close();
	}

}
