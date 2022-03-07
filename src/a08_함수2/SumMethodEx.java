package a08_함수2;

import java.util.Scanner;

public class SumMethodEx {
	
	/*
	 * 숫자 4개를 입력받는다.
	 * a, b, c, d
	 * 숫자 4개를 모두 입력받아서 리턴하여 total 변수를 출력하시오.
	 */
	public static void printInput(int a, int b, int c, int d) {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
	}

	public static int sum(int a, int b, int c, int d) {
		int total = a + b + c + d;
		return total;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 4개 입력: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		
		System.out.println("total: "+ sum(a, b, c, d));
	}
}
