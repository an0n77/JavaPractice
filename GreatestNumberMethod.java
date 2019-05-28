public class GreatestNumberMethod{
	public int compare(int a,int b,int c){
	int gr = (a>b)?((a>c)?a:c):(b>c)? b:c;
	return gr;
	}

	public static void main(String[] args){
		int a = 10;
		int b = 15;
		int c = 9;

		GreatestNumberMethod g = new GreatestNumberMethod();
		int greatest = g.compare(a,b,c);
		System.out.println(greatest);
	}
}