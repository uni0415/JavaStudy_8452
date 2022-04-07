package a10_배열;

/**
 * 
 * 배열(Array)
 * 연관된 데이터를 하나의 변수에 그룹핑해서 관리하는 기법.
 * 
 * 자료형[] 배열변수명 = new 자료형[배열공간의 개수];
 * int[] numbers = new int[5];
 * User[] users = new User[3];
 * 
 *
 */

public class ArrayTest {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		numbers[1] = 100;
		
		for(int i = 0; i < 10; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("***********************************");
		
		/*
		 * String 배열 10개의 공간을 생성
		 * 가나다라마바사아자차
		 * 
		 * 
		 */
		String[] kor = new String[10];
		kor[0] = "가";		
		kor[1] = "나";
		kor[2] = "다";
		kor[3] = "라";
		kor[4] = "마";
		kor[5] = "바";
		kor[6] = "사";
		kor[7] = "아";
		kor[8] = "자";
		kor[9] = "차";
		
		for(int i = 0; i < kor.length; i++) {
			System.out.println(kor[i]);			
		}
		
	}

}
