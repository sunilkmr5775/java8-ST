package com.studytonight.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MinAndMax {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(100);
        numbers.add(110);
        numbers.add(120);
        numbers.add(150);

        System.out.println("Original Integer List - " + numbers);

        Stream<Integer> stream = numbers.stream();
        int max_val = stream.max((x, y) -> x > y ? 1 : -1).get();
        System.out.println("Max Value : " + max_val);
        int min_val = numbers.stream().min((x, y) -> x < y ? -1 : 1).get();
        System.out.println("Min Value : " + min_val);

        // random numbers
        List<Integer> numberList = Arrays.asList(5, 9, 11, 2, 8, 21, 1);


        // print to console
        System.out.println("====================Using other methods=================================" +
                "\n\nOriginal Integer List - " + numberList);


        // 1. find Maximum and Minimum number in List using max/min(Integer::compare).get()
        int max1 = numberList.stream().max(Integer::compare).get();
        System.out.println("\nLargest number using max(Integer::compare).get() is = " + max1);
        int min1 = numberList.stream().min(Integer::compare).get();
        System.out.println("Minimum number using min(Integer::compare).get() is = " + min1);


        // 2. find Maximum and Minimum number in List using max/min(Integer::compareTo).get()
        int max2 = numberList.stream().max(Integer::compareTo).get();
        System.out.println("\nLargest number using max(Integer::compareTo).get() is = " + max2);
        int min2 = numberList.stream().min(Integer::compareTo).get();
        System.out.println("Minimum number using min(Integer::compareTo).get() is = " + min2);


        // 3. find Maximum and Minimum number in List using max/min(Comparator.naturalOrder()).get()
        int max3 = numberList.stream().max(Comparator.naturalOrder()).get();
        System.out.println("\nLargest number using max(Comparator.naturalOrder()).get() is = " + max3);
        int min3 = numberList.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Minimum number using min(Comparator.naturalOrder()).get() is = " + min3);


        // 4. find Maximum and Minimum number in List using max/min(Comparator.comparing(Integer::valueOf)).get()
        int max4 = numberList.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("\nLargest number using max(Comparator.comparing(Integer::valueOf)).get() is = " + max4);
        int min4 = numberList.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Minimum number using min(Comparator.comparing(Integer::valueOf)).get() is = " + min4);


        // 5. find Maximum and Minimum number in List using mapToInt(Integer::intValue).max().getAsInt()
        int max5 = numberList.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println("\nLargest number using mapToInt(Integer::intValue).max().getAsInt() is = " + max5);
        int min5 = numberList.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println("Minimum number using mapToInt(Integer::intValue).min().getAsInt() is = " + min5);

    }
}