package a은행프로그램.view;

public class IndexImpl implements Index{
	@Override
	public void show() {
		System.out.println("[은행 콘솔 프로그램]");
		System.out.println("1. 회원가입");
		System.out.println("2. 회원조회");
		System.out.println("3. 로그인");
		System.out.println("q. 프로그램 종료");
	}
	
	@Override
	public void loginShow() {
		System.out.println("[입출금 프로그램]");
		System.out.println("1. 계좌 생성");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 송금");
		System.out.println("5. 대출");
		System.out.println("6. 잔액 조회");
		System.out.println("b. 로그아웃");
	}
}
