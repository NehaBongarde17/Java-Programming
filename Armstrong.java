package com.sunbeam;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = sc.nextInt();
		int temp = num;
		int count = 0;
		int result;
		while(temp>0) {
			count++;
			temp = temp/10;
		}
		temp = num;
		int sum = 0;
		
		while(temp>0) {
			int digit = temp % 10;
			result = (int)Math.pow(digit,count);
			sum = sum + result;
			temp = temp / 10;
		}
		if(sum==num) {
			System.out.println(num+" is Armstrong number");
		}
		else {
			System.out.println(num+" is not Armstrong number");
		}
		
	}

}
