import java.util.Scanner;
public class SumMethod{
	public int sum(int a,int b){
	return(a+b);
	}

	public static void main(String[] args){
	SumMethod s = new SumMethod();
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Number:");
	int a = scan.nextInt();
	System.out.println("Enter Number:");
	int b = scan.nextInt();
	int n=s.sum(a,b);
	System.out.println("Sum="+n);
	}
}