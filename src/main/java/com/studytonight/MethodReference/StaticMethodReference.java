package com.studytonight.MethodReference;

interface JavaInterface {
	void showInterfaceInfo();
}

public class StaticMethodReference {
	static void show() {
		System.out.println("This is called using method reference");
	}
	public static void main(String[] args) {
		// Referring Method
		JavaInterface ji = StaticMethodReference::show;
		ji.showInterfaceInfo();
	}
}