package com.rythm.test;

public class Person{
    private String name;
    private int age;
    public int getAge(){
      return age;
    }
    public String getName(){
      return name;
    }
    public void setAge(int age){
      this.age = age;
    }
    public void setName(String name){
      this.name = name;
    }
}
/*
 * ���� this �ؼ�����Ϊ�˽��ʵ��������private String name���;ֲ�������setName(String name)�е�name������֮�䷢����ͬ���ĳ�ͻ
 * */
