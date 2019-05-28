import java.util.Scanner;
public class LongName{
	public String compare(String a,String b){
	return((a.length()>b.length())?a:b);
	}

	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	LongName l = new LongName();
	String a = s.next();
	String b = s.next();

	String res = l.compare(a,b);
	System.out.println(res);

	}
}