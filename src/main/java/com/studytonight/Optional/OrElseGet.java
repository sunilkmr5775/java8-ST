package com.studytonight.Optional;

import java.util.Optional;
public class OrElseGet {
	static String otherVal() {
		return "Value not Present";
	}

	public static void main(String[] args){
		Optional<String> name  = Optional.of("Rohan");
		Optional<String> lName = Optional.empty();

		// orElseGet
		String other = name.orElseGet(() -> otherVal());
		System.out.println(other);
		// empty
		other = lName.orElseGet(() -> otherVal());
		System.out.println(other);
	}
}