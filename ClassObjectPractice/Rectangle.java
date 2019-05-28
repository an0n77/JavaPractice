class Rectangle{
	private int length;
	private int breadth;
	private int area;

	public int area(int l,int b){
	return (l*b);
	}

	Rectangle(int l,int b){
	this.length = l;
	this.breadth = b;
	this.area = area(l,b);
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(5,8);
		System.out.println("Area of r1: "+r1.area);
		System.out.println("Area of r2: "+r2.area);
	}

}