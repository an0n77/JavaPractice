public class ObjectDemo1{

private String name;
private int id;
private String address;


public void printName(){
	this.name="hello";
}
public void printId(){
	this.id=2;
}
public void printAddress(){
	this.address="putalisadak";
}
public static void main(String[] args){

ObjectDemo1 object1= new ObjectDemo1(); //creates an object
System.out.println(object1.name); //accessing class attribute with help of an object
object1.printName(); //accessing class method with help of an object
System.out.println(object1.name);
ObjectDemo1 object2= new ObjectDemo1();
System.out.println(object2.name);
}



}