package a은행프로그램.data;

public class User {
	private static int autoIncrement = 0;
	private String userId;
	private String password;
	private String name;
	private int age;
	private int id;
	private UserAccount account;

	public User(String userId, String password, String name, int age) {
		id = autoIncrement;
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	
	public void setAccount(UserAccount account) {
		this.account = account;
	}

	public UserAccount getAccount() {
		return account;
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
		return "User [userId=" + userId + ", name=" + name + ", age=" + age + "]";
	}


}
