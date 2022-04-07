package aUser;

import java.util.Scanner;

public class Service {

	User[] users = new User[2];

	public void newUser(Scanner sc) {
		User user = new User();
		for (int i = 0; i < users.length; i++) {
			if (users[i] == null) {
				System.out.print("ID : ");
				String userid = sc.nextLine();
				user.setUserId(userid);

				System.out.print("PW : ");
				String userpw = sc.nextLine();
				user.setUserPw(userpw);

				System.out.print("이름 : ");
				String username = sc.nextLine();
				user.setUsername(username);

				System.out.print("Email : ");
				String email = sc.nextLine();
				user.setEmail(email);

				System.out.print("전화번호 : ");
				String phoneNum = sc.nextLine();
				user.setPhoneNum(phoneNum);

				users[i] = user;
				System.out.println(users[i]);
				break;
			} else if (users[i + 1] != null) {
				System.out.println("공간이 꽉 찼습니다.");
				return;
			}
		}
	}

	public void userInfo(Scanner sc) {
		System.out.print("ID를 입력해주세요: ");
		String id = sc.nextLine();
		boolean userFlag = false;
		for (int i = 0; i < users.length; i++) {
			if (users[i].getUserId().equals(id)) {
				System.out.println(id);
				User user = users[i];
				System.out.print("ID : ");
				System.out.println(user.getUserId());
				System.out.print("PW : ");
				System.out.println(user.getUserPw());
				System.out.print("이름 : ");
				System.out.println(user.getUsername());
				System.out.print("Email : ");
				System.out.println(user.getEmail());
				System.out.print("전화번호 : ");
				System.out.println(user.getPhoneNum());
				System.out.println();
				userFlag = true;
				break;
			} 
		}
		if(userFlag==false) {
			System.out.println("잘못된 아이디입니다.");
			return;
		}
	}
}
