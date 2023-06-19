package MySchool;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

import Modules.Person;
import Modules.School;
import Modules.Student;
import Modules.Teacher;
import Services.SchoolServices;
import Tools.ActionEnum;

public class Hmi {
	private static SchoolServices schoolServices;

	public static void start() {
		Scanner scanner = new Scanner(System.in);
		School school = Hmi.createSchool();

		System.out.println("welcome to " + school.getName() + "   in   " + school.getAdress());
		String action;
		do {
			System.out.println("what do you want to do??");
			action = scanner.next();
			switch (action) {
			case "addStudent":
				Hmi.addStudent();
				break;
			case "addTeacher":
				Hmi.addTeacher();
				break;
			case "printAllStudent":
				Hmi.printAllStudent();
				break;
			case "printAllTeacher":
				Hmi.printAllTeacher();
				break;
			case "FindStudentByName":
				Hmi.PrintDataPersonByName(ActionEnum.STUDENT);

				break;
			case "FindTeacherByName":
				Hmi.PrintDataPersonByName(ActionEnum.TEACHER);
				break;
			case "removeStudent":
				Hmi.removePerson(ActionEnum.TEACHER);
				break;
			case "removeTeacher":
				Hmi.removePerson(ActionEnum.TEACHER);
				break;

			default:
				break;
			}

		} while (!action.equals("exit"));
	}

	private static School createSchool() {
		School school = new School();
		school.setName("barmaja");
		school.setAdress("tunisia");
		school.setPhoneNumber("564654");
		Hmi.schoolServices = new SchoolServices(school);
		return school;

	}

//  la methode addStudent**/////
	private static void addStudent() {
		Student student = new Student();
		Hmi.setDataPerson(student);
		Hmi.schoolServices.addStudent(student);
	}

//  la methode addTeacher**/////
	private static void addTeacher() {
		Teacher teacher = new Teacher();
		Hmi.setDataPerson(teacher);
		Hmi.schoolServices.addTeacher(teacher);
	}

//  la methode PrintAllStudent**/////
	public static void printAllStudent() {

		for (Student student : Hmi.schoolServices.getSchool().getListesrudent()) {
			System.out.println(student.getData());
		}
	}

//  la methode PrintAllTeacher**/////
	public static void printAllTeacher() {

		for (Teacher teacher : Hmi.schoolServices.getSchool().getListesDesteachers()) {
			System.out.println(teacher.getData());

		}
	}

	private static void setDataPerson(Person p) {
		Scanner reader = new Scanner(System.in);
		System.out.println("please enter the name");
		p.setName(reader.next());
		//////
		System.out.println("please enter the age ");
		p.setAge(reader.nextInt());
		////////
		if (p instanceof Teacher) {
			System.out.println("please enter the salary of teacher");
			((Teacher) p).setSalary(reader.nextFloat());

		} else if (p instanceof Student) {
			System.out.println("please enter the ParentPhone of student");
			((Student) p).setParentPhone(reader.next());

		} else {

			throw new InputMismatchException();
		}

	}

	private static void PrintDataPerson(Person person) {
		if (person == null) {
			System.out.println("not found");

		} else
			System.out.println(person.getData());
	}

	private static void PrintDataPersonByName(ActionEnum action) {
		Person p = Hmi.FindPersonByName(action);
		Hmi.PrintDataPerson(p);

	}

	private static Person FindPersonByName(ActionEnum action) {
		Scanner reader = new Scanner(System.in);
		System.out.println("enter your name");
		String name = reader.next();
		Person p;
		if (action == ActionEnum.STUDENT) {
			p = Hmi.schoolServices.getStudentByName(name);

		} else {
			p = Hmi.schoolServices.getTeacherByName(name);

		}
		return p;
	}

	private static void removePerson(ActionEnum action) {
		Person p = Hmi.FindPersonByName(action);
		if (p instanceof Student) {
			Hmi.schoolServices.removeStudent((Student) p);
		} else {
			Hmi.schoolServices.removeTeacher((Teacher) p);
		}

	}

}
