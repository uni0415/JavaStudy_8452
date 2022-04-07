package a07_반복.퀴즈;

import java.util.Scanner;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
		for(int i = 0; i< 5; i++) {
			for(int j = 0; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<(i*2)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
