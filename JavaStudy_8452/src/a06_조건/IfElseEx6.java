package a06_조건;

import java.util.Scanner;

public class IfElseEx6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		int result = 0;
		
		System.out.print("x축: ");
		x = sc.nextInt();
		System.out.print("y축: ");
		y = sc.nextInt();
		
		if(x == 0 && x == y) {
			System.out.println("원점입니다.");
		}else {
			if(x > 0 && y > 0) {
				result = 1;
			}else if(x < 0 && y > 0) {
				result = 2;
			}else if(x < 0 && y < 0) {
				result = 3;
			}else {
				result = 4;
			}
			System.out.println(result+"사분면입니다.");
		}
	}
}
