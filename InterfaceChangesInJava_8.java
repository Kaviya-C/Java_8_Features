
package com.java8;

public class InterfaceChangesInJava_8 
{
	public static void main(String...args)
	{
		/*
		 * interface can have concrete methods
		 * default and static methods
		 * stream()-- introduced in collection interface
		 * if stream() - abstract we have to implement every subinterface of collection interface
		 * 
		 * 
		 * 
		 * how to solve the diamond problem in interface
		 * 
		 * interface  A{}
		 * interface B extends A{}
		 * class Main implements A,B{}
		 * class Last extends main implements A,B{}
		 * 
		 * ---select classes over interface-----------Main
		 * 
		 * 
		 * interface A{}
		 * interface B extends A{}
		 * class Main implements A,B{}
		 * --select most specific interface than general interface---- B
		 * 
		 * interfaceName.super.method
		 * 
		 */
	}

}
