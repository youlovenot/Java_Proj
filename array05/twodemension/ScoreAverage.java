package array05.twodemension;

public class ScoreAverage {

	public static void main(String[] args) {
		// 2차원 배열로 학년의 각 학기별(1학기,2하기)로 성적을 저장 하고, 4년간 전체 평점 평균을 구함
		double score[][] =
			{ {3.3,3.4},	//1학년 (1학기,2학기)
			  {3.5,3.6},	//2학년 (1학기,2학기)
			  {3.7,4.0},	//3학년 (1학기,2학기)
			  {4.1,4.2} };	//4학년 (1학기,2학기)
		double sum =0;
		for (int year=0;year<score.length;year++) {				//행을 루프
			for(int term=0;term<score[year].length;term++) {	//열을 루프
				sum+=score[year][term];		//전체 평점의 합
			}
		}
		int n = score.length;		//행의 갯수 : 4
		int m = score[0].length;	//열의 갯수 : 2
		System.out.println("4학년 전체 성적의 합은 : "+sum);
		System.out.println("4학년 전체 평균 : "+sum/(n*m));
	}

}
