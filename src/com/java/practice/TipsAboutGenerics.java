package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TipsAboutGenerics {
    public static <T >List<T> solution(List<T>list, T item1,T item2){

      list.add(item1);
      list.add(item2);
return list;
    }
    public static void main(String[] args){
        System.out.println(solution(new ArrayList<>(),"java","python"));
       // solutions();
        Integer i=23;//the integer class object
        print(i);
        List<Integer>list = Arrays.asList(1,2,3);//the arrayList object
        print(list);
        List<String>list2 = new ArrayList<>();
        list2.add("adam");
        list2.add("Hiwot");
        list2.add("kebede");
        list2.add("java");
      // read(list); //we will face  compile type error because the list of object
        // is not the supper type of the List of integer
        // to fix this we have to use wild cards
        // that is go to the read method and make List<?>lis instead of List<Object>list
        // now lets see.
        readAndWrite(list);
        readAndWrite(list2);




    }
    /*
    or this problem, we have  types of queries you can perform on a List:

Insert  at index :

Insert
x y
Delete the element at index :

Delete
x
Given a list, , of  integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer,  (the initial number of elements in ).
The second line contains  space-separated integers describing .
The third line contains an integer,  (the number of queries).
The  subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .
Constraints



Each element in is a 32-bit integer.
Output Format

Print the updated list  as a single line of space-separated integers.

Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0
Sample Output

0 1 78 12 23
Explanation


 Insert 23 at index .

 Delete the element at index .

Having performed all  queries, we print  as a single line of space-separated integers.
     */
    //The solution will be the following
    // first we have to create the file to read it using the scanner class.
    public static void solutions() {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int value = scan.nextInt();
            list.add(value);
        }
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String action = scan.next();
            if (action.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else { // "Delete"
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        scan.close();

        /* Print our updated Linked List */
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
    public static void print(Object o){
        System.out.println(o.toString());


    }
    public static void read(List<Object>list){
        for (Object o:list){
            System.out.println(o);
        }
    }
    public static void readAndWrite(List<?>list1){
        for (Object o:list1){
            System.out.println(o);

        }

    }


}
