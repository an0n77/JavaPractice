import java.util.Scanner;
public class ArrayNumberSort{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of Array:");
	int len = scan.nextInt();

	int[] a = new int[len];
	for(int i=0;i<len;i++){
		System.out.println("Enter a number:");
		a[i] = scan.nextInt();
	}
	int minValue = a[0];
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[j]<a[i]){
				minValue = a[j];
				a[j] = a[i];
				a[i] = minValue;
			}
		}
	}
	
	System.out.println("");
	for(Integer x:a){
		System.out.println(x);
	}

	}
}