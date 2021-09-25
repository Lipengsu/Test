package com.rythm.test;

public class Test_cloneable implements Cloneable {
	 // ��������
    String name;
    int likes;
 
    public static void main(String[] args) {
 
        // ��������
        Test_cloneable obj1 = new Test_cloneable();
 
        // ��ʼ������
        obj1.name = "Runoob";
        obj1.likes = 111;
 
        // ��ӡ���
        System.out.println(obj1.name); // Runoob
        System.out.println(obj1.likes); // 111
 
        try {
 
            // ���� obj1 �Ŀ���
            Test_cloneable obj2 = (Test_cloneable) obj1.clone();
 
            // ʹ�� obj2 �������
            System.out.println(obj2.name); // Runoob
            System.out.println(obj2.likes); // 111
        } catch (Exception e) {
            System.out.println(e);
        }
 
    }
}
