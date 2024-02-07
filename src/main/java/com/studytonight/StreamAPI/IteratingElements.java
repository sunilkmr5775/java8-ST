package com.studytonight.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IteratingElements {

	public static void main(String[] args){
		
		List<Integer> numbers = new ArrayList<Integer>();  

        numbers.add(100);
        numbers.add(110);
        numbers.add(120);
        numbers.add(150);

        Stream<Integer> stream = numbers.stream();
        stream.forEach(System.out::println); 
	}
}