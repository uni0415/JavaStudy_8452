package a은행프로그램.service;

import java.util.Scanner;

import a은행프로그램.data.User;
import a은행프로그램.data.UserAccount;

public interface UserService {
	public void createAccount(Scanner scanner, User user);
	public void deposit(Scanner scanner, User user);
	public void withdraw(Scanner scanner ,User user);
	public void sendMoney(Scanner scanner, User user);
	public void moneyLoan(Scanner scanner , User user);
	public void moneyCheck(User user);
}
