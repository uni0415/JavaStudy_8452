package a06_조건;

import java.util.Scanner;

public class If {
	//윤년 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if((num%4 ==0 && !(num%100==0))||num%400==0) {
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}
}
