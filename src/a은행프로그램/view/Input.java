package a은행프로그램.view;

import java.util.Scanner;

import a은행프로그램.data.User;

public interface Input {
	public char typedSelect(Scanner scanner);
	public User signUp(Scanner scanner);
	public void showUsers(Scanner scanner);
	public User login(Scanner scanner);
	public void createAccount(Scanner scanner);
}
