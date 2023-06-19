package Modules;

import java.util.ArrayList;

public class Grade {
	String code;
	String name;
	Teacher teacher;
	ArrayList<Student>listeDesEtudiants= new ArrayList<>();	
	
	public Grade() {
		
	}

	/**
	 * @param code
	 * @param name
	 * @param teacher
	 * @param listeDesEtudiants
	 */
;
	
	/**
	 * @param code
	 * @param name
	 */
	public Grade(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public ArrayList<Student> getListeDesEtudiants() {
		return listeDesEtudiants;
	}
	public void addStudent(Student student) {
		this.listeDesEtudiants.add(student);	
	}

		public void removeStudent(Student student) {
			this.listeDesEtudiants.remove(student);
		}


	

}
