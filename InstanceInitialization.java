public class InstanceInitialization{
	String name;
	static String address;

	{  name="hari";   } //IIB instance initilaization block, called before constructor
	static{             //SIB Static initilaization block , called when class is initialized      
		address="anamnagar";
		System.out.println(address);
	}
	InstanceInitialization(){
		System.out.println(name);
	}
	public static void main(String[] args){
		InstanceInitialization ii= new InstanceInitialization();
		InstanceInitialization i2= new InstanceInitialization();
	}


}