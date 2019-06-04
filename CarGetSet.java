import java.io.Serializable;

public class CarGetSet implements Serializable{
	CarGetSet() {}	
	private int id;
	private String name;
	private double cost;

	public void setId(int id){
		this.id = id;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setCost(double cost){
		this.cost = cost;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}
	public double getCost(){
		return cost;
	}

}