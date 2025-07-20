package com.problem1;

class Date{
	private int day;
	private int month;
	private int year;
	
	public Date(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return this.day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return this.month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void displayDate() {
		System.out.printf("Date : %d/%d/%d\n",this.day,this.month,this.year);
	}
	
}
public class DateTest{
	public static void main(String[] args) {
		Date dt1 = new Date(2,3,2004);
		//dt1.displayDate();
		
		System.out.print("Initial date:");
		dt1.displayDate();
		
		dt1.setDay(12);
		dt1.setMonth(3);
		dt1.setYear(2023);
		
		System.out.print("Updated date:");
		dt1.displayDate();
		
		System.out.println("Month:"+dt1.getMonth());
		System.out.println("Day:"+dt1.getDay());
		System.out.println("Year:"+dt1.getYear());


	}

}
