package com.rythm.test;

import java.util.LinkedList;

public class Test_linkedlist {
	 public static void main(String[] args) {
	        LinkedList<String> sites = new LinkedList<String>();
	        sites.add("Google");
	        sites.add("Runoob");
	        sites.add("Taobao");
	     // ʹ�� addFirst() ��ͷ�����Ԫ��
	        sites.addFirst("Wiki");
	        // ʹ�� addLast() ��β�����Ԫ��
	        sites.addLast("Super");
	        sites.add("Weibo");
	        System.out.println(sites);
	     // ʹ�� removeFirst() �Ƴ�ͷ��Ԫ��
	        sites.removeFirst();
	        System.out.println(sites);
	        // ʹ�� removeLast() �Ƴ�β��Ԫ��
	        sites.removeLast();
	        System.out.println(sites);
	     // ʹ�� getFirst() ��ȡͷ��Ԫ��
	        System.out.println(sites.getFirst());
	     // ʹ�� getLast() ��ȡβ��Ԫ��
	        System.out.println(sites.getLast());
	        for (int size = sites.size(), i = 0; i < size; i++) {
	            System.out.println(sites.get(i));
	        }
	    }
}
