package a08_함수;

import java.util.Scanner;

public class MethodEx3 {

	public static void printStar(int startCount) {
		if(startCount < 1) {
			System.out.println("별의 개수는 1개 이상을 입력하셔야합니다.");
		}else {
			for(int i = 0; i < startCount; i++) {
				for(int j = 0; j < startCount - i - 1; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < (i * 2) + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		/*
		 * printStar(입력받은 별의 개수)
		 * 1보다 작은 음수가 들어왔을 때,
		 * 별의 개수는 1개 이상을 입력하셔야합니다.
		 */
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		
		System.out.print("반복 횟수 입력: ");
		n = scanner.nextInt();
		
		printStar(n);
	}

}
