package com.studytonight.Optional;

//Example: Without Optional Class
public class WithoutOptional {
	String name;	// uninitialized variable
	public static void main(String[] args){
		WithoutOptional m = new WithoutOptional();
		// fetching name in somewhere in the code.
		char ch = m.name.charAt(0);
		System.out.println(ch);  // NullPointerException
	}
}