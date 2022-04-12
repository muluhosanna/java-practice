package com.java.practice;

public class GenericMethod {
    public <T>void show(T itme){
        System.out.println(itme.toString());
    }
    public <T>T showInfo(T item){
       // System.out.println(itm.toString());
        return  item;

    }
    public <T,V>void showItems(T t,V v){
        System.out.println(t.toString());
        System.out.println(v.toString());
    }
    public <T> void prinItem(T[] items){
        for (T item:items){
            System.out.println(item.toString());

        }
    }
    public <T>T resultItem(T list){
        System.out.println(list.toString());
        return list;


    }
    public <T>T[] takeOver(T[] foo){
        for (T t: foo){
            System.out.println(t);
        }
        return foo;
    }
    public static <T extends Comparable<T>> T calculate(T num1,T num2){
        if (num1.compareTo(num2)<0)
            return num1;
        return num2;


    }
    public static <T extends Comparable<T>>T sampleCompre(T num1,T num2){
        if (num1.compareTo(num2)>0)
        {return num1;}

        else if (num1.compareTo(num2)<0){
            return num2;

        }
        return null;

    }
    public static <T extends Number> double add(T num1,T num2){
        Double result = num1.doubleValue()+num2.doubleValue();
        return result;

    }


}
