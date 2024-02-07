package com.studytonight.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// Here, we are converting all the list elements into
// lowercase and iterating using the forEach() method
public class STDemo {
	public static void main(String[] args){
		
		List<String> fruits = new ArrayList<String>();

		fruits.add("APPLE");
		fruits.add("BANANA");
		fruits.add("CHERRY");
		    
		Stream<String> stream = fruits.stream();
		    
		Stream<String> stringStream = stream.map((value) -> value.toLowerCase());
        stringStream.forEach(System.out::println);
	}
}