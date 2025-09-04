import java.util.Scanner;

class Employee{
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee() {
		this.firstName = "/0";
		this.lastName = "/0";
		this.monthlySalary = 0.0;
	}
	
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		if(monthlySalary < 0 ) {
			this.monthlySalary = 0.0;
		}
		else {
			this.monthlySalary = monthlySalary;
		}
	}
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first name of employee : ");
		firstName = sc.next();
		System.out.print("Enter the last name of employee : ");
		lastName = sc.next();
		System.out.print("Enter the monthly salary of employee : ");
		monthlySalary = sc.nextDouble();
		
		if(monthlySalary < 0) {
			monthlySalary = 0.0;
		}
	}
	
	public double getYearlySalary() {
		return monthlySalary * 12;
	}
	
	public double raiseSalary(double percent) {
		monthlySalary = monthlySalary * (1 + percent / 100);
		return monthlySalary;
	}
	
	public void showRecord() {
		System.out.println("=======Employee Details=======");
		System.out.println("First Name : "+firstName);
		System.out.println("Last Name : "+lastName);
		System.out.println("Monthly Salary : "+monthlySalary);
		System.out.println("Yearly Salary : "+getYearlySalary());
		System.out.println("==============================");
		
	}
	
}
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.acceptRecord();
		System.out.println("Yearly Salary : "+e1.getYearlySalary());
		e1.raiseSalary(10);
		System.out.println("Yearly salary after 10% raise : "+e1.getYearlySalary());
		e1.showRecord();
		
		Employee e2 = new Employee();
		e2.acceptRecord();
		System.out.println("Yearly Salary : "+e2.getYearlySalary());
		e2.raiseSalary(10);
		System.out.println("Yearly salary after 10% raise : "+e2.getYearlySalary());
		e2.showRecord();
		
		
	}

}
