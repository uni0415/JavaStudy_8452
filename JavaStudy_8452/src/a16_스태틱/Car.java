package a16_스태틱;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * 스태틱(static)이란?
 * 해당 클래스 내에서 한번 선언되면 계속 공유되는 영역
 * 
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
	private int serialNumber;
	private String company;
	private String model;
	//스태틱 메소드는 스태틱 변수만 리턴 가능하다.
	//일반 변수들은 생성 되야지만 쓸 수 있지만 스태틱 변수들은 생성하지 않아도 사용 가능하기 때문에 
	
	
	
}
