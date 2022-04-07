package a은행프로그램.data;

public class UserAccount {
	
	private static int autoIncreament = 0;
	private final String currentNum;
	private String accountPw;
	private int totalMoney;
	private int loanCount;
	private String grade;
	private int userId;
	
	public UserAccount(int userId, String accountPw) {
		grade = "F";
		currentNum = "112-2214-4872-0" + (++autoIncreament);
		loanCount = 2;
		this.userId = userId;
		this.accountPw = accountPw;
	}

	public int getUserId() {
		return userId;
	}
	
	public String getCurrentNum() {
		return currentNum;
	}

	public String getAccountPw() {
		return accountPw;
	}

	public int getTotalMoney() {
		return totalMoney;
	}

	public int getLoanCount() {
		return loanCount;
	}

	public String getGrade() {
		return grade;
	}
	
	public void inMoney(int money) {
		totalMoney += money;
	}
	
	public void outMoney(int money) {
		totalMoney -=money;
	}
	
	public void userGrade() {
		if (totalMoney > 10000) {
			grade = "A";
		} else if (totalMoney > 6000) {
			grade = "B";
		} else if (totalMoney > 3000) {
			grade = "C";
		} else if (totalMoney > 1000) {
			grade = "D";
		} else {
			grade = "F";
		}
	}
	
	public boolean isLoan() {
		if(grade.equals("F")) {
			return false;
		}
		return true;
	}
	
	public int getLoan() {
		if(grade.equals("A")) {
			return 20000;
		}else if(grade.equals("B")) {
			return 15000;
		}else if(grade.equals("C")) {
			return 10000;
		}else if(grade.equals("D")) {
			return 5000;
		}
		return 0;
	}
	
	public void loan(int loanMoney) {
		loanCount--;
		totalMoney += loanMoney;
		System.out.println("대출이 완료되었습니다.");
		System.out.println("잔액: " + totalMoney);
	}
	
}
