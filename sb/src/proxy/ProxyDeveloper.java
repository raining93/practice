package proxy;

public class ProxyDeveloper implements Developer{
	
	private Developer developer;
	
	public ProxyDeveloper(Developer developer) {
		super();
		this.developer=developer;
	}


	@Override
	public void develpe() {
		 
		System.out.println("출근 카드를 찍는다.");
		
		try {
			developer.develpe();
		}catch (Exception e) {
			System.out.println("쉬는 날입니다.");
		}finally {
			System.out.println("집에 간다.");
		}
		
	}

}
