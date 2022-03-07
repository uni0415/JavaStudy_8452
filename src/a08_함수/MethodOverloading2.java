package a08_함수;

/**
 * 
 * 오버로딩의 개념.
 * 
 * 메소드의 이름을 재사용할 수 있다.
 * 
 * 요리사에게 재료 3개를 주면 3개를 가지고 요리를 해야하고 1개를 주면 하나의 재료로 요리를 해야한다.
 * 특징1. 매개변수의 개수에 따라 메소드를 정의 할 수 있다.
 *
 * 요리사에게 재료 2개를 주고 도구 1개를 전달한다. 
 * 특징2. 매개변수의 자료형이 다르면 매개변수의 개수가 같아도 정의 할 수 있다.
 */

public class MethodOverloading2 {
	
	public static void sum() {
		System.out.println("매개변수가 없습니다.");
	}
	
	public static void sum(int a) {
		System.out.println(a + "(을)를 출력합니다.");
	}
	
	public static void sum(int a, int b) {
		System.out.println("a와 b의 합은 " + (a + b) + "입니다.");
	}
	
	public static void sum(int a, double b) {
		System.out.println("a와 b의 합은 " + (a + b) + "입니다.");
	}
	
	public static void sum(String a, double b) {
		System.out.println("a와 b의 합은 " + (Double.parseDouble(a) + b) + "입니다.");
	}

	public static void main(String[] args) {
		sum();
		sum(1);
		sum(10, 20);
		sum(10, 2.5);
		sum("10.7", 2.5);
	}

}
