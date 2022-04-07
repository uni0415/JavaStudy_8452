package a09_클래스;

public class Student {
	//속성, 래퍼런스변수, 필드
	String schoolName;
	int studentYear;
	int studentGroup;
	int studentnumber;
	String studentName;
	String studentAddress;
	String studentphone;
	boolean graduationFlag;
	
	public Student() { //기본 생성자
		System.out.println("기본생성자 호출");
	}
	
	public Student(String schoolName, String studentName) {
		this.schoolName = schoolName;
		this.studentName = studentName;
	}
	

	public Student(String schoolName, int studentYear, int studentGroup, int studentnumber, String studentName,
			String studentAddress, String studentphone, boolean graduationFlag) { //전체 필드 생성자
		this();
		this.schoolName = schoolName;
		this.studentYear = studentYear;
		this.studentGroup = studentGroup;
		this.studentnumber = studentnumber;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentphone = studentphone;
		this.graduationFlag = graduationFlag;
	}


	public void showStudentInfo() {
		System.out.println("학교명: " + schoolName);
		System.out.println("학년: " + studentYear);
		System.out.println("반: " + studentGroup);
		System.out.println("번호: " + studentnumber);
		System.out.println("이름: " + studentName);
		System.out.println("주소: " + studentAddress);
		System.out.println("연락처: " + studentphone);
		System.out.println("졸업구분: " + (graduationFlag == true ? "졸업" : "재학중"));
	}
	
	public void incrementYear() {
		if(studentYear > 2 && graduationFlag == false) {
			graduationFlag = true;
		}else {
			studentYear++;
		}
	}
}
