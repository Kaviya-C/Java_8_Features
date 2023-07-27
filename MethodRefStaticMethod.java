package com.java8;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodRefStaticMethod
{
	public static void main(String...args)
	{
		Function<String,Integer> f=(String no)->Integer.parseInt(no);
		System.out.println(f.apply("90"));
	
		Function<String,Integer> f1=Integer::parseInt;
		System.out.println(f1.apply("654"));
	
		
		Function<String,String> f2=(String s)->s.toLowerCase();
		System.out.println(f2);
		
		String message="hello";
		
		Consumer<String> print=String::toLowerCase;
		print.accept("helelo");
		Function<String,String> f3=String::toLowerCase;
	}

}
