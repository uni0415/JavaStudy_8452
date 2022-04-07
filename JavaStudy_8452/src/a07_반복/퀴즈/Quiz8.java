package a07_반복.퀴즈;

public class Quiz8 {
	public static void main(String[] args) {
		/*
		 * 1 ~ 2001
		 * 윤달이면 출력
		 * 윤달이 아니면 출력x
		 * 4의 배수이면서, 100의 배수가 아닐때 또는 400의 배수인것
		 */
		
		for(int i = 0; i<2002; i++) {
			int year = i + 1;
			if(!((year%4==0) && (!(year%100==0) || year%400==0))) {
				continue;								
			}else {
				System.out.println(year);
			}
		}
	}
}
