package basic_class_11.object;

public class String_Ex02 {	//concat(): 두 문자열을 연결해서 출력: 가비지가 발생
							//작은 양의 문자열을 연결할 때 사용.
							//별도의 메모리 영역을 새로 생성 연결,
	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값: "+System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androidStr);	// concat(): 두개의 문자열을 연결해서 출력.
		
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소 값: "+System.identityHashCode(javaStr));

	}

}
