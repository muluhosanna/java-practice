package com.java.practice;

import java.util.ArrayList;
import java.util.List;

public class Bucket<T> {
    private T item;
    public void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return this.item;
    }
    public static void main(String[]args){

        List<Bucket<String>>list = new ArrayList<>();//type inference
      addStore("Adem",list);
      addStore("mulu",list);
      // how come this will happen in reality
        // what does it mean?


    }
    public static <T>void addStore(T t, List<Bucket<T>>list){
        Bucket<T>bucket = new Bucket<>();
        Bucket<T>bucket1 = new Bucket<>();
        bucket1.setItem(t);
        bucket.setItem(t);
        list.add(bucket);
        list.add(bucket1);
        System.out.println(t.toString()+"has been added to the list");

    }
}
