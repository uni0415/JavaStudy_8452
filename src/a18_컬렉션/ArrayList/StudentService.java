package a18_컬렉션.ArrayList;

import java.util.ArrayList;

public class StudentService {
	private final ArrayList<Student> studentList;

	public StudentService(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	// 학생 추가
	public void addStudent(String name, String email, String address) {
		Student student = Student.builder().Name(name).Email(email).Address(address).build();
		studentList.add(student);
		System.out.println(name + " 학생 정보가 추가되었습니다.");
	}

	// 학생 전체 정보 조회
	public void showStudentAll() {
		System.out.println();
		System.out.println("[전체 학생 정보 조회]");
		if (studentList.isEmpty()) {
			System.out.println("등록된 학생이 없습니다.");
		}
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println();
	}

	// 학생 이름으로 정보 조회
	public void showStudentByName(String name) {
		System.out.println("[" + name + " 학생 정보 조회]");
		for (Student student : studentList) {
			if (student.getName().equals(name)) {
				System.out.println(student);
				System.out.println();
				return;
			}
		}
		System.out.println(name + "의 학생 정보가 존재하지 않습니다.");
		System.out.println();
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
		System.out.println("[" + name + " 학생 정보 수정]");
		// 만약에 email 또는 address가 null이거나 ""이 들어왔을 때 원래 정보 유지
		if (studentList.isEmpty()) {
			System.out.println("등록된 학생이 없습니다.");
		}
		for (Student student : studentList) {
			if (student.getName().equals(name)) {
				if (isEmpty(email) && isEmpty(address)) {
					System.out.println("수정할 정보가 없습니다.");
					System.out.println();
				} else {
					if (isEmpty(email)) {
						student.setAddress(address);
					} else if (isEmpty(address)) {
						student.setEmail(email);
					} else {
						student.setEmail(email);
						student.setAddress(address);
					}
					System.out.println(name + " 학생 정보가 수정되었습니다.");
					System.out.println();
				}
				return;
			}
		}
		System.out.println(name + "의 학생 정보가 존재하지 않습니다.");
		System.out.println();

	}

	// 학생 정보 삭제
	public void deleteStudentByName(String name) {
		System.out.println("[" + name + " 학생 정보 삭제]");
		if (studentList.isEmpty()) {
			System.out.println("등록된 학생이 없습니다.");
		}
		for (Student student : studentList) {
			if (student.getName().equals(name)) {
				studentList.remove(student);
				System.out.println(name + " 학생 정보가 삭제되었습니다.");
				System.out.println();
				return;
			} 
		}
		System.out.println(name + "의 학생 정보가 존재하지 않습니다.");
		System.out.println();
	}
}
