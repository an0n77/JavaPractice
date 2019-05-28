class TwoStudent{
	private String name;
	private String phone_number;
	private String address;

	TwoStudent(String name,String phone_number,String address){
	this.name = name;
	this.phone_number = phone_number;
	this.address = address;
	}

	public static void main(String[] args) {
		TwoStudent john = new TwoStudent("John","9812345670","Lazimpat");
		TwoStudent sam = new TwoStudent("Sam","9809876543","New Road");

		System.out.println("Name: "+john.name+"\tContact: "+john.phone_number+"\tAddress: "+john.address);
		System.out.println("Name: "+sam.name+"\tContact: "+sam.phone_number+"\tAddress: "+sam.address);
	}
}