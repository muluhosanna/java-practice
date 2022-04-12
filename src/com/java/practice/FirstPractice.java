package com.java.practice;

import javax.swing.*;
import java.awt.*;
import java.security.KeyStore;
import java.util.*;

public class FirstPractice {


    public void testSimple() {
        StringBuffer st1 = new StringBuffer("hello world");
        StringBuffer str2 = new StringBuffer("hello world");
        System.out.println(st1 == str2);
        System.out.println(st1.equals(str2));
        byte b = 10;
        byte b2 = 20;
        int b3 = b + b2;
        System.out.println(b3);
    }

    public void arrays() {
        ArrayList<Integer> myArray = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            myArray.add(i);

        }
        System.out.println(myArray);

        for (int i = 0; i < myArray.size(); i++) {
            System.out.println(myArray.get(i));
        }
        System.out.println(myArray.remove(3));
        System.out.println(myArray);

        for (Integer n : myArray) {
            System.out.println(n);
        }

    }

    public void linkedTest() {
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.addFirst("D");
        list2.addLast("F");
        System.out.println(list2);
        for (String b : list2) {
            System.out.println(b);
        }
        Object[] t = list2.toArray();

        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
    }

    public void treSet() {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(10);
        tree.add(20);
        tree.add(2);
        tree.add(1);
        for (Integer r : tree) {
            System.out.println(r);// what ever we write the order tree set keeps th natural order
            // so the output will be 1,2,10,20
            // no duplicated element is allowed
        }
    }

    public void mapTest() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        System.out.println(map);//key are unique are set as set and value are as list

        if (map.containsKey("a")) {
            Integer a = map.get("a");
            System.out.println(a);
        }
        for (String key : map.keySet()) {
            System.out.println(key + " " + ",value=" + map.get(key));
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }

    public void treeMap() {
        TreeMap<Integer, String> tree2 = new TreeMap<>();
        tree2.put(3, "adddis");
        tree2.put(2, "kaleb");
        tree2.put(8, "D");
        System.out.println(tree2);

    }

    public void testOnStrings() {
        //index of indicates that the first occurrence of the string and the char
        //but the last indexOf indicates last occurrence of either the String ot the char.
        String s = "Hello java";
        System.out.println(s.lastIndexOf("e"));
        System.out.println(s.lastIndexOf("ja"));
        System.out.println(s.lastIndexOf("j", 8));
        String s2 = "Welcome to Java";
        System.out.println(s2.indexOf('W'));
        System.out.println(s2.indexOf("come"));
        System.out.println(s2.indexOf("Java", 5));//11
        System.out.println(s2.lastIndexOf("to", 1));//-1
        System.out.println(s2.lastIndexOf("to", 8));//8
        String str1 = "welcome to the new era of technology";
        String str2 = "welcome to the new era of technology";
        String str3 = "Welcome To The New Era Of Technology";
        System.out.println(str1 == str2);//true because str1 saves the first object and str2 saves the
        // object of the second object
        //the content is the same

        System.out.println(str1.equals(str2));//true
        StringBuffer buffer = new StringBuffer("welcome to the new era of technology");// buffer save s the address of the object
        StringBuffer buffer1 = new StringBuffer("welcome to the new era of technology");// buffer1 saves the address of the second  object
        System.out.println(buffer == buffer1);//false
        System.out.println(buffer.equals(buffer1));// false
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareToIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.contains("welcome"));
        int k = str3.indexOf(' ');
        String str4 = str3.substring(0, k);
        String str5 = str3.substring(k + 1);
        System.out.println(str5);
        System.out.println(str4);
        String str6 = "123";
        int t = Integer.parseInt(str6);
        System.out.println(t);
        byte b = Byte.parseByte(str6);
        System.out.println(b);

    }

    public void testAll() {
        String s1 = "Welcome to java";
        String s2 = "Programing is fun";
        String s3 = "Welcome to java";
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1 == s3);
        System.out.println(s1.toUpperCase());
        System.out.println(s1 == s2);
        System.out.println("\t Wel \t".trim());

    }

    public void launchCode() {
        String s2 = "";
        String strimport = "Launch code";
        for (int i = 0; i < strimport.length(); i++) {

            if (i == 1 || i == 2 || i == 6 || i == 8 || i == 10) {
                System.out.println(strimport);
            } else {
                System.out.println(strimport.charAt(i));
            }
        }
        //remove all the vowels from the string
        //remove all the space
        //print what is left
    }


    public String testString() {
        String s = "welcometojava";
        String min = s.substring(0, 3);
        String max = s.substring(0, 3);

        for (int i = 0; i < s.length() - 3; i++) {
            //s.substring(i,3+i);
            if (s.substring(i, i + 3).compareTo(max) > 0) {
                max = s.substring(i, i + 3);
            } else if (s.substring(i, i + 3).compareTo(min) < 0) {
                min = s.substring(i, i + 3);

            }

        }
        return min + "\n" + max;


    }

    public void testMain() {
        String s = "madam";
        String answer="yes";
        for (int i=0;i<s.length()/2;i++){
            if (s.charAt(i)==s.charAt(s.length()-i-1)){
                continue;
            }else{
                answer="no";
                break;
            }

        }
        System.out.println(answer);
        System.out.println(4+56+30+12);
        System.out.println("yes"+78+23);






    }
    public void anotherTest(){
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        for(int i=1;i<=t;i++){
            try{
                long x= scan.nextLong();
                System.out.println(x+ " "+"can be fitted in:");

                if(x>=-Math.pow(2,15) && x<=Math.pow(2,15)-1){
                    System.out.println("* short");
                }if(x>=-(Math.pow(2,31))&& x<=(Math.pow(2,31)-1)){
                    System.out.println("* int");
                }if(x>=-(Math.pow(2,63))&& x<=Math.pow(2,63)-1){
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(scan.next() +" "+ "can't be fitted any where");
            }



        }


    }
    public void keyboardTest(){
        System.out.println("what a wonderful time time is ti");
        System.out.println("I don't believe it");
        for (int i =0;i<6;i++){
            System.out.println(2*i);
        }
        String s="Hello world";
        System.out.println(s.toLowerCase());



    }
    public void howStack() {
        Stack<String> str = new Stack<>();
        str.push("java");
        str.push("python");
        str.push("C++");
        str.push("php");
        for (String s : str) {
            System.out.println(s);
        }

        System.out.println(str.peek());
        // System.out.println(str.pop());
        System.out.println(str.toString());


    }


}








