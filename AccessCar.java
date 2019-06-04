public class AccessCar{
	public static void main(String[] args) {
		CarGetSet c1 = new CarGetSet();
		CarGetSet c2 = new CarGetSet();

		c1.setId(1);
		c1.setName("Tesla");
		c1.setCost(12000.0d);

		c2.setId(2);
		c2.setName("Porsche");
		c2.setCost(18000.0d);

		System.out.println("Id:"+c1.getId()+"\t"+"Model:"+c1.getName()+"\tCost:"+c1.getCost());
		System.out.println("Id:"+c2.getId()+"\t"+"Model:"+c2.getName()+"\tCost:"+c2.getCost());
	}
}