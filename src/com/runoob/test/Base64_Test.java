package com.runoob.test;

import java.util.Base64;
import java.util.UUID;
import java.io.UnsupportedEncodingException;
 
public class Base64_Test {
   public static void main(String args[]){
      try {
        
         // ʹ�û�������
         String base64encodedString = Base64.getEncoder().encodeToString("sulipeng".getBytes("utf-8"));
         System.out.println("Base64 �����ַ��� (����) :" + base64encodedString);
        
         // ����
         byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
        
         System.out.println("ԭʼ�ַ���: " + new String(base64decodedBytes, "utf-8"));
         base64encodedString = Base64.getUrlEncoder().encodeToString("sulipeng".getBytes("utf-8"));
         System.out.println("Base64 �����ַ��� (URL) :" + base64encodedString);
        
         StringBuilder stringBuilder = new StringBuilder();
        
         for (int i = 0; i < 1; ++i) {
            stringBuilder.append(UUID.randomUUID().toString());
         }
        
         byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
         String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
         System.out.println("Base64 �����ַ��� (MIME) :" + mimeEncodedString);
         
      }catch(UnsupportedEncodingException e){
         System.out.println("Error :" + e.getMessage());
      }
   }
}