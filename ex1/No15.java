package ex1;

public class No15 {
	public static void main(String[] args) {
		for(int i=1;i<100;i++) {
			int one = i%10;		// 일의 자리
			int ten = i/10;		// 십의 자리
			if((one!=0&&one%3==0)^(ten!=0&&ten%3==0))
				System.out.println(i+" 박수 짝");
			else if(one!=0&&one%3==0&&ten!=0&&ten%3==0)
				System.out.println(i+" 박수 짝짝");
		}
	}
}
