public class IfElseFfDemo{
	public static void main(String[] args){
	int age = 73;
	int salary = 25000;
	if (age<25){
	salary -= 0.05*salary;
	}
	else if(age>25 && age<40){
	salary -= 0.15*salary;
	}

	else{
	salary -= 0.25*salary;
	}

	System.out.println("Salary: "+salary);
	}
}