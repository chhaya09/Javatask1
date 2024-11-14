package java3;

public class Even_num {
	
	public static void main(String[] args) {
	
        System.out.println("Even numbers between 1 and 20:");
        
        for (int number = 1; number <= 20; number++) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
