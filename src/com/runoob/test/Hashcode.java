package com.runoob.test;

import java.util.ArrayList;

public class Hashcode {
    public static void main(String[] args) {
 
        // String ʹ�� hashCode()
        String str = new String();
        System.out.println(str.hashCode()); // 0
 
        // ArrayList ʹ�� hashCode()
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.hashCode()); // 1
        
     // Object ʹ�� hashCode()
        Object obj1 = new Object();
 
        // obj1 ��ֵ�� obj2
        Object obj2 = obj1;
 
        // �ж����������Ƿ����
        System.out.println(obj1.equals(obj2)); // true
 
        // ��ȡ obj1 �� obj2 �Ĺ�ϣֵ
        System.out.println(obj1.hashCode()); // 225534817 
        System.out.println(obj2.hashCode()); // 225534817
    }
}