package a06_조건;

import java.util.Scanner;

public class IfElseEx4 {

	public static void main(String[] args) {
		/*
		 * 세 수 중에 가장 큰 수를 찾는 문제
		 * 
		 * 세 수를 입력해 주세요: 1 3 5
		 * 
		 * 가장 큰 수는 5입니다. 세 수 모두 같습니다.
		 */

		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int z = 0;
		int result = 0;

		System.out.print("세 수를 입력해 주세요: ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();

		if (x == y && x == z) {
			System.out.println("세 수 모두 같습니다.");
		} else {
			if (x > y) {
				result = x;
			} else {
				result = y;
			}
			if (result < z) {
				result = z;
			}
			System.out.println("가장 큰  수는 " + result + "입니다.");
		}
	}
}
