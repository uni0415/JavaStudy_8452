package a07_반복;

public class ContinueEx {
	/*
	 * continue -> 계속하다
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			if(i != 0 && i % 2 == 0) {
				continue;
			}
			if(i == 3) {
				break;
			}
			System.out.println(i);
		}
	}
}
