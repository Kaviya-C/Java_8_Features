package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodExplore {
	public static void main(String... args) {
		/*
		 * Mapping operations map--- function<T ,R>-- R apply(T t)
		 */
		List<String> names = Arrays.asList("he", "him", "his", "her", "she", "they");
		names.stream().map(String::toUpperCase).forEach(System.out::println);
		names.stream().map(String::length).forEach(System.out::println);
		/* map method-- mapToInt mapToLong mapToDouble */

		/* Sorting operations */
		names.stream().sorted().forEach(System.out::println);
		names.stream().sorted((String word1, String word2) -> word2.length() - word1.length())
				.forEach(System.out::println);

		/*
		 * reducing operations terminal operations T reduce(T
		 * identity,BinaryOperator<T>accumulator);
		 */
		int sum = Arrays.stream(new int[] { 12, 2, 4, 1, 2, 1 }).reduce(0, (first, second) -> first + second);
		System.out.println(sum);

		OptionalInt sum1 = Arrays.stream(new int[] { 1, 3, 4, 5, 2 }).reduce((start, next) -> start + next);
		System.out.println(sum1.getAsInt());

		/* min() max() count() collect() */
		OptionalInt min = Arrays.stream(new int[] { 12, 34, 1, 0, 9, 8 }).min();
		System.out.println(min.getAsInt());

		OptionalInt max = Arrays.stream(new int[] { 12, 34, 1, 0, 9, 8 }).max();
		System.out.println(max.getAsInt());

		long count = Arrays.stream(new int[] { 1, 2, 3, 4, 8, 100 }).count();
		System.out.println(count);

		/*
		 * collect special case of reduction operation called mutable reduction
		 * operation it returns mutable result container as list,set
		 */
		List<String> l = names.stream().filter((String word) -> word.length() > 3).collect(Collectors.toList());
		System.out.println(l);

		/* finding and matching operations */
		List<String> lists = Arrays.asList("john", "winston", "roy", "jasmine");

		List<String> result = new ArrayList<>();
		if (lists.stream().anyMatch((String s) -> s.length() > 4)) {
			System.out.println("yes having name above 4 letters");
		}
		if (lists.stream().allMatch((String s) -> s.length() > 5)) {
			System.out.println("All are having 5 letters");
		}
		if (lists.stream().noneMatch((String s) -> s.length() > 6)) {
			System.out.println("No name greater than 7");
		}

		Optional<String> s = Stream.of("john", "Lilly", "joseph").findAny();
		System.out.println(s.get());

		Optional<String> s1 = Stream.of("kaviya", "geetha", "shalini").findAny();
		System.out.println(s1);

		Stream.of(9, 2, 1, 4, 3).limit(3).forEach((num) -> System.out.println(num));

		Object[] stream = names.stream().limit(2).toArray();
		System.out.println(Arrays.toString(stream));

		Object[] array = names.stream().filter(word -> word.length() > 3)
				.peek(letter -> System.out.println("FilteredName: " + letter)).map(String::toUpperCase)
				.peek(el -> System.out.println("Mapped: " + el)).toArray();

	}

}
