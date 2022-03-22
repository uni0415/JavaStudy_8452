package a은행프로그램.data;

public class User {
	private static int autoIncrement = 0;
	private final String currentNum;
	private String userId;
	private String password;
	private String name;
	private int age;
	private String accountPw;
	
	public User(String userId, String password, String name, int age) {
		currentNum = "112-2214-4872-0"+(++autoIncrement);
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.age = age;
	}



	public String getAccountPw() {
		return accountPw;
	}



	public void setAccountPw(String accountPw) {
		this.accountPw = accountPw;
	}



	public String getUserId() {
		return userId;
	}



	public String getPassword() {
		return password;
	}



	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", name=" + name + ", age=" + age + "]";
	}

}
