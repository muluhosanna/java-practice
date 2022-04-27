package com.java.practice;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.*;

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
        //testLiat();
        //testStack();
        //tetQue();
        //testPriority();
        //testDeque();
       // testMap();
       // testLinkedList();
       // examplesOnHash();
        //testTree();
       // testReverse();
       // treeSettest();
       // subsettest();
        //testing();
      //  testSort();
        testSortingAlgorithm();


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
    public static void testLiat(){
        List<String> summary = new ArrayList<>();
        summary.add("kavin");
        summary.add("Adam");
        summary.add("Ana");
        Iterator<String>iterator = summary.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        summary.add(0,"Danaiel");
        summary.remove(0);
        System.out.println(summary.contains("Danaiel"));
        Object[]o =summary.toArray();
        for (Object s:o)
            System.out.println(s);

    }
    public static void testStack(){
        Stack<String>names = new Stack<>();
        names.push("Adam");
        names.push("Joe");
        names.push("Ana");
        names.push("Daneil");
        names.push("Katy");

        for (String s: names){
            System.out.println(s);

        }
        while (!names.isEmpty()){
            System.out.println(names.pop());

        }


    }
    public static void tetQue(){
        Queue<String>queue = new LinkedList<>();
        queue.offer("Adam");
        queue.offer("Katy");
        queue.offer("Ana");
        queue.offer("Kero");
        while (!queue.isEmpty()){
           System.out.println(queue.remove());
        }
       System.out.println(queue.size());
        //the size() is zero because we removed it one by one.
        System.out.println("after");
       /* for (String s:queue){
            System.out.println(s);
        }*/
        Object[]obj=queue.toArray();
        for (Object o:obj){
            System.out.println(o);
        }
    }
    public static void testPriority() {


        Queue<Person> listPerson = new PriorityQueue<>();
        listPerson.add(new Person("kebede",32));
        listPerson.add(new Person("chanie",37));
        listPerson.add(new Person("Abebe",89));
        listPerson.add(new Person("Akalu",45));
        while (listPerson.peek()!=null){
            System.out.println(listPerson.poll());
        }
    }
    public static void testDeque(){
        // add the pop method does not remove the top
        // rather if we use the push method to insert the pop method peeks the largest
        // and removes it.
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(10);
        stack.push(100);
        stack.push(1000);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    public static void testMap(){
        Map<Integer,String>map = new HashMap<>();
        map.put(1,"Adam");
        map.put(2,"kevin");
        map.put(3,"Ana");
        map.put(40,"Lucy");
        System.out.println(map.get(1));
        System.out.println(map.get(null));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.toString());
        for (Integer key:map.keySet()){
            System.out.println(map.get(key));
        }
        // we can use the following
        for (Map.Entry<Integer,String>entry:map.entrySet()){
            System.out.println(entry.getKey() +"-" +entry.getValue());
        }
    }
    public static void testLinkedList(){
        Map<String,Integer>linkList = new HashMap<>();
        linkList.put("aaa",1);
        linkList.put("bbb",2);
        linkList.put("ccc",3);
        linkList.put("ddd",4);
        linkList.put("eee",5);
        linkList.put("fff",6);
        linkList.put("iii",7);
        linkList.put("hhh",8);
        linkList.put("jjj",9);
        for (Map.Entry<String,Integer>entry:linkList.entrySet()){
            System.out.println(entry.getValue()+"-" +entry.getKey());
        }
        // As we saw above the order of insertion is not preserved
        // but if we use linked hashmap the order of insertion will be preserved.
        // linked hashmaps use more memory but if we do not want the order of insertion
        // we can use the standard hash map.
        // let us see the example




    }
    public static void examplesOnHash(){
        Map<String,Integer>linkMap1 = new LinkedHashMap<>();
        linkMap1.put("aaa",1);
        linkMap1.put("bbb",2);
        linkMap1.put("ccc",3);
        linkMap1.put("ddd",4);
        linkMap1.put("eee",5);
        linkMap1.put("fff",6);
        linkMap1.put("iii",7);
        linkMap1.put("hhh",8);
        linkMap1.put("jjj",9);
        for (Map.Entry<String,Integer>entry:linkMap1.entrySet()){
            System.out.println(entry.getValue()+"-" +entry.getKey());
        }


    }
    public static void testTree(){
        Map<Integer,String>map = new TreeMap<>();
        map.put(10,"ten");
        map.put(3,"three");
        map.put(5,"five");
        map.put(1,"one");
        map.put(8,"eight");
        for (Map.Entry<Integer,String>entry1:map.entrySet()){
            System.out.println(entry1.getKey()+"-" +entry1.getValue());
        }
    }
    //the above method returns in ascending order. but if we want to reverse the order
    // we use the following
    public static void testReverse(){
        Map<Integer,String>map = new TreeMap<>(Comparator.reverseOrder());
        map.put(10,"ten");
        map.put(3,"three");
        map.put(5,"five");
        map.put(1,"one");
        map.put(8,"eight");
        for (Map.Entry<Integer,String>entry1:map.entrySet()){
            System.out.println(entry1.getKey()+"-" +entry1.getValue());
        }

    }
    public static void treeSettest(){
        Set<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(1);
        set.add(9);
        set.add(5);
        set.add(120);
        set.add(87);
        set.add(55);
        for(Integer num:set){
            System.out.println(num);
        }

    }
    public static void subsettest(){
        SortedSet<Integer>set = new TreeSet<>();
        set.add(12);
        set.add(1);
        set.add(9);
        set.add(5);
        set.add(120);
        set.add(87);
        set.add(55);
        Set<Integer>subset = set.subSet(5,80);
        for (Integer num:subset){
            System.out.println(num);
        }
        Set<Integer>subset1 = set.tailSet(50);
        for (Integer num1:subset1){
            System.out.println(num1);
        }


    }
    public static void testing(){
        SortedSet<Integer>set = new TreeSet(Comparator.reverseOrder());
        set.add(12);
        set.add(1);
        set.add(9);
        set.add(5);
        set.add(120);
        set.add(87);
        set.add(55);
        Set<Integer> subset = set.headSet(20);
        System.out.println(set.last());
        for (Integer num:set){
            System.out.println(num);
        }



    }
    public static void testSort(){
        List<String>list = new ArrayList<>();
        list.add("Adam");
        list.add("Joe");
        list.add("Katy");
        list.add("Ana");
        Collections.sort(list);
        // the above method is used to make list in assending order
        // if we want  to reverse the order  we use the following
        //Collections.sort(list,collections.reverseOrder())

        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);


    }
    public static void testSortingAlgorithm(){
        List<Person>personList = new ArrayList<>();
        personList.add(new Person("kebede",32));
        personList.add(new Person("Abebe",42));
        personList.add(new Person("kumlachew",52));
        personList.add(new Person("chanie",10));
        personList.add(new Person("chalie",14));
        Collections.sort(personList);
        System.out.println(personList);
        Collections.sort(personList,Collections.reverseOrder());
        System.out.println(personList);

    }




}
