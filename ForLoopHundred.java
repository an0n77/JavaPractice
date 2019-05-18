public class ForLoopHundred{
	public static void main(String[] args){
	System.out.println("Sum of Numbers");
	int a = 0;
	for(int i =1; i<=100; i++){
	a += i;
	}
	System.out.println(a);
	
System.out.println("Even Numbers");
	for(int i=1; i<=100;i++){
		if(i%2==0){
			System.out.println(i);
		}

	}
System.out.println("Number Divisible by 5");
	for(int i=1;i<=100;i++){
		if(i%5==0){
			System.out.println(i);
		}
	}

	float r = 11f;

	float area = r*r*22/7;
	System.out.println("Area of cicle: "+area);
}
}