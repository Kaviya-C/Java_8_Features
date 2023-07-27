package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Student {
	int rollNo;
	String name;
	int mark;
	String subject;

	Student(int roll, String studName, int studMark, String studSubj) {
		this.rollNo = roll;
		this.name = studName;
		this.mark = studMark;
		this.subject = studSubj;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [rollNo= " + rollNo + ", name= " + name + ", mark= " + mark + ", subject= " + subject + "]";
	}

}

public class ImplementationFunctionalInterface {
	public static void main(String... args) {
		ArrayList<Student> array = new ArrayList<>();
		array.add(new Student(10, "Meena", 87, "Mathematics"));
		array.add(new Student(40, "Raghu", 60, "History"));
		array.add(new Student(50, "farina", 87, "Mathematics"));
		array.add(new Student(60, "jagan", 80, "English"));
		array.add(new Student(20, "oviya", 66, "Computer"));
		array.add(new Student(30, "winston", 75, "Tamil"));
		array.add(new Student(80, "uma", 57, "Science"));
		array.add(new Student(70, "sohail", 67, "Mathematics"));
		array.add(new Student(100, "prem", 97, "History"));

		Predicate<Student> history = (Student s) -> s.getSubject().equals("History");

		List<Student> his = new ArrayList<>();
		for (Student result : array) {
			if (history.test(result)) {
				his.add(result);
			}
		}
		for (Student each : his) {
			System.out.println(each);
		}

		Consumer<Student> studMarks = (Student s) -> System.out.println(s.getName() + "--" + s.getMark());

		List<Student> l = new ArrayList<>();
		for (Student s : array) {
			studMarks.accept(s);
		}
		for (Student r1 : l) {
			System.out.println(r1);
		}

		// Function<Student,String> demo=Student::getName;
		Function<Student, String> function = (Student s) -> s.getName();
		List<String> stud = new ArrayList<>();

		for (Student s : array) {
			stud.add(function.apply(s));
		}
		for (String s : stud) {
			System.out.println(s);
		}

		Supplier<Student> st = () -> new Student(100, "Saras", 78, "English");
		array.add(st.get());

		System.out.println(array);

	}

}
