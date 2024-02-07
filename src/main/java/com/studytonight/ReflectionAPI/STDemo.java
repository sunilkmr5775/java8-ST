package com.studytonight.ReflectionAPI;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class STDemo {
	public static void main(String[] args){
		
	  Class<? extends Calculate> cal = new Calculate().getClass();
	  // Get methods
	  Method[] allMethods = cal.getDeclaredMethods();

		// Get Method and Parameters info using enhanced for loop
		System.out.println("==========Using enhanced for loop=========");
		getDataUsingEnhancedForLoop(allMethods);

		// Get Method and Parameters info using enhanced for streams
		System.out.println("==========Using stream=========");
		getDataUsingStreams(allMethods);



	}

	public static void	getDataUsingEnhancedForLoop(Method[] allMethods){
		for(Method method : allMethods) {
			System.out.println("Method Name: "+ method.getName());
			Parameter[] parameters = method.getParameters();
			System.out.println("Parameters: ");
			for(Parameter parameter : parameters)
				System.out.println(parameter);
		}
	}
	public static void getDataUsingStreams(Method[] methods){
			List<Method> methodList = Arrays.asList(methods);
			List<String> methodNames = methodList.stream().map(Method::getName).collect(Collectors.toList());
			System.out.println("Method Names: "+ methodNames);

//		List<String> methodList = Arrays.stream(methods).map(m->"Method Names: "+m.getName()).collect(Collectors.toList());
//		methodList.stream().forEach(System.out::println);
		List<Parameter[]> list = methodList.stream().map(a->a.getParameters()).collect(Collectors.toList());
		for (Parameter[] param: list){
			Arrays.stream(param).map(a->a.getType()+" "+a.getName()).forEach(System.out::println);
		}
		}











}