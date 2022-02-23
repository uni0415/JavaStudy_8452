package a06_조건;

import java.util.Scanner;

public class IfElseEx5 {

	public static void main(String[] args) {
		/*
		 * 점수를 입력받아서 해당 점수가 몇 학점인지 출력하는 문제
		 * 
		 * 점수를 입력해주세요: 85
		 * 
		 * 학생의 평점은 B학점입니다.
		 * 
		 * 점수는 0 ~ 100사이만 입력이 가능 그 외의 값이 들어왔을 때는 점수는 0 ~ 100사이만 입력이 가능합니다. 출력 90 ~ 100 A
		 * 80 ~ 89 B 70 ~ 79 C 60 ~ 69 D 0 ~ 59 F
		 */

		Scanner sc = new Scanner(System.in);
		int score = 0;
		String grade = null;

		System.out.print("점수를 입력해주세요: ");
		score = sc.nextInt();

		if (score < 0 || score > 100) {
			System.out.println("점수는 0 ~ 100사이만 입력이 가능합니다.");
		} else {
			if (score > 89) {
				grade = "A";
			} else if (score > 79) {
				grade = "B";
			} else if (score > 69) {
				grade = "C";
			} else if (score > 59) {
				grade = "D";
			} else {
				grade = "F";
			}
			System.out.println("학생의 평점은 " + grade + "학점입니다.");
		}

	}
}
