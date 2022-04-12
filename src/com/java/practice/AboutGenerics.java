package com.java.practice;

public class AboutGenerics<K,V> {
    private K key;
    private V value;

    public AboutGenerics(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setDar(V value) {
        this.value = value;
    }

    public void setItem(K key){
        this.key=key;

    }

    @Override
    public String toString() {
        return "AboutGenerics{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public K getKey(){
        return key;
    }
    public static  <K,V>void result(K key,V value){

        System.out.println(key.equals(value));
        System.out.println(key.hashCode());

    }


}
