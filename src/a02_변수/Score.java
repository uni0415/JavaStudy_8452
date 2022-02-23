package a02_변수;

public class Score {
	public static void main(String[] args) {
		double kor = 80.5;
		double eng = 90.0;
		double math = 75.8;
		
		double avg = 0;	//평균
		double total = 0;	//합계
		
		int iAvg = 0;	//각각의 점수에서 소수점을 뺀 평균
		int iTotal = 0;	//각각의 점수에서 소수점을 뺀 합계

		total = kor + eng + math;
		avg = total/3;
		
		iTotal = (int)kor + (int)eng + (int)math;
		iAvg = iTotal/3;
		
		
		System.out.println("평균1: "+avg);
		System.out.println("합계1: "+total);
		System.out.println("평균2: "+iAvg);
		System.out.println("합계2: "+iTotal);
	}
}
