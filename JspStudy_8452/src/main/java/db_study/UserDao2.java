package db_study;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.util.ArrayList;

import db.DBConnectionMgr;
import repository.user.User;

public class UserDao2 {
	private final DBConnectionMgr pool;
	
	public UserDao2(DBConnectionMgr pool) {
		this.pool = pool;
	}
	
	public User getUserByUsername(String username) {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = null;
		
		try {
			con = pool.getConnection();
			sql = "select * from user_mst where username = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();
			rs.next();
			
			try {
				user = User.builder()
						.user_code(rs.getInt(1))
						.username(rs.getString(2))
						.password(rs.getString(3))
						.name(rs.getString(4))
						.email(rs.getString(5))
						.create_date(rs.getTimestamp(6).toLocalDateTime())
						.update_date(rs.getTimestamp(7).toLocalDateTime())
						.build();
			} catch (SQLDataException e) {
				System.out.println("조회할 유저가 없습니다.");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return user;
	}
	
	public ArrayList<User> getUserAll(){
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<User> userList = new ArrayList<User>();
		
		try {
			con = pool.getConnection();
			sql = "select * from user_mst";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				User user = User.builder()
						.user_code(rs.getInt(1))
						.username(rs.getString(2))
						.password(rs.getString(3))
						.name(rs.getString(4))
						.email(rs.getString(5))
						.create_date(rs.getTimestamp(6).toLocalDateTime())
						.update_date(rs.getTimestamp(7).toLocalDateTime())
						.build();
				userList.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return userList;
	}
	
	
}