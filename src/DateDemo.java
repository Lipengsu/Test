import java.util.*;
import java.text.*;
  
public class DateDemo {
   public static void main(String args[]) {
       // ��ʼ�� Date ����
       Date date = new Date();
	// ʹ�� toString() ������ʾ����ʱ��
//       Date date1 = new Date(99, 2, 12);
//       Date date2 = new Date(99, 2, 18);
       System.out.println(date.toString());
       System.out.println(new Date(99, 2, 12).before(new Date (99, 2, 18)));
       Date dnow = new Date();
       SimpleDateFormat ft =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
       System.out.println("��ǰʱ��Ϊ��"+ ft.format(dnow));
       //c��ʹ��  
       System.out.printf("ȫ�����ں�ʱ����Ϣ��%tc%n",date);          
       //f��ʹ��  
       System.out.printf("��-��-�ո�ʽ��%tF%n",date);  
       //d��ʹ��  
       System.out.printf("��/��/���ʽ��%tD%n",date);  
       //r��ʹ��  
       System.out.printf("HH:MM:SS PM��ʽ��12ʱ�ƣ���%tr%n",date);  
       //t��ʹ��  
       System.out.printf("HH:MM:SS��ʽ��24ʱ�ƣ���%tT%n",date);  
       //R��ʹ��  
       System.out.printf("HH:MM��ʽ��24ʱ�ƣ���%tR%n",date);  
       // ʹ��toString()��ʾ���ں�ʱ��
       System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
       //b��ʹ�ã��·ݼ��  
       String str=String.format(Locale.US,"Ӣ���·ݼ�ƣ�%tb",date);       
       System.out.println(str);                                                                              
       System.out.printf("�����·ݼ�ƣ�%tb%n",date);  
       //B��ʹ�ã��·�ȫ��  
       str=String.format(Locale.US,"Ӣ���·�ȫ�ƣ�%tB",date);  
       System.out.println(str);  
       System.out.printf("�����·�ȫ�ƣ�%tB%n",date);  
       //a��ʹ�ã����ڼ��  
       str=String.format(Locale.US,"Ӣ�����ڵļ�ƣ�%ta",date);  
       System.out.println(str);  
       //A��ʹ�ã�����ȫ��  
       System.out.printf("�������ڵļ�ƣ�%tA%n",date);  
       //C��ʹ�ã���ǰ��λ  
       System.out.printf("���ǰ��λ���֣�������λǰ�油0����%tC%n",date);  
       //y��ʹ�ã������λ  
       System.out.printf("��ĺ���λ���֣�������λǰ�油0����%ty%n",date);  
       //j��ʹ�ã�һ�������  
       System.out.printf("һ���е�����������ĵڼ��죩��%tj%n",date);  
       //m��ʹ�ã��·�  
       System.out.printf("��λ���ֵ��·ݣ�������λǰ�油0����%tm%n",date);  
       //d��ʹ�ã��գ���λ���������㣩  
       System.out.printf("��λ���ֵ��գ�������λǰ�油0����%td%n",date);  
       //e��ʹ�ã��գ�һλ�����㣩  
       System.out.printf("�·ݵ��գ�ǰ�治��0����%te%n",date);  
       
       //---------------
       SimpleDateFormat ft1 = new SimpleDateFormat ("yyyy-MM-dd"); 
       
       String input = args.length == 0 ? "1818-11-11" : args[0]; 
  
       System.out.print(input + " Parses as "); 
  
       Date t; 
  
       try { 
           t = ft1.parse(input); 
           System.out.println(t); 
       } catch (ParseException e) { 
           System.out.println("Unparseable using " + ft1); 
       }
       try { 
           System.out.println(new Date( ) + "\n"); 
           Thread.sleep(1000*3);    // ����3��
           System.out.println(new Date( ) + "\n"); 
        } catch (Exception e) { 
            System.out.println("Got an exception!"); 
        }
   }
}