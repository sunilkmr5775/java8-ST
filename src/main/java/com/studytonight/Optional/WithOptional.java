package com.studytonight.Optional;

import java.util.Optional;

public class WithOptional {
	String name;	// uninitialized variable
	public static void main(String[] args){
		WithOptional m = new WithOptional();
		// fetching name in somewhere in the code.
		// Handling null using Optional class
        Optional<String> isNull = Optional.ofNullable(m.name);  
        if(isNull.isPresent()) {
        	char ch = m.name.charAt(0);
    		System.out.println(ch);  // No NullPointerException
        }else {
        	System.out.println("Value is null");
        }
	}
}