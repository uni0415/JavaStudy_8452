package aUser;

import java.util.Scanner;

public class MainView {
	
	public static void main(String[] args) {
		Service service = new Service();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 회원조회");
			System.out.println("q. 프로그램 종료");
			System.out.print("->");
			char op = sc.nextLine().charAt(0);

			if (op == '1') {
				service.newUser(sc);
			} else if (op == '2') {
				service.userInfo(sc);
			} else if(op == 'q') {
				System.out.println("프로그램 종료..");
				break;
			}
			
		}
		sc.close();
		
	}
	
}
