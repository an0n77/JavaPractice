import java.util.Scanner; 
public class ArrayDemoSmallest{
	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<10;i++){
		System.out.println("Enter number:");
		a[i]=scan.nextInt();
		}
		int sindex = 99999999;
		for(int i=0;i<10;i++){
		if(a[i]<sindex){
		sindex=a[i];
		}
		}
		System.out.println("The Smallest number is:"+sindex);
	}
}