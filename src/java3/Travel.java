package java3;

public class Travel {
	
	public void auto(int a) {
		System.out.println(a);
	}
	
	public void auto (int a, int b) {
		System.out.println(a + b);
	}
	
	public void auto() {
		System.out.println("non parameter");
	}
	
	public static void main(String[] args) {
		
		Travel e = new Travel();
		e.auto(4);
		e.auto();
		e.auto(56, 67);
	}

}
