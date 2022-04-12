package com.java.practice;

public  class TestDataStructure {
    private static Object item;
    public void setItem(Object item){
        this.item=item;
    }
    public Object getItem(){
        return item;
    }

    public static void main(String[] args){
        TestDataStructure data = new TestDataStructure();
        data.setItem(54);
        Integer t= (Integer) data.getItem();
        System.out.println(item);


        Integer[]integers = {1,3,4,5};
        String[] string = {"tom","pawi","aden"};
        Integer[]intArray= {Integer.valueOf(2),Integer.valueOf(3),Integer.valueOf(8)};
        Character[] charArray = {Character.valueOf('v'),Character.valueOf('r'),Character.valueOf('T')};
        String[]stringArray = {"Tom", "Susan", "Kim"};
        Double[]doubleArray ={Double.valueOf(2),Double.valueOf(-2.3),Double.valueOf(9),Double.valueOf(-100.0)};
       // sort(intArray);
        sort(doubleArray);
      //  sort(charArray);
      // sort(stringArray);
       stringCompare();
       System.out.println(20+30);
       System.out.println(20-100);
        System.out.println(100/2);


        //TestDataStructure.<Integer>print(integers);
        //TestDataStructure.<String>print(string);
       // print(string);
       // print(integers);// to invoke geric methods in java we can use either the class name.the generic element
        // followed by the static method.

    }

    public static <E> void print(E[] list){
        for (int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }
    public static <E extends Comparable<E>>void sort(E[] list1){
        E currentMin;
        int currentMinIndex;

        for (int i=0; i<list1.length;i++) {
            currentMin = list1[i];
            currentMinIndex = i;
            for (int j = i + 1; j < list1.length; j++) {
                if (currentMin.compareTo(list1[j]) > 0) {
                    currentMin = list1[j];
                    currentMinIndex = j;

                }
            }


                    System.out.println(list1[i]);
                }

        }

    public static void stringCompare(){
        int[]mat ={2,-4,5,-1,8};
        int temp =0;

        for (int i=0;i<mat.length-1;i++){
            System.out.println(mat[i]);



            }
        for (int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat.length;j++){
                if (mat[i]>mat[j]){
                    temp=mat[i];
                    mat[i]=mat[j];
                    mat[j]=temp;

                }
            }
            System.out.println(mat[i]);

        }
        }




    

}
