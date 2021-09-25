package com.rythm.test;

public class Default_method {
	public static void main(String args[]) {
		Vehicle vehicle = new Car1();
		vehicle.print();
	}
}

interface Vehicle {
	default void print() {
		System.out.println("����һ����!");
	}

	static void blowHorn() {
		System.out.println("������!!!");
	}
}

interface FourWheeler {
	default void print() {
		System.out.println("����һ�����ֳ�!");
	}
}

class Car1 implements Vehicle, FourWheeler {
	public void print() {
		Vehicle.super.print();
		FourWheeler.super.print();
		Vehicle.blowHorn();
		System.out.println("����һ������!");
	}
}
