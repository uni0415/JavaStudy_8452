package a14_최상위클래스;

public class Laptop extends Computer {
	private String company;
	private String model;
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(String company, String model) {
		super();
		this.company = company;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + "]";
	}
	
	
}
