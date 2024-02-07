package com.studytonight.Optional;

import java.util.Optional;
public class FilterMethod {
	public static void main(String[] args){
		Optional<String> name  = Optional.of("Rohan");
		Optional<String> lName = Optional.empty();

		// filter
		Optional <String> other  = name.filter(n->n.equals("Rohan"));
		System.out.println(other);
		other  = name.filter(n->n.equals("rohan"));
		System.out.println(other);
	}
}