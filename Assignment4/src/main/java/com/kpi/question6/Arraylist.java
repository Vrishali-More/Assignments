package com.kpi.question6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author VishaliMore
 *
 */
public class Arraylist {
	
	public static void main(String args[]) {
	
	List<String>list1=Arrays.asList("Papers","Books","Pens","Pencil","Chock","BlackBoards");
    
	List<String>list2=Arrays.asList("NoteBooks","Books","School","Teachers","Collage");
	
	List<String>list3=Arrays.asList("Student","Books","University","WritingBoards","Laptop","Mobile","Watch");
	
	List<String>list4=Arrays.asList("schoolteacher","Books","Principal","Headmaster","Monitor");
	
	List<String>list5=Arrays.asList("Exam","Books","Blackpen","Bluepen","Hallticket","Timetable");
	
	
	// Searching for common element in every ArrayList
	
	// Displaying list
	
	System.out.println("List1:"+list1);// Display list1
	System.out.println("List2:"+list2);// Display list2
	System.out.println("List3:"+list3);// Display list1
	System.out.println("List4:"+list4);// Display list1
	System.out.println("List5:"+list5);// Display list1
	
	// Using Stream find common element

	// for list1 and list2 common elements
	List<String>Listcommon1=new ArrayList<String>();// create a new collection to stored common element
	
	Listcommon1=list1.stream().filter(list2::contains).collect(Collectors.toList());
	System.out.println("\n Common elements in arraylist1 and arraylist2:"+Listcommon1);
	
	//for list3 and list4
	
	List<String>Listcommon2=list3.stream().filter(list4::contains).collect(Collectors.toList());
	System.out.println("Common Elements in arraylist3 and arraylist4:"+Listcommon2);
	
	//for list5 and Listcommon1 and create new listcommon3
	List<String>Listcommon3=Listcommon1.stream().filter(list5::contains).collect(Collectors.toList());
	System.out.println("Common elements in Listcommon1 and arraylist5:"+Listcommon3);
	
	// for all list common elements
	
	List<String>Listcommon=Listcommon3.stream().filter(Listcommon2::contains).collect(Collectors.toList());
	System.out.println("\n Commons on all List:"+Listcommon);
	
	
	// to find position of common element
	String Books= list1.get(1);
	int position = list2.indexOf(Books);
	System.out.println("\n Position of duplicate element:"+position);

	
}
}
