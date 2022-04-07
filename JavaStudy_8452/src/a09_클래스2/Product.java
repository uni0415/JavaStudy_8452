package a09_클래스2;

public class Product {
	private int productCode;
	private String productName;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(int productCode, String productName) {
		super();
		this.productCode = productCode;
		this.productName = productName;
	}


	public void showProduct() {
		System.out.println("상품코드: "+productCode);
		System.out.println("상품명: "+productName);
	}

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}
