package Modules;

import java.util.ArrayList;

public class School {
	String name;
	String adress;
	String phoneNumber;
	ArrayList<Student>listesrudent=new ArrayList<>();
	ArrayList<Teacher>listesDesteachers=new ArrayList<>();
	ArrayList<Grade>listesDesGrade=new ArrayList<>();

	public School() {

		
	}
	/**
	 * @param name
	 * @param adress
	 * @param phoneNumber
	 * @param listesrudent
	 * @param listesDesteachers
	 * @param listesDesGrade
	 */

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public ArrayList<Student> getListesrudent() {
		return listesrudent;
	}
	
	public ArrayList<Teacher> getListesDesteachers() {
		return listesDesteachers;
	}

	public ArrayList<Grade> getListesDesGrade() {
		return listesDesGrade;
	}
	/**
	 * @param name
	 */
	public School(String name) {
		super();
		this.name = name;
	}
	

}
