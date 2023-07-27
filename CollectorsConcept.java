package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

//collector is an interface

// collectors is an class

//collect() method --terminal operation Stream interface

class Stud {
	int id;
	String name;
	int percentage;
	String subject;

	Stud(int roll, String studName, String sub, int studPer) {
		this.id = roll;
		this.name = studName;
		this.subject = sub;
		this.percentage = studPer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Stud [id= " + id + ", name= " + name + ", percentage= " + percentage + ", subject= " + subject + "]";
	}
}

public class CollectorsConcept {
	public static void main(String... args) {
		List<Stud> list = Arrays.asList(new Stud(100, "Sharmi", "Maths", 89), new Stud(108, "Rajeev", "Hindi", 90),
				new Stud(103, "geetha", "Gk", 93), new Stud(101, "heena", "English", 91),
				new Stud(102, "hemma", "Maths", 100));

		List<Stud> greater93 = list.stream().filter((Stud s) -> s.getPercentage() > 91).collect(Collectors.toList());

		for (Stud s : greater93) {
			System.out.println(s);
		}
		Set<String> set = list.stream().map(Stud::getSubject).collect(Collectors.toSet());
		for (String a : set) {
			System.out.println(a);
		}

		Map<String, Integer> map = list.stream().collect(Collectors.toMap(Stud::getName, Stud::getPercentage));

		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "   " + entry.getValue());
		}

		LinkedList<Stud> l = list.stream().limit(4).collect(Collectors.toCollection(LinkedList::new));
		System.out.println(l);

		String names = list.stream().map((Stud s) -> s.getName()).collect(Collectors.joining());
		System.out.println(names);

		Long count = list.stream().collect(Collectors.counting());
		System.out.println(count);

		Optional<Integer> highPercent = list.stream().map(Stud::getPercentage)
				.collect(Collectors.maxBy(Comparator.naturalOrder()));
		System.out.println(highPercent.get());

		Optional<Integer> lowPercent = list.stream().map(Stud::getPercentage)
				.collect(Collectors.minBy(Comparator.naturalOrder()));
		System.out.println(lowPercent.get());

		Integer summingInt = list.stream().collect(Collectors.summingInt((Stud s) -> s.getPercentage()));
		System.out.println(summingInt);

		Double average = list.stream().collect(Collectors.averagingInt((Stud s) -> s.getPercentage()));
		System.out.println(average);
		System.out.println("----------------");

		DoubleSummaryStatistics s = list.stream().collect(Collectors.summarizingDouble(Stud::getPercentage));
		System.out.println(s.getMax());
		System.out.println(s.getMin());
		System.out.println(s.getCount());
		System.out.println(s.getAverage());
		
		System.out.println();
		
		Collectors.groupingBy(Student::getSubject);
		Collectors.groupingBy(Stud::getName);
		//Collectors.groupingBy(Stud::getMark);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
