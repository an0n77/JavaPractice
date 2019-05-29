public class StaticTest2{


	public static void main(String[] args){
		TestClass.test(); TestClass.a;

		TestClass t1= new TestClass();
		t1.a;
		t1.b;
		t1.test();

	}
}


class TestClass{
	static int a=10;
	int b=10;
	public static void test(){
		System.out.println("hi there");
		System.out.println(a);
		System.out.println(b);
	}
}