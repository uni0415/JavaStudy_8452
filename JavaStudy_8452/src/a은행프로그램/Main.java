package a은행프로그램;

import java.util.Scanner;

import a은행프로그램.controller.PageController;
import a은행프로그램.service.UserServiceImpl;
import a은행프로그램.view.IndexImpl;
import a은행프로그램.view.InputImpl;

public class Main {
	public static void main(String[] args) {
		PageController pageController = new PageController(new InputImpl(),new IndexImpl(), new Scanner(System.in), new UserServiceImpl());
		pageController.index();
	}
}
