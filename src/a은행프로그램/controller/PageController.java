package a은행프로그램.controller;

import java.util.Scanner;

import a은행프로그램.data.User;
import a은행프로그램.view.Index;
import a은행프로그램.view.IndexImpl;
import a은행프로그램.view.Input;

public class PageController {
	private final Input input;
	private final Index index;
	private Scanner scanner;
	
	public PageController(Input input) {
		this.input = input;
		index = new IndexImpl();
		scanner = new Scanner(System.in);
	}
	
	public void index() {
		while(true) {
			index.show();
			char select = input.typedSelect(scanner);
			
			if(select == '1') {
				input.signUp(scanner);
			}else if(select == '2') {
				input.showUsers(scanner);
			}else if(select == '3') {
				User user = input.login(scanner);
				if(user != null) {
					logined(user);
				}
			}else if(select == 'q') {
				System.out.println("프로그램 종료중..");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	public void logined(User user) {
		while(true) {
			index.loginShow();
			char select = input.typedSelect(scanner);
			System.out.println();
			if(select == '1') {
				
			}else if(select == '2') {
				
			}else if(select == '3') {
				
			}else if(select == '4') {
				
			}else if(select == '5') {
				
			}else if(select == 'b'){
				break;
			}else {
				
			}
		}
	}
	
}
