package com.java.practice;
// in the following class apply the comparable interface
// and we will apply the methods ogf the comparable interface

public class Person implements Comparable<Person>{
    int age;
    String name;
    public Person(String name,int age){
        this.age=age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age='" + age + '\'' +
                '}';
    }


    @Override
    public int compareTo(Person other) {
        if(this.getAge()<other.getAge()){
            return -1;
        } else if(this.getAge()>other.getAge()){
            return 1;
        } else

        return 0;
        // we can use the above method or the method below method to compare the age.
                //Integer.compare(this.getAge(), other.getAge());//comparing with age
        // alternatively we can write as return Integer.compare(age,other.getAge())
    }
}
