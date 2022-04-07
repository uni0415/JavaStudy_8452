package a19_예외;

public class ExceptionEx1 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		try {
			for (int i = 0; i < arr.length + 1; i++) {
				System.out.println("test" + i);
				System.out.println(arr[i]);
			}
			System.out.println("모든 데이터를 참조하였습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 공간을 초과하여 참조하였습니다.");
		}

		System.out.println("데이터 저장");
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
	}
}
