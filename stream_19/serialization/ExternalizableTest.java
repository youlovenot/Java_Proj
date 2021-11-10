package stream_19.serialization;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

//Externalizable : 세부적인 컨트롤을 하면서 직렬화 가능 (메소드 제공됨)

class Dog implements Externalizable {
	String name;
	int age;
	
	public Dog() {}
	public Dog(String name, int age) {
		this.name = name; this.age = age;
	}
	
	@Override
	public String toString() {
		return name + ", " + age;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);		//출력시 호출되는 메소드 (아웃풋 스트림)
		out.writeInt(age);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();	//인풋시 호출되는 메소드 (인풋 스트림)
		age = in.readInt();
	}
}

public class ExternalizableTest {

	public static void main(String[] args) throws IOException {
		Dog myDog = new Dog("댕댕이",3);
		Dog yourDog = new Dog("누렁이",2);
		
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\dog.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(myDog);
		oos.writeObject(yourDog);
		
		System.out.println("===직렬화 성공(Externalizable)");
		
		oos.close();
		
	}

}
