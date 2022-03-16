package a18_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class StudentService {
	private final HashMap<String, Student> studentMap;

	public StudentService(HashMap<String, Student> studentMap) {
		this.studentMap = studentMap;
	}

	// 학생 추가
	public void addStudent(String name, String email, String address) {
		Student student = Student.builder().Name(name).Email(email).Address(address).build();
		studentMap.put(name, student);
		System.out.println(name + " 학생 정보가 추가되었습니다.");
	}

	// 학생 전체 정보 조회
	public void showStudentAll() {
		System.out.println();
		System.out.println("[전체 학생 정보 조회]");
		if (studentMap.isEmpty()) {
			System.out.println("등록된 학생이 없습니다.");
		}
		Iterator<String> ir = studentMap.keySet().iterator();
		while (ir.hasNext()) {
			System.out.println(studentMap.get(ir.next()));
		}
		System.out.println();
	}

	// 학생 이름으로 정보 조회
	public void showStudentByName(String name) {
		System.out.println("[" + name + " 학생 정보 조회]");
		if (studentMap.containsKey(name)) {
			System.out.println(studentMap.get(name));
			return;
		}
		System.out.println(name + "의 학생 정보가 존재하지 않습니다.");

	}

	public boolean isEmpty(String str) {
		boolean result = false;
		if (str == null || str.equals("")) {
			result = true;
		}
		return result;
	}

	// 학생 정보 수정
	public void updateStudentByName(String name, String email, String address) {
		System.out.println();
		if (studentMap.containsKey(name)) {
			Student student = studentMap.get(name);
			if(isEmpty(email)&&isEmpty(address)) {
				System.out.println("수정할 정보가 없습니다.");
				System.out.println();
			}else {
				if(isEmpty(email)) {
					student.setAddress(address);
				}else if(isEmpty(address)) {
					student.setEmail(email);
				}else {
					student.setAddress(address);
					student.setEmail(email);
				}
				System.out.println(name + " 학생 정보가 수정되었습니다.");
			}
			return;
		}
		System.out.println(name + "의 학생 정보가 존재하지 않습니다.");
		System.out.println();

	}

	// 학생 정보 삭제
	public void deleteStudentByName(String name) {
		if(studentMap.containsKey(name)) {
			studentMap.remove(name);
		}
	}
}
