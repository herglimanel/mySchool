package Services;

import java.util.Iterator;

import Modules.Grade;
import Modules.School;
import Modules.Student;
import Modules.Teacher;

public class SchoolServices {
	School school;

	/**
	 * @param school
	 */
	public SchoolServices() {
	}

	public SchoolServices(School school) {
		super();
		this.school = school;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public void addStudent(Student student) {
		this.school.getListesrudent().add(student);

	}

	public void addTeacher(Teacher teacher) {
		this.school.getListesDesteachers().add(teacher);

	}

	public void addGrade(Grade grade) {
		this.school.getListesDesGrade().add(grade);

	}

	public void removeStudent(Student student) {
		this.school.getListesrudent().remove(student);

	}

	public void removeTeacher(Teacher teacher) {
		this.school.getListesDesteachers().remove(teacher);

	}

	public void removeGrade(Grade grade) {
		this.school.getListesDesGrade().remove(grade);

	}

	public Student getStudentByName(String name) {
		Student a = null;
		for (Student student : this.school.getListesrudent()) {
			if (student.getName().toUpperCase().equals(name.toUpperCase())) {
				a = student;
				break;

			}
		}
		return a;

	}

	public Teacher getTeacherByName(String name) {

		for (Teacher teacher : this.school.getListesDesteachers()) {
			if (teacher.getName().toUpperCase().equals(name.toUpperCase())) {
			

			}

			return teacher;

		}
		return null;
	}
	public Grade getGradeByName(String name) {

		for (Grade grade : this.school.getListesDesGrade()) {
			if (grade.getName().equals(name)) {
			

			}

			return grade;

		}
		return null;
	}
}
