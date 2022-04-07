package a07_반복;

import java.util.Scanner;

public class GugudanInput {
	public static void main(String[] args) {
		/*
		 * 1. 몇단부터 몇단까지 출력할 것인지 입력
		 * start index: 5
		 * end index: 8
		 */
		Scanner sc = new Scanner(System.in);
		int startIndex = 0;
		int endIndex = 0;
		System.out.print("start index: ");
		startIndex = sc.nextInt();
		System.out.print("end index: ");
		endIndex = sc.nextInt();
		System.out.println();
		
//		for(; startIndex < endIndex+1; startIndex++) {
//			System.out.println(startIndex+"단");
//			for(int i=0; i < 9; i++) {
//				System.out.println(startIndex + " X " + (i+1) + " = " + endIndex*(i+1));
//			}
//			System.out.println();
//		}
		
		
		while(startIndex < endIndex+1) {
			int i = 0;
			System.out.println(startIndex+"단");
			while(i < 9) {
				System.out.println(startIndex+" X "+(i+1)+" = "+ (startIndex*(i+1)));
				i++;
			}
			startIndex++;
			System.out.println();
		}
		
	}
}
