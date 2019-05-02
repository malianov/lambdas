/**
 * Copyright © 2016, Oracle and/or its affiliates. All rights reserved.
 *
 * JDK 8 MOOC Lesson 1 homework
 */
package net.igorok.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Lesson1 {

    public void runExercises() {
        System.out.println("JDK 8 Lambdas and Streams MOOC Lesson 1");
        System.out.println("--------------------------------\nRunning exercise 1 solution...");
        exercise1();
        System.out.println("--------------------------------\nRunning exercise 2 solution...");
        exercise2();
        System.out.println("--------------------------------\nRunning exercise 3 solution...");
        exercise3();
        System.out.println("--------------------------------\nRunning exercise 4 solution...");
        exercise4();
        System.out.println("--------------------------------\nRunning exercise 5 solution...");
        exercise5();
    }

    /**
     * Exercise 1
     *
     * Create a string that consists of the first letter of each word in the list
     * of Strings provided.
     */
    private void exercise1() {
        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

        StringBuilder sb = new StringBuilder();
        list.forEach(name -> sb.append(name.charAt(0)));
        System.out.println(sb);
    }

    /**
     * Exercise 2
     *
     * Remove the words that have odd lengths from the list.
     */
    private void exercise2() {
        List<String> list = new ArrayList<>(Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        //list.removeIf(string -> string.length() % 2 != 1);
        list.removeIf(string -> (string.length() & 1) != 1);
        System.out.println(list);
    }

    /**
     * Exercise 3
     *
     * Replace every word in the list with its upper case equivalent.
     */
    private void exercise3() {
        List<String> list = new ArrayList<>(Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        list.replaceAll(string -> string.toUpperCase());
        System.out.println(list);
    }

    /**
     * Exercise 4
     *
     * Convert every key-value pair of the map into a string and append them all
     * into a single string, in iteration order.
     */
    private void exercise4() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("c", 3);
        map.put("b", 2);
        map.put("a", 1);

        StringBuilder sb = new StringBuilder();
        map.forEach((k, v) -> sb.append(k + " - " + v + "\n"));
        System.out.print(sb.toString());
    }

    /**
     * Exercise 5
     *
     * Create a new thread that prints the numbers from the list.
     */
    private void exercise5() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Runnable task = () -> list.forEach(System.out::print);
        new Thread(task).start();
    }

    public static void main(String[] args) {
        Lesson1 lesson = new Lesson1();
        lesson.runExercises();
    }
}
