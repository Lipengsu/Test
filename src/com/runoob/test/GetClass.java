package com.runoob.test;
import java.util.ArrayList;

public class GetClass {
    public static void main(String[] args) {
 
    // getClass() with Object
    Object obj1 = new Object();
    System.out.println("obj1 ����Ϊ: " + obj1.getClass());
 
    // getClass() with String
    String obj2 = new String();
    System.out.println("obj2 ����Ϊ: " + obj2.getClass());
 
    // getClass() with ArrayList
    ArrayList<Integer> obj3 = new ArrayList<>();
    System.out.println("obj3 ����Ϊ: " + obj3.getClass());
    }
}