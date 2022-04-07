package a14_최상위클래스;

import java.util.Objects;

public class Student {
	private int studentYear;
	private int studentGroup;
	private int studentNumber;
	private String name;

	public Student(int studentYear, int studentGroup, int studentNumber, String name) {
		super();
		this.studentYear = studentYear;
		this.studentGroup = studentGroup;
		this.studentNumber = studentNumber;
		this.name = name;
	}/*
		 * Object클래스에 정의되어 있는 hashCode() 메소드는 물리적 주소값을 리턴하는 기능. hashCode() 메소드를
		 * 재정의(Override)한다는 것은 '논리적 주소를 만들겠다'라는 의미이다.
		 */

	@Override
	public String toString() {
		return "Student [studentYear=" + studentYear + ", studentGroup=" + studentGroup + ", studentNumber="
				+ studentNumber + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, studentGroup, studentNumber, studentYear);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && studentGroup == other.studentGroup
				&& studentNumber == other.studentNumber && studentYear == other.studentYear;
	}

}
