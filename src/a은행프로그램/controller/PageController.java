package a은행프로그램.controller;

import java.util.Scanner;

import a은행프로그램.data.User;
import a은행프로그램.service.UserService;
import a은행프로그램.view.Index;
import a은행프로그램.view.Input;

public class PageController {
	private final Input input;
	private final Index index;
	private final UserService userService;
	private Scanner scanner;
	
	public PageController(Input input, Index index, Scanner scanner, UserService userService) {
		this.input = input;
		this.index = index;
		this.scanner = scanner;
		this.userService = userService;
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
				userService.createAccount(scanner, user);
			}else if(select == '2') {
				userService.deposit(scanner, user);
			}else if(select == '3') {
				userService.withdraw(scanner, user);
			}else if(select == '4') {
				userService.sendMoney(scanner, user);
			}else if(select == '5') {
				userService.moneyLoan(scanner, user);
			}else if(select == '6') {
				userService.moneyCheck(user);
			}else if(select == 'b'){
				break;
			}else {
				
			}
		}
	}
	
}
