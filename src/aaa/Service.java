package aaa;

import java.util.Scanner;

public class Service {
	Scanner scanner;
	UserData userData = UserData.getInstance();
	public void newUser() {
		scanner = new Scanner(System.in);
		System.out.print("ID : ");
		String userid = scanner.nextLine();
		System.out.print("PW : ");
		String userpw = scanner.nextLine();

		System.out.print("이름 : ");
		String username = scanner.nextLine();

		System.out.print("Email : ");
		String email = scanner.nextLine();

		System.out.print("전화번호 : ");
		String phoneNum = scanner.nextLine();
		User user = new User(userid, userpw, username, email, phoneNum);
		userData.getUsers().add(user);
	}
	
	public void userInfo() {
		System.out.print("ID : ");
		System.out.println();
		System.out.print("PW : ");
		System.out.println();
		System.out.print("이름 : ");
		System.out.println();
		System.out.print("Email : ");
		System.out.println();
		System.out.print("전화번호 : ");
		System.out.println();
		System.out.println();
	}
}
