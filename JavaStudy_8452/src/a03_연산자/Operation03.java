package a03_연산자;

public class Operation03 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int result1 = num1 < num2 ? 1 : 2;
		
		System.out.println(result1);
		
		boolean result2 = num1 > num2 ? true : false;
		
		int score = 95;
		char grade = score > -1 && score < 101 ? 
				score > 89 ? 'A' :
					score > 79 ? 'B' : 
						score > 69 ? 'C' :
							score > 59 ? 'D' :
								score > -1 ? 'F' : 'X' 
												 : 'X';
			System.out.println(grade);
	}

}
