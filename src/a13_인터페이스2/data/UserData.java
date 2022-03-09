package a13_인터페이스2.data;

import a13_인터페이스2.model.User;

public class UserData {
	private User[] users;

	public UserData() {
		// TODO Auto-generated constructor stub
	}

	public User[] getUsers() {
		return users;
	}

	public void setUsers(User[] users) {
		this.users = users;
	}

	public UserData(User[] users) {
		super();
		this.users = users;
	}

	public void showUsers() {
		for(int i = 0; i < users.length; i++) {
			users[i].showUser();
		}
	}
}
