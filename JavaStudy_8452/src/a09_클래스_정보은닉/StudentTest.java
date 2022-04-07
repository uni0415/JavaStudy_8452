package a09_클래스_정보은닉;

/*
 * Student 클래스 정의
 * 속성
 * schoolName
 * studentCode(학번) 20220000 -> int
 * studentYear -> int
 * studentName
 * 
 * 생성자(기본, 전체)
 * 
 * getter, setter
 * 
 * 메소드 showStduentInfo
 * 학교명: 코리아아이티아카데미
 * 학번: 20220001
 * 학년: 1
 * 이름: 김준일
 * 
 * 학교명: 코리아아이티아카데미
 * 학번: 20220002
 * 학년: 3
 * 이름: 김준이
 */

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student("코리아아이티아카데미", 20220001, 1, "김준일");
		Student student2 = new Student("코리아아이티아카데미", 20220002, 3, "김준이");
		Student student3 = new Student("코리아아이티아카데미", 20220002, 3, "김준이");
		Student student4 = new Student("코리아아이티아카데미", 20220002, 3, "김준이");
		Student student5 = new Student("코리아아이티아카데미", 20220002, 3, "김준이");
		Student student6 = new Student("코리아아이티아카데미", 20220002, 3, "김준이");
		Student student7 = new Student("코리아아이티아카데미", 20220002, 3, "김준이");
		Student student8 = new Student("코리아아이티아카데미", 20220002, 3, "김준이");
		Student student9 = new Student("코리아아이티아카데미", 20220002, 3, "김준이");
		Student student11 = new Student("코리아아이티아카데미", 20220002, 3, "김준이");
		Student student12 = new Student("코리아아이티아카데미", 20220002, 3, "김준이");
		Student student13 = new Student("코리아아이티아카데미", 20220002, 3, "김준이");
		Student student14 = new Student("코리아아이티아카데미", 20220002, 3, "김준이");
		Student student15 = new Student("코리아아이티아카데미", 20220002, 3, "김준이");
		Student student16 = new Student("코리아아이티아카데미", 20220002, 3, "김준이");
		Student student17 = new Student("코리아아이티아카데미", 20220002, 3, "김준이");
		Student student18 = new Student("코리아아이티아카데미", 20220002, 3, "김준이");
		
		student1.showStduentInfo();
		student2.showStduentInfo();
		student2.showStduentInfo();
		student2.showStduentInfo();
		student2.showStduentInfo();
		student2.showStduentInfo();
		student2.showStduentInfo();
		student2.showStduentInfo();
		student2.showStduentInfo();
		student2.showStduentInfo();
		student2.showStduentInfo();
		student2.showStduentInfo();
		student2.showStduentInfo();

	}

}
