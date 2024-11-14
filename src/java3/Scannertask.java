package java3;

import java.util.Scanner;

public class Scannertask {
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		// String
		System.out.println("Enter your name:");
		String name = a.nextLine();
		System.out.println("The name is: " + name);
		
		// int 
		System.out.println("Enter your ID (int):");
		int id = a.nextInt();
		System.out.println("The ID is: " + id);
		
		// byte 
		System.out.println("Enter a byte value (byte):");
		byte nextByte = a.nextByte();
		System.out.println("The byte value is: " + nextByte);
		
		// char
		System.out.println("Enter a single character (char):");
		char character = a.next().charAt(0);
		System.out.println("The single character is: " + character);
		
		// double 
		System.out.println("Enter a double value (double):");
		double nextDouble = a.nextDouble();
		System.out.println("The double value is: " + nextDouble);
		

	}
}

