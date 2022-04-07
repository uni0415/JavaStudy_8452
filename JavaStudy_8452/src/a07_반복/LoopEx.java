package a07_반복;

public class LoopEx {
	public static void main(String[] args) {
		int num = 0;
		int result = 0;
		
		while(num < 100) {
			result += (++num);
		}
		System.out.println(result);
		
		int i = 0;
		while(i < 100) {
			System.out.println(i);
			i++;
		}
		
		for(int j = 0; j < 100; j++) {
			System.out.println(j);
		}
		
		
		for(int k = 0; k < 100;) {
			k++;
			System.out.println(k);
		}
	}
}
