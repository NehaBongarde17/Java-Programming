package com.sunbeam;

import java.util.Scanner;

public class LargestandSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.print("Enter the elements in array : ");
		
		for(int i = 0;i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int smallest = arr[0];
		int largest = arr[0];
		
		for(int i = 1 ; i < arr.length;i++) {
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
			else {
				largest = arr[i];
			}
			
		}
		
		System.out.println("Largest : "+largest);
		System.out.println("Smallest : "+smallest);
		
		sc.close();
	}

}
