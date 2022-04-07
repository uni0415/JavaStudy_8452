package aaa;

import java.util.Scanner;

public class User {
	private String userId;
	private String userPw;
	private String username;
	private String email;
	private String phoneNum;
	
	
	
	Scanner scanner = new Scanner(System.in);
	User(String userId, String userPw, String username, String email, String phoneNum) {
		this.userId = userId;
		this.userPw = userPw;
		this.username = username;
		this.email = email;
		this.phoneNum = phoneNum;
	}

	public String getUserId() {
		return userId;
	}

	

	public String getUserPw() {
		return userPw;
	}

	

	public String getUsername() {
		return username;
	}

	

	public String getEmail() {
		return email;
	}



	public String getPhoneNum() {
		return phoneNum;
	}

	
	
	

}
