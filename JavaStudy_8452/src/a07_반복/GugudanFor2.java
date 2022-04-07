package a07_반복;

import java.util.Scanner;

public class GugudanFor2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = 0;
		int end = 0;
		for(int i = 0; i < 8; i++) {
			int dan = i+2;
			System.out.println(dan+"단");
			for(int j = 0; j < 9; j++) {
				System.out.println(dan + " X " + (j+1) + " = " + dan*(j+1));
			}
			System.out.println();
		}
		
		start = sc.nextInt();
		end = sc.nextInt();
		
//		for(int i = 2; i<9;i++) {
//			int dan = i+2;
//			System.out.print(i+"단		");
//		}
//		System.out.println();
		for(int i = 1; i<10; i++) {
			for(; start<end; start++) {
				System.out.print(start+" X "+i+" = "+start*i+"	"); 
			}
			System.out.println();
		}
	}
}
