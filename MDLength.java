public class MDLength{
	public static void main(String[] args){

		MDLength t = new MDLength();
		System.out.println(t);

		int[][] a = {{00,01,02},{10,11,12}};
		for(int i =0; i<a.length;i++){

			for(int j=0;j<a[0].length;j++){
			System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
	
	System.out.println("a[i][j] length:"+a.length+","+a[0].length);
	}


// @Override
// public String(){
// 	return "Hi";
// }
}