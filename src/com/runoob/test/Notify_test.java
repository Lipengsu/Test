package com.runoob.test;
import java.util.*;

public class Notify_test {
	 
    private List<String> synchedList;
 
    public Notify_test() {
        // ����һ��ͬ���б�
        synchedList = Collections.synchronizedList(new LinkedList<String>());
    }
 
    // ɾ���б��е�Ԫ��
    public String removeElement() throws InterruptedException {
        synchronized (synchedList) {
 
            // �б�Ϊ�վ͵ȴ�
            while (synchedList.isEmpty()) {
                System.out.println("List is empty...");
                synchedList.wait();
                System.out.println("Waiting...");
            }
            String element = synchedList.remove(0);
 
            return element;
        }
    }
 
    // ���Ԫ�ص��б�
    public void addElement(String element) {
        System.out.println("Opening...");
        synchronized (synchedList) {
 
            // ���һ��Ԫ�أ���֪ͨԪ���Ѵ���
            synchedList.add(element);
            System.out.println("New Element:'" + element + "'");
 
            synchedList.notifyAll();
            System.out.println("notifyAll called!");
        }
        System.out.println("Closing...");
    }
 
    public static void main(String[] args) {
        final Notify_test demo = new Notify_test();
 
        Runnable runA = new Runnable() {
 
            public void run() {
                try {
                    String item = demo.removeElement();
                    System.out.println("" + item);
                } catch (InterruptedException ix) {
                    System.out.println("Interrupted Exception!");
                } catch (Exception x) {
                    System.out.println("Exception thrown.");
                }
            }
        };
 
        Runnable runB = new Runnable() {
 
            // ִ�����Ԫ�ز���������ʼѭ��
            public void run() {
                demo.addElement("Hello!");
            }
        };
 
        try {
            Thread threadA1 = new Thread(runA, "Google");
            threadA1.start();
 
            Thread.sleep(500);
 
            Thread threadA2 = new Thread(runA, "Runoob");
            threadA2.start();
 
            Thread.sleep(500);
 
            Thread threadB = new Thread(runB, "Taobao");
            threadB.start();
 
            Thread.sleep(1000);
 
            threadA1.interrupt();
            threadA2.interrupt();
        } catch (InterruptedException x) {
        }
    }
}