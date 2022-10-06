package com.kpi.question7;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author VrishaliMore
 *
 */
public class SetDemo {
	

	public static void main(String args[]) {
		
		Set<Integer> set=new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		set.add(10);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(11);
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);
		
		
		
		Stream<Integer>stream1=set.stream();// Convert set to Stream
		
		//display elements in sorted order using Stream and forEach 
	    stream1.forEach(num->System.out.println(num));
	
		
	    // To print last element of set using stream and lambda expression
		Integer last= set.stream().reduce((first,second)->second).orElse(null);
			                 
		System.out.println("Last element is = "+last);// display last element
		
		
	}
	
	}
	

