package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Car implements Comparable<Car>{
    private String name;
    private int id;

    public Car(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Car o) {
        if(this.getId()==o.getId()){
            return 0;
        }else if (this.getId()<o.getId()){
            return -1;
        }else

        return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
    public static void main(String[] args) {


        Car c1 = new Car("BMW", 10);
        Car c2 = new Car("Merchedes", 33);
        Car c3 = new Car("Volvo", 5);
        Car c4 = new Car("Fiat", 8);
        Car c5 = new Car("Tesla", 100);
            ArrayList<Car> arr = new ArrayList<>();
            arr.add(c1);
            arr.add(c2);
            arr.add(c3);
            arr.add(c4);
            arr.add(c5);

            Collections.sort(arr);
            for (Car c : arr) {
                System.out.println(c.id);
            }
            System.out.println("Before");
            System.out.println(add(20,4));
            System.out.println("After");

        }
        public static <T extends Number> double add(T num1,T num2){
        double result = num1.doubleValue()+num2.doubleValue();
        return result;
        }



}
