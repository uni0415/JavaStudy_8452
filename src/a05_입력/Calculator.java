package a05_입력;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int z = 0;
		int result = 0;
		
		System.out.print("세 수를 입력하세요: ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		result = x + y + z;
		System.out.println("세 수의 합: " + result);
		System.out.println();
		
		System.out.print("세 수를 입력하세요: ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		result = x * y * z;
		System.out.println("세 수의 곱: " + result);
		System.out.println();
		
		System.out.print("세 수를 입력하세요: ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		result = (x * y)%z;
		System.out.println("앞의 두 수의 곱에 세번째 수로 나눈 나머지: " + result);
	}
}
