package com.runoob.test;

import java.util.Scanner; 

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // �Ӽ��̽�������
 
        // next��ʽ�����ַ���
        System.out.println("next��ʽ���գ�");
        // �ж��Ƿ�������
        if (scan.hasNextLine()) {
            String str1 = scan.nextLine();
            System.out.println("���������Ϊ��" + str1);
        }
        scan.close();
    }
}
/*
next() �� nextLine() ����
next():

1��һ��Ҫ��ȡ����Ч�ַ���ſ��Խ������롣
2����������Ч�ַ�֮ǰ�����Ŀհף�next() �������Զ�����ȥ����
3��ֻ��������Ч�ַ���Ž����������Ŀհ���Ϊ�ָ������߽�������
next() ���ܵõ����пո���ַ�����
nextLine()��

1����EnterΪ������,Ҳ����˵ nextLine()�������ص�������س�֮ǰ�������ַ���
2�����Ի�ÿհס�/
 */