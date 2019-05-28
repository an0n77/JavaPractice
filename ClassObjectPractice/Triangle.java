import java.util.Scanner;

class Triangle{
	private double area;
	private int perimeter;
	//Using Constructor
	Triangle(int a,int b,int c){
		this.area = calcArea(a,b,c);
		this.perimeter = calcPerimeter(a,b,c);
	}


	//Using Method
	public int calcPerimeter(int a,int b, int c){
		int perimeter= a+b+c;
		return perimeter;
	}

	public double calcArea(int a, int b, int c){
		double s = (a+b+c)/2;
		double area = Math.pow(s*(s-a)*(s-b)*(s-c),0.5);
		return area;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of sides");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		// Triangle tr = new Triangle();
		// System.out.println("Perimeter: "+tr.calcPerimeter(a,b,c));
		// System.out.println("Area: "+tr.calcArea(a,b,c));

		Triangle t = new Triangle(a,b,c);
		
		System.out.println("Enter sides of another Triangle:");
		int l = s.nextInt();
		int b1 = s.nextInt();
		int h = s.nextInt();
		Triangle t1 = new Triangle(l,b1,h);
		System.out.println("1st Triangle\n"+"Area: "+t.area);
		System.out.println("Perimeter: "+t.perimeter);
		System.out.println("\n2nd Triangle\n"+"Area: "+t1.area);
		System.out.println("Perimeter: "+t1.perimeter);

	}
}