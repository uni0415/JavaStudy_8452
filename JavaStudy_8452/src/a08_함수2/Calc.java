package a08_함수2;

import java.util.Scanner;

public class Calc {
	/*
	 * 매개변수는 모두 2개(정수)
	 * 
	 * sum 덧셈
	 * sub 뺄셈
	 * mul 곱셈
	 * div 나눗셈
	 * 매개변수 둘중 하나라도 0이면 0을 리턴
	 * 
	 * 두수를 입력
	 * 
	 * 더한결과:
	 * 뺀결과:
	 * 곱한결과:
	 * 나눈결과:
	 * 
	 */
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int div(int num1, int num2) {
		if(num1 == 0 || num2 == 0) {
			return 0;
		}
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		System.out.print("정수 2개 입력: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("더한결과: "+sum(num1, num2));
		System.out.println("뺀결과: "+sub(num1, num2));
		System.out.println("곱한결과: "+mul(num1, num2));
		System.out.println("나눈결과: "+div(num1, num2));
	}
}
