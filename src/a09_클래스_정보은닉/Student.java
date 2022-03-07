package a09_클래스_정보은닉;

public class Student {
	private String schoolName;
	private int studentCode;
	private int studentYear;
	private String studentName;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String schoolName, int studentCode, int studentYear, String studentName) {
		super();
		this.schoolName = schoolName;
		this.studentCode = studentCode;
		this.studentYear = studentYear;
		this.studentName = studentName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public int getStudentYear() {
		return studentYear;
	}

	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void showStduentInfo() {
		System.out.println("학교명: " + schoolName);
		System.out.println("학번: " + studentCode);
		System.out.println("학년: " + studentYear);
		System.out.println("이름: " + studentName);
		System.out.println();
	}
	
	
}
