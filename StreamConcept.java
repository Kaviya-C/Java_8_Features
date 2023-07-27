package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Students {

}
public class StreamConcept {
	public static void main(String... args) {
		// creates an empty stream
		Stream<Student> empty = Stream.empty();
		System.out.println(empty.count());

		// stream Of single element
		Stream<Students> single = Stream.of(new Students());
		System.out.println(single.count());

		// create stream from values
		Stream<Integer> many = Stream.of(1, 3, 4, 5, 1);
		System.out.println(many.count());

		// Creating stream() from collections
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Spring");
		list.add("JDBC");
		// list.stream().forEach((String s)->System.out.println(s));

		/*
		 * SELECTION OPERATIONS filter--Intermediate operations
		 */
		List<String> list1 = new ArrayList<>();
		list1.add("Java");
		list1.add("JavaSpring");
		list1.add("JDBC");
		list1.add("JavaSQL");
		list1.add("HTML");
		/*
		 * list1.stream().filter((String
		 * s)->s.startsWith("Ja")).forEach(System.out::println);
		 */
		System.out.println(list1);
		list1.stream().filter((String word) -> word.length() > 5).forEach(System.out::println);

		/*
		 * Select only unique elements distinct()---intermediate operations
		 */
		List<String> list2 = Arrays.asList("pink", "pink", "black", "green");
		System.out.println(list2);
		list2.stream().distinct().forEach(System.out::println);

		// select first n elements
		list2.stream().limit(2).forEach(System.out::println);
		;

		list2.stream().skip(3).forEach(System.out::println);

		/*
		 * Stream sequence of elements from source which support operation on data y
		 * stream? filtering mapping matching finding -- collections api java8 stream
		 * api
		 * 
		 * characteristics Stream not a data structure traverse only once intermediate
		 * and terminal operation pipeline of operations lazily populated stream consume
		 * data source internally iteration happen in stream parallel execution
		 * parallelStream() short circuit --findFirst findAny limit
		 * java.util.stream.Stream
		 * 
		 * INTERMEDIATE OPERATIONS:
		 * 
		 * filter--- predicate--boolean test(T t) map----Function<T,R> ---R apply(T t)
		 * distinct-- stream<T> distinct() sorted --- Stream<T> sorted() limit---
		 * Stream<T> limit(long maxSize) skip---Stream<T> skip(long n)
		 * 
		 * TERMINAL OPERATIONS
		 * 
		 * forEach---Consumer<T t>--void accept(T t) toArray---Object[] to Array()
		 * reduce-- T reduce(T identity,BinaryOperator<T>) collect-- R
		 * collect(Collector<T>) min--optional<T>min(Comparator<T>) max- " same max()
		 * count -- long count() anyMatch()--- predicate -- boolean test noneMatch() --
		 * predicate allMatch() --- predicate findFirst() optiona<T> findAny()
		 * optional<T>
		 *
		 * 
		 */
	}

}
