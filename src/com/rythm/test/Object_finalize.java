package com.rythm.test;

import java.util.*;

public class Object_finalize extends GregorianCalendar{
	public static void main(String[] args) {
		try {
			// ���� RunoobTest ����
			Object_finalize cal = new Object_finalize();

			// �����ǰʱ��
			System.out.println("" + cal.getTime());

			// finalize cal
			System.out.println("Finalizing...");
//			cal.finalize();
			System.out.println("Finalized.");

		} catch (Throwable ex) {
			ex.printStackTrace();
		}
	}
}
