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
		System.out.print("ID를 입력하세요: ");
		String id = scanner.nextLine();
		for (int i = 0; i < userData.getUsers().size(); i++) {

			if (id.equals(userData.getUsers().get(i).getUserId())) {
				System.out.print("ID : ");
				System.out.println(userData.getUsers().get(i).getUserId());
				System.out.print("PW : ");
				System.out.println(userData.getUsers().get(i).getUserPw());
				System.out.print("이름 : ");
				System.out.println(userData.getUsers().get(i).getUsername());
				System.out.print("Email : ");
				System.out.println(userData.getUsers().get(i).getEmail());
				System.out.print("전화번호 : ");
				System.out.println(userData.getUsers().get(i).getPhoneNum());
				System.out.println();
				System.out.println();
				return;
			}
		}
		System.out.println("유저를 찾을 수 없습니다.");
		System.out.println();
	}
}
