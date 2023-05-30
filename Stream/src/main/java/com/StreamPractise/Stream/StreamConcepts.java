package com.StreamPractise.Stream;

import java.util.HashSet;
import java.util.stream.Stream;
import java.util.Set;

import org.omg.CORBA.PUBLIC_MEMBER;

public class StreamConcepts {

	public static void main(String[] args) {
		// Stream-iterator
//		int sum = Stream.iterate(1, n->n*2).limit(10).reduce(0,Integer::sum);
//		 
//		//stream.forEach(System.out::println);
//		System.out.println(sum);
//		
//		Stream.iterate(1, n->n+1).limit(10).filter(StreamConcepts::isEven).forEach(System.out::println);;
//		
//		 Set<String> names = new HashSet<>(); 
//		    names.add("XML");
//		    names.add("Java");
//
//		    Stream<String> sequentialStream  = names.stream();
//		    sequentialStream.forEach(System.out::println);
//
//		    Stream<String> parallelStream = names.parallelStream();
//		    parallelStream.forEach(System.out::println);
		    
		    
		    String str = "5 123,123,qwe,1,123, 25";
		    str.chars()
		    .filter(n ->  !Character.isDigit((char)n) &&   !Character.isWhitespace((char)n))
		    .forEach(n ->  System.out.print((char)n));
		

	}
	
	public static boolean isEven(int a) {
		if (a%2==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
