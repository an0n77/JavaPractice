public class AccessModifier{


public static void main(String[] args){
	Car.testDrive();
	
	//wagener.engineConfigure();
}

}

class Car{

private Car(){
	System.out.println("i cannot give you access to make an object here");
}
	public static void testDrive(){
		System.out.println("You can test drive this wagener");
		Car c= new Car();
		c.engineConfigure();
	}

	private void engineConfigure(){
		System.out.println("Only people from wagener can access this");
	}

}