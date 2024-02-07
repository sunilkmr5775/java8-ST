package com.studytonight.Optional;

import java.util.Optional;
public class IfElse {
	public static void main(String[] args){
		Optional<String> name = Optional.of("Rohan");
		Optional<String> lName = Optional.empty();

		// orElse
		String other = name.orElse("Sohan");
		System.out.println(other);
		// empty
		other = lName.orElse("Sohan");
		System.out.println(other);
	}
}