package web.service;

public interface ProfileService {
	public boolean updateProfile(int userCode, String name, String email);
	public boolean updatepassword(int userCode, String password);
	public boolean deleteUser(int userCode);
}
