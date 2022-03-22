package a은행프로그램;

import a은행프로그램.controller.PageController;
import a은행프로그램.view.InputImpl;

public class Main {
	public static void main(String[] args) {
		PageController pageController = new PageController(new InputImpl());
		pageController.index();
	}
}
