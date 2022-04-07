package a02_변수;

public class UserInfo {
	public static void main(String[] args) {
		int studentCode = 20220001;
		char name1 = '김';
		char name2 = '경';
		char name3 = '운';
		int studentYear = 1;
		double score = 85.5;
		char grade = 'B';
		boolean gender = false;
		
		
				
		System.out.println("학번: "+studentCode);
		System.out.print("이름: ");
		System.out.println(""+ name1 + name2 + name3);
		System.out.print("학년: ");
		System.out.println(studentYear);
		System.out.print("성적: ");
		System.out.println(score);
		System.out.print("평점: ");
		System.out.println(grade);
		System.out.print("성별: ");
		System.out.println(gender);
	}
}
