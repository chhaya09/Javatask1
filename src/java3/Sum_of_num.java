package java3;

public class Sum_of_num {

    public static void main(String[] args) {
        int totalSum = 0;
        
        for (int number = 1; number <= 100; number++) {
            totalSum += number;
        }
        
        System.out.println("The sum of numbers from 1 to 100 is: " + totalSum);
    }
}
