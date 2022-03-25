package aaa;

import java.util.Scanner;

public class NewUser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Service service = new Service();
		
		while (true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 회원조회");
			System.out.println("3. 종료");
			System.out.print("->");
			char select = scanner.next().charAt(0);
			scanner.nextLine();

			if (select == '1') {
				service.newUser();
			}else if(select == '2') {
				service.userInfo();
			}else if(select == '3') {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		scanner.close();
	}

	
}
