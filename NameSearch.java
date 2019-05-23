import java.util.Scanner;

public class NameSearch{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the number of Name:");
	int n = scan.nextInt();
	scan.nextLine();
	String[] a = new String[n];
	for(int i=0;i<n;i++){
		System.out.println("Enter name:");
		a[i]=scan.nextLine();
	}
	String tempStr = a[0];
	
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(a[j].length()<a[i].length()){
				tempStr = a[j];
				a[j] = a[i];
				a[i] = tempStr;
			}
		}
	}

	for(String x:a){
		System.out.println(x);
	}

	System.out.println("Enter Name For Searching:");
	String sName = scan.nextLine();

	for(int i=0;i<n;i++){
		if(sName.equals(a[i])){
			System.out.println("The name "+sName+" is in the list.");
		}
	}
		

	}
}