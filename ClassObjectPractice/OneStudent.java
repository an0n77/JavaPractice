class OneStudent{
//Question No.1
	private String name;
	private int roll_no;

	OneStudent(String name,int roll_no){
		this.name = name;
		this.roll_no = roll_no;
	}

	public static void main(String[] args){
		OneStudent john = new OneStudent("John",2);
		System.out.println("Name: "+john.name);
		System.out.println("Roll No.: "+john.roll_no);
	}
}