public class StaticVariable{

static int a=10; //is static and can be accessed through object as well as static content and class,but we don't call with object
int b=20; //non-static and hence can be used only through object's scope



public void testMethod(){
	System.out.println(a);
	System.out.println(b);
}

}