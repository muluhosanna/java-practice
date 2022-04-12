package com.java.practice;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void drawAll1(List<Shape> shapes){
        for (Shape shape:shapes){
            shape.draw();
        }

    }
    public static <T extends Shape> void drawAll(List<T>shapes){
        for(T shape:shapes){
            shape.draw();
        }
    }
    public static void main(String[] args){
        List<Square>squares = new ArrayList<>();
        squares.add(new Square());
        drawAll(squares);
      //  drawAll(squares); we will have a compile type error
        //because the shape is the supper type for squares but List<Shape> is not t
        // the super type of the List<Square>
        // to fix this will use the following
        // go to the drawAll method and change to bounded type parameters
        //we can create arraylists as follows
        List<? extends Number>list1 = new ArrayList<Integer>();
        List<? extends Number>list2 = new ArrayList<Double>();
        List<? extends Number>list3 = new ArrayList<Float>();
        // we use upper bounded wildcards to read items
        List<Integer>nums = new ArrayList<>();
        showAll(Arrays.asList(2,3,4,5));
        List<? super Integer>list4 = new ArrayList<Integer>();
        List<? super Integer>list5 = new ArrayList<Number>();
        List<? super Integer>list6 = new ArrayList<Object>();
        // we can not read from lower bound generics
        //like this List<? super T>list but we can insert or add items into
        // a List<? super T>
        // look the following
        List<Serializable>list = new ArrayList<>();
        list.add("mulu");
        list.add("lakew");
        list.add("anna");
        showAll2(list);
        Integer j=34;
        ran(j);
        sumAll(Arrays.asList(5,6,7,10));
        List<?super Number>num = new ArrayList<>();
        num.add(3);
        num.add(3.3);
        num.add(3.5f);
        System.out.println(num);
        List<String> list11= Arrays.asList("Adam","Ana","Kevin");
        List<String >lists2 = new ArrayList<>();
        copy(list11,lists2);
        System.out.println(lists2);
        List<Integer>list7 = Arrays.asList(2,3,5,6);
        List<Integer>list8 = new ArrayList<>();
        copy(list7,list8);
        System.out.println(list8);
        meseret(list11);
        foundation(list11);
        List<? super BigInteger>latest = new ArrayList<BigInteger>();
        List<? super BigInteger>latest1= new ArrayList<Object>();
        List<? super Number>number1 = new ArrayList<Number>();
        number1.add(23);
        number1.add(34);
        number1.add(45);
        meseret(number1);


    }
    public static void showAll2(List<? super Number>list){
       // for (Number num:list){// we hava to change the Number to an Object to fix the problem
        for (Object num:list){
            System.out.println(num);
        }
    }
    public static void showAll(List<? extends Number>list){
        for (Number n:list){
            System.out.println(n);
        }
    }
    public static void ran(Object c){
            System.out.println(c.toString());

    }
    public static double sumAll(List<? extends Number>list){
        double sum=0;
        for (Number n:list){
            sum += n.doubleValue();
        }
        return sum;

    }
    //how to read and write items in lower bound wildcards

    public static <T> void copy(List<?extends T>source,List<? super T>destination){

        for (int i=0; i<source.size();i++){
            destination.add(source.get(i));// inserting an items in lower bound wild cards

        }
    }
    // the following example shows how to read itms from uper bound wild cards
    public static <T> void meseret(List<?extends T >last1){
        for (int i=0;i<last1.size();i++){
            System.out.println(last1.get(i));
        }

    }
    public static <T> void foundation(List<? super T>last2){
        System.out.println(last2.size());


    }
    //type features
    public static void comparing(){
        // the following code snipets are equivalent
        List<Integer>listTest = new ArrayList<>();
        listTest.add(3);
        Integer num=listTest.get(0);
// in the following example there  may be objects and type casting in the byte code
        List listTest2 = new ArrayList();
        listTest2.add(3);
        Integer num2 = (Integer) listTest2.get(0);

    }

}
