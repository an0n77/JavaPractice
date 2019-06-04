import java.util.Scanner;


public class EmployeeSetGet{

	public static void main(String[] args) {
		EmployeeDetails e1 = new EmployeeDetails();
		EmployeeDetails e2 = new EmployeeDetails();
		EmployeeDetails e3 = new EmployeeDetails();

		Scanner in = new Scanner(System.in);

		System.out.println("Employee Details Entry");
		System.out.print("Id: ");
		int id = in.nextInt();
		in.nextLine();
		System.out.print("Name: ");
		String name = in.nextLine();
		System.out.print("Department: ");
		String dept = in.nextLine();
		System.out.print("Working Hours: ");
		int hrs = in.nextInt();
		System.out.print("Salary: ");
		double salary = in.nextDouble();

		e1.setId(id);
		e1.setName(name);
		e1.setDepartment(dept);
		e1.setWorkinghrs(hrs);
		e1.setSalary(salary);

		System.out.println("Employee Details Entry");
		System.out.print("Id: ");
		id = in.nextInt();
		in.nextLine();
		System.out.print("Name: ");
		name = in.nextLine();
		System.out.print("Department: ");
		dept = in.nextLine();
		System.out.print("Working Hours: ");
		hrs = in.nextInt();
		System.out.print("Salary: ");
		salary = in.nextDouble();

		e2.setId(id);
		e2.setName(name);
		e2.setDepartment(dept);
		e2.setWorkinghrs(hrs);
		e2.setSalary(salary);

		System.out.println("Employee Details Entry");
		System.out.print("Id: ");
		id = in.nextInt();
		in.nextLine();
		System.out.print("Name: ");
		name = in.nextLine();
		System.out.print("Department: ");
		dept = in.nextLine();
		System.out.print("Working Hours: ");
		hrs = in.nextInt();
		System.out.print("Salary: ");
		salary = in.nextDouble();

		e3.setId(id);
		e3.setName(name);
		e3.setDepartment(dept);
		e3.setWorkinghrs(hrs);
		e3.setSalary(salary);


		System.out.println("Id: "+e1.getId()+"\tName: "+e1.getName()+"\tDepartment: "+e1.getDepartment()+
			"\tWorking Hours: "+e1.getWorkinghrs()+"\tSalary: "+e1.getSalary());
		System.out.println("Id: "+e2.getId()+"\tName: "+e2.getName()+"\tDepartment: "+e2.getDepartment()+
			"\tWorking Hours: "+e2.getWorkinghrs()+"\tSalary: "+e2.getSalary());
		System.out.println("Id: "+e3.getId()+"\tName: "+e3.getName()+"\tDepartment: "+e3.getDepartment()+
			"\tWorking Hours: "+e3.getWorkinghrs()+"\tSalary: "+e3.getSalary());

}
}