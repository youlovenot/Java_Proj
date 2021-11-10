package ex1;

public class Max {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {4,5,1,2,3};
		//작성위치
		max = array[0];
		for(int i=1;i<array.length;i++) {
			if(max<array[i])
				max=array[i];
		}
		System.out.println("max: "+max);
	}
}
