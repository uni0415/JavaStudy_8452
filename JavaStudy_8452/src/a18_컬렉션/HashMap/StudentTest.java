package a18_컬렉션.HashMap;

import java.util.HashMap;

public class StudentTest {
	public static void main(String[] args) {
		StudentService service = new StudentService(new HashMap<String, Student>());
		
		service.showStudentAll();
		service.addStudent("경운", "ruddns@naver.com", "부산 동래구");
		service.addStudent("경운2", "ruddns@daum.net", "부산 진구");
		service.addStudent("경운3", "ruddns@gmail.com", "부산 사하구");
		
		service.showStudentAll();
		service.showStudentByName("경운");
		service.updateStudentByName("경운", "ruddns@kakao.com", "부산 해운대구");
		
		service.deleteStudentByName("경운");
		service.showStudentAll();
	}
}
