package com.java.practice;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.StreamSupport;

public class TestOnStatic <E>{
    private ArrayList<E> list = new ArrayList<>();

    public int getSize(){
        return list.size();

    }
    public E peek(){
        return list.get(getSize()-1);
    }

    public static Scanner scan = new Scanner(System.in);
    public void testGenerics() {
        ArrayList array1 = new ArrayList();
        array1.add(new Date());
        array1.add(new String("Java"));
        Date d2= (Date) array1.get(0);
        ArrayList<Date> dates  = new ArrayList<>();
        dates.add(new Date());
       // dates.add(new String()) compiler error

        Date d=dates.get(0);
        array1.get(0);
        System.out.println(d);
        System.out.println(d2);
        System.out.println(array1.get(1));



    }

    public ArrayList<E> getList() {

        return list;
    }
    public void push(E o){
       // list.add();

    }
}





