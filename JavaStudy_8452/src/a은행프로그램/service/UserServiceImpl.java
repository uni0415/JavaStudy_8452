package a은행프로그램.service;

import java.util.Scanner;

import a은행프로그램.data.User;
import a은행프로그램.data.UserAccount;
import a은행프로그램.data.UserData;

public class UserServiceImpl implements UserService {
	UserData userData;
	UserAccount userAccount;

	public UserServiceImpl() {
		userData = UserData.getInstance();
	}

	@Override
	public void createAccount(Scanner scanner, User user) {
		if (user.getAccount() == null) {
			System.out.print("계좌 비밀번호를 입력하세요: ");
			String password = scanner.nextLine();
			UserAccount userAccount = new UserAccount(user.getId(), password);
			user.setAccount(userAccount);
			System.out.println("계좌가 생성되었습니다.");
			System.out.println("계좌번호: " + userAccount.getCurrentNum());

		} else {
			System.out.println("이미 생성된 계좌가 있습니다.");
			System.out.println();
		}
	}

	@Override
	public void deposit(Scanner scanner, User user) {
		if (!checkAccount(user)) {
			return;
		} else {
			System.out.print("입금할 금액을 입력해주세요: ");
			int money = scanner.nextInt();
			if (money < 0) {
				System.out.println("0 이상의 금액을 넣어야 합니다.");
				System.out.println();
			}
			user.getAccount().inMoney(money);
			user.getAccount().userGrade();
			System.out.println("잔액: " + user.getAccount().getTotalMoney() + "원");
			System.out.println();
		}
	}

	@Override
	public void withdraw(Scanner scanner, User user) {
		if (!checkAccount(user)) {
			return;
		} else {
			System.out.println("계좌 비밀번호를 입력해주세요: ");
			String password = scanner.nextLine();
			if (!(user.getAccount().getAccountPw().equals(password))) {
				System.out.println("잘못된 비밀번호입니다.");
				System.out.println();

			} else {
				System.out.print("출금할 금액을 입력해주세요: ");
				int money = scanner.nextInt();
				if (money > user.getAccount().getTotalMoney()) {
					System.out.println("잔액이 부족합니다.");
					System.out.println();
				} else if (money < 0) {
					System.out.println("잘못된 입력입니다.");
					System.out.println();
				} else {
					while (true) {
						System.out.println("잔액: " + user.getAccount().getTotalMoney() + "원");
						System.out.println("출금할 금액: " + money);
						System.out.println();
						System.out.println("출금하시겠습니까?");
						System.out.println("확인 : 1 / 취소 : 2");
						char flag = scanner.next().charAt(0);
						scanner.nextLine();
						if (flag == '1') {
							user.getAccount().outMoney(money);
							user.getAccount().userGrade();
							System.out.println("출금 완료");
							System.out.println("잔액: " + user.getAccount().getTotalMoney());
							System.out.println();
							break;
						} else if (flag == '2') {
							break;
						} else {
							System.out.println("잘못 입력하셨습니다.");
							System.out.println();
							continue;
						}
					}
				}
			}

		}
	}

	@Override
	public void sendMoney(Scanner scanner, User user) {
		if (!checkAccount(user))
			return;
		if (!checkPassword(user, scanner))
			return;

		System.out.println("송금할 유저를 입력해주세요: ");
		String username = scanner.nextLine();

		int money = 0;
		for (int i = 0; i < userData.getUsers().size(); i++) {
			if (user.getUserId().equals(username)) {
				System.out.println("자기 자신에게는 송금할 수 없습니다.");
				System.out.println();
				return;

			} else if (userData.getUsers().get(i).getUserId().equals(username)
					&& userData.getUsers().get(i).getAccount() != null) {
				System.out.println(user.getName() + "님 잔액 : " + user.getAccount().getTotalMoney());
				System.out.print("얼마를 송금하시겠습니까? ");
				money = scanner.nextInt();
				if(money > user.getAccount().getTotalMoney()) {
					System.out.println("잔액이 부족합니다.");
				}else if(money<0) {
					System.out.println("잘못 입력하셨습니다.");
					return;
				}
				user.getAccount().outMoney(money);
				userData.getUsers().get(i).getAccount().inMoney(money);
				user.getAccount().userGrade();
				System.out.println(userData.getUsers().get(i).getName() + "님에게 " + money + "원 송금하셨습니다.");
				System.out.println();
				System.out.println("잔액: " + user.getAccount().getTotalMoney() + "원");
				System.out.println();
				return;
			}
		}
		System.out.println("유저를 찾을 수 없습니다.");
		System.out.println();
	}

	private boolean checkAccount(User user) {
		if (user.getAccount() == null) {
			System.out.println("생성된 계좌가 없습니다.");
			System.out.println();
			return false;
		}
		return true;
	}

	private boolean checkPassword(User user, Scanner scanner) {
		System.out.println("계좌 비밀번호를 입력해주세요: ");
		String password = scanner.nextLine();
		if (!(user.getAccount().getAccountPw().equals(password))) {
			System.out.println("잘못된 비밀번호입니다.");
			System.out.println();
			return false;
		}
		return true;
	}

	@Override
	public void moneyLoan(Scanner scanner, User user) {
		int loanMoney = 0;
		if (!(checkAccount(user)))
			return;
		if (user.getAccount().isLoan()) {
			loanMoney = user.getAccount().getLoan();
		} else {
			System.out.println("신용 등급이 낮아 대출을 받을 수 없습니다.");
			return;
		}

		System.out.println("대출 가능 횟수 : " + user.getAccount().getLoanCount());
		if (user.getAccount().getLoanCount() < 1) {
			System.out.println("더 이상 대출을 받을 수 없습니다.");
			return;
		}
		System.out.println("대출 가능 금액은 " + loanMoney + "원입니다.");
		System.out.println();
		System.out.println("대출 받으시겠습니까?");
		System.out.println("1.예 / 2.아니오");
		char flag = scanner.next().charAt(0);
		System.out.println();
		if (flag == '1') {
			user.getAccount().loan(loanMoney);
		} else if (flag == '2') {
			return;
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	@Override
	public void moneyCheck(User user) {
		if(!checkAccount(user)) {
			return;
		}
		System.out.println("계좌번호: "+user.getAccount().getCurrentNum());
		System.out.println("잔액 : "+user.getAccount().getTotalMoney()+"원");
		
	}
}
