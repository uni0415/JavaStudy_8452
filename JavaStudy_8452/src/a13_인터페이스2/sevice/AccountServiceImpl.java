package a13_인터페이스2.sevice;

import a13_인터페이스2.data.UserData;
import a13_인터페이스2.model.User;

public class AccountServiceImpl implements AccountService {
	private UserData userData;
	
	public AccountServiceImpl() {
		userData = UserData.getInstance();
	}
	
	@Override
	public void printUserProfile() {
		User[] users = userData.getUsers();
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) {
				continue;
			}
			System.out.println(users[i]);
		}
	}
}
