import java.util.Scanner;
public class Swap{
	public static void main(String[] args){
	int a = 0;
	int b = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a:");
	a = sc.nextInt();
	System.out.println("Enter b:");
	b = sc.nextInt();
	System.out.println("Initial A="+a);
	System.out.println("Initial B="+b);
	a = a^b;
	System.out.println("A="+a);
	b = a^b;
	System.out.println("B="+b);
	a = a^b;
	System.out.println("Final A="+a);


	}
}