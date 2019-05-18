public class ExampleString{
	public static void main(String[] args){
	String firstName = "trevor";
	

	String firstalpha = firstName.substring(0,1);
	System.out.println(firstalpha.toUpperCase()+firstName.substring(1,6));
	
	String statRam = "i will kill you Ravan";

	System.out.println(statRam);
	int leg = statRam.length();
	String ss = statRam.toLowerCase();

	System.out.println(ss.substring(0,1).toUpperCase()+ss.substring(1,leg));
	
	

	
	// String a1=statRam.substring(0,1);
	// String statRam1 = statRam.substring(1,leg-6);
	// String statRam2 = statRam.substring(leg-4,leg);
	// String a2 = statRam.substring(leg-6,leg-4);
	// // System.out.println(a2);
	// System.out.println(a1.toUpperCase()+statRam1+a2.toLowerCase()+statRam2);
	
	}
}