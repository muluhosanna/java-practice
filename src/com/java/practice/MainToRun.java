package com.java.practice;

import java.util.ArrayList;

public class MainToRun {
    public static void main(String[] args) {
       // testExample();
      // examplesOnStatic();
       // examplesOnGenerics();
        testOnGeneric();
        //testOnStudent();


    }
    public static void testOnStudent(){
        Student s1=new Student("Bob",3.5,12);
        Student s2= new Student("Jon",3.5,9);
        int result = s1.compareTo(s2);
        if (result<0){
            System.out.println(s1.getName() +"comes before" + s2.getName());
        }else if(result>0){
            System.out.println(s1.getName() + " comes after "+ s2.getName());
        }else{
            System.out.println(s1.getName() + "is equal to" + s2.getName());
        }
    }

    public static void  testOnGeneric(){
        GenericMethod method = new GenericMethod();
        method.show(46);
        System.out.println(method.showInfo("welcome to java"));
        method.showItems("Aman",3);
        Integer[]arr = {2,4,5,6,10,56};
        String[] str ={"How","mulu","water","red"};
        method.prinItem(str);
        method.prinItem(arr);
        String strings = "Hello world";
        method.resultItem(strings);
        System.out.println("Aftter");
        method.takeOver(arr);
        String[]s1={"white","black","where","peace"};
        //method.takeOver(s1);
        System.out.println(GenericMethod.calculate("hello","java"));
       System.out.println( GenericMethod.calculate(23,45));
        System.out.println("before");
       System.out.println( GenericMethod.calculate(new Person("Adem",23),new Person("kasim",32)));
        System.out.println("After");
        // System.out.println(GenericMethod.sampleCompre(new Person("Adem",23),new Person("kasim",32)));
         System.out.println(GenericMethod.add(2.0,10));
        System.out.println(GenericMethod.add(100,56));

    }
    public static void examplesOnGenerics(){
        AboutGenerics<String,Integer>gerner = new AboutGenerics<>("hello",23);
        AboutGenerics<Double,Float> dad  = new AboutGenerics<>(46.9,4.0f);
        dad.setItem(65.9);
        dad.setDar(3.0F);
        AboutGenerics.result(69.5,3.0F);
        AboutGenerics.result("java","hello");
        System.out.println(gerner);
        gerner.setItem("java");
        gerner.getKey();
        System.out.println(gerner.getKey());
    }
    public static void  examplesOnStatic(){
        TestOnStatic stat = new TestOnStatic();
       // stat.testGenerics();
      // System.out.println( stat.getList());


    }
    public static void testExample(){
        FirstPractice first = new FirstPractice();
        //first.testSimple();
        //first.arrays();
       // first.linkedTest();
        //first.treSet();
        //first.mapTest();
       // first.treeMap();
       // first.testOnStrings();
        //first.testAll();
       // first.launchCode();
        //first.testString();
       // System.out.println();
      // System.out.println(first.testString());
      //first.testMain();
      // first.anotherTest();
        //first.keyboardTest();
        first.howStack();



    }
}
