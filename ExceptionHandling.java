package com.sunbeam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter the numerator : ");
			int num = sc.nextInt();
			
			System.out.print("Enter the denominator : ");
			int deno = sc.nextInt();
			
			int result = num / deno;
			System.out.println("Division : "+result);
		}
		catch(InputMismatchException e) {
			System.out.println("Error:Please enter valid numbers.");
		}
		catch(ArithmeticException e){
			System.out.println("Error:Denominator cannot be zero.");
		}
		finally {
			System.out.println("Operation completed");
		}

	}

}
