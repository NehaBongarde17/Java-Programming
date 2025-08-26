package com.sunbeam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
	
	public int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("Enter the number : ");
			int num = sc.nextInt();
			if(num<0) {
				System.out.println("There is no factorial for negative number.");
			}
			else {
				Factorial fact = new Factorial();
				int result = fact.factorial(num);
				System.out.println("Factorial of "+num+" is "+result);
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Enter the valid number please.Try again..!");
		}
		
	}

}
