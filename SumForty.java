public class SumForty{
	public int sumA(int a){
	return (a+40);
	}

	public void sumB(int a){
	System.out.println(a+1);
	}

	public static void main(String[] args){
	SumForty s = new SumForty();
	int a = s.sumA(10);
	System.out.println(a);
	s.sumB(2);

	}	
}