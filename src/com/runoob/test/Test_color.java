package com.runoob.test;

enum Color {
	RED, GREEN, BLUE, BLACK;
	 // ���캯��
    private Color()
    {
        System.out.println("Constructor called for : " + this.toString());
    }
 
    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}

public class Test_color {
	// ִ��������
	public static void main(String[] args) {
//    	for(Color var1 : Color.values())
//        System.out.println(var1);
		
		/*
		Color myVar = Color.BLUE;

		switch (myVar) {
		case RED:
			System.out.println("��ɫ");
			break;
		case GREEN:
			System.out.println("��ɫ");
			break;
		case BLUE:
			System.out.println("��ɫ");
			break;
		}
		*/
		/*
		 // ���� values()
        Color[] arr = Color.values();
 
        // ����ö��
        for (Color col : arr)
        {
            // �鿴����
            System.out.println(col + " at index " + col.ordinal());
        }
 
        // ʹ�� valueOf() ����ö�ٳ����������ڵĻᱨ�� IllegalArgumentException
        System.out.println(Color.valueOf("RED"));
        // System.out.println(Color.valueOf("WHITE"));
        */
        Color c1 = Color.RED;
        System.out.println(c1);
        c1.colorInfo();
	}
}