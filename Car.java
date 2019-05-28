class Car{
	private String name;
	Car(){
	// System.out.println("I am a Toyota");
	}
	Car(String name){
	System.out.println("I am "+name);
	this.name = name;
	}
	public static void main(String[] args){
	// Car toyota = new Car();
	Car lamborghini = new Car("Lamborghini");
	System.out.println(lamborghini.name);
	}
}