package a18_컬렉션;

import java.util.ArrayList;

import a13_인터페이스2.model.User;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<User> userList = new ArrayList<User>();
		
		User user1 = User.builder()
					.username("a")
					.password("1234")
					.name("aa")
					.email("a@naver.com")
					.build();
		
		User user2 = User.builder()
					.username("b")
					.password("1234")
					.name("bb")
					.email("b@naver.com")
					.build();
		User user3 = User.builder()
					.username("c")
					.password("1234")
					.name("cc")
					.email("c@naver.com")
					.build();
		
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
		System.out.println("[회원 아이디 리스트]");
		for(int i = 0; i < userList.size(); i++) {
			User user = userList.get(i);
			System.out.println(user.getUsername());
		}
		System.out.println();
		
		System.out.println("[회원 비밀번호 리스트]");
		for(User user : userList) {
			System.out.println(user.getPassword());
		}
		System.out.println();
		
		userList.set(0, User.builder().username("ttt").password("1111").build()); 
		userList.add(0, User.builder().username("yyy").password("1111").build());
		System.out.println(userList);
	}
}
