package com.rythm.test;

import java.util.HashSet;

public class Test_hashset {
	public static void main(String[] args) {
	    HashSet<String> sites = new HashSet<String>();
	        sites.add("Google");
	        sites.add("Runoob");
	        sites.add("Taobao");
	        sites.add("Zhihu");
	        sites.add("Runoob");  // 重复的元素不会被添加
	        System.out.println(sites);
	        System.out.println(sites.contains("Taobao"));
	        sites.remove("Taobao");  // 删除元素，删除成功返回 true，否则为 false
	        System.out.println(sites);
//	        sites.clear();  
//	        System.out.println(sites);
	        System.out.println(sites.size());  
	        for (String i : sites) {
	            System.out.println(i);
	        }
	    }
}
