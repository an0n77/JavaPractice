public class StaticBlock1{
	static String name="Java";

	
	public static void main(String[] args){
		System.out.println("Shoutout from main method");
	}

	static{
		System.out.println("The course is :"+name);
	}
}