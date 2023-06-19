package Modules;

public class Teacher extends Person{
	float salary;

	/**
	 * 
	 */
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param age
	 */
	public Teacher(String name, int age	, float salary) {
		super(name, age);
		this.salary=salary;
		// TODO Auto-generated constructor stub
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	
	@Override
	public String getData() {
		return  this.getName() +" "  +   this.getAge() + "  " + getSalary();
		
		
		
		
	}

	


}
