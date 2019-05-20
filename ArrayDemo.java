import java.util.Scanner;
public class ArrayDemo{
	public static void main(String[] args){
	// int[] a = {1,2,3,7,12,99,34,11};
	// for(int i=0; i<8;i++){
	// System.out.println(a[i]);
	// }

	// String[] name = {"Ram","Shyam", "Hari","Ramesh", "Rabi"};
	// int index = 0;
	// for(int i=0; i<5;i++){
	// 	if(name[i].length()>name[index].length()){
	// 		index = i;
	// 	}
	// }
	// System.out.println(name[index]);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Length");
		int l = scan.nextInt();
		int[] n = new int[l];

		for(int i=0;i<l;i++){
			System.out.println("Enter Number:");
			n[i]=scan.nextInt();
		}

		System.out.println("");
		for(Integer x:n){
			System.out.println(x);
		}



	}
}