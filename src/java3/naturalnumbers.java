package java3;

public class naturalnumbers {
	
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;

        while (number <= 10) {
            sum += number;
            number++;
        }

        System.out.println("The sum of the first 10 natural numbers is: " + sum);
    }
}
