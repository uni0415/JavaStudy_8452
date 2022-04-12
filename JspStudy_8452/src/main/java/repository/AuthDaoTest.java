package repository;

import db.DBConnectionMgr;

public class AuthDaoTest {
	public static void main(String[] args) {
		DBConnectionMgr pool = DBConnectionMgr.getInstance();
		
		AuthDao authDao = new AuthDaoImpl(pool);
		int result = authDao.signinByUsernameAndPassword("gyeongun", "1234");
		
 		if(result==2) {
 			System.out.println("로그인 성공");
 		}else {
 			System.out.println("로그인 실패");
 		}
		
	}
}
