package calculate;

public class Calculator1 {

	int a,b;
	
	public void setOprands(int a, int b) {
		this.a =a;
		this.b=b;
		
	}
	
	public void sum() {
		System.out.println(this.a+this.b);
	}
	
	public void substract() {
		System.out.println(this.a-this.b);
	}
	
	public static void main(String[] args) {
		Calculator1 c1 = new Calculator1();
		c1.setOprands(20,10);
		c1.sum();
		c1.substract();
	}
	
}
