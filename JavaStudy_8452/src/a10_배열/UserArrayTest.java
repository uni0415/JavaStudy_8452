package a10_배열;

public class UserArrayTest {

	public static void main(String[] args) {
		User[] users = new User[5];
		
		users[0] = new User("junil", "1234");
		users[1] = new User("junil2", "12345");
		users[2] = new User("junil3", "12346");
		users[3] = new User("junil4", "12347");
		users[4] = new User("junil5", "12348");
		
		
		for(int i = 0; i < users.length; i++) {
			/*
			if(users[i] != null) {
				users[i].showInfo();				
			}
			*/
			if(users[i] == null) {
				continue;
			}
			users[i].showInfo();
		}
		
		System.out.println("=========================");
		
		
		int[] numbers = new int[5];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
