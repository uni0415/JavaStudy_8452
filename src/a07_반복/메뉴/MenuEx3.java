package a07_반복.메뉴;

import java.util.Scanner;

public class MenuEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char select =' ';
		boolean firstFlag = true;
		while(firstFlag) {
			boolean secondFlag = true;
			System.out.println("[사용자 폴더]");
			System.out.println("1. 바탕화면");
			System.out.println("2. 문서");
			System.out.println("q. 프로그램 종료");
			System.out.println("====================");
			System.out.println("명령 선택: ");
			select = sc.next().charAt(0);
			
			if(select == '1') {
				while(secondFlag) {
					System.out.println("[바탕화면 폴더]");
					System.out.println("1. 롤");
					System.out.println("2. 크롬");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("====================");
					System.out.println("명령 선택: ");
					select = sc.next().charAt(0);
					
					if(select == '1') {
						System.out.println("롤을 실행합니다.");
					}else if(select == '2') {
						System.out.println("크롬 브라우저를 실행합니다.");
					}else if(select == 'b') {
						System.out.println("뒤로가기");
						secondFlag = false;
					}else if(select == 'q') {
						System.out.println("프로그램 종료중...");
						firstFlag = false;
						secondFlag = false;
					}else {
						System.out.println("해당 프로그램 또는 폴더가 존재하지 않습니다.");
					}
					System.out.println("##################");
				}
			}else if(select == '2') {
				while(secondFlag) {
					System.out.println("[문서 폴더]");
					System.out.println("1. 그림");
					System.out.println("2. 음악");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("====================");
					System.out.println("명령 선택: ");
					select = sc.next().charAt(0);
					
					if(select == '1') {
						System.out.println("그림 폴더로 이동합니다.");
					}else if(select == '2') {
						System.out.println("음악 폴더로 이동합니다.");
					}else if(select == 'b') {
						System.out.println("뒤로가기");
						secondFlag = false;
					}else if(select == 'q') {
						System.out.println("프로그램 종료중...");
						firstFlag = false;
						secondFlag = false;
					}else {
						System.out.println("해당 프로그램 또는 폴더가 존재하지 않습니다.");
					}
					System.out.println("##################");
				}
			}else if(select == 'q') {
				System.out.println("프로그램 종료중...");
				firstFlag = false;
			}else {
				System.out.println("해당 폴더는 존재하지 않습니다.");
			}
			System.out.println("---------------------");
		}
		System.out.println("프로그램 종료");
	}
}
