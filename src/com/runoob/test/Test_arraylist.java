package com.runoob.test;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Test_arraylist {
	  public static void main(String[] args) {
	        ArrayList<String> sites = new ArrayList<String>();
	        sites.add("Google");
	        sites.add("Runoob");
	        sites.add("Aaaaa");
	        sites.add("Taobao");
	        sites.add("Weibo");
	        System.out.println(sites);
	        System.out.println(sites.get(1));  // ���ʵڶ���Ԫ��
	        sites.set(1, "Wiki"); // ��һ������Ϊ����λ�ã��ڶ���ΪҪ�޸ĵ�ֵ
	        System.out.println(sites);
	        sites.remove(4); // ɾ�����ĸ�Ԫ��
	        System.out.println(sites);
	        System.out.println(sites.size());
	        Collections.sort(sites);
//	        for (int i = 0; i < sites.size(); i++) {
//	            System.out.println(sites.get(i));
//	        }
//	        for (String i : sites) {
//	            System.out.println(i);
//	        }
	        //��һ�ֱ�������ʹ�� For-Each ���� List
	        System.out.println("��һ�ֱ�����ʽ��");
	        for (String str : sites) {            //Ҳ���Ը�д for(int i=0;i<list.size();i++) ������ʽ
	           System.out.println(str);
	        }
	      //�����ֱ��� ʹ�õ�����������ر���
	        System.out.println("�����ֱ�����ʽ��");
	        Iterator<String> ite=sites.iterator();
	        while(ite.hasNext())//�ж���һ��Ԫ��֮����ֵ
	        {
	            System.out.println(ite.next());
	        }
	        //�ڶ��ֱ������������Ϊ������ص����ݽ��б���
	        System.out.println("�ڶ��ֱ�����ʽ��");
	        String[] strArray=new String[sites.size()];
	        sites.toArray(strArray);
	        for(int i=0;i<strArray.length;i++) //����Ҳ���Ը�дΪ  for(String str:strArray) ������ʽ
	        {
	           System.out.println(strArray[i]);
	        }
	        
	       
//	        System.out.println(sites);
	        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	        myNumbers.add(10);
	        myNumbers.add(15);
	        myNumbers.add(20);
	        myNumbers.add(25);
	        Collections.sort(myNumbers);
	        for (int i : myNumbers) {
	            System.out.println(i);
	        }
	        
	    }
}
