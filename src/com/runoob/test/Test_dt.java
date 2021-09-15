package com.runoob.test;

public class Test_dt {
    public static void main(String[] args) {
      show(new Cat());  // �� Cat ������� show ����
      show(new Dog2());  // �� Dog ������� show ����
                
      Animal2 a = new Cat();  // ����ת��  
      a.eat();               // ���õ��� Cat �� eat
      Cat c = (Cat)a;        // ����ת��  
      c.work();        // ���õ��� Cat �� work
  }  
            
    public static void show(Animal2 a)  {
      a.eat();  
        // �����ж�
        if (a instanceof Cat)  {  // è�������� 
            Cat c = (Cat)a;  
            c.work();  
        } else if (a instanceof Dog2) { // ���������� 
            Dog2 c = (Dog2)a;  
            c.work();  
        }  
    }  
}
 
abstract class Animal2 {  
    abstract void eat();  
}  
  
class Cat extends Animal2 {  
    public void eat() {  
        System.out.println("����");  
    }  
    public void work() {  
        System.out.println("ץ����");  
    }  
}  
  
class Dog2 extends Animal2 {  
    public void eat() {  
        System.out.println("�Թ�ͷ");  
    }  
    public void work() {  
        System.out.println("����");  
    }  
}