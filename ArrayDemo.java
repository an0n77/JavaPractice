public class ArrayDemo{
	public static void main(String[] args){
	// int[] a = {1,2,3,7,12,99,34,11};
	// for(int i=0; i<8;i++){
	// System.out.println(a[i]);
	// }

	String[] name = {"Ram","Shyam", "Hari","Ramesh", "Rabi"};
	int index = 0;
	for(int i=0; i<5;i++){
		if(name[i].length()>name[index].length()){
			index = i;
		}
	}
	System.out.println(name[index]);

	}
}