public class TestObject{
	int a =10;
	int b =20;

	public void methoda()
	{
	System.out.println("Hello Buddy");
	}

	public static void main(String[] args){
	TestObject t1=new TestObject();

	t1.methoda();

	System.out.println(t1.a);
	System.out.println(t1.b);
	}
}