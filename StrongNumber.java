package com.sunbeam;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		if(num<0) {
			System.out.println(num+" not strong number");
		}
		else if(num==0) {
			System.out.println(num+" is not strong number because "+num+"! is equal to 1");
		}
		else {
			int[] fact = new int[10];
			fact[0] = 1;

			for (int i = 1; i < 10; i++) {
			    fact[i] = fact[i - 1] * i;
			}

			int sum = 0;
			int temp = num;
			while(temp > 0) {
				int digit = temp % 10;
				sum += fact[digit];
				temp = temp / 10;
			}
			if(sum == num) {
				System.out.println(num+" is Strong number");
			}
			else {
				System.out.println(num+" is not Strong number");
			}
		}

	}

}
