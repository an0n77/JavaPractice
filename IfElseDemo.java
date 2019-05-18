public class IfElseDemo{
	public static void main(String[] args){
	int age = 26;
	int salary = 50000;

	if(age>30){
	System.out.println("10% of salary i.e., " +(salary*10/100)+ " will be deducted and will receive " +  (salary - (salary*10/100)) );
	}
	else
	System.out.println("5% of salary i.e., " +(salary*5/100)+ " will be deducted and will receive " + (salary - (salary*5/100)));
	}
}