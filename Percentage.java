public class Percentage{
	public static void main(String[] args){
	int percent = 200;

	if(percent >= 80){
	System.out.println("Distinction");
	}
	else if(percent>=60 && percent<80){
		System.out.println("1st Division");
	}
	else if(percent>=50 && percent<60){
		System.out.println("2nd Division");
	}

	else if(percent>=40 && percent<50){
		System.out.println("3rd Division");
	}
	else
	{
		System.out.println("Fail");
	}
	}
}