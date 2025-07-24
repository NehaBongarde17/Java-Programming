package com.sunbeam;

public class Program {
	
	public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "cherry", "apple", "banana", "date"};
        String[] array2 = {"grape", "apple", "kiwi","grape"};

        System.out.println("Duplicate values in array1:");

        for(int i = 0; i < array1.length; i++) {
            for(int j = i + 1; j < array1.length; j++) {
                if(array1[i].equals(array1[j])) {
                    System.out.println(array1[i]);
                    break; 
                }
            }   
        }
        System.out.println("Duplicate values in array2:");
        for(int i = 0; i < array2.length; i++) {
            for(int j = i + 1; j < array2.length; j++) {
                if(array2[i].equals(array2[j])) {
                    System.out.println(array2[i]);
                    break; 
                }
            }   
        }
	}
}
