package com.runoob.test;

import java.util.*;
//import java.util.Iterator;

public class Test_iterator {
    public static void main(String[] args) {

        // ��������
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");

        // ��ȡ������
        Iterator<String> it = sites.iterator();

        // ��������еĵ�һ��Ԫ��
        System.out.println(it.next());
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it1 = numbers.iterator();
        while(it1.hasNext()) {
            Integer i = it1.next();
            if(i < 10) {  
                it1.remove();  // ɾ��С�� 10 ��Ԫ��
            }
        }
        System.out.println(numbers);
    }
}