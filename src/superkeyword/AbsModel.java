package superkeyword;
import java.util.Scanner;
abstract class Employee{
	private String name;
	private int payment_per_hour;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setPay(int payment_per_hour) {
		this.payment_per_hour=payment_per_hour;
	}
	public int getPay() {
		return payment_per_hour;
	}
	abstract void CalculateSalary();
}
class ContractEmployee extends Employee{
	int cworking_Hour;
	int calculate_Salary;
	Scanner sc=new Scanner(System.in);
	public void CalculateSalary() {
		System.out.println("Enter working hour:");
		cworking_Hour=sc.nextInt();
		calculate_Salary=cworking_Hour*getPay();
		System.out.println("Total Salary:"+calculate_Salary);
	}
}
class FulltimeEmployee extends Employee {
	int working_Hour;
	int calculate_Salary;
	Scanner sc=new Scanner(System.in);
	public void CalculateSalary() {
		System.out.println("Enter working hour:");
		int working_Hour=sc.nextInt();
		calculate_Salary=working_Hour*getPay();
		System.out.println("Total Salary:"+calculate_Salary);
	}
	
}
public class AbsModel {

	public static void main(String[] args) {
		ContractEmployee c=new ContractEmployee();
		FulltimeEmployee f=new FulltimeEmployee();
		c.setName("Reshma");
		System.out.println("Enter Contract Employee name:"+c.getName());
		c.setPay(100);
		System.out.println("Pay per Hour:"+c.getPay());
		c.CalculateSalary();
		System.out.println();
		f.setName("Alex");
		System.out.println("Enter Full Time Employee name:"+f.getName());
		f.setPay(100);
		System.out.println("Pay per Hour:"+f.getPay());
		f.CalculateSalary();
		

	}

}
