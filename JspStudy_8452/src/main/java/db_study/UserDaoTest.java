package db_study;

import java.util.ArrayList;

import db.DBConnectionMgr;
import repository.user.User;

public class UserDaoTest {

	public static void main(String[] args) {
		DBConnectionMgr pool = DBConnectionMgr.getInstance();
		
		UserDao2 userDao = new UserDao2(pool);
		ArrayList<User> userList = userDao.getUserAll();
	
		for(User user : userList) {
			System.out.println(user);
		}
		
		System.out.println("=====================getUser()===========================");
		User user = userDao.getUserByUsername("uni0415");
		System.out.println(user);
	}

}
