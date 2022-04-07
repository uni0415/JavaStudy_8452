package a18_컬렉션.ArrayList;

import java.util.ArrayList;

public class StudentTest {
	public static void main(String[] args) {
		StudentService service = new StudentService(new ArrayList<Student>());
		
		service.showStudentAll();
		service.addStudent("경운", "ruddns@naver.com", "부산 동래구");
		service.addStudent("경운2", "ruddns@daum.net", "부산 진구");
		service.addStudent("경운3", "ruddns@gmail.com", "부산 사하구");
		
		service.showStudentAll();
		service.showStudentByName("경운2");
		service.updateStudentByName("경운", "ruddns@kakao.com", "부산 해운대구");
		
		service.deleteStudentByName("경운3");
		service.showStudentAll();
	}
}
