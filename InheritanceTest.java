import java.time.LocalDate;
import java.time.Period;

class Person{
	private String name;
	LocalDate birthday;
	private double height;
	private double weight;
	private String address;
	
	public Person(String name, LocalDate birthday, double height, double weight, String address) {
		this.name = name;
		this.birthday = birthday;
		this.height = height;
		this.weight = weight;
		this.address = address;
	}

	public int calculateAge() {
		LocalDate today = LocalDate.now();
        Period period = Period.between(birthday, today);
        return period.getYears();
	}
	
}
class Student extends Person{
	private int roll_no;
	private double[] marks;
	
	public Student(String name, LocalDate birthday, double height, double weight, String address, int roll_no, double[] marks) {
		super(name, birthday, height, weight, address);
		this.roll_no = roll_no;
		this.marks = marks;
	}
	
	public void calculateAvg() {
		int sum = 0;
		for(int i = 0; i < marks.length;i++) {
			sum += marks[i];
		}
		double avg = sum / marks.length;
		System.out.println("Average marks : "+avg);
	}
	
	
}

class Employee_1 extends Person{
	private int empid;
	private double salary;
	
	public Employee_1(String name, LocalDate birthday, double height, double weight, String address, int empid, double salary) {
		super(name, birthday, height, weight, address);
		this.empid = empid;
		this.salary = salary;
	}
	
	public void calculateTax() {
		double tax_rate;
		if(salary <= 50000) {
			tax_rate = 0.10;
		}
		else if(salary <= 100000) {
			tax_rate = 0.20;
		}
		else {
			tax_rate = 0.30;
		}
		
		double tax = salary * tax_rate;
		
		System.out.println("Tax : "+tax);
	}
}
public class InheritanceTest {

	public static void main(String[] args) {
		Person p = new Person("Neha Bongarde",LocalDate.of(2004, 9, 6),165.0,37,"Hupari");
		int age = p.calculateAge();
		System.out.println("Age : "+age);
		
		Student s = new Student("Alice", LocalDate.of(2000, 8, 20), 1.65, 55, "456 College Road",20, new double[] {85, 90, 80});
		s.calculateAvg();
		
		Employee_1 e = new Employee_1("Bob", LocalDate.of(1985, 3, 10), 1.80, 75, "789 Work Ave",60, 60000);
		e.calculateTax();

	}

}
