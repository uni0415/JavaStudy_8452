package a18_컬렉션.HashMap;

import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
	/*
	 * studentName
	 * studentEmail
	 * studentAddress
	 */
	private String Name;
	private String Email;
	private String Address;
}
