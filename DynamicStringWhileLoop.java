import java.util.Scanner;

public class DynamicStringWhileLoop{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	String s = "yes";
	while(s.equals("yes")){
	System.out.println("Hello console!! I am sending you a stream");
	
	System.out.println("Do you want to continue? Type Yes or No..");
	s = sc.next();
	s = s.toLowerCase();
	}
	
}