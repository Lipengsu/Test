package com.rythm.test;

public class Tostring {
	 public static void main(String[] args) {
		 
	        // toString() with Object
	        Object obj1 = new Object();
	        System.out.println(obj1.toString());
	 
	        Object obj2 = new Object();
	        System.out.println(obj2.toString());
	 
	        Object obj3 = new Object();
	        System.out.println(obj3.toString());
	        
	        // toString() with array
	        // ��������
	        String[] array = { "Google", "Runoob", "Taobao" };
	        System.out.println(array[0].toString());
	 
	        // ����Ԫ��ֵ����һ���ַ����ı�ʾ��ʽ
	        // Array �̳��� Object �࣬���Կ���ֱ��ʹ�� toString() ����
	        System.out.println(array[1].toString()); // Runoob
	    }
}
