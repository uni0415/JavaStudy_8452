package a05_입력;

import java.util.Scanner;

public class ScoreEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String grade = null;
		
		System.out.print("성적을 입력해 주세요 : ");
		score = sc.nextInt();
		grade = score > -1 && score < 101 ?
				score > 89 ? "A" :
					score > 79 ? "B" : 
						score > 69 ? "C" : 
							score > 59 ? "D" :
								score > -1 ? "F" : "X"
												: "X";
		System.out.println("학생의 평점은 "+grade+"등급입니다");
	}
}
