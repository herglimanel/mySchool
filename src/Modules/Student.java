package Modules;

public class Student extends Person {
	
String parentPhone;

public Student() {
	super();
}


public Student(String name, int age,String parentPhone) {
	super(name, age);
	this.parentPhone=parentPhone;
	
}

public String getParentPhone() {
	return parentPhone;
}

public void setParentPhone(String parentPhone) {
	this.parentPhone = parentPhone;
}


@Override
public String getData() {
	return  this.getName() +" "  +   this.getAge() + "  " + getParentPhone();
	
	
	
	
}








}
