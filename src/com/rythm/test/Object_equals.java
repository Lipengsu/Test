package com.rythm.test;

import java.util.*;

public class Object_equals {
	public static void main(String[] args) {
		 
		// Object ʹ�� hashCode()
        Object obj1 = new Object();
 
        // obj1 ��ֵ�� obj2
        Object obj2 = obj1;
 
        // �ж����������Ƿ����
        System.out.println(obj1.equals(obj2)); // true
 
        // ��ȡ obj1 �� obj2 �Ĺ�ϣֵ
        System.out.println(obj1.hashCode()); // 225534817 
        System.out.println(obj2.hashCode()); // 225534817
        
        
        // Object ʹ�� hashCode()
        Object obj3 = new Object();
        System.out.println(obj3.hashCode()); 
        
     // String ʹ�� hashCode()
        String str = new String();
        System.out.println(str.hashCode()); // 0
        
        String str1 = "runoobnn";
        System.out.println(str1.hashCode()); // 0
 
        // ArrayList ʹ�� hashCode()
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.hashCode()); // 1
    }
}
