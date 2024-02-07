package com.studytonight.MethodReference;

interface JavaInterface1{
	int findMax(int a, int b);
}

public class ReferringLibraryStaticMethod {

	public static void main(String[] args) {
		// Referring Method
		JavaInterface1 ji = Math::max;
		int result = ji.findMax(10, 20);
		System.out.println(result);

	}
}