package com.studytonight.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterListElements {
	public static void main(String[] args){
		
		List<Integer> numbers = new ArrayList<Integer>();  
        numbers.add(100);
        numbers.add(110);
        numbers.add(120);
        numbers.add(150);
        
        List<Integer> newlist = numbers.stream()
                                      .filter(n->n>110)
                                      .collect(Collectors.toList());
        System.out.println(newlist);  
	}
}