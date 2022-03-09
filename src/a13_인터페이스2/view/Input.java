package a13_인터페이스2.view;

import java.util.Scanner;

import a13_인터페이스2.model.User;

public interface Input {
	public char typedSelect(Scanner scanner);
	public User typedUser(Scanner scanner);
	public String typedUsername(Scanner scanner);
}
