package com.runoob.test;

class Animal1 {
	public void move() {
		System.out.println("��������ƶ�");
	}
}

class Dog1 extends Animal1 {
	public void move() {
		System.out.println("�������ܺ���");
		super.move();
	}

	public void bark() {
		System.out.println("�����Էͽ�");
	}
}

public class TestDog {
	public static void main(String args[]) {
		Animal1 a = new Animal1(); // Animal ����
		Animal1 b = new Dog1(); // Dog ����
		Dog1 c = new Dog1();

		a.move();// ִ�� Animal ��ķ���

		b.move();// ִ�� Dog ��ķ���

		c.bark();
	}
}