public class TypeCasting{
	public static void main(String[] args){
		System.out.println("1");
		int a = 10;
		String b = "10";
		Integer c= Integer.parseInt(b);
			
		
		System.out.println(a+c);

		System.out.println("2");
		float d = 10.5f;
		int e = 10;
		int f = (int) d;
		System.out.println(e+f);

		System.out.println("3");
		System.out.println(10+""+20);

		// int g = 10;
		// int h = 20;
	
		System.out.println(""+10+20);

	}
}