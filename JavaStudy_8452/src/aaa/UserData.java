package aaa;

import java.util.ArrayList;

public class UserData {
	private ArrayList<User> users;
	private static UserData instance;
	
	private UserData() {
		users = new ArrayList<User>();
	}
	
	public static UserData getInstance() {
		if(instance == null) {
			instance = new UserData();
		}
		return instance;
	}
	
	public ArrayList<User> getUsers(){
		return users;
	}
}
