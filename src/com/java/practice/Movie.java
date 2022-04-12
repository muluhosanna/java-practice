package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// under this section we will see inference

public class Movie {
    static <T> List<T> add(List<T> list, T item1, T item2) {
        list.add(item1);
        list.add(item2);
        return list;
    }

    public static void main(String[] args) {
        List<Person> list11 = add(new ArrayList<>(), new Person("wale", 20), new Person("eshetu", 32));
        System.out.println(add(new ArrayList<Double>(), 20.0, 31.5));
        List<Integer> list1 = add(new ArrayList<>(), 30, 20);
        System.out.println(list1);
        List<String> list2 = add(new ArrayList<>(), "java", "python");
        System.out.println(list2);
        List<Character> list3 = add(new ArrayList<>(), 'A', 'C');
        System.out.println(list3);
        List<? extends Number> l1 = new ArrayList<Integer>();
        List<? extends Number> l2 = new ArrayList<Double>();
        List<? extends Number> l3 = new ArrayList<Float>();
        showAll(Arrays.asList(1, 2, 3));
        System.out.println(sumAll(Arrays.asList(1, 2, 3)));
        System.out.println(list11);


    }

    public static void showAll(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

    public static double sumAll(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

}
