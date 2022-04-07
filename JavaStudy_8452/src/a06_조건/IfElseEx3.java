package a06_조건;

import java.util.Scanner;

public class IfElseEx3 {

		public static void main(String[] args) {
			/*
			 * 하나의 수를 입력받아 그 수가 홀수인지 짝수인지 판별
			 * 하지만 0은 0입니다 로 출력
			 * 
			 * 수를 입력해주세요: 3
			 * 
			 * 홀수입니다.
			 */
			Scanner sc = new Scanner(System.in);
			int num = 0;
			String result = null;
			
			System.out.print("수를 입력해주세요: ");
			num = sc.nextInt();
			
			if(num == 0) {
				result = "0";
			}else {
				if(num % 2 == 0) {
					result = "짝수";
				}else {
					result = "홀수";
				}
			}
			System.out.println(result + "입니다.");
			
		}
}
