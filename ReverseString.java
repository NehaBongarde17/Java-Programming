package com.sunbeam;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.next();
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String str1 = sb.toString();
		System.out.println("String after reverse : "+str1);
		
		sc.close();
	}

}
