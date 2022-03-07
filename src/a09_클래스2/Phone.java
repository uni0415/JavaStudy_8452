package a09_클래스2;

/**
 * 속성 phoneType(int) 1: feature-phone, 2: smart-phone phoneModel(String)
 * phoneColor(int) 1: 블랙, 2: 화이트, 3: 블루, 4: 레드
 * 
 * 기능 powerOn() phoneModel의 전원을 켭니다. powerOff() phoneModel의 전원을 끕니다.
 * showPhoneInfo() 휴대폰 타입: feature-phone, smart-phone 휴대폰 모델: 롤리팝, 고아라폰, 아이폰,
 * 갤럭시 휴대폰 색상: 블랙, 화이트, 블루, 레드
 * 
 * 
 * 
 */
public class Phone {
	private int phoneType;
	private String phoneModel;
	private int phoneColor;

	public Phone() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Phone(int phoneType, String phoneModel, int phoneColor) {
		super();
		this.phoneType = phoneType;
		this.phoneModel = phoneModel;
		this.phoneColor = phoneColor;
	}



	public int getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(int phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhoneModel() {
		return phoneModel;
	}

	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}

	public int getPhoneColor() {
		return phoneColor;
	}

	public void setPhoneColor(int phoneColor) {
		this.phoneColor = phoneColor;
	}
}
