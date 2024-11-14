package java3;

import java.util.Scanner;

public class Looptask2 {


    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.print("Enter the first number (num1): ");
        int num1 = a.nextInt();
        
        System.out.print("Enter the second number (num2): ");
        int num2 = a.nextInt();
        
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2 + "");
            
        }
        
        else if (num2 > num1) {
            System.out.println(num2 + " is greater than " + num1 + "");
            
            
        }
        
        else {
            System.out.println(num1 + " and " + num2 + " are equal.");
        }
        
    }    
}    

