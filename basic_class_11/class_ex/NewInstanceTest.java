package basic_class_11.class_ex;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person();
		System.out.println(person1);	//new를 사용해서객체 생성
		
		Class pClass = Class.forName("basic_class_11.class_ex.Person");
		Person person2 = (Person) pClass.newInstance();
					//newInstance(): *.class 파일로 객체 생성
		System.out.println(person2);
	}

}
