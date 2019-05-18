import java.util.*;
public class AgeTax{
	public static void main(String[] args){
	int age = 24;
	String gender = "male";
	int salary = 25000;

	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter Age:");
	age = s1.nextInt();
	System.out.println("Enter Gender: ");
	gender = s1.next();
	System.out.println("Enter Salary");
	salary = s1.nextInt();

if(age<25){
	if(gender.equals("male")){
	salary-= salary*0.15;
	System.out.println("Salary: "+salary);
	}
	else{
	salary-= salary*0.1;
	System.out.println("Salary: "+salary);
	}
	}
else{
	if(gender.equals("male")){
		salary-= salary*0.25;
		System.out.println("Salary: "+salary);
	}
	else{
		salary -=salary*0.25;
		System.out.println("Salary: "+salary);
	}

System.out.println("Salary: "+salary);
}
}
}