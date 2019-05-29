import java.util.Scanner;
class Employee{
	private int salary;
	private int time;

	public void getInfo(int salary, int time){
		this.salary = salary;
		this.time = time;
	}

	public void AddSal(int salary){
	if(salary<500){
	this.salary += 10;
	}
	}

	public void AddWork(int time){
	if(time>6){
	this.salary += 5;
	}
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter 1st salary:\t");
		int salary = s.nextInt();
		System.out.print("\nEnter 1st Working Hour: \t");
		int time = s.nextInt();

		System.out.print("Enter 2nd salary:\t");
		int salary1 = s.nextInt();
		System.out.print("\nEnter 2nd Working Hour: \t");
		int time1 = s.nextInt();


		Employee ram = new Employee();
		ram.getInfo(salary,time);
		ram.AddSal(salary);
		ram.AddWork(time);

		Employee shyam = new Employee();
		shyam.getInfo(salary1,time1);
		shyam.AddSal(salary1);
		shyam.AddWork(time1);
		System.out.println("\nFinal Salary:"+ram.salary);
		System.out.println("\nFinal Salary:"+shyam.salary);
	}
}