package com.java8;

public class IntroductionJava_8
{
	public static void main(String...args)
	{
		/*
		 * Java 8 lambda expression can be defined as without name
		 * like anonymous function
		 * same as  methods -->lambda expression can have --> parameter,body
		 * return ,list of exceptions
		 * unlike methods they can have neither method name
		 * not associated with any class
		 * 
		 * syntax
		 * 			(parameter)->{expression}
		 * 
		 * where to use
		 * 			instantiation of functional interface
		 * 			before java8 anonymous inner class used to implement functional interface
		 * 		    after java8 lambda expression are used to implement functional interface
		 * 
		 * how to use
		 * 
		 * ANONYMOUS INNER CLASS
		 * 
		 * Comparator<Student> comp=new Comparator<>()
		 * {
		 *    public int compare(Student s1,Student s2)
		 *    {
		 *       return s1.percentage-s2.percentage;
		 *    }
		 * }
			
	     *LAMBDA EXPRESSION
	     *
		 * Comparator<Student> com=(Student s1,Student s2)-> s1.percentage-s2.percentage;
		 * 
		 * 
		 * avoid repetetion and verbosity
		 * clear concise code
		 * 
		 * typechecking compiler
		 * 
		 * list of exception return keyword need not to mention explicitly in lambda expression
		 */
	}

}
