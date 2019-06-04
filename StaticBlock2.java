public class StaticBlock2{
	static String name;
	static String address;

	static{

	name = "Ram";
	address = "New Road";
	}

	static{

	name = "Hari";
	address = "Old Road";
	}

public static void main(String[] args){
	System.out.println(name);
	System.out.println(address);
}
}