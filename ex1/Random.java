package ex1;

public class Random {

	public static void main(String[] args) {
		
		int n = (int)(Math.random()*3);	//0, 1, 2 값만 출력이 된다.
		System.out.println(n);
		
		System.out.println("=================================");
		System.out.println(Math.random());		//0.0000000000... ~ 0.99999999999...
		System.out.println(Math.random()*10);	//0.000000000... ~ 9.999999999...
		System.out.println((int)(Math.random()*10));	//0 ~ 9
		System.out.println((int)(Math.random()*10)+1);	//1 ~ 10

	}

}
