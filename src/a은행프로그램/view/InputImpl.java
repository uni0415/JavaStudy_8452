package a은행프로그램.view;

import java.util.Scanner;

import a은행프로그램.data.User;
import a은행프로그램.data.UserData;

public class InputImpl implements Input {
	
	UserData userData;
	
	public InputImpl() {
		userData = UserData.getInstance();
	}
	
	@Override
	public char typedSelect(Scanner scanner) {
		System.out.print("명령을 입력하세요: ");
		char select = scanner.next().charAt(0);
		scanner.nextLine();
		return select;
	}

	@Override
	public User signUp(Scanner scanner) {
		System.out.println("[회원가입]");
		System.out.print("아이디: ");
		String userId = scanner.nextLine();
		System.out.print("비밀번호: ");
		String password = scanner.nextLine();
		System.out.print("이름: ");
		String name = scanner.nextLine();
		System.out.print("나이: ");
		int age = Integer.parseInt(scanner.nextLine());
		User user = new User(userId, password, name, age);
		userData.getUsers().add(user);
		
		return user;
	}

	@Override
	public void showUsers(Scanner scanner) {
		
		
		while (true) {
			System.out.println("[회원 조회]");
			System.out.println("1. 전체 회원 조회");
			System.out.println("2. 아이디로 회원 조회");
			System.out.println("b. 뒤로가기");
			char select = scanner.next().charAt(0);
			scanner.nextLine();
			if(select == '1') {
				System.out.println(userData.getUsers());
			}else if(select == '2') {
				String username = scanner.nextLine();
				boolean userFlag = false;
				for(User user : userData.getUsers()) {
					if(username.equals(user.getUserId())) {
						System.out.println(user);
						userFlag = true;
						break;
					}
				}
				if(userFlag == false) {
					System.out.println("유저를 찾을 수 없습니다.");
				}
			}else if(select == 'b') {
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	@Override
	public User login(Scanner scanner) {
		
		System.out.print("아이디 : ");
		String id = scanner.nextLine();		
		System.out.print("비밀번호: ");
		String pw = scanner.nextLine();
		
		for(int i = 0; i < userData.getUsers().size(); i++) {
			User user = userData.getUsers().get(i);
			if(id.equals(user.getUserId()) && pw.equals(user.getPassword())) {
				return user;
			}
		}
		System.out.println("유저를 찾을 수 없습니다.");
		return null;
			
//			if(!(id.equals(user.getUserId()))) {
//				System.out.println("아이디를 찾을 수 없습니다.");
//				System.out.println("메인메뉴로 돌아갑니다.");
//				break;
//			}else if(id.equals(user.getUserId())&&!(pw.equals(user.getPassword()))){
//				System.out.println("비밀번호가 다릅니다.");
//				System.out.println("메인메뉴로 돌아갑니다.");
//				break;
//			}else if(id.equals(user.getUserId())&&pw.equals(user.getPassword())) {
//				System.out.println(user.getName()+"님 환영합니다.");
//			}
//		}
	}
	
	@Override
	public void createAccount(Scanner scanner) {
		
	}
}
