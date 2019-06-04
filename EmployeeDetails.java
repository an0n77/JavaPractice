import java.io.Serializable;

public class EmployeeDetails implements Serializable{
private int id;
private String name;
private String department;
private int workinghrs;
private double salary;

EmployeeDetails(){}

public void setId(int id){
	this.id = id;
}

public void setName(String name){
	this.name = name;
}

public void setDepartment(String dept){
	this.department = dept;
}

public void setWorkinghrs(int hrs){
	this.workinghrs = hrs;
}

public void setSalary(double salary){
	this.salary = salary;
}

public int getId(){
	return id;
}

public String getName(){
	return name;
}

public String getDepartment(){
	return department;
}

public int getWorkinghrs(){
	return workinghrs;
}

public double getSalary(){
	return salary;
}
}