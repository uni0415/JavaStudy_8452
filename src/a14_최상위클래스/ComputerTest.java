package a14_최상위클래스;

public class ComputerTest {
	public static void main(String[] args) {
		Computer computer = new Computer();
		Computer laptop = new Laptop("삼성","갤럭시북 프로");
		Object obj = new Computer();
		Object obj2 = new Laptop("LG","그램2022");
		Computer c = ((Computer)obj);
		Object[] objs = new Object[5];
		objs[0] = computer;
		System.out.println(computer);
		
		System.out.println(laptop);
		System.out.println(obj2);
	}
}
