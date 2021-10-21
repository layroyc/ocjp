package 继承.OcjpT9;

public class Mountain extends Rock {

     Mountain() {

          super("granite "); //调用父类的有参方法，同时继承父类的无参构造
          new Rock("granite ");

          }

     public static void main(String[] a) { new Mountain(); }

     }
