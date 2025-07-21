package com.problem2;

class Invoice{
	private String part_number;
	private String part_description;
	private int quantity;
	private double price;
	
	public Invoice(String part_number,String part_description,int quantity,double price) {
		this.part_number = part_number;
		this.part_description = part_description;
		this.quantity = quantity;
		this.price = price;
	}
	public String getNumber() {
		return part_number;
	}
	public void setNumber(String part_number) {
		this.part_number = part_number;
	}
	public String getDescription() {
		return part_description;
	}
	public void setDescription(String part_description) {
		this.part_description = part_description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity>0) {
			this.quantity = quantity;
		}
		else {
			this.quantity = 0;
		}
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>0) {
			this.price = price;
		}
		else {
			this.price = 0.0;
		}
	}
	public double calcAmount() {
		double amount;
		amount = this.quantity*this.price;
		return amount;
	}
	public void displayInfo() {
		System.out.printf("Number : %s\nDescription : %s\nQuantity : %d\nPrice : %.2f\n",this.part_number,this.part_description,this.quantity,this.price);
	}
}

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice iv = new Invoice("2E233","hjagdfjhag",2,20000.00);
		
		System.out.println("Item information :");
		iv.displayInfo();
		
		System.out.println("Amount : "+iv.calcAmount());
		
		iv.setNumber("2");
		iv.setDescription("hammer");
		iv.setQuantity(-4);
		iv.setPrice(-200);
		
		System.out.println("After setting the negative quantity and price:");
		//iv.displayInfo();
		
		System.out.println("Number :"+iv.getNumber());
		System.out.println("Description :"+iv.getDescription());
		System.out.println("Quantity :"+iv.getQuantity());
		System.out.println("Price :"+iv.getPrice());
		System.out.println("Amount :"+iv.calcAmount());

	}

}
