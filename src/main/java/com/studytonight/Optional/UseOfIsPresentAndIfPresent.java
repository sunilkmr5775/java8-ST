package com.studytonight.Optional;

import java.util.Optional;
public class UseOfIsPresentAndIfPresent {
	String name;	// uninitialized variable
	public static void main(String[] args){
		UseOfIsPresentAndIfPresent m = new UseOfIsPresentAndIfPresent();
		m.name = "Rohan"; // Initializing variable
        Optional<String> name = Optional.ofNullable(m.name); // ofNullable returns an Optional describing the specified value, if non-null, otherwise returns an empty Optional.

//		isPresent()
		if(name.isPresent()) {
        	char ch = m.name.charAt(0);
			System.out.println(ch);  // No NullPointerException
        } else {
        	System.out.println("Value is null");
        }

        // ifPresent()
        name.ifPresent(n -> {
        						System.out.println("Value is present");
        						System.out.println("Value start with "+ m.name.charAt(0));
        					}
        				);
        

	}
}