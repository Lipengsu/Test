class Polygon {
   public void display() {
   }
}
public class AnonymousDemo {
   public void createClass() {
      // ������ʵ��һ���ӿ�
      Polygon p1 = new Polygon() {
         public void display() {
            System.out.println("���������ڲ���");
         }
      };
      p1.display();
   }
   public static void main(String[] args) {
      AnonymousDemo an = new AnonymousDemo();
      an.createClass();
   }
}