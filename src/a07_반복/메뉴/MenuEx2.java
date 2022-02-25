package a07_반복.메뉴;

import java.util.Scanner;

public class MenuEx2 {
	public static void main(String[] args) {
		/*
		 * [학생관리 프로그램] 1. 학생 주소조회 2. 학생 성적조회 3. 학생 기본정보 조회 q. 프로그램 종료
		 * 
		 * 명령을 선택하세요:
		 * 
		 * 해당 명령은 선택할 수 없습니다.
		 * 
		 * 1. 학생의 주소를 조회합니다. 2. 학생의 성적을 조회합니다. 3. 학생의 기본정보를 조회합니다. q. 프로그램 종료중... 프로그램이
		 * 종료되었습니다.
		 */

		Scanner sc = new Scanner(System.in);
		char select = ' ';

		while (true) {
			System.out.println("[학생관리 프로그램]");
			System.out.println("1. 학생 주소조회");
			System.out.println("2. 학생 성적조회");
			System.out.println("3. 학생 기본정보 조회");
			System.out.println("q. 프로그램 종료");
			System.out.println();
			System.out.print("명령을 선택하세요: ");
			
			select = sc.next().charAt(0);
			
			if (select == '1') {
				System.out.println("학생의 주소를 조회합니다.");
			} else if (select == '2') {
				System.out.println("학생의 성적을 조회합니다.");
			} else if (select == '3') {
				System.out.println("학생의 기본정보를 조회합니다.");
			} else if (select == 'q') {
				System.out.println("프로그램 종료중...");
				break;
			} else {
				System.out.println("해당 명령은 선택할 수 없습니다.");
			}
			System.out.println();
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
