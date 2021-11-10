package array05;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		double[] data = new double[5];	//double형 배열변수 data에 방을 5개 생성
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		System.out.println(data.length);	//배열변수의 방의 갯수를 출력
		
		double sum = 0.0;
		double total = 1.0;
	
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
			sum+=data[i];		//sum = sum + data[i]
		}
		System.out.println("총 합은 : "+sum);
		
		for (int i=0;i<3;i++) {
			total*=data[i]; 
		}
		System.out.println("배열의 모든수를 곱한 결과는 "+total);
	}
}
