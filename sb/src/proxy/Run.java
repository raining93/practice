package proxy;

public class Run {

	public static void main(String[] args) {
		
		Developer man = new ProxyDeveloper(new Man());
		Developer woman = new ProxyDeveloper(new Woman());
		Developer child = new ProxyDeveloper(new Child());
	
		man.develpe();
		System.out.println("====================================");
		woman.develpe();
		System.out.println("====================================");
		child.develpe();
		System.out.println("====================================");

	}

}
