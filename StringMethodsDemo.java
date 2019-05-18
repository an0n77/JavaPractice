public class StringMethodsDemo{
	public static void main(String[] args){
	String s1 = "StringDemo";
	System.out.println(s1.charAt(3));
	System.out.println(s1.length());
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.isEmpty());
	System.out.println(s1.substring(0,7));
	System.out.println(s1.toCharArray());
	String s2 = "Strings";
	s2 = s2.toLowerCase();
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.concat(s2));
	System.out.println(s1.contains("a"));
	}
}