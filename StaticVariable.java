public class StaticVariable{

static int a=10; //is static and can be accessed through object as well as static content and class,but we don't call with object
int b=20; //non-static and hence can be used only through object's scope

public static void main(String[] args){

System.out.println(a);
//for non static content 
StaticVariable sv= new StaticVariable();
System.out.println(sv.b);
System.out.println(sv.a);
sv.testMethod();

}

public void testMethod(){
	System.out.println(a);
	System.out.println(b);
}

}