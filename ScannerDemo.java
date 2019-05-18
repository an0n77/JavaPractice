import java.util.Scanner;

public class ScannerDemo{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a integer value");
	int a = sc.nextInt();
	sc.nextLine();	//Enter is used by this code
	System.out.println("Enter a name");
	String name = sc.nextLine();

	System.out.println("Number: "+a);
	System.out.println("Name: "+name);
	}
}