package a05_입력;

import java.util.Scanner;

public class UserInfo {
	public static void main(String[] args) {
		/**
		 * username(아이디)
		 * password(비밀번호)
		 * year(년도)
		 * month(월)
		 * day(일)
		 * name(이름)
		 * address(주소) 부산 동래구 사직동
		 */
		Scanner sc = new Scanner(System.in);
		String username = sc.next();
		String password = sc.next();
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		String name = sc.next();
		sc.nextLine();
		String address = sc.nextLine();
		
		
		
		System.out.println("아이디 : "+username);
		System.out.println("비밀번호 : " + password);
		System.out.println("생년월일 : "+year+"년 " + month + "월 " + day + "일");
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		
	}
}
