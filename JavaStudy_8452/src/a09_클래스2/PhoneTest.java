package a09_클래스2;

public class PhoneTest {
	/*
	 * addPhone(int type, String model, int color); 리턴은 객체(주소값)
	 */
	public static Phone addPhone(int type, String model, int color) {
		Phone phone = new Phone(type, model, color);
//		phone.setPhoneType(type);
//		phone.setPhoneModel(model);
//		phone.setPhoneColor(color);
		return phone;
	}

	public static void showPhoneInfo(Phone p) {
		System.out.println("휴대폰 타입: " +(p.getPhoneType() == 1 ? "feature-phone" : "smart-phone"));
		System.out.println("휴대폰 모델: " +p.getPhoneModel());
		System.out.println("휴대폰 색상: " +(p.getPhoneColor() == 1 ? "블랙" : p.getPhoneColor() == 2 ? "화이트" : p.getPhoneColor() == 3 ? "블루" : "레드"));
		System.out.println();
	}

	public void powerOn(Phone p) {
		System.out.println(p.getPhoneModel() + "의 전원을 켭니다.");
	}

	public void powerOff(Phone p) {
		System.out.println(p.getPhoneModel() + "의 전원을 끕니다.");
	}

	public static void main(String[] args) {
		// 객체생성1
		Phone p1 = addPhone(1, "롤리팝", 1);
		Phone p2 = addPhone(1, "고아라폰", 2);
		Phone p3 = addPhone(2, "아이폰", 3);
		showPhoneInfo(p1);
		showPhoneInfo(p2);
		showPhoneInfo(p3);
	}
}
