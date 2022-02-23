package a04_문자열;

public class StudentInfo {
	public static void main(String[] args) {
		String name = "김경운";
		/**
		 * 2022년 02월 22일 코리아아이티아카데미부산 학생정보
		 * year  month day       academy(문자열)
		 */
		int i_year = 2022;
		String year = "" + (++i_year);
		String month = "02";
		String day = "22";
		String academy = "코리아아이티아카데미부산";
		
		
		System.out.println(year + "년 "+ month+"월 " + day + "일 " + academy + " 학생정보");
		System.out.println("학생 이름: "+name);
		////////////////////////////////////////////////////////////
		/*
		 * 문자열 형변환
		 * 문자열(String) -> Integer(int)
		 * Integer.parseInt("100"); -> 숫자 100으로 변환
		 * Double.parseDouble("15.123); -> 실수  15.123으로 변환
		 * Boolean parseBoolean("true")
		 * 
		 * 정수, 실수 등을 문자열로 형변환
		 * Integer.tostring(100); -> 문자열 100으로 변환
		 * Double.toString(3.14); -> 문자열 3.41로 변환
		 * Boolean toString(true) -> 문자열 true로 변환
		 */
		
		int num = Integer.parseInt("100");
		double dNum = Double.parseDouble("3.14");
		System.out.println(num + 20 );
		System.out.println(dNum + 10);
		System.out.println(Boolean.parseBoolean("true"));
		System.out.println("" + 100) ;
		
		String num2 = Integer.toString(200);
		System.out.println(num2 + 200);
	}
}
